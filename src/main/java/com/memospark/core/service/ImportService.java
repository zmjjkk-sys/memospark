package com.memospark.core.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.memospark.core.domain.Card;
import com.memospark.core.domain.CardProgress;
import com.memospark.core.domain.Deck;
import com.memospark.core.dto.ImportResultDto;
import com.memospark.core.repository.CardProgressRepository;
import com.memospark.core.repository.CardRepository;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ImportService {

    private final DeckService deckService;
    private final CardRepository cardRepository;
    private final CardProgressRepository cardProgressRepository;
    private final SpacedRepetitionService srsService;
    private final ObjectMapper objectMapper;

    @Transactional
    public ImportResultDto importJson(Long deckId, MultipartFile file, Long userId, boolean isAdmin) throws IOException {
        Deck deck = deckService.getDeckOrThrow(deckId);
        deckService.verifyOwnership(deck, userId, isAdmin);
        List<Map<String, String>> items = objectMapper.readValue(
                file.getInputStream(),
                new TypeReference<>() {});

        int imported = 0, failed = 0;
        for (Map<String, String> item : items) {
            try {
                String front = item.get("front");
                String back = item.get("back");
                if (front == null || back == null || front.isBlank() || back.isBlank()) {
                    failed++;
                    continue;
                }
                saveCard(deck, front, back, item.getOrDefault("tags", ""), userId);
                imported++;
            } catch (Exception e) {
                failed++;
            }
        }
        return new ImportResultDto(imported, failed, "JSON import complete");
    }

    @Transactional
    public ImportResultDto importCsv(Long deckId, MultipartFile file, Long userId, boolean isAdmin) throws IOException {
        Deck deck = deckService.getDeckOrThrow(deckId);
        deckService.verifyOwnership(deck, userId, isAdmin);
        int imported = 0, failed = 0;

        try (CSVReader reader = new CSVReader(
                new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8))) {
            String[] line;
            boolean firstLine = true;
            while ((line = reader.readNext()) != null) {
                // Skip header row if it looks like a header
                if (firstLine) {
                    firstLine = false;
                    if (line.length > 0 && line[0].equalsIgnoreCase("front")) continue;
                }
                if (line.length < 2) { failed++; continue; }
                try {
                    String front = line[0].trim();
                    String back = line[1].trim();
                    String tags = line.length > 2 ? line[2].trim() : "";
                    if (front.isBlank() || back.isBlank()) { failed++; continue; }
                    saveCard(deck, front, back, tags, userId);
                    imported++;
                } catch (Exception e) {
                    failed++;
                }
            }
        } catch (CsvValidationException e) {
            throw new IOException("Invalid CSV format: " + e.getMessage(), e);
        }
        return new ImportResultDto(imported, failed, "CSV import complete");
    }

    private void saveCard(Deck deck, String front, String back, String tags, Long userId) {
        Card card = new Card(deck, front, back, tags);
        card = cardRepository.save(card);
        CardProgress progress = new CardProgress(card);
        srsService.initProgress(progress, userId);
        cardProgressRepository.save(progress);
    }
}

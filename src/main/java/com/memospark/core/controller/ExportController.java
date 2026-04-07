package com.memospark.core.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.memospark.core.domain.Card;
import com.memospark.core.repository.CardRepository;
import com.memospark.core.service.DeckService;
import com.memospark.core.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/export")
@RequiredArgsConstructor
public class ExportController {

    private final DeckService deckService;
    private final CardRepository cardRepository;
    private final ObjectMapper objectMapper;
    private final UserService userService;

    @GetMapping("/json/{deckId}")
    public void exportJson(@PathVariable Long deckId, HttpServletResponse response,
                            @AuthenticationPrincipal UserDetails userDetails) throws IOException {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        var deck = deckService.getDeckOrThrow(deckId);
        deckService.verifyOwnership(deck, userId, isAdmin);
        List<Card> cards = cardRepository.findByDeckId(deckId);

        List<Map<String, String>> data = cards.stream()
                .map(c -> Map.of("front", c.getFront(), "back", c.getBack(), "tags", c.getTags() != null ? c.getTags() : ""))
                .toList();

        String filename = URLEncoder.encode(deck.getName(), StandardCharsets.UTF_8) + ".json";
        response.setContentType("application/json; charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(response.getOutputStream(), data);
    }

    @GetMapping("/csv/{deckId}")
    public void exportCsv(@PathVariable Long deckId, HttpServletResponse response,
                            @AuthenticationPrincipal UserDetails userDetails) throws IOException {
        Long userId = userService.getUserId(userDetails.getUsername());
        boolean isAdmin = userService.isAdmin(userDetails.getUsername());
        var deck = deckService.getDeckOrThrow(deckId);
        deckService.verifyOwnership(deck, userId, isAdmin);
        List<Card> cards = cardRepository.findByDeckId(deckId);

        String filename = URLEncoder.encode(deck.getName(), StandardCharsets.UTF_8) + ".csv";
        response.setContentType("text/csv; charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        // BOM for Excel UTF-8 compatibility
        response.getOutputStream().write(new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF});

        PrintWriter writer = new PrintWriter(response.getOutputStream(), true, StandardCharsets.UTF_8);
        writer.println("front,back,tags");
        for (Card c : cards) {
            writer.println(csvEscape(c.getFront()) + "," + csvEscape(c.getBack()) + "," + csvEscape(c.getTags() != null ? c.getTags() : ""));
        }
        writer.flush();
    }

    private String csvEscape(String value) {
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }
}

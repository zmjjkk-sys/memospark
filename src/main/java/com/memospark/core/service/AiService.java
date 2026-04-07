package com.memospark.core.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class AiService {

    @Value("${ai.api.key}")
    private String apiKey;

    @Value("${ai.api.url}")
    private String apiUrl;

    @Value("${ai.api.model:qwen-turbo}")
    private String model;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    /**
     * Get a progressive hint for a coding problem.
     * level: 1=general direction, 2=approach detail, 3=pseudocode
     */
    public String generateHint(String problemDescription, String userCode, int level) {
        String levelDesc = switch (level) {
            case 1 -> "Give a brief general direction/approach (1-2 sentences). Do NOT give code or detailed steps.";
            case 2 -> "Give a more detailed approach with key steps and data structures to use. Do NOT give actual code.";
            case 3 -> "Give pseudocode or a very detailed step-by-step algorithm. Still don't give the complete solution code.";
            default -> "Give a brief hint.";
        };

        String prompt = """
                You are a coding tutor. A student is working on this problem:

                %s

                %s

                %s

                Reply in the same language as the problem description (Chinese or English). Keep it concise.
                """.formatted(
                problemDescription,
                (userCode != null && !userCode.isBlank()) ? "Their current code:\n" + userCode : "",
                levelDesc
        );

        return chat(prompt);
    }

    /**
     * Generate flashcards for a given topic.
     */
    public List<Map<String, String>> generateCards(String topic, int count, String language) {
        String lang = "zh".equals(language) ? "Chinese" : "English";

        String prompt = """
                Generate exactly %d flashcards about the topic: "%s"

                Each card should have a question (front) and a concise answer (back).
                Reply in %s.

                Return ONLY a JSON array, no markdown, no explanation:
                [{"front":"question here","back":"answer here","tags":"tag1,tag2"}]
                """.formatted(count, topic, lang);

        String response = chat(prompt);

        // Extract JSON from response
        String json = response;
        if (json.contains("[")) {
            json = json.substring(json.indexOf("["), json.lastIndexOf("]") + 1);
        }

        try {
            return objectMapper.readValue(json, new TypeReference<>() {});
        } catch (Exception e) {
            log.error("Failed to parse AI card response: {}", response, e);
            throw new RuntimeException("AI returned invalid card format");
        }
    }

    private String chat(String userMessage) {
        try {
            String body = objectMapper.writeValueAsString(Map.of(
                    "model", model,
                    "messages", List.of(Map.of("role", "user", "content", userMessage))
            ));

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + apiKey)
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .timeout(Duration.ofSeconds(30))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                log.error("AI API error {}: {}", response.statusCode(), response.body());
                throw new RuntimeException("AI service error: " + response.statusCode());
            }

            JsonNode root = objectMapper.readTree(response.body());
            return root.path("choices").path(0)
                    .path("message").path("content").asText("");
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            log.error("AI API call failed", e);
            throw new RuntimeException("AI service unavailable: " + e.getMessage());
        }
    }
}

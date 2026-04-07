package com.memospark.core.controller;

import com.memospark.core.service.AiService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@RequiredArgsConstructor
public class AiController {

    private final AiService aiService;

    public record HintRequest(String problemDescription, String userCode, int level) {}
    public record GenerateCardsRequest(String topic, int count, String language) {}

    @PostMapping("/hint")
    public Map<String, String> getHint(@RequestBody HintRequest req,
                                        @AuthenticationPrincipal UserDetails userDetails) {
        String hint = aiService.generateHint(req.problemDescription(), req.userCode(), req.level());
        return Map.of("hint", hint);
    }

    @PostMapping("/generate-cards")
    public List<Map<String, String>> generateCards(@RequestBody GenerateCardsRequest req,
                                                    @AuthenticationPrincipal UserDetails userDetails) {
        int count = Math.min(req.count() > 0 ? req.count() : 10, 30);
        return aiService.generateCards(req.topic(), count, req.language());
    }
}

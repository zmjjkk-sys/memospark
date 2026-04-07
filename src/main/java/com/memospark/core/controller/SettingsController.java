package com.memospark.core.controller;

import com.memospark.core.dto.SrsSettingsDto;
import com.memospark.core.service.SpacedRepetitionService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
@RequiredArgsConstructor
public class SettingsController {

    private final SpacedRepetitionService srsService;
    private final UserService userService;

    @GetMapping("/srs")
    public SrsSettingsDto getSrsSettings(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return srsService.getSrsSettings(userId);
    }

    @PutMapping("/srs")
    public SrsSettingsDto updateSrsSettings(@RequestBody SrsSettingsDto dto,
                                             @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return srsService.updateSrsSettings(userId, dto);
    }
}

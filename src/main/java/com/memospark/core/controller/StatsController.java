package com.memospark.core.controller;

import com.memospark.core.dto.DailyStatsDto;
import com.memospark.core.dto.StatsDto;
import com.memospark.core.service.StatisticsService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
public class StatsController {

    private final StatisticsService statisticsService;
    private final UserService userService;

    @GetMapping
    public StatsDto getStats(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return statisticsService.getStats(userId);
    }

    @GetMapping("/daily")
    public List<DailyStatsDto> getDailyStats(@RequestParam(defaultValue = "30") int days,
                                              @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return statisticsService.getDailyStats(userId, Math.min(days, 90));
    }
}

package com.memospark.core.dto;

public record StatsDto(
        long totalCards,
        long totalDecks,
        long dueToday,
        long reviewedToday,
        long totalReviews,
        double retentionRate,
        int streakDays
) {}

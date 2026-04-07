package com.memospark.core.dto;

import com.memospark.core.domain.DeckType;

import java.time.LocalDateTime;

public record DeckSummaryDto(
        Long id,
        String name,
        String description,
        DeckType type,
        LocalDateTime createdAt,
        long totalCards,
        long dueCards,
        long newCards,
        long reviewCards,
        long newLearnedToday,
        Integer dailyReviewLimit,
        Integer dailyNewCardLimit,
        long reviewedToday,
        String ownerUsername
) {}

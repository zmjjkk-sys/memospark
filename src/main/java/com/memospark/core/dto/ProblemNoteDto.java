package com.memospark.core.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProblemNoteDto(
        Long id,
        Long problemId,
        int problemNumber,
        String title,
        String difficulty,
        String category,
        String bookmarkType,
        boolean starred,
        String note,
        String errorReason,
        int retryCount,
        LocalDate nextRetryDate,
        boolean isDueForRetry,
        LocalDateTime updatedAt
) {}

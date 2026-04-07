package com.memospark.core.dto;

import java.time.LocalDateTime;

public record CodeSubmissionDto(
        Long id,
        String language,
        String status,
        int passedCases,
        int totalCases,
        LocalDateTime submittedAt
) {}

package com.memospark.core.dto;

import java.time.LocalDate;

public record DailyStatsDto(
        LocalDate date,
        long count,
        double retentionRate
) {}

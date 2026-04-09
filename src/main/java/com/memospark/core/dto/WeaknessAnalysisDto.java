package com.memospark.core.dto;

import java.util.Map;

public record WeaknessAnalysisDto(
        Map<String, Integer> errorReasonCounts,
        Map<String, Integer> categoryCounts,
        int totalWrong,
        String aiAnalysis
) {}

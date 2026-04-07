package com.memospark.core.dto;

public record CreateProblemRequest(
        Integer problemNumber,
        String title,
        String difficulty,
        String description,
        String hint,
        String javaTemplate,
        String pythonTemplate,
        String javaDriverCode,
        String pythonDriverCode,
        String testCasesJson,
        String tags
) {}

package com.memospark.core.dto;

public record CreateProblemNoteRequest(
        Long problemId,
        String bookmarkType,
        String note,
        String errorReason
) {}

package com.memospark.core.dto;

public record UpdateProblemNoteRequest(
        String bookmarkType,
        String note,
        String errorReason
) {}

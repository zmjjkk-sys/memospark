package com.memospark.core.dto;

public record ImportResultDto(int imported, int failed, String message) {}

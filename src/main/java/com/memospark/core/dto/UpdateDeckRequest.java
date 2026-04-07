package com.memospark.core.dto;

public record UpdateDeckRequest(String name, String description, Integer dailyReviewLimit, Integer dailyNewCardLimit) {}

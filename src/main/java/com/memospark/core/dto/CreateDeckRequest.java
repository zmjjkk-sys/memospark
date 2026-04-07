package com.memospark.core.dto;

public record CreateDeckRequest(String name, String description, Integer dailyReviewLimit, Integer dailyNewCardLimit) {}

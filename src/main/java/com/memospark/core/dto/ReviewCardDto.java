package com.memospark.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record ReviewCardDto(
        Long cardId,
        Long deckId,
        String deckName,
        String front,
        String back,
        String tags,
        int repetitions,
        double easeFactor,
        int interval,
        LocalDate nextReviewDate,
        @JsonProperty("isNew") boolean isNew
) {}

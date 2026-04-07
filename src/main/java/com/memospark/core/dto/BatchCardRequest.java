package com.memospark.core.dto;

import java.util.List;

public record BatchCardRequest(
        List<Long> cardIds,
        Long targetDeckId
) {}

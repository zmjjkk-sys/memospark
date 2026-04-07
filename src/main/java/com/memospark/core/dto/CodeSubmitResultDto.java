package com.memospark.core.dto;

import java.util.List;

public record CodeSubmitResultDto(
        String status,
        int passedCases,
        int totalCases,
        List<TestCaseResult> testCases
) {
    public record TestCaseResult(
            int index,
            boolean passed,
            String input,
            String expectedOutput,
            String actualOutput
    ) {}
}

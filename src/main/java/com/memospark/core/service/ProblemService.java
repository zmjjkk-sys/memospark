package com.memospark.core.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.memospark.core.domain.CodeProblem;
import com.memospark.core.domain.CodeSubmission;
import com.memospark.core.domain.User;
import com.memospark.core.dto.*;
import com.memospark.core.repository.CodeProblemRepository;
import com.memospark.core.repository.CodeSubmissionRepository;
import com.memospark.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProblemService {

    private final CodeProblemRepository problemRepository;
    private final CodeSubmissionRepository submissionRepository;
    private final UserRepository userRepository;
    private final JudgeService judgeService;
    private final ObjectMapper objectMapper;

    @Transactional(readOnly = true)
    public List<CodeProblemDto> getAllProblems(Long userId) {
        return problemRepository.findAllByOrderByProblemNumberAsc()
                .stream().map(p -> toDto(p, userId)).toList();
    }

    @Transactional(readOnly = true)
    public CodeProblemDto getProblem(Long id, Long userId) {
        CodeProblem p = getProblemOrThrow(id);
        return toDto(p, userId);
    }

    @Transactional
    public CodeSubmitResultDto submit(Long problemId, CodeSubmitRequest req, Long userId) {
        CodeProblem problem = getProblemOrThrow(problemId);
        User user = userRepository.findById(userId).orElse(null);

        String driverCode = "java".equals(req.language())
                ? problem.getJavaDriverCode()
                : problem.getPythonDriverCode();

        String fullCode = driverCode.replace("{{USER_CODE}}", req.code());

        List<Map<String, String>> testCases = parseTestCases(problem.getTestCasesJson());

        List<CodeSubmitResultDto.TestCaseResult> results = new ArrayList<>();
        int passed = 0;
        String overallStatus = "ACCEPTED";

        for (int i = 0; i < testCases.size(); i++) {
            Map<String, String> tc = testCases.get(i);
            String input = tc.get("input");
            String expected = tc.get("expectedOutput").trim();

            JudgeService.JudgeResult judgeResult = judgeService.execute(fullCode, req.language(), input);

            String actual = judgeResult.stdout().trim();
            boolean pass;

            if (judgeResult.statusId() == 6) {
                overallStatus = "COMPILE_ERROR";
                actual = judgeResult.compileOutput();
                pass = false;
            } else if (judgeResult.statusId() == 5) {
                overallStatus = "TIME_LIMIT";
                actual = "Time Limit Exceeded";
                pass = false;
            } else if (judgeResult.statusId() != 3) {
                overallStatus = "RUNTIME_ERROR";
                actual = judgeResult.stderr().isEmpty() ? "Runtime Error" : judgeResult.stderr();
                pass = false;
            } else {
                pass = expected.equals(actual);
                if (!pass && "ACCEPTED".equals(overallStatus)) {
                    overallStatus = "WRONG_ANSWER";
                }
            }

            if (pass) passed++;
            results.add(new CodeSubmitResultDto.TestCaseResult(i + 1, pass, input, expected, actual));

            // Stop on compilation/runtime error — fill remaining as not executed
            if (judgeResult.statusId() != 3) {
                for (int j = i + 1; j < testCases.size(); j++) {
                    Map<String, String> remaining = testCases.get(j);
                    results.add(new CodeSubmitResultDto.TestCaseResult(
                            j + 1, false, remaining.get("input"),
                            remaining.get("expectedOutput"), "Not executed"));
                }
                break;
            }
        }

        // Persist submission
        CodeSubmission submission = new CodeSubmission(
                problem, user, req.language(), req.code(), overallStatus, passed, testCases.size());
        submissionRepository.save(submission);

        return new CodeSubmitResultDto(overallStatus, passed, testCases.size(), results);
    }

    @Transactional(readOnly = true)
    public List<CodeSubmissionDto> getSubmissions(Long problemId, Long userId) {
        return submissionRepository.findByProblemIdAndUserIdOrderBySubmittedAtDesc(problemId, userId)
                .stream()
                .map(s -> new CodeSubmissionDto(
                        s.getId(), s.getLanguage(), s.getStatus(),
                        s.getPassedCases(), s.getTotalCases(), s.getSubmittedAt()))
                .toList();
    }

    private CodeProblem getProblemOrThrow(Long id) {
        return problemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Problem not found: " + id));
    }

    @Transactional
    public CodeProblemDto createProblem(CreateProblemRequest req) {
        CodeProblem p = new CodeProblem(
                req.problemNumber(), req.title(), req.difficulty(),
                req.description(), req.javaTemplate(), req.pythonTemplate(),
                req.javaDriverCode(), req.pythonDriverCode(),
                req.testCasesJson(), req.tags());
        p.setHint(req.hint());
        p = problemRepository.save(p);
        return toDto(p, null);
    }

    @Transactional
    public CodeProblemDto updateProblem(Long id, CreateProblemRequest req) {
        CodeProblem p = getProblemOrThrow(id);
        if (req.problemNumber() != null) p.setProblemNumber(req.problemNumber());
        if (req.title() != null) p.setTitle(req.title());
        if (req.difficulty() != null) p.setDifficulty(req.difficulty());
        if (req.description() != null) p.setDescription(req.description());
        if (req.hint() != null) p.setHint(req.hint());
        if (req.javaTemplate() != null) p.setJavaTemplate(req.javaTemplate());
        if (req.pythonTemplate() != null) p.setPythonTemplate(req.pythonTemplate());
        if (req.javaDriverCode() != null) p.setJavaDriverCode(req.javaDriverCode());
        if (req.pythonDriverCode() != null) p.setPythonDriverCode(req.pythonDriverCode());
        if (req.testCasesJson() != null) p.setTestCasesJson(req.testCasesJson());
        if (req.tags() != null) p.setTags(req.tags());
        p = problemRepository.save(p);
        return toDto(p, null);
    }

    @Transactional
    public void deleteProblem(Long id) {
        submissionRepository.deleteByProblemId(id);
        problemRepository.deleteById(id);
    }

    private CodeProblemDto toDto(CodeProblem p, Long userId) {
        boolean accepted = userId != null && submissionRepository.existsByProblemIdAndUserIdAndStatus(p.getId(), userId, "ACCEPTED");
        return new CodeProblemDto(
                p.getId(), p.getProblemNumber(), p.getTitle(), p.getDifficulty(),
                p.getDescription(), p.getHint(),
                p.getJavaTemplate(), p.getPythonTemplate(),
                p.getJavaDriverCode(), p.getPythonDriverCode(),
                p.getTestCasesJson(), p.getTags(), accepted);
    }

    private List<Map<String, String>> parseTestCases(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse test cases", e);
        }
    }
}

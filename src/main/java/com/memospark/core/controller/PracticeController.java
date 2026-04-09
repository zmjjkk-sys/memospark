package com.memospark.core.controller;

import com.memospark.core.dto.*;
import com.memospark.core.service.AiService;
import com.memospark.core.service.ProblemNoteService;
import com.memospark.core.service.ProblemService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/practice")
@RequiredArgsConstructor
public class PracticeController {

    private final ProblemService problemService;
    private final ProblemNoteService noteService;
    private final AiService aiService;
    private final UserService userService;

    @GetMapping("/problems")
    public List<CodeProblemDto> getAllProblems(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return problemService.getAllProblems(userId);
    }

    @GetMapping("/problems/{id}")
    public CodeProblemDto getProblem(@PathVariable Long id,
                                     @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return problemService.getProblem(id, userId);
    }

    @PostMapping("/problems/{id}/submit")
    public CodeSubmitResultDto submit(@PathVariable Long id, @RequestBody CodeSubmitRequest req,
                                      @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return problemService.submit(id, req, userId);
    }

    @GetMapping("/problems/{id}/submissions")
    public List<CodeSubmissionDto> getSubmissions(@PathVariable Long id,
                                                   @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return problemService.getSubmissions(id, userId);
    }

    // ── Admin CRUD ──

    @PostMapping("/problems")
    @ResponseStatus(HttpStatus.CREATED)
    public CodeProblemDto createProblem(@RequestBody CreateProblemRequest req) {
        return problemService.createProblem(req);
    }

    @PutMapping("/problems/{id}")
    public CodeProblemDto updateProblem(@PathVariable Long id, @RequestBody CreateProblemRequest req) {
        return problemService.updateProblem(id, req);
    }

    @DeleteMapping("/problems/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProblem(@PathVariable Long id) {
        problemService.deleteProblem(id);
    }

    // ── Notebook Endpoints ──

    @GetMapping("/notebook")
    public List<ProblemNoteDto> getNotebook(
            @RequestParam(required = false) String type,
            @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        if (type != null && !type.isBlank()) {
            return noteService.getNotesByType(userId, type);
        }
        return noteService.getAllNotes(userId);
    }

    @GetMapping("/notebook/summary")
    public Map<String, Object> getNotebookSummary(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.getSummary(userId);
    }

    @GetMapping("/notebook/due")
    public List<ProblemNoteDto> getDueNotes(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.getDueNotes(userId);
    }

    @PostMapping("/notebook/{problemId}/toggle-star")
    public Map<String, Object> toggleStar(@PathVariable Long problemId,
                                           @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.toggleStar(userId, problemId);
    }

    @PostMapping("/notebook/{problemId}/toggle-todo")
    public Map<String, Object> toggleTodo(@PathVariable Long problemId,
                                           @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.toggleTodo(userId, problemId);
    }

    public record WrongNoteRequest(String note, String errorReason) {}

    @PostMapping("/notebook/{problemId}/wrong")
    public ProblemNoteDto saveWrongNote(@PathVariable Long problemId,
                                        @RequestBody WrongNoteRequest req,
                                        @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.saveWrongNote(userId, problemId, req.note(), req.errorReason());
    }

    @DeleteMapping("/notebook/{problemId}/wrong")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeWrongNote(@PathVariable Long problemId,
                                @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        noteService.removeWrongNote(userId, problemId);
    }

    public record RetryRequest(int quality) {}

    @PostMapping("/notebook/{problemId}/retry")
    public ProblemNoteDto recordRetry(@PathVariable Long problemId,
                                      @RequestBody RetryRequest req,
                                      @AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        return noteService.recordRetry(userId, problemId, req.quality());
    }

    @PostMapping("/notebook/ai-analysis")
    public WeaknessAnalysisDto aiAnalysis(@AuthenticationPrincipal UserDetails userDetails) {
        Long userId = userService.getUserId(userDetails.getUsername());
        WeaknessAnalysisDto data = noteService.getWeaknessData(userId);
        if (data.totalWrong() == 0) {
            return data;
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Error reasons: ");
        data.errorReasonCounts().forEach((k, v) -> summary.append(k).append("=").append(v).append(", "));
        summary.append("\nWeak categories: ");
        data.categoryCounts().forEach((k, v) -> summary.append(k).append("=").append(v).append(", "));
        summary.append("\nTotal wrong problems: ").append(data.totalWrong());

        String aiText = aiService.analyzeWeakness(summary.toString());
        return new WeaknessAnalysisDto(data.errorReasonCounts(), data.categoryCounts(), data.totalWrong(), aiText);
    }
}

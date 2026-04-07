package com.memospark.core.controller;

import com.memospark.core.dto.*;
import com.memospark.core.service.ProblemService;
import com.memospark.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/practice")
@RequiredArgsConstructor
public class PracticeController {

    private final ProblemService problemService;
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
}

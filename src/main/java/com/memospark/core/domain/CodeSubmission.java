package com.memospark.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "code_submissions")
@Getter
@Setter
@NoArgsConstructor
public class CodeSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "problem_id", nullable = false)
    private CodeProblem problem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, length = 20)
    private String language;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String code;

    @Column(nullable = false, length = 30)
    private String status;

    @Column(nullable = false)
    private int passedCases;

    @Column(nullable = false)
    private int totalCases;

    @Column(nullable = false, updatable = false)
    private LocalDateTime submittedAt = LocalDateTime.now();

    public CodeSubmission(CodeProblem problem, User user, String language, String code,
                          String status, int passedCases, int totalCases) {
        this.problem = problem;
        this.user = user;
        this.language = language;
        this.code = code;
        this.status = status;
        this.passedCases = passedCases;
        this.totalCases = totalCases;
    }
}

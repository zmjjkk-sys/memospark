package com.memospark.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "problem_notes", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "problem_id"}))
@Getter
@Setter
@NoArgsConstructor
public class ProblemNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id")
    private CodeProblem problem;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private BookmarkType bookmarkType;

    @Column(nullable = false)
    private boolean starred = false;

    @Column(columnDefinition = "TEXT")
    private String note;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ErrorReason errorReason;

    @Column(nullable = false)
    private int retryCount = 0;

    @Column(nullable = false)
    private double easeFactor = 2.5;

    @Column(nullable = false)
    private int retryInterval = 0;

    private LocalDate nextRetryDate;

    private LocalDate lastRetryDate;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}

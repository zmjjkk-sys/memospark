package com.memospark.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "code_problems")
@Getter
@Setter
@NoArgsConstructor
public class CodeProblem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer problemNumber;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false, length = 20)
    private String difficulty;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String javaTemplate;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String pythonTemplate;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String javaDriverCode;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String pythonDriverCode;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String testCasesJson;

    @Column(columnDefinition = "TEXT")
    private String hint;

    @Column(length = 500)
    private String tags;

    public CodeProblem(Integer problemNumber, String title, String difficulty,
                       String description, String javaTemplate, String pythonTemplate,
                       String javaDriverCode, String pythonDriverCode,
                       String testCasesJson, String tags) {
        this.problemNumber = problemNumber;
        this.title = title;
        this.difficulty = difficulty;
        this.description = description;
        this.javaTemplate = javaTemplate;
        this.pythonTemplate = pythonTemplate;
        this.javaDriverCode = javaDriverCode;
        this.pythonDriverCode = pythonDriverCode;
        this.testCasesJson = testCasesJson;
        this.tags = tags;
    }
}

package com.memospark.core.repository;

import com.memospark.core.domain.CodeSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeSubmissionRepository extends JpaRepository<CodeSubmission, Long> {

    List<CodeSubmission> findByProblemIdOrderBySubmittedAtDesc(Long problemId);

    boolean existsByProblemIdAndStatus(Long problemId, String status);

    List<CodeSubmission> findByProblemIdAndUserIdOrderBySubmittedAtDesc(Long problemId, Long userId);

    boolean existsByProblemIdAndUserIdAndStatus(Long problemId, Long userId, String status);

    void deleteByProblemId(Long problemId);
}

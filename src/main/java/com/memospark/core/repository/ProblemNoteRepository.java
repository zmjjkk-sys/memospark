package com.memospark.core.repository;

import com.memospark.core.domain.BookmarkType;
import com.memospark.core.domain.ProblemNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.Modifying;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ProblemNoteRepository extends JpaRepository<ProblemNote, Long> {

    Optional<ProblemNote> findByUserIdAndProblemId(Long userId, Long problemId);

    List<ProblemNote> findByUserIdOrderByUpdatedAtDesc(Long userId);

    List<ProblemNote> findByUserIdAndBookmarkTypeOrderByUpdatedAtDesc(Long userId, BookmarkType bookmarkType);

    List<ProblemNote> findByUserIdAndNextRetryDateLessThanEqual(Long userId, LocalDate date);

    int countByUserIdAndBookmarkType(Long userId, BookmarkType bookmarkType);

    List<ProblemNote> findByUserIdAndStarredTrueOrderByUpdatedAtDesc(Long userId);

    int countByUserIdAndStarredTrue(Long userId);

    boolean existsByUserIdAndProblemId(Long userId, Long problemId);

    @Query("SELECT n.errorReason, COUNT(n) FROM ProblemNote n WHERE n.user.id = :userId AND n.bookmarkType = 'WRONG' AND n.errorReason IS NOT NULL GROUP BY n.errorReason")
    List<Object[]> countWrongByErrorReason(Long userId);

    @Query("SELECT n.problem.category, COUNT(n) FROM ProblemNote n WHERE n.user.id = :userId AND n.bookmarkType = 'WRONG' GROUP BY n.problem.category")
    List<Object[]> countWrongByCategory(Long userId);

    @Modifying
    @Query("UPDATE ProblemNote n SET n.problem = null WHERE n.problem.id = :problemId")
    void clearProblemReference(Long problemId);
}

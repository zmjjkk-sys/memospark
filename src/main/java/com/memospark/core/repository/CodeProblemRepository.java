package com.memospark.core.repository;

import com.memospark.core.domain.CodeProblem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CodeProblemRepository extends JpaRepository<CodeProblem, Long> {

    List<CodeProblem> findAllByOrderByProblemNumberAsc();

    Optional<CodeProblem> findByProblemNumber(Integer problemNumber);
}

package com.memospark.core.init;

import com.memospark.core.domain.CodeProblem;
import com.memospark.core.repository.CodeProblemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Slf4j
@Order(1)
public class CodeProblemDataInitializer implements ApplicationRunner {

    private final CodeProblemRepository codeProblemRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        List<String[]> problems = CodeProblemData.problems();
        int inserted = 0;
        int updated = 0;

        for (String[] p : problems) {
            int problemNumber = Integer.parseInt(p[0]);
            String category = p.length > 10 ? p[10] : null;

            Optional<CodeProblem> existing = codeProblemRepository.findByProblemNumber(problemNumber);
            if (existing.isPresent()) {
                // Backfill category if missing
                CodeProblem ep = existing.get();
                if (category != null && (ep.getCategory() == null || ep.getCategory().isBlank())) {
                    ep.setCategory(category);
                    codeProblemRepository.save(ep);
                    updated++;
                }
                continue;
            }

            CodeProblem problem = new CodeProblem(
                    problemNumber,
                    p[1],  // title
                    p[2],  // difficulty
                    p[3],  // description
                    p[4],  // javaTemplate
                    p[5],  // pythonTemplate
                    p[6],  // javaDriverCode
                    p[7],  // pythonDriverCode
                    p[8],  // testCasesJson
                    p[9]   // tags
            );
            problem.setCategory(category);
            codeProblemRepository.save(problem);
            inserted++;
        }

        if (inserted > 0 || updated > 0) {
            log.info("Code problems: {} inserted, {} updated (category backfill)", inserted, updated);
        }
    }
}

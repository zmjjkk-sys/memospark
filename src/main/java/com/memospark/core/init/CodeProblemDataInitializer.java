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

        for (String[] p : problems) {
            int problemNumber = Integer.parseInt(p[0]);

            // Idempotent: skip if already exists
            if (codeProblemRepository.findByProblemNumber(problemNumber).isPresent()) {
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
            codeProblemRepository.save(problem);
            inserted++;
        }

        if (inserted > 0) {
            log.info("Initialized {} code problems", inserted);
        }
    }
}

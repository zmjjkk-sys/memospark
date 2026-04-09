package com.memospark.core.init;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregates all LeetCode Hot 100 problems from category-specific data files.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemData {

    private CodeProblemData() {}

    public static List<String[]> problems() {
        List<String[]> all = new ArrayList<>();
        all.addAll(CodeProblemDataHash.problems());
        all.addAll(CodeProblemDataTwoPointers.problems());
        all.addAll(CodeProblemDataSlidingWindow.problems());
        all.addAll(CodeProblemDataSubstring.problems());
        all.addAll(CodeProblemDataArray.problems());
        all.addAll(CodeProblemDataMatrix.problems());
        all.addAll(CodeProblemDataLinkedList.problems());
        all.addAll(CodeProblemDataBinaryTree.problems());
        all.addAll(CodeProblemDataGraph.problems());
        all.addAll(CodeProblemDataBacktracking.problems());
        all.addAll(CodeProblemDataBinarySearch.problems());
        all.addAll(CodeProblemDataStack.problems());
        all.addAll(CodeProblemDataHeap.problems());
        all.addAll(CodeProblemDataGreedy.problems());
        all.addAll(CodeProblemDataDP.problems());
        all.addAll(CodeProblemDataMultiDP.problems());
        all.addAll(CodeProblemDataTechniques.problems());
        return all;
    }
}

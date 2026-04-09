package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — Category: 回溯 (Backtracking)
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataBacktracking {

    private CodeProblemDataBacktracking() {}

    public static List<String[]> problems() {
        return List.of(
                permutations(),
                subsets(),
                letterCombinations(),
                combinationSum(),
                generateParentheses(),
                wordSearch(),
                palindromePartitioning(),
                nQueens()
        );
    }

    // ── 46. Permutations (Medium) ─────────────────────────────
    private static String[] permutations() {
        return new String[]{
                "46", "Permutations", "Medium",
                // description
                """
                Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

                Example:
                  Input: nums = [1,2,3]
                  Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

                Example 2:
                  Input: nums = [0,1]
                  Output: [[0,1],[1,0]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> permute(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def permute(self, nums: list[int]) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] parts = sc.nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        List<List<Integer>> result = new Solution().permute(nums);
                        // Sort each permutation, then sort the list for consistent output
                        result.sort((a, b) -> {
                            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
                            }
                            return a.size() - b.size();
                        });
                        StringBuilder sb = new StringBuilder("[");
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append("[");
                            for (int j = 0; j < result.get(i).size(); j++) {
                                if (j > 0) sb.append(",");
                                sb.append(result.get(i).get(j));
                            }
                            sb.append("]");
                        }
                        sb.append("]");
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                result = Solution().permute(nums)
                result.sort()
                parts = []
                for t in result:
                    parts.append("[" + ",".join(map(str, t)) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3", "expectedOutput": "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]"},
                  {"input": "0,1", "expectedOutput": "[[0,1],[1,0]]"},
                  {"input": "1", "expectedOutput": "[[1]]"}
                ]""",
                // tags
                "array,backtracking",
                // category
                "回溯"
        };
    }

    // ── 78. Subsets (Medium) ──────────────────────────────────
    private static String[] subsets() {
        return new String[]{
                "78", "Subsets", "Medium",
                // description
                """
                Given an integer array nums of unique elements, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.

                Example:
                  Input: nums = [1,2,3]
                  Output: [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]

                Example 2:
                  Input: nums = [0]
                  Output: [[],[0]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> subsets(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def subsets(self, nums: list[int]) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] parts = sc.nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        List<List<Integer>> result = new Solution().subsets(nums);
                        // Sort each subset, then sort the list for consistent output
                        for (List<Integer> sub : result) Collections.sort(sub);
                        result.sort((a, b) -> {
                            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
                            }
                            return a.size() - b.size();
                        });
                        StringBuilder sb = new StringBuilder("[");
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append("[");
                            for (int j = 0; j < result.get(i).size(); j++) {
                                if (j > 0) sb.append(",");
                                sb.append(result.get(i).get(j));
                            }
                            sb.append("]");
                        }
                        sb.append("]");
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                result = Solution().subsets(nums)
                result = [sorted(s) for s in result]
                result.sort(key=lambda x: (len(x), x))
                parts = []
                for s in result:
                    parts.append("[" + ",".join(map(str, s)) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3", "expectedOutput": "[[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]"},
                  {"input": "0", "expectedOutput": "[[],[0]]"}
                ]""",
                // tags
                "array,backtracking,bit-manipulation",
                // category
                "回溯"
        };
    }

    // ── 17. Letter Combinations of a Phone Number (Medium) ────
    private static String[] letterCombinations() {
        return new String[]{
                "17", "Letter Combinations of a Phone Number", "Medium",
                // description
                """
                Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

                A mapping of digits to letters (just like on the telephone buttons):
                  2 → abc, 3 → def, 4 → ghi, 5 → jkl, 6 → mno, 7 → pqrs, 8 → tuv, 9 → wxyz

                Example:
                  Input: digits = "23"
                  Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

                Example 2:
                  Input: digits = ""
                  Output: []""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<String> letterCombinations(String digits) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def letterCombinations(self, digits: str) -> list[str]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String digits = new Scanner(System.in).nextLine().trim();
                        List<String> result = new Solution().letterCombinations(digits);
                        if (result == null || result.isEmpty()) {
                            System.out.println("");
                        } else {
                            Collections.sort(result);
                            System.out.println(String.join(",", result));
                        }
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                digits = input().strip()
                result = Solution().letterCombinations(digits)
                if not result:
                    print("")
                else:
                    result.sort()
                    print(",".join(result))""",
                // testCasesJson
                """
                [
                  {"input": "23", "expectedOutput": "ad,ae,af,bd,be,bf,cd,ce,cf"},
                  {"input": "", "expectedOutput": ""}
                ]""",
                // tags
                "hash-table,string,backtracking",
                // category
                "回溯"
        };
    }

    // ── 39. Combination Sum (Medium) ──────────────────────────
    private static String[] combinationSum() {
        return new String[]{
                "39", "Combination Sum", "Medium",
                // description
                """
                Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
                The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

                Example:
                  Input: candidates = [2,3,6,7], target = 7
                  Output: [[2,2,3],[7]]

                Example 2:
                  Input: candidates = [2,3,5], target = 8
                  Output: [[2,2,2,2],[2,3,3],[3,5]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> combinationSum(int[] candidates, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def combinationSum(self, candidates: list[int], target: int) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] parts = sc.nextLine().trim().split(",");
                        int[] candidates = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) candidates[i] = Integer.parseInt(parts[i].trim());
                        int target = Integer.parseInt(sc.nextLine().trim());
                        List<List<Integer>> result = new Solution().combinationSum(candidates, target);
                        // Sort each combination, then sort the list for consistent output
                        for (List<Integer> combo : result) Collections.sort(combo);
                        result.sort((a, b) -> {
                            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
                            }
                            return a.size() - b.size();
                        });
                        StringBuilder sb = new StringBuilder("[");
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append("[");
                            for (int j = 0; j < result.get(i).size(); j++) {
                                if (j > 0) sb.append(",");
                                sb.append(result.get(i).get(j));
                            }
                            sb.append("]");
                        }
                        sb.append("]");
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                parts = input().strip().split(",")
                candidates = [int(x) for x in parts]
                target = int(input().strip())
                result = Solution().combinationSum(candidates, target)
                result = [sorted(c) for c in result]
                result.sort(key=lambda x: (len(x), x))
                parts = []
                for c in result:
                    parts.append("[" + ",".join(map(str, c)) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "2,3,6,7\\n7", "expectedOutput": "[[2,2,3],[7]]"},
                  {"input": "2,3,5\\n8", "expectedOutput": "[[2,2,2,2],[2,3,3],[3,5]]"}
                ]""",
                // tags
                "array,backtracking",
                // category
                "回溯"
        };
    }

    // ── 22. Generate Parentheses (Medium) ──────────────────────
    private static String[] generateParentheses() {
        return new String[]{
                "22", "Generate Parentheses", "Medium",
                // description
                """
                Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

                Example:
                  Input: n = 3
                  Output: ["((()))","(()())","(())()","()(())","()()()"]

                Example 2:
                  Input: n = 1
                  Output: ["()"]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<String> generateParenthesis(int n) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def generateParenthesis(self, n: int) -> list[str]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int n = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        List<String> result = new Solution().generateParenthesis(n);
                        if (result == null || result.isEmpty()) {
                            System.out.println("");
                        } else {
                            Collections.sort(result);
                            System.out.println(String.join(",", result));
                        }
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                n = int(input().strip())
                result = Solution().generateParenthesis(n)
                if not result:
                    print("")
                else:
                    result.sort()
                    print(",".join(result))""",
                // testCasesJson
                """
                [
                  {"input": "3", "expectedOutput": "((())),(()()),(())(),()(()),()()()"},
                  {"input": "1", "expectedOutput": "()"}
                ]""",
                // tags
                "string,dynamic-programming,backtracking",
                // category
                "回溯"
        };
    }

    // ── 79. Word Search (Medium) ───────────────────────────────
    private static String[] wordSearch() {
        return new String[]{
                "79", "Word Search", "Medium",
                // description
                """
                Given an m x n grid of characters board and a string word, return true if word exists in the grid.
                The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

                Example:
                  Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
                  Output: true

                Example 2:
                  Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
                  Output: true

                Example 3:
                  Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
                  Output: false

                Input format:
                  Line 1: number of rows
                  Next lines: each row as comma-separated characters
                  Last line: the word to search""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public boolean exist(char[][] board, String word) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def exist(self, board: list[list[str]], word: str) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int rows = Integer.parseInt(sc.nextLine().trim());
                        char[][] board = new char[rows][];
                        for (int i = 0; i < rows; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            board[i] = new char[parts.length];
                            for (int j = 0; j < parts.length; j++) board[i][j] = parts[j].charAt(0);
                        }
                        String word = sc.nextLine().trim();
                        System.out.println(new Solution().exist(board, word));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                board = []
                for _ in range(rows):
                    board.append(input().strip().split(","))
                word = input().strip()
                print(str(Solution().exist(board, word)).lower())""",
                // testCasesJson
                """
                [
                  {"input": "3\\nA,B,C,E\\nS,F,C,S\\nA,D,E,E\\nABCCED", "expectedOutput": "true"},
                  {"input": "3\\nA,B,C,E\\nS,F,C,S\\nA,D,E,E\\nSEE", "expectedOutput": "true"},
                  {"input": "3\\nA,B,C,E\\nS,F,C,S\\nA,D,E,E\\nABCB", "expectedOutput": "false"}
                ]""",
                // tags
                "array,backtracking,matrix",
                // category
                "回溯"
        };
    }

    // ── 131. Palindrome Partitioning (Medium) ──────────────────
    private static String[] palindromePartitioning() {
        return new String[]{
                "131", "Palindrome Partitioning", "Medium",
                // description
                """
                Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

                Example:
                  Input: s = "aab"
                  Output: [["a","a","b"],["aa","b"]]

                Example 2:
                  Input: s = "a"
                  Output: [["a"]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<String>> partition(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def partition(self, s: str) -> list[list[str]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        List<List<String>> result = new Solution().partition(s);
                        // Sort each partition list, then sort all partitions for consistent output
                        result.sort((a, b) -> {
                            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                                int cmp = a.get(i).compareTo(b.get(i));
                                if (cmp != 0) return cmp;
                            }
                            return a.size() - b.size();
                        });
                        StringBuilder sb = new StringBuilder("[");
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append("[");
                            List<String> part = result.get(i);
                            for (int j = 0; j < part.size(); j++) {
                                if (j > 0) sb.append(",");
                                sb.append("\\"").append(part.get(j)).append("\\"");
                            }
                            sb.append("]");
                        }
                        sb.append("]");
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                import json

                {{USER_CODE}}

                s = input().strip()
                result = Solution().partition(s)
                result.sort()
                print(json.dumps(result))""",
                // testCasesJson
                """
                [
                  {"input": "aab", "expectedOutput": "[[\\"a\\",\\"a\\",\\"b\\"],[\\"aa\\",\\"b\\"]]"},
                  {"input": "a", "expectedOutput": "[[\\"a\\"]]"}
                ]""",
                // tags
                "string,dynamic-programming,backtracking",
                // category
                "回溯"
        };
    }

    // ── 51. N-Queens (Hard) ─────────────────────────────────────
    private static String[] nQueens() {
        return new String[]{
                "51", "N-Queens", "Hard",
                """
                The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

                Given an integer n, return all distinct solutions to the n-queens puzzle. Each solution contains a distinct board configuration where 'Q' indicates a queen and '.' indicates an empty space.

                Example:
                  Input: n = 4
                  Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]""",
                """
                import java.util.*;

                class Solution {
                    public List<List<String>> solveNQueens(int n) {

                    }
                }""",
                """
                class Solution:
                    def solveNQueens(self, n: int) -> list[list[str]]:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int n = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        List<List<String>> result = new Solution().solveNQueens(n);
                        result.sort((a, b) -> {
                            for (int i = 0; i < a.size(); i++) {
                                int cmp = a.get(i).compareTo(b.get(i));
                                if (cmp != 0) return cmp;
                            }
                            return 0;
                        });
                        System.out.println(result.size());
                    }
                }""",
                """
                {{USER_CODE}}

                n = int(input().strip())
                result = Solution().solveNQueens(n)
                print(len(result))""",
                """
                [
                  {"input": "4", "expectedOutput": "2"},
                  {"input": "1", "expectedOutput": "1"}
                ]""",
                "array,backtracking",
                "回溯"
        };
    }
}

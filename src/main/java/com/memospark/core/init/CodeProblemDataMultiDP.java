package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems for category: Multi-dimensional Dynamic Programming.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataMultiDP {

    private CodeProblemDataMultiDP() {}

    public static List<String[]> problems() {
        return List.of(
                uniquePaths(),
                minimumPathSum(),
                longestPalindromicSubstring(),
                longestCommonSubsequence(),
                editDistance()
        );
    }

    // ── 62. Unique Paths (Medium) ─────────────────────────────
    private static String[] uniquePaths() {
        return new String[]{
                "62", "Unique Paths", "Medium",
                // description
                """
                There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

                Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

                Example 1:
                  Input: m = 3, n = 7
                  Output: 28

                Example 2:
                  Input: m = 3, n = 2
                  Output: 3
                  Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
                  1. Right -> Down -> Down
                  2. Down -> Down -> Right
                  3. Down -> Right -> Down""",
                // javaTemplate
                """
                class Solution {
                    public int uniquePaths(int m, int n) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def uniquePaths(self, m: int, n: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int m = Integer.parseInt(sc.nextLine().trim());
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().uniquePaths(m, n));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                m = int(input().strip())
                n = int(input().strip())
                print(Solution().uniquePaths(m, n))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n7", "expectedOutput": "28"},
                  {"input": "3\\n2", "expectedOutput": "3"}
                ]""",
                // tags
                "math,dynamic-programming,combinatorics",
                // category
                "\u591A\u7EF4\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 64. Minimum Path Sum (Medium) ─────────────────────────
    private static String[] minimumPathSum() {
        return new String[]{
                "64", "Minimum Path Sum", "Medium",
                // description
                """
                Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

                Note: You can only move either down or right at any point in time.

                Example 1:
                  Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
                  Output: 7
                  Explanation: Because the path 1 -> 3 -> 1 -> 1 -> 1 minimizes the sum.

                Example 2:
                  Input: grid = [[1,2,3],[4,5,6]]
                  Output: 12""",
                // javaTemplate
                """
                class Solution {
                    public int minPathSum(int[][] grid) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def minPathSum(self, grid: list[list[int]]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int rows = Integer.parseInt(sc.nextLine().trim());
                        int[][] grid = new int[rows][];
                        for (int i = 0; i < rows; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            grid[i] = new int[parts.length];
                            for (int j = 0; j < parts.length; j++) grid[i][j] = Integer.parseInt(parts[j].trim());
                        }
                        System.out.println(new Solution().minPathSum(grid));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                grid = []
                for _ in range(rows):
                    grid.append(list(map(int, input().strip().split(","))))
                print(Solution().minPathSum(grid))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n1,3,1\\n1,5,1\\n4,2,1", "expectedOutput": "7"},
                  {"input": "2\\n1,2,3\\n4,5,6", "expectedOutput": "12"}
                ]""",
                // tags
                "array,dynamic-programming,matrix",
                // category
                "\u591A\u7EF4\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 5. Longest Palindromic Substring (Medium) ─────────────
    private static String[] longestPalindromicSubstring() {
        return new String[]{
                "5", "Longest Palindromic Substring", "Medium",
                // description
                """
                Given a string s, return the longest palindromic substring in s.

                Example 1:
                  Input: s = "cbbd"
                  Output: "bb"

                Example 2:
                  Input: s = "a"
                  Output: "a"

                Example 3:
                  Input: s = "racecar"
                  Output: "racecar" """,
                // javaTemplate
                """
                class Solution {
                    public String longestPalindrome(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def longestPalindrome(self, s: str) -> str:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().longestPalindrome(s));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                print(Solution().longestPalindrome(s))""",
                // testCasesJson
                """
                [
                  {"input": "cbbd", "expectedOutput": "bb"},
                  {"input": "a", "expectedOutput": "a"},
                  {"input": "racecar", "expectedOutput": "racecar"}
                ]""",
                // tags
                "string,dynamic-programming",
                // category
                "\u591A\u7EF4\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 1143. Longest Common Subsequence (Medium) ─────────────
    private static String[] longestCommonSubsequence() {
        return new String[]{
                "1143", "Longest Common Subsequence", "Medium",
                // description
                """
                Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

                A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

                For example, "ace" is a subsequence of "abcde".

                A common subsequence of two strings is a subsequence that is common to both strings.

                Example 1:
                  Input: text1 = "abcde", text2 = "ace"
                  Output: 3
                  Explanation: The longest common subsequence is "ace" and its length is 3.

                Example 2:
                  Input: text1 = "abc", text2 = "abc"
                  Output: 3

                Example 3:
                  Input: text1 = "abc", text2 = "def"
                  Output: 0""",
                // javaTemplate
                """
                class Solution {
                    public int longestCommonSubsequence(String text1, String text2) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String text1 = sc.nextLine().trim();
                        String text2 = sc.nextLine().trim();
                        System.out.println(new Solution().longestCommonSubsequence(text1, text2));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                text1 = input().strip()
                text2 = input().strip()
                print(Solution().longestCommonSubsequence(text1, text2))""",
                // testCasesJson
                """
                [
                  {"input": "abcde\\nace", "expectedOutput": "3"},
                  {"input": "abc\\nabc", "expectedOutput": "3"},
                  {"input": "abc\\ndef", "expectedOutput": "0"}
                ]""",
                // tags
                "string,dynamic-programming",
                // category
                "\u591A\u7EF4\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 72. Edit Distance (Medium) ────────────────────────────
    private static String[] editDistance() {
        return new String[]{
                "72", "Edit Distance", "Medium",
                // description
                """
                Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

                You have the following three operations permitted on a word:
                - Insert a character
                - Delete a character
                - Replace a character

                Example 1:
                  Input: word1 = "horse", word2 = "ros"
                  Output: 3
                  Explanation:
                  horse -> rorse (replace 'h' with 'r')
                  rorse -> rose (remove 'r')
                  rose -> ros (remove 'e')

                Example 2:
                  Input: word1 = "intention", word2 = "execution"
                  Output: 5
                  Explanation:
                  intention -> inention (remove 't')
                  inention -> enention (replace 'i' with 'e')
                  enention -> exention (replace 'n' with 'x')
                  exention -> exection (replace 'n' with 'c')
                  exection -> execution (insert 'u')""",
                // javaTemplate
                """
                class Solution {
                    public int minDistance(String word1, String word2) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def minDistance(self, word1: str, word2: str) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String word1 = sc.nextLine().trim();
                        String word2 = sc.nextLine().trim();
                        System.out.println(new Solution().minDistance(word1, word2));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                word1 = input().strip()
                word2 = input().strip()
                print(Solution().minDistance(word1, word2))""",
                // testCasesJson
                """
                [
                  {"input": "horse\\nros", "expectedOutput": "3"},
                  {"input": "intention\\nexecution", "expectedOutput": "5"}
                ]""",
                // tags
                "string,dynamic-programming",
                // category
                "\u591A\u7EF4\u52A8\u6001\u89C4\u5212"
        };
    }
}

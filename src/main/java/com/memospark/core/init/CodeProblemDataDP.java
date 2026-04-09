package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems for category: Dynamic Programming.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataDP {

    private CodeProblemDataDP() {}

    public static List<String[]> problems() {
        return List.of(
                climbingStairs(),
                pascalsTriangle(),
                houseRobber(),
                perfectSquares(),
                coinChange(),
                wordBreak(),
                longestIncreasingSubsequence(),
                maximumProductSubarray(),
                partitionEqualSubsetSum(),
                longestValidParentheses()
        );
    }

    // ── 70. Climbing Stairs (Easy) ────────────────────────────
    private static String[] climbingStairs() {
        return new String[]{
                "70", "Climbing Stairs", "Easy",
                // description
                """
                You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

                Example 1:
                  Input: n = 2
                  Output: 2
                  Explanation: There are two ways: 1+1, 2

                Example 2:
                  Input: n = 3
                  Output: 3
                  Explanation: There are three ways: 1+1+1, 1+2, 2+1""",
                // javaTemplate
                """
                class Solution {
                    public int climbStairs(int n) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def climbStairs(self, n: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int n = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(new Solution().climbStairs(n));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                n = int(input().strip())
                print(Solution().climbStairs(n))""",
                // testCasesJson
                """
                [
                  {"input": "2", "expectedOutput": "2"},
                  {"input": "3", "expectedOutput": "3"},
                  {"input": "5", "expectedOutput": "8"}
                ]""",
                // tags
                "math,dynamic-programming,memoization",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 118. Pascal's Triangle (Easy) ─────────────────────────
    private static String[] pascalsTriangle() {
        return new String[]{
                "118", "Pascal's Triangle", "Easy",
                // description
                """
                Given an integer numRows, return the first numRows of Pascal's triangle.

                In Pascal's triangle, each number is the sum of the two numbers directly above it.

                Example 1:
                  Input: numRows = 5
                  Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

                Example 2:
                  Input: numRows = 1
                  Output: [[1]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> generate(int numRows) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def generate(self, numRows: int) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int numRows = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        List<List<Integer>> result = new Solution().generate(numRows);
                        StringBuilder sb = new StringBuilder("[");
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append("[");
                            List<Integer> row = result.get(i);
                            for (int j = 0; j < row.size(); j++) {
                                if (j > 0) sb.append(",");
                                sb.append(row.get(j));
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

                numRows = int(input().strip())
                result = Solution().generate(numRows)
                parts = []
                for row in result:
                    parts.append("[" + ",".join(map(str, row)) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "5", "expectedOutput": "[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]"},
                  {"input": "1", "expectedOutput": "[[1]]"}
                ]""",
                // tags
                "array,dynamic-programming",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 198. House Robber (Medium) ─────────────────────────────
    private static String[] houseRobber() {
        return new String[]{
                "198", "House Robber", "Medium",
                // description
                """
                You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. Adjacent houses have security systems connected — if two adjacent houses were broken into on the same night, it will automatically contact the police.

                Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

                Example 1:
                  Input: nums = [1,2,3,1]
                  Output: 4
                  Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total = 1 + 3 = 4.

                Example 2:
                  Input: nums = [2,7,9,3,1]
                  Output: 12
                  Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1). Total = 2 + 9 + 1 = 12.""",
                // javaTemplate
                """
                class Solution {
                    public int rob(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def rob(self, nums: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().rob(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().rob(nums))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,1", "expectedOutput": "4"},
                  {"input": "2,7,9,3,1", "expectedOutput": "12"}
                ]""",
                // tags
                "array,dynamic-programming",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 279. Perfect Squares (Medium) ─────────────────────────
    private static String[] perfectSquares() {
        return new String[]{
                "279", "Perfect Squares", "Medium",
                // description
                """
                Given an integer n, return the least number of perfect square numbers that sum to n.

                A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

                Example 1:
                  Input: n = 12
                  Output: 3
                  Explanation: 12 = 4 + 4 + 4

                Example 2:
                  Input: n = 13
                  Output: 2
                  Explanation: 13 = 4 + 9""",
                // javaTemplate
                """
                class Solution {
                    public int numSquares(int n) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def numSquares(self, n: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int n = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(new Solution().numSquares(n));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                n = int(input().strip())
                print(Solution().numSquares(n))""",
                // testCasesJson
                """
                [
                  {"input": "12", "expectedOutput": "3"},
                  {"input": "13", "expectedOutput": "2"}
                ]""",
                // tags
                "math,dynamic-programming,bfs",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 322. Coin Change (Medium) ─────────────────────────────
    private static String[] coinChange() {
        return new String[]{
                "322", "Coin Change", "Medium",
                // description
                """
                You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money. Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

                You may assume that you have an infinite number of each kind of coin.

                Example 1:
                  Input: coins = [1,2,5], amount = 11
                  Output: 3
                  Explanation: 11 = 5 + 5 + 1

                Example 2:
                  Input: coins = [2], amount = 3
                  Output: -1

                Example 3:
                  Input: coins = [1], amount = 0
                  Output: 0""",
                // javaTemplate
                """
                class Solution {
                    public int coinChange(int[] coins, int amount) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def coinChange(self, coins: list[int], amount: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] parts = sc.nextLine().trim().split(",");
                        int[] coins = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) coins[i] = Integer.parseInt(parts[i].trim());
                        int amount = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().coinChange(coins, amount));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                coins = list(map(int, input().strip().split(",")))
                amount = int(input().strip())
                print(Solution().coinChange(coins, amount))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,5\\n11", "expectedOutput": "3"},
                  {"input": "2\\n3", "expectedOutput": "-1"},
                  {"input": "1\\n0", "expectedOutput": "0"}
                ]""",
                // tags
                "array,dynamic-programming,bfs",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 139. Word Break (Medium) ──────────────────────────────
    private static String[] wordBreak() {
        return new String[]{
                "139", "Word Break", "Medium",
                // description
                """
                Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

                Note that the same word in the dictionary may be reused multiple times in the segmentation.

                Example 1:
                  Input: s = "leetcode", wordDict = ["leet","code"]
                  Output: true
                  Explanation: Return true because "leetcode" can be segmented as "leet code".

                Example 2:
                  Input: s = "applepenapple", wordDict = ["apple","pen"]
                  Output: true
                  Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".

                Example 3:
                  Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
                  Output: false""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public boolean wordBreak(String s, List<String> wordDict) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def wordBreak(self, s: str, wordDict: list[str]) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String s = sc.nextLine().trim();
                        String[] parts = sc.nextLine().trim().split(",");
                        List<String> wordDict = new ArrayList<>();
                        for (String p : parts) wordDict.add(p.trim());
                        System.out.println(new Solution().wordBreak(s, wordDict));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                word_dict = [w.strip() for w in input().strip().split(",")]
                result = Solution().wordBreak(s, word_dict)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "leetcode\\nleet,code", "expectedOutput": "true"},
                  {"input": "applepenapple\\napple,pen", "expectedOutput": "true"},
                  {"input": "catsandog\\ncats,dog,sand,and,cat", "expectedOutput": "false"}
                ]""",
                // tags
                "array,hash-table,string,dynamic-programming,trie,memoization",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 300. Longest Increasing Subsequence (Medium) ──────────
    private static String[] longestIncreasingSubsequence() {
        return new String[]{
                "300", "Longest Increasing Subsequence", "Medium",
                // description
                """
                Given an integer array nums, return the length of the longest strictly increasing subsequence.

                Example 1:
                  Input: nums = [10,9,2,5,3,7,101,18]
                  Output: 4
                  Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

                Example 2:
                  Input: nums = [0,1,0,3,2,3]
                  Output: 4

                Example 3:
                  Input: nums = [7,7,7,7,7,7,7]
                  Output: 1""",
                // javaTemplate
                """
                class Solution {
                    public int lengthOfLIS(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def lengthOfLIS(self, nums: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().lengthOfLIS(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().lengthOfLIS(nums))""",
                // testCasesJson
                """
                [
                  {"input": "10,9,2,5,3,7,101,18", "expectedOutput": "4"},
                  {"input": "0,1,0,3,2,3", "expectedOutput": "4"},
                  {"input": "7,7,7,7,7,7,7", "expectedOutput": "1"}
                ]""",
                // tags
                "array,binary-search,dynamic-programming",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 152. Maximum Product Subarray (Medium) ────────────────
    private static String[] maximumProductSubarray() {
        return new String[]{
                "152", "Maximum Product Subarray", "Medium",
                // description
                """
                Given an integer array nums, find a subarray that has the largest product, and return the product.

                The test cases are generated so that the answer will fit in a 32-bit integer.

                Example 1:
                  Input: nums = [2,3,-2,4]
                  Output: 6
                  Explanation: [2,3] has the largest product 6.

                Example 2:
                  Input: nums = [-2,0,-1]
                  Output: 0
                  Explanation: The result cannot be 2, because [-2,-1] is not a subarray.""",
                // javaTemplate
                """
                class Solution {
                    public int maxProduct(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxProduct(self, nums: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().maxProduct(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().maxProduct(nums))""",
                // testCasesJson
                """
                [
                  {"input": "2,3,-2,4", "expectedOutput": "6"},
                  {"input": "-2,0,-1", "expectedOutput": "0"}
                ]""",
                // tags
                "array,dynamic-programming",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 416. Partition Equal Subset Sum (Medium) ──────────────
    private static String[] partitionEqualSubsetSum() {
        return new String[]{
                "416", "Partition Equal Subset Sum", "Medium",
                // description
                """
                Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

                Example 1:
                  Input: nums = [1,5,11,5]
                  Output: true
                  Explanation: The array can be partitioned as [1, 5, 5] and [11].

                Example 2:
                  Input: nums = [1,2,3,5]
                  Output: false
                  Explanation: The array cannot be partitioned into equal sum subsets.""",
                // javaTemplate
                """
                class Solution {
                    public boolean canPartition(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def canPartition(self, nums: list[int]) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().canPartition(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                result = Solution().canPartition(nums)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "1,5,11,5", "expectedOutput": "true"},
                  {"input": "1,2,3,5", "expectedOutput": "false"}
                ]""",
                // tags
                "array,dynamic-programming",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }

    // ── 32. Longest Valid Parentheses (Hard) ──────────────────
    private static String[] longestValidParentheses() {
        return new String[]{
                "32", "Longest Valid Parentheses", "Hard",
                // description
                """
                Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

                Example 1:
                  Input: s = "(()"
                  Output: 2
                  Explanation: The longest valid parentheses substring is "()".

                Example 2:
                  Input: s = ")()())"
                  Output: 4
                  Explanation: The longest valid parentheses substring is "()()".

                Example 3:
                  Input: s = ""
                  Output: 0""",
                // javaTemplate
                """
                class Solution {
                    public int longestValidParentheses(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def longestValidParentheses(self, s: str) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String s = sc.hasNextLine() ? sc.nextLine().trim() : "";
                        System.out.println(new Solution().longestValidParentheses(s));
                    }
                }""",
                // pythonDriverCode
                """
                import sys

                {{USER_CODE}}

                s = sys.stdin.readline().rstrip('\\n') if not sys.stdin.isatty() else ""
                print(Solution().longestValidParentheses(s))""",
                // testCasesJson
                """
                [
                  {"input": "(()", "expectedOutput": "2"},
                  {"input": ")()())", "expectedOutput": "4"},
                  {"input": "", "expectedOutput": "0"}
                ]""",
                // tags
                "string,dynamic-programming,stack",
                // category
                "\u52A8\u6001\u89C4\u5212"
        };
    }
}

package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — category "贪心算法".
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataGreedy {

    private CodeProblemDataGreedy() {}

    public static List<String[]> problems() {
        return List.of(
                bestTimeToBuyAndSellStock(),
                jumpGame(),
                jumpGameII(),
                partitionLabels()
        );
    }

    // ── 121. Best Time to Buy and Sell Stock (Easy) ────────────
    private static String[] bestTimeToBuyAndSellStock() {
        return new String[]{
                "121", "Best Time to Buy and Sell Stock", "Easy",
                // description
                """
                You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit. If no profit is possible, return 0.

                Example 1:
                  Input: prices = [7,1,5,3,6,4]
                  Output: 5
                  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 5.

                Example 2:
                  Input: prices = [7,6,4,3,1]
                  Output: 0
                  Explanation: No profitable transaction is possible.""",
                // javaTemplate
                """
                class Solution {
                    public int maxProfit(int[] prices) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxProfit(self, prices: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] prices = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) prices[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().maxProfit(prices));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                prices = list(map(int, input().strip().split(",")))
                print(Solution().maxProfit(prices))""",
                // testCasesJson
                """
                [
                  {"input": "7,1,5,3,6,4", "expectedOutput": "5"},
                  {"input": "7,6,4,3,1", "expectedOutput": "0"},
                  {"input": "2,4,1", "expectedOutput": "2"}
                ]""",
                // tags
                "array,dynamic-programming",
                // category
                "贪心算法"
        };
    }

    // ── 55. Jump Game (Medium) ─────────────────────────────────
    private static String[] jumpGame() {
        return new String[]{
                "55", "Jump Game", "Medium",
                // description
                """
                You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

                Return true if you can reach the last index, or false otherwise.

                Example 1:
                  Input: nums = [2,3,1,1,4]
                  Output: true
                  Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

                Example 2:
                  Input: nums = [3,2,1,0,4]
                  Output: false
                  Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.""",
                // javaTemplate
                """
                class Solution {
                    public boolean canJump(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def canJump(self, nums: list[int]) -> bool:
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
                        System.out.println(new Solution().canJump(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                result = Solution().canJump(nums)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "2,3,1,1,4", "expectedOutput": "true"},
                  {"input": "3,2,1,0,4", "expectedOutput": "false"}
                ]""",
                // tags
                "array,dynamic-programming,greedy",
                // category
                "贪心算法"
        };
    }

    // ── 45. Jump Game II (Medium) ──────────────────────────────
    private static String[] jumpGameII() {
        return new String[]{
                "45", "Jump Game II", "Medium",
                // description
                """
                You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

                Each element nums[i] represents the maximum length of a forward jump from index i. Return the minimum number of jumps to reach nums[n - 1].

                The test cases are generated such that you can reach nums[n - 1].

                Example 1:
                  Input: nums = [2,3,1,1,4]
                  Output: 2
                  Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

                Example 2:
                  Input: nums = [2,3,0,1,4]
                  Output: 2""",
                // javaTemplate
                """
                class Solution {
                    public int jump(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def jump(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().jump(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().jump(nums))""",
                // testCasesJson
                """
                [
                  {"input": "2,3,1,1,4", "expectedOutput": "2"},
                  {"input": "2,3,0,1,4", "expectedOutput": "2"}
                ]""",
                // tags
                "array,dynamic-programming,greedy",
                // category
                "贪心算法"
        };
    }

    // ── 763. Partition Labels (Medium) ─────────────────────────
    private static String[] partitionLabels() {
        return new String[]{
                "763", "Partition Labels", "Medium",
                // description
                """
                You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

                Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

                Return a list of integers representing the size of these parts.

                Example 1:
                  Input: s = "ababcbacadefegdehijhklij"
                  Output: [9,7,8]

                Example 2:
                  Input: s = "eccbbbbdec"
                  Output: [10]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<Integer> partitionLabels(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def partitionLabels(self, s: str) -> list[int]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        List<Integer> result = new Solution().partitionLabels(s);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append(result.get(i));
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                result = Solution().partitionLabels(s)
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "ababcbacadefegdehijhklij", "expectedOutput": "9,7,8"},
                  {"input": "eccbbbbdec", "expectedOutput": "10"}
                ]""",
                // tags
                "hash-table,two-pointers,string,greedy",
                // category
                "贪心算法"
        };
    }
}

package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems - Substring category.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataSubstring {

    private CodeProblemDataSubstring() {}

    public static List<String[]> problems() {
        return List.of(
                subarraySumEqualsK(),
                slidingWindowMaximum(),
                minimumWindowSubstring()
        );
    }

    // ── 560. Subarray Sum Equals K (Medium) ──
    private static String[] subarraySumEqualsK() {
        return new String[]{
                "560", "Subarray Sum Equals K", "Medium",
                // description
                """
                Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

                A subarray is a contiguous non-empty sequence of elements within an array.

                Example 1:
                  Input: nums = [1,1,1], k = 2
                  Output: 2

                Example 2:
                  Input: nums = [1,2,3], k = 3
                  Output: 2""",
                // javaTemplate
                """
                class Solution {
                    public int subarraySum(int[] nums, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def subarraySum(self, nums: list[int], k: int) -> int:
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
                        int k = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().subarraySum(nums, k));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                k = int(input().strip())
                print(Solution().subarraySum(nums, k))""",
                // testCasesJson
                """
                [
                  {"input": "1,1,1\\n2", "expectedOutput": "2"},
                  {"input": "1,2,3\\n3", "expectedOutput": "2"}
                ]""",
                // tags
                "array,hash-table,prefix-sum",
                // category
                "\u5b50\u4e32"
        };
    }

    // ── 239. Sliding Window Maximum (Hard) ──
    private static String[] slidingWindowMaximum() {
        return new String[]{
                "239", "Sliding Window Maximum", "Hard",
                // description
                """
                You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

                Example 1:
                  Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
                  Output: [3,3,5,5,6,7]
                  Explanation:
                    Window position                Max
                    ---------------               -----
                    [1  3  -1] -3  5  3  6  7       3
                     1 [3  -1  -3] 5  3  6  7       3
                     1  3 [-1  -3  5] 3  6  7       5
                     1  3  -1 [-3  5  3] 6  7       5
                     1  3  -1  -3 [5  3  6] 7       6
                     1  3  -1  -3  5 [3  6  7]      7

                Example 2:
                  Input: nums = [1], k = 1
                  Output: [1]""",
                // javaTemplate
                """
                class Solution {
                    public int[] maxSlidingWindow(int[] nums, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxSlidingWindow(self, nums: list[int], k: int) -> list[int]:
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
                        int k = Integer.parseInt(sc.nextLine().trim());
                        int[] result = new Solution().maxSlidingWindow(nums, k);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < result.length; i++) {
                            if (i > 0) sb.append(",");
                            sb.append(result[i]);
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                k = int(input().strip())
                result = Solution().maxSlidingWindow(nums, k)
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "1,3,-1,-3,5,3,6,7\\n3", "expectedOutput": "3,3,5,5,6,7"},
                  {"input": "1\\n1", "expectedOutput": "1"}
                ]""",
                // tags
                "array,queue,sliding-window,heap,monotonic-queue",
                // category
                "\u5b50\u4e32"
        };
    }

    // ── 76. Minimum Window Substring (Hard) ──
    private static String[] minimumWindowSubstring() {
        return new String[]{
                "76", "Minimum Window Substring", "Hard",
                // description
                """
                Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

                The testcases will be generated such that the answer is unique.

                Example 1:
                  Input: s = "ADOBECODEBANC", t = "ABC"
                  Output: "BANC"
                  Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

                Example 2:
                  Input: s = "a", t = "a"
                  Output: "a"

                Example 3:
                  Input: s = "a", t = "aa"
                  Output: ""
                  Explanation: Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.""",
                // javaTemplate
                """
                class Solution {
                    public String minWindow(String s, String t) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def minWindow(self, s: str, t: str) -> str:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String s = sc.nextLine().trim();
                        String t = sc.nextLine().trim();
                        System.out.println(new Solution().minWindow(s, t));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                t = input().strip()
                print(Solution().minWindow(s, t))""",
                // testCasesJson
                """
                [
                  {"input": "ADOBECODEBANC\\nABC", "expectedOutput": "BANC"},
                  {"input": "a\\na", "expectedOutput": "a"},
                  {"input": "a\\naa", "expectedOutput": ""}
                ]""",
                // tags
                "hash-table,string,sliding-window",
                // category
                "\u5b50\u4e32"
        };
    }
}

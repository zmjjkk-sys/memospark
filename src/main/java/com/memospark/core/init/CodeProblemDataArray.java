package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — category "普通数组".
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataArray {

    private CodeProblemDataArray() {}

    public static List<String[]> problems() {
        return List.of(
                maximumSubarray(),
                mergeIntervals(),
                rotateArray(),
                productOfArrayExceptSelf(),
                firstMissingPositive()
        );
    }

    // ── 53. Maximum Subarray (Medium) ──────────────────────────
    private static String[] maximumSubarray() {
        return new String[]{
                "53", "Maximum Subarray", "Medium",
                // description
                """
                Given an integer array nums, find the subarray with the largest sum, and return its sum.

                Example:
                  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
                  Output: 6
                  Explanation: The subarray [4,-1,2,1] has the largest sum 6.""",
                // javaTemplate
                """
                class Solution {
                    public int maxSubArray(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxSubArray(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().maxSubArray(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().maxSubArray(nums))""",
                // testCasesJson
                """
                [
                  {"input": "-2,1,-3,4,-1,2,1,-5,4", "expectedOutput": "6"},
                  {"input": "1", "expectedOutput": "1"},
                  {"input": "5,4,-1,7,8", "expectedOutput": "23"}
                ]""",
                // tags
                "array,dynamic-programming,divide-and-conquer",
                // category
                "普通数组"
        };
    }

    // ── 56. Merge Intervals (Medium) ───────────────────────────
    private static String[] mergeIntervals() {
        return new String[]{
                "56", "Merge Intervals", "Medium",
                // description
                """
                Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

                Example:
                  Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
                  Output: [[1,6],[8,10],[15,18]]
                  Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].""",
                // javaTemplate
                """
                class Solution {
                    public int[][] merge(int[][] intervals) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int count = Integer.parseInt(sc.nextLine().trim());
                        int[][] intervals = new int[count][2];
                        for (int i = 0; i < count; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            intervals[i][0] = Integer.parseInt(parts[0].trim());
                            intervals[i][1] = Integer.parseInt(parts[1].trim());
                        }
                        int[][] result = new Solution().merge(intervals);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < result.length; i++) {
                            if (i > 0) sb.append("\\n");
                            sb.append(result[i][0]).append(",").append(result[i][1]);
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                count = int(input().strip())
                intervals = []
                for _ in range(count):
                    parts = input().strip().split(",")
                    intervals.append([int(parts[0]), int(parts[1])])
                result = Solution().merge(intervals)
                print("\\n".join(f"{r[0]},{r[1]}" for r in result))""",
                // testCasesJson
                """
                [
                  {"input": "4\\n1,3\\n2,6\\n8,10\\n15,18", "expectedOutput": "1,6\\n8,10\\n15,18"},
                  {"input": "2\\n1,4\\n4,5", "expectedOutput": "1,5"}
                ]""",
                // tags
                "array,sorting",
                // category
                "普通数组"
        };
    }

    // ── 189. Rotate Array (Medium) ─────────────────────────────
    private static String[] rotateArray() {
        return new String[]{
                "189", "Rotate Array", "Medium",
                // description
                """
                Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

                Example:
                  Input: nums = [1,2,3,4,5,6,7], k = 3
                  Output: [5,6,7,1,2,3,4]
                  Explanation:
                    rotate 1 step to the right: [7,1,2,3,4,5,6]
                    rotate 2 steps to the right: [6,7,1,2,3,4,5]
                    rotate 3 steps to the right: [5,6,7,1,2,3,4]""",
                // javaTemplate
                """
                class Solution {
                    public void rotate(int[] nums, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def rotate(self, nums: list[int], k: int) -> None:
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
                        new Solution().rotate(nums, k);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < nums.length; i++) {
                            if (i > 0) sb.append(",");
                            sb.append(nums[i]);
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                k = int(input().strip())
                Solution().rotate(nums, k)
                print(",".join(map(str, nums)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4,5,6,7\\n3", "expectedOutput": "5,6,7,1,2,3,4"},
                  {"input": "-1,-100,3,99\\n2", "expectedOutput": "3,99,-1,-100"}
                ]""",
                // tags
                "array,math,two-pointers",
                // category
                "普通数组"
        };
    }

    // ── 238. Product of Array Except Self (Medium) ─────────────
    private static String[] productOfArrayExceptSelf() {
        return new String[]{
                "238", "Product of Array Except Self", "Medium",
                // description
                """
                Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

                The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

                You must write an algorithm that runs in O(n) time and without using the division operation.

                Example:
                  Input: nums = [1,2,3,4]
                  Output: [24,12,8,6]""",
                // javaTemplate
                """
                class Solution {
                    public int[] productExceptSelf(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def productExceptSelf(self, nums: list[int]) -> list[int]:
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
                        int[] result = new Solution().productExceptSelf(nums);
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
                result = Solution().productExceptSelf(nums)
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4", "expectedOutput": "24,12,8,6"},
                  {"input": "-1,1,0,-3,3", "expectedOutput": "0,0,9,0,0"}
                ]""",
                // tags
                "array,prefix-sum",
                // category
                "普通数组"
        };
    }

    // ── 41. First Missing Positive (Hard) ──────────────────────
    private static String[] firstMissingPositive() {
        return new String[]{
                "41", "First Missing Positive", "Hard",
                // description
                """
                Given an unsorted integer array nums, return the smallest missing positive integer.

                You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

                Example:
                  Input: nums = [3,4,-1,1]
                  Output: 2
                  Explanation: 1 is in the array but 2 is missing.""",
                // javaTemplate
                """
                class Solution {
                    public int firstMissingPositive(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def firstMissingPositive(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().firstMissingPositive(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().firstMissingPositive(nums))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,0", "expectedOutput": "3"},
                  {"input": "3,4,-1,1", "expectedOutput": "2"},
                  {"input": "7,8,9,11,12", "expectedOutput": "1"}
                ]""",
                // tags
                "array,hash-table",
                // category
                "普通数组"
        };
    }
}

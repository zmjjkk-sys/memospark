package com.memospark.core.init;

import java.util.List;

/**
 * Two Pointers category LeetCode problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataTwoPointers {

    private CodeProblemDataTwoPointers() {}

    public static List<String[]> problems() {
        return List.of(
                moveZeroes(),
                containerWithMostWater(),
                threeSum(),
                trappingRainWater()
        );
    }

    // ── 283. Move Zeroes (Easy) ─────────────────────────────────
    private static String[] moveZeroes() {
        return new String[]{
                "283", "Move Zeroes", "Easy",
                // description
                """
                Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

                Note that you must do this in-place without making a copy of the array.

                Example:
                  Input: nums = [0,1,0,3,12]
                  Output: [1,3,12,0,0]

                Example 2:
                  Input: nums = [0]
                  Output: [0]""",
                // javaTemplate
                """
                class Solution {
                    public void moveZeroes(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def moveZeroes(self, nums: list[int]) -> None:
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
                        new Solution().moveZeroes(nums);
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
                Solution().moveZeroes(nums)
                print(",".join(map(str, nums)))""",
                // testCasesJson
                """
                [
                  {"input": "0,1,0,3,12", "expectedOutput": "1,3,12,0,0"},
                  {"input": "0", "expectedOutput": "0"}
                ]""",
                // tags
                "array,two-pointers",
                // category
                "双指针"
        };
    }

    // ── 11. Container With Most Water (Medium) ──────────────────
    private static String[] containerWithMostWater() {
        return new String[]{
                "11", "Container With Most Water", "Medium",
                // description
                """
                You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

                Find two lines that together with the x-axis form a container, such that the container contains the most water.

                Return the maximum amount of water a container can store.

                Notice that you may not slant the container.

                Example:
                  Input: height = [1,8,6,2,5,4,8,3,7]
                  Output: 49
                  Explanation: The max area is between lines at index 1 and 8, area = min(8,7) * (8-1) = 49.""",
                // javaTemplate
                """
                class Solution {
                    public int maxArea(int[] height) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxArea(self, height: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] height = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) height[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().maxArea(height));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                height = list(map(int, input().strip().split(",")))
                print(Solution().maxArea(height))""",
                // testCasesJson
                """
                [
                  {"input": "1,8,6,2,5,4,8,3,7", "expectedOutput": "49"},
                  {"input": "1,1", "expectedOutput": "1"}
                ]""",
                // tags
                "array,two-pointers,greedy",
                // category
                "双指针"
        };
    }

    // ── 15. 3Sum (Medium) ───────────────────────────────────────
    private static String[] threeSum() {
        return new String[]{
                "15", "3Sum", "Medium",
                // description
                """
                Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

                The solution set must not contain duplicate triplets.

                Example:
                  Input: nums = [-1,0,1,2,-1,-4]
                  Output: [[-1,-1,2],[-1,0,1]]

                Example 2:
                  Input: nums = [0,0,0]
                  Output: [[0,0,0]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> threeSum(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def threeSum(self, nums: list[int]) -> list[list[int]]:
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
                        List<List<Integer>> result = new Solution().threeSum(nums);
                        for (List<Integer> list : result) Collections.sort(list);
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
                result = Solution().threeSum(nums)
                result = [sorted(t) for t in result]
                result.sort()
                parts = []
                for t in result:
                    parts.append("[" + ",".join(map(str, t)) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "-1,0,1,2,-1,-4", "expectedOutput": "[[-1,-1,2],[-1,0,1]]"},
                  {"input": "0,1,1", "expectedOutput": "[]"},
                  {"input": "0,0,0", "expectedOutput": "[[0,0,0]]"}
                ]""",
                // tags
                "array,two-pointers,sorting",
                // category
                "双指针"
        };
    }

    // ── 42. Trapping Rain Water (Hard) ──────────────────────────
    private static String[] trappingRainWater() {
        return new String[]{
                "42", "Trapping Rain Water", "Hard",
                // description
                """
                Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

                Example:
                  Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
                  Output: 6
                  Explanation: 6 units of rain water are being trapped.

                Example 2:
                  Input: height = [4,2,0,3,2,5]
                  Output: 9""",
                // javaTemplate
                """
                class Solution {
                    public int trap(int[] height) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def trap(self, height: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] height = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) height[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().trap(height));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                height = list(map(int, input().strip().split(",")))
                print(Solution().trap(height))""",
                // testCasesJson
                """
                [
                  {"input": "0,1,0,2,1,0,1,3,2,1,2,1", "expectedOutput": "6"},
                  {"input": "4,2,0,3,2,5", "expectedOutput": "9"}
                ]""",
                // tags
                "array,two-pointers,dynamic-programming,stack",
                // category
                "双指针"
        };
    }
}

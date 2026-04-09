package com.memospark.core.init;

import java.util.List;

/**
 * Static data for technique-category LeetCode problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataTechniques {

    private CodeProblemDataTechniques() {}

    public static List<String[]> problems() {
        return List.of(
                singleNumber(),
                majorityElement(),
                sortColors(),
                nextPermutation(),
                findTheDuplicateNumber()
        );
    }

    // ── 136. Single Number (Easy) ──────────────────────────────
    private static String[] singleNumber() {
        return new String[]{
                "136", "Single Number", "Easy",
                // description
                """
                Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

                You must implement a solution with a linear runtime complexity and use only constant extra space.

                Example 1:
                  Input: nums = [2,2,1]
                  Output: 1

                Example 2:
                  Input: nums = [4,1,2,1,2]
                  Output: 4

                Example 3:
                  Input: nums = [1]
                  Output: 1""",
                // javaTemplate
                """
                class Solution {
                    public int singleNumber(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def singleNumber(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().singleNumber(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().singleNumber(nums))""",
                // testCasesJson
                """
                [
                  {"input": "2,2,1", "expectedOutput": "1"},
                  {"input": "4,1,2,1,2", "expectedOutput": "4"},
                  {"input": "1", "expectedOutput": "1"}
                ]""",
                // tags
                "array,bit-manipulation",
                // category
                "技巧"
        };
    }

    // ── 169. Majority Element (Easy) ───────────────────────────
    private static String[] majorityElement() {
        return new String[]{
                "169", "Majority Element", "Easy",
                // description
                """
                Given an array nums of size n, return the majority element.

                The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.

                Example 1:
                  Input: nums = [3,2,3]
                  Output: 3

                Example 2:
                  Input: nums = [2,2,1,1,1,2,2]
                  Output: 2""",
                // javaTemplate
                """
                class Solution {
                    public int majorityElement(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def majorityElement(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().majorityElement(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().majorityElement(nums))""",
                // testCasesJson
                """
                [
                  {"input": "3,2,3", "expectedOutput": "3"},
                  {"input": "2,2,1,1,1,2,2", "expectedOutput": "2"}
                ]""",
                // tags
                "array,hash-table,divide-and-conquer,sorting,counting",
                // category
                "技巧"
        };
    }

    // ── 75. Sort Colors (Medium) ───────────────────────────────
    private static String[] sortColors() {
        return new String[]{
                "75", "Sort Colors", "Medium",
                // description
                """
                Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

                We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

                You must solve this problem without using the library's sort function.

                Example 1:
                  Input: nums = [2,0,2,1,1,0]
                  Output: [0,0,1,1,2,2]

                Example 2:
                  Input: nums = [2,0,1]
                  Output: [0,1,2]""",
                // javaTemplate
                """
                class Solution {
                    public void sortColors(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def sortColors(self, nums: list[int]) -> None:
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
                        new Solution().sortColors(nums);
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
                Solution().sortColors(nums)
                print(",".join(map(str, nums)))""",
                // testCasesJson
                """
                [
                  {"input": "2,0,2,1,1,0", "expectedOutput": "0,0,1,1,2,2"},
                  {"input": "2,0,1", "expectedOutput": "0,1,2"}
                ]""",
                // tags
                "array,two-pointers,sorting",
                // category
                "技巧"
        };
    }

    // ── 31. Next Permutation (Medium) ──────────────────────────
    private static String[] nextPermutation() {
        return new String[]{
                "31", "Next Permutation", "Medium",
                // description
                """
                A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

                The next permutation of an array of integers is the next lexicographically greater permutation of its integer. If the array is already the last permutation, rearrange it as the lowest possible order (i.e., sorted in ascending order).

                The replacement must be in place and use only constant extra memory.

                Example 1:
                  Input: nums = [1,2,3]
                  Output: [1,3,2]

                Example 2:
                  Input: nums = [3,2,1]
                  Output: [1,2,3]

                Example 3:
                  Input: nums = [1,1,5]
                  Output: [1,5,1]""",
                // javaTemplate
                """
                class Solution {
                    public void nextPermutation(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def nextPermutation(self, nums: list[int]) -> None:
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
                        new Solution().nextPermutation(nums);
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
                Solution().nextPermutation(nums)
                print(",".join(map(str, nums)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3", "expectedOutput": "1,3,2"},
                  {"input": "3,2,1", "expectedOutput": "1,2,3"},
                  {"input": "1,1,5", "expectedOutput": "1,5,1"}
                ]""",
                // tags
                "array,two-pointers",
                // category
                "技巧"
        };
    }

    // ── 287. Find the Duplicate Number (Medium) ────────────────
    private static String[] findTheDuplicateNumber() {
        return new String[]{
                "287", "Find the Duplicate Number", "Medium",
                // description
                """
                Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

                There is only one repeated number in nums, return this repeated number.

                You must solve the problem without modifying the array nums and using only constant extra space.

                Example 1:
                  Input: nums = [1,3,4,2,2]
                  Output: 2

                Example 2:
                  Input: nums = [3,1,3,4,2]
                  Output: 3""",
                // javaTemplate
                """
                class Solution {
                    public int findDuplicate(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def findDuplicate(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().findDuplicate(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().findDuplicate(nums))""",
                // testCasesJson
                """
                [
                  {"input": "1,3,4,2,2", "expectedOutput": "2"},
                  {"input": "3,1,3,4,2", "expectedOutput": "3"}
                ]""",
                // tags
                "array,two-pointers,binary-search,bit-manipulation",
                // category
                "技巧"
        };
    }
}

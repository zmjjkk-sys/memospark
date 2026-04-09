package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode Binary Search problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataBinarySearch {

    private CodeProblemDataBinarySearch() {}

    public static List<String[]> problems() {
        return List.of(
                searchInsertPosition(),
                searchA2DMatrix(),
                searchInRotatedSortedArray(),
                findMinimumInRotatedSortedArray(),
                findFirstAndLastPosition(),
                medianOfTwoSortedArrays()
        );
    }

    // ── 35. Search Insert Position (Easy) ─────────────────────
    private static String[] searchInsertPosition() {
        return new String[]{
                "35", "Search Insert Position", "Easy",
                // description
                """
                Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

                You must write an algorithm with O(log n) runtime complexity.

                Example 1:
                  Input: nums = [1,3,5,6], target = 5
                  Output: 2

                Example 2:
                  Input: nums = [1,3,5,6], target = 2
                  Output: 1

                Example 3:
                  Input: nums = [1,3,5,6], target = 7
                  Output: 4""",
                // javaTemplate
                """
                class Solution {
                    public int searchInsert(int[] nums, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def searchInsert(self, nums: list[int], target: int) -> int:
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
                        int target = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().searchInsert(nums, target));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                target = int(input().strip())
                print(Solution().searchInsert(nums, target))""",
                // testCasesJson
                """
                [
                  {"input": "1,3,5,6\\n5", "expectedOutput": "2"},
                  {"input": "1,3,5,6\\n2", "expectedOutput": "1"},
                  {"input": "1,3,5,6\\n7", "expectedOutput": "4"}
                ]""",
                // tags
                "array,binary-search",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }

    // ── 74. Search a 2D Matrix (Medium) ───────────────────────
    private static String[] searchA2DMatrix() {
        return new String[]{
                "74", "Search a 2D Matrix", "Medium",
                // description
                """
                You are given an m x n integer matrix with the following two properties:
                - Each row is sorted in non-decreasing order.
                - The first integer of each row is greater than the last integer of the previous row.

                Given an integer target, return true if target is in matrix or false otherwise.

                You must write an algorithm with O(log(m * n)) runtime complexity.

                Example 1:
                  Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
                  Output: true

                Example 2:
                  Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean searchMatrix(int[][] matrix, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int rows = Integer.parseInt(sc.nextLine().trim());
                        int[][] matrix = new int[rows][];
                        for (int i = 0; i < rows; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            matrix[i] = new int[parts.length];
                            for (int j = 0; j < parts.length; j++) matrix[i][j] = Integer.parseInt(parts[j].trim());
                        }
                        int target = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().searchMatrix(matrix, target));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                matrix = []
                for _ in range(rows):
                    matrix.append(list(map(int, input().strip().split(","))))
                target = int(input().strip())
                result = Solution().searchMatrix(matrix, target)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "3\\n1,3,5,7\\n10,11,16,20\\n23,30,34,60\\n3", "expectedOutput": "true"},
                  {"input": "3\\n1,3,5,7\\n10,11,16,20\\n23,30,34,60\\n13", "expectedOutput": "false"}
                ]""",
                // tags
                "array,binary-search,matrix",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }

    // ── 33. Search in Rotated Sorted Array (Medium) ───────────
    private static String[] searchInRotatedSortedArray() {
        return new String[]{
                "33", "Search in Rotated Sorted Array", "Medium",
                // description
                """
                There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k.

                Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

                You must write an algorithm with O(log n) runtime complexity.

                Example 1:
                  Input: nums = [4,5,6,7,0,1,2], target = 0
                  Output: 4

                Example 2:
                  Input: nums = [4,5,6,7,0,1,2], target = 3
                  Output: -1

                Example 3:
                  Input: nums = [1], target = 0
                  Output: -1""",
                // javaTemplate
                """
                class Solution {
                    public int search(int[] nums, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def search(self, nums: list[int], target: int) -> int:
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
                        int target = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().search(nums, target));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                target = int(input().strip())
                print(Solution().search(nums, target))""",
                // testCasesJson
                """
                [
                  {"input": "4,5,6,7,0,1,2\\n0", "expectedOutput": "4"},
                  {"input": "4,5,6,7,0,1,2\\n3", "expectedOutput": "-1"},
                  {"input": "1\\n0", "expectedOutput": "-1"}
                ]""",
                // tags
                "array,binary-search",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }

    // ── 153. Find Minimum in Rotated Sorted Array (Medium) ────
    private static String[] findMinimumInRotatedSortedArray() {
        return new String[]{
                "153", "Find Minimum in Rotated Sorted Array", "Medium",
                // description
                """
                Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Given the sorted rotated array nums of unique elements, return the minimum element of this array.

                You must write an algorithm that runs in O(log n) time.

                Example 1:
                  Input: nums = [3,4,5,1,2]
                  Output: 1

                Example 2:
                  Input: nums = [4,5,6,7,0,1,2]
                  Output: 0

                Example 3:
                  Input: nums = [11,13,15,17]
                  Output: 11""",
                // javaTemplate
                """
                class Solution {
                    public int findMin(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def findMin(self, nums: list[int]) -> int:
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
                        System.out.println(new Solution().findMin(nums));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().findMin(nums))""",
                // testCasesJson
                """
                [
                  {"input": "3,4,5,1,2", "expectedOutput": "1"},
                  {"input": "4,5,6,7,0,1,2", "expectedOutput": "0"},
                  {"input": "11,13,15,17", "expectedOutput": "11"}
                ]""",
                // tags
                "array,binary-search",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }

    // ── 34. Find First and Last Position of Element in Sorted Array (Medium) ──
    private static String[] findFirstAndLastPosition() {
        return new String[]{
                "34", "Find First and Last Position of Element in Sorted Array", "Medium",
                // description
                """
                Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

                If target is not found in the array, return [-1, -1].

                You must write an algorithm with O(log n) runtime complexity.

                Example 1:
                  Input: nums = [5,7,7,8,8,10], target = 8
                  Output: [3,4]

                Example 2:
                  Input: nums = [5,7,7,8,8,10], target = 6
                  Output: [-1,-1]

                Example 3:
                  Input: nums = [1], target = 1
                  Output: [0,0]""",
                // javaTemplate
                """
                class Solution {
                    public int[] searchRange(int[] nums, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def searchRange(self, nums: list[int], target: int) -> list[int]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String line = sc.nextLine().trim();
                        int[] nums;
                        if (line.isEmpty()) {
                            nums = new int[0];
                        } else {
                            String[] parts = line.split(",");
                            nums = new int[parts.length];
                            for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        }
                        int target = Integer.parseInt(sc.nextLine().trim());
                        int[] res = new Solution().searchRange(nums, target);
                        System.out.println(res[0] + "," + res[1]);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                line = input().strip()
                nums = list(map(int, line.split(","))) if line else []
                target = int(input().strip())
                res = Solution().searchRange(nums, target)
                print(f"{res[0]},{res[1]}")""",
                // testCasesJson
                """
                [
                  {"input": "5,7,7,8,8,10\\n8", "expectedOutput": "3,4"},
                  {"input": "5,7,7,8,8,10\\n6", "expectedOutput": "-1,-1"},
                  {"input": "1\\n1", "expectedOutput": "0,0"}
                ]""",
                // tags
                "array,binary-search",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }

    // ── 4. Median of Two Sorted Arrays (Hard) ───────────────────
    private static String[] medianOfTwoSortedArrays() {
        return new String[]{
                "4", "Median of Two Sorted Arrays", "Hard",
                // description
                """
                Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

                The overall run time complexity should be O(log (m+n)).

                Example 1:
                  Input: nums1 = [1,3], nums2 = [2]
                  Output: 2.0

                Example 2:
                  Input: nums1 = [1,2], nums2 = [3,4]
                  Output: 2.5""",
                // javaTemplate
                """
                class Solution {
                    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String line1 = sc.nextLine().trim();
                        int[] nums1;
                        if (line1.isEmpty()) {
                            nums1 = new int[0];
                        } else {
                            String[] parts1 = line1.split(",");
                            nums1 = new int[parts1.length];
                            for (int i = 0; i < parts1.length; i++) nums1[i] = Integer.parseInt(parts1[i].trim());
                        }
                        String line2 = sc.nextLine().trim();
                        int[] nums2;
                        if (line2.isEmpty()) {
                            nums2 = new int[0];
                        } else {
                            String[] parts2 = line2.split(",");
                            nums2 = new int[parts2.length];
                            for (int i = 0; i < parts2.length; i++) nums2[i] = Integer.parseInt(parts2[i].trim());
                        }
                        double res = new Solution().findMedianSortedArrays(nums1, nums2);
                        if (res == (long) res) {
                            System.out.println(String.format("%.1f", res));
                        } else {
                            System.out.println(String.format("%.1f", res));
                        }
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                line1 = input().strip()
                nums1 = list(map(int, line1.split(","))) if line1 else []
                line2 = input().strip()
                nums2 = list(map(int, line2.split(","))) if line2 else []
                res = Solution().findMedianSortedArrays(nums1, nums2)
                print(f"{res:.1f}")""",
                // testCasesJson
                """
                [
                  {"input": "1,3\\n2", "expectedOutput": "2.0"},
                  {"input": "1,2\\n3,4", "expectedOutput": "2.5"}
                ]""",
                // tags
                "array,binary-search,divide-and-conquer",
                // category
                "\u4e8c\u5206\u67e5\u627e"
        };
    }
}

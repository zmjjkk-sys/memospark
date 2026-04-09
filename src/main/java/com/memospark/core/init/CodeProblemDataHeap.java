package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — category "堆".
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataHeap {

    private CodeProblemDataHeap() {}

    public static List<String[]> problems() {
        return List.of(
                kthLargestElement(),
                topKFrequentElements(),
                findMedianFromDataStream()
        );
    }

    // ── 215. Kth Largest Element in an Array (Medium) ──────────
    private static String[] kthLargestElement() {
        return new String[]{
                "215", "Kth Largest Element in an Array", "Medium",
                // description
                """
                Given an integer array nums and an integer k, return the kth largest element in the array.

                Note that it is the kth largest element in the sorted order, not the kth distinct element.

                Example 1:
                  Input: nums = [3,2,1,5,6,4], k = 2
                  Output: 5

                Example 2:
                  Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
                  Output: 4""",
                // javaTemplate
                """
                class Solution {
                    public int findKthLargest(int[] nums, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def findKthLargest(self, nums: list[int], k: int) -> int:
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
                        System.out.println(new Solution().findKthLargest(nums, k));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                k = int(input().strip())
                print(Solution().findKthLargest(nums, k))""",
                // testCasesJson
                """
                [
                  {"input": "3,2,1,5,6,4\\n2", "expectedOutput": "5"},
                  {"input": "3,2,3,1,2,4,5,5,6\\n4", "expectedOutput": "4"}
                ]""",
                // tags
                "array,divide-and-conquer,sorting,heap,quickselect",
                // category
                "堆"
        };
    }

    // ── 347. Top K Frequent Elements (Medium) ──────────────────
    private static String[] topKFrequentElements() {
        return new String[]{
                "347", "Top K Frequent Elements", "Medium",
                // description
                """
                Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

                Example 1:
                  Input: nums = [1,1,1,2,2,3], k = 2
                  Output: [1,2]

                Example 2:
                  Input: nums = [1], k = 1
                  Output: [1]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public int[] topKFrequent(int[] nums, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
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
                        int[] result = new Solution().topKFrequent(nums, k);
                        Arrays.sort(result);
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
                result = Solution().topKFrequent(nums, k)
                result.sort()
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "1,1,1,2,2,3\\n2", "expectedOutput": "1,2"},
                  {"input": "1\\n1", "expectedOutput": "1"}
                ]""",
                // tags
                "array,hash-table,divide-and-conquer,sorting,heap,counting,quickselect",
                // category
                "堆"
        };
    }

    // ── 295. Find Median from Data Stream (Hard) ───────────────
    private static String[] findMedianFromDataStream() {
        return new String[]{
                "295", "Find Median from Data Stream", "Hard",
                // description
                """
                The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

                Implement the MedianFinder class:
                - MedianFinder() initializes the MedianFinder object.
                - void addNum(int num) adds the integer num to the data structure.
                - double findMedian() returns the median of all elements so far.

                Example:
                  Input: ["addNum","addNum","findMedian","addNum","findMedian"]
                         [1,2,null,3,null]
                  Output: [null,null,1.5,null,2.0]""",
                // javaTemplate
                """
                import java.util.*;

                class MedianFinder {

                    public MedianFinder() {

                    }

                    public void addNum(int num) {

                    }

                    public double findMedian() {

                    }
                }""",
                // pythonTemplate
                """
                import heapq

                class MedianFinder:
                    def __init__(self):
                        pass

                    def addNum(self, num: int) -> None:
                        pass

                    def findMedian(self) -> float:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] ops = sc.nextLine().trim().split(",");
                        String[] vals = sc.nextLine().trim().split(",");
                        MedianFinder mf = new MedianFinder();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < ops.length; i++) {
                            if (i > 0) sb.append(",");
                            String op = ops[i].trim();
                            if (op.equals("addNum")) {
                                mf.addNum(Integer.parseInt(vals[i].trim()));
                                sb.append("null");
                            } else if (op.equals("findMedian")) {
                                double median = mf.findMedian();
                                if (median == (int) median) {
                                    sb.append(String.format("%.1f", median));
                                } else {
                                    sb.append(String.valueOf(median));
                                }
                            }
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                ops = input().strip().split(",")
                vals = input().strip().split(",")
                mf = MedianFinder()
                results = []
                for i in range(len(ops)):
                    op = ops[i].strip()
                    if op == "addNum":
                        mf.addNum(int(vals[i].strip()))
                        results.append("null")
                    elif op == "findMedian":
                        median = mf.findMedian()
                        if median == int(median):
                            results.append(f"{median:.1f}")
                        else:
                            results.append(str(median))
                print(",".join(results))""",
                // testCasesJson
                """
                [
                  {"input": "addNum,addNum,findMedian,addNum,findMedian\\n1,2,null,3,null", "expectedOutput": "null,null,1.5,null,2.0"}
                ]""",
                // tags
                "two-pointers,design,sorting,heap,data-stream",
                // category
                "堆"
        };
    }
}

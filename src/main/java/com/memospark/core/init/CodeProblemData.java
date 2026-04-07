package com.memospark.core.init;

import java.util.List;

/**
 * Static data for 10 MVP LeetCode problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags}
 */
public final class CodeProblemData {

    private CodeProblemData() {}

    public static List<String[]> problems() {
        return List.of(
                twoSum(),
                validParentheses(),
                mergeTwoSortedLists(),
                climbingStairs(),
                bestTimeToBuyAndSellStock(),
                reverseLinkedList(),
                maximumSubarray(),
                threeSum(),
                numberOfIslands(),
                longestPalindromicSubstring()
        );
    }

    // ── 1. Two Sum (Easy) ─────────────────────────────────────
    private static String[] twoSum() {
        return new String[]{
                "1", "Two Sum", "Easy",
                // description
                """
                Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

                You may assume that each input would have exactly one solution, and you may not use the same element twice.

                Example:
                  Input: nums = [2,7,11,15], target = 9
                  Output: [0,1]
                  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].""",
                // javaTemplate
                """
                class Solution {
                    public int[] twoSum(int[] nums, int target) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def twoSum(self, nums: list[int], target: int) -> list[int]:
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
                        int[] result = new Solution().twoSum(nums, target);
                        Arrays.sort(result);
                        System.out.println(result[0] + "," + result[1]);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                target = int(input().strip())
                result = Solution().twoSum(nums, target)
                result.sort()
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "2,7,11,15\\n9", "expectedOutput": "0,1"},
                  {"input": "3,2,4\\n6", "expectedOutput": "1,2"},
                  {"input": "3,3\\n6", "expectedOutput": "0,1"}
                ]""",
                // tags
                "array,hash-table"
        };
    }

    // ── 20. Valid Parentheses (Easy) ──────────────────────────
    private static String[] validParentheses() {
        return new String[]{
                "20", "Valid Parentheses", "Easy",
                """
                Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

                An input string is valid if:
                1. Open brackets must be closed by the same type of brackets.
                2. Open brackets must be closed in the correct order.
                3. Every close bracket has a corresponding open bracket of the same type.

                Example:
                  Input: s = "()[]{}"
                  Output: true""",
                """
                class Solution {
                    public boolean isValid(String s) {

                    }
                }""",
                """
                class Solution:
                    def isValid(self, s: str) -> bool:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().isValid(s));
                    }
                }""",
                """
                {{USER_CODE}}

                s = input().strip()
                result = Solution().isValid(s)
                print(str(result).lower())""",
                """
                [
                  {"input": "()", "expectedOutput": "true"},
                  {"input": "()[]{}", "expectedOutput": "true"},
                  {"input": "(]", "expectedOutput": "false"},
                  {"input": "([)]", "expectedOutput": "false"},
                  {"input": "{[]}", "expectedOutput": "true"}
                ]""",
                "stack,string"
        };
    }

    // ── 21. Merge Two Sorted Lists (Easy) ─────────────────────
    private static String[] mergeTwoSortedLists() {
        return new String[]{
                "21", "Merge Two Sorted Lists", "Easy",
                """
                You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list by splicing together the nodes of the first two lists. Return the head of the merged linked list.

                Example:
                  Input: list1 = [1,2,4], list2 = [1,3,4]
                  Output: [1,1,2,3,4,4]""",
                """
                class Solution {
                    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

                    }
                }""",
                """
                class Solution:
                    def mergeTwoLists(self, list1, list2):
                        pass""",
                """
                import java.util.*;

                class ListNode {
                    int val;
                    ListNode next;
                    ListNode() {}
                    ListNode(int val) { this.val = val; }
                    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
                }

                {{USER_CODE}}

                public class Main {
                    static ListNode parse(String s) {
                        if (s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        ListNode dummy = new ListNode(0);
                        ListNode curr = dummy;
                        for (String p : parts) { curr.next = new ListNode(Integer.parseInt(p.trim())); curr = curr.next; }
                        return dummy.next;
                    }
                    static String fmt(ListNode head) {
                        if (head == null) return "null";
                        StringBuilder sb = new StringBuilder();
                        while (head != null) { sb.append(head.val); if (head.next != null) sb.append(","); head = head.next; }
                        return sb.toString();
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        ListNode l1 = parse(sc.nextLine().trim());
                        ListNode l2 = parse(sc.nextLine().trim());
                        System.out.println(fmt(new Solution().mergeTwoLists(l1, l2)));
                    }
                }""",
                """
                class ListNode:
                    def __init__(self, val=0, next=None):
                        self.val = val
                        self.next = next

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null": return None
                    dummy = ListNode(0)
                    curr = dummy
                    for v in s.split(","):
                        curr.next = ListNode(int(v.strip()))
                        curr = curr.next
                    return dummy.next

                def fmt(head):
                    if not head: return "null"
                    parts = []
                    while head:
                        parts.append(str(head.val))
                        head = head.next
                    return ",".join(parts)

                l1 = parse(input().strip())
                l2 = parse(input().strip())
                print(fmt(Solution().mergeTwoLists(l1, l2)))""",
                """
                [
                  {"input": "1,2,4\\n1,3,4", "expectedOutput": "1,1,2,3,4,4"},
                  {"input": "null\\nnull", "expectedOutput": "null"},
                  {"input": "null\\n0", "expectedOutput": "0"}
                ]""",
                "linked-list,recursion"
        };
    }

    // ── 70. Climbing Stairs (Easy) ────────────────────────────
    private static String[] climbingStairs() {
        return new String[]{
                "70", "Climbing Stairs", "Easy",
                """
                You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

                Example:
                  Input: n = 3
                  Output: 3
                  Explanation: There are three ways: 1+1+1, 1+2, 2+1""",
                """
                class Solution {
                    public int climbStairs(int n) {

                    }
                }""",
                """
                class Solution:
                    def climbStairs(self, n: int) -> int:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        int n = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(new Solution().climbStairs(n));
                    }
                }""",
                """
                {{USER_CODE}}

                n = int(input().strip())
                print(Solution().climbStairs(n))""",
                """
                [
                  {"input": "2", "expectedOutput": "2"},
                  {"input": "3", "expectedOutput": "3"},
                  {"input": "5", "expectedOutput": "8"}
                ]""",
                "dynamic-programming,math"
        };
    }

    // ── 121. Best Time to Buy and Sell Stock (Easy) ───────────
    private static String[] bestTimeToBuyAndSellStock() {
        return new String[]{
                "121", "Best Time to Buy and Sell Stock", "Easy",
                """
                You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit. If no profit is possible, return 0.

                Example:
                  Input: prices = [7,1,5,3,6,4]
                  Output: 5
                  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 5.""",
                """
                class Solution {
                    public int maxProfit(int[] prices) {

                    }
                }""",
                """
                class Solution:
                    def maxProfit(self, prices: list[int]) -> int:
                        pass""",
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
                """
                {{USER_CODE}}

                prices = list(map(int, input().strip().split(",")))
                print(Solution().maxProfit(prices))""",
                """
                [
                  {"input": "7,1,5,3,6,4", "expectedOutput": "5"},
                  {"input": "7,6,4,3,1", "expectedOutput": "0"},
                  {"input": "2,4,1", "expectedOutput": "2"}
                ]""",
                "array,greedy"
        };
    }

    // ── 206. Reverse Linked List (Easy) ───────────────────────
    private static String[] reverseLinkedList() {
        return new String[]{
                "206", "Reverse Linked List", "Easy",
                """
                Given the head of a singly linked list, reverse the list, and return the reversed list.

                Example:
                  Input: head = [1,2,3,4,5]
                  Output: [5,4,3,2,1]""",
                """
                class Solution {
                    public ListNode reverseList(ListNode head) {

                    }
                }""",
                """
                class Solution:
                    def reverseList(self, head):
                        pass""",
                """
                import java.util.*;

                class ListNode {
                    int val;
                    ListNode next;
                    ListNode() {}
                    ListNode(int val) { this.val = val; }
                    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
                }

                {{USER_CODE}}

                public class Main {
                    static ListNode parse(String s) {
                        if (s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        ListNode dummy = new ListNode(0);
                        ListNode curr = dummy;
                        for (String p : parts) { curr.next = new ListNode(Integer.parseInt(p.trim())); curr = curr.next; }
                        return dummy.next;
                    }
                    static String fmt(ListNode head) {
                        if (head == null) return "null";
                        StringBuilder sb = new StringBuilder();
                        while (head != null) { sb.append(head.val); if (head.next != null) sb.append(","); head = head.next; }
                        return sb.toString();
                    }
                    public static void main(String[] args) {
                        ListNode head = parse(new Scanner(System.in).nextLine().trim());
                        System.out.println(fmt(new Solution().reverseList(head)));
                    }
                }""",
                """
                class ListNode:
                    def __init__(self, val=0, next=None):
                        self.val = val
                        self.next = next

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null": return None
                    dummy = ListNode(0)
                    curr = dummy
                    for v in s.split(","):
                        curr.next = ListNode(int(v.strip()))
                        curr = curr.next
                    return dummy.next

                def fmt(head):
                    if not head: return "null"
                    parts = []
                    while head:
                        parts.append(str(head.val))
                        head = head.next
                    return ",".join(parts)

                head = parse(input().strip())
                print(fmt(Solution().reverseList(head)))""",
                """
                [
                  {"input": "1,2,3,4,5", "expectedOutput": "5,4,3,2,1"},
                  {"input": "1,2", "expectedOutput": "2,1"},
                  {"input": "null", "expectedOutput": "null"}
                ]""",
                "linked-list,recursion"
        };
    }

    // ── 53. Maximum Subarray (Medium) ─────────────────────────
    private static String[] maximumSubarray() {
        return new String[]{
                "53", "Maximum Subarray", "Medium",
                """
                Given an integer array nums, find the subarray with the largest sum, and return its sum.

                Example:
                  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
                  Output: 6
                  Explanation: The subarray [4,-1,2,1] has the largest sum 6.""",
                """
                class Solution {
                    public int maxSubArray(int[] nums) {

                    }
                }""",
                """
                class Solution:
                    def maxSubArray(self, nums: list[int]) -> int:
                        pass""",
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
                """
                {{USER_CODE}}

                nums = list(map(int, input().strip().split(",")))
                print(Solution().maxSubArray(nums))""",
                """
                [
                  {"input": "-2,1,-3,4,-1,2,1,-5,4", "expectedOutput": "6"},
                  {"input": "1", "expectedOutput": "1"},
                  {"input": "5,4,-1,7,8", "expectedOutput": "23"}
                ]""",
                "array,dynamic-programming"
        };
    }

    // ── 15. 3Sum (Medium) ─────────────────────────────────────
    private static String[] threeSum() {
        return new String[]{
                "15", "3Sum", "Medium",
                """
                Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. The solution set must not contain duplicate triplets.

                Example:
                  Input: nums = [-1,0,1,2,-1,-4]
                  Output: [[-1,-1,2],[-1,0,1]]""",
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> threeSum(int[] nums) {

                    }
                }""",
                """
                class Solution:
                    def threeSum(self, nums: list[int]) -> list[list[int]]:
                        pass""",
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
                """
                [
                  {"input": "-1,0,1,2,-1,-4", "expectedOutput": "[[-1,-1,2],[-1,0,1]]"},
                  {"input": "0,1,1", "expectedOutput": "[]"},
                  {"input": "0,0,0", "expectedOutput": "[[0,0,0]]"}
                ]""",
                "array,two-pointers,sorting"
        };
    }

    // ── 200. Number of Islands (Medium) ───────────────────────
    private static String[] numberOfIslands() {
        return new String[]{
                "200", "Number of Islands", "Medium",
                """
                Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

                Example:
                  Input: grid = [
                    ["1","1","0","0","0"],
                    ["1","1","0","0","0"],
                    ["0","0","1","0","0"],
                    ["0","0","0","1","1"]
                  ]
                  Output: 3""",
                """
                class Solution {
                    public int numIslands(char[][] grid) {

                    }
                }""",
                """
                class Solution:
                    def numIslands(self, grid: list[list[str]]) -> int:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int rows = Integer.parseInt(sc.nextLine().trim());
                        char[][] grid = new char[rows][];
                        for (int i = 0; i < rows; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            grid[i] = new char[parts.length];
                            for (int j = 0; j < parts.length; j++) grid[i][j] = parts[j].charAt(0);
                        }
                        System.out.println(new Solution().numIslands(grid));
                    }
                }""",
                """
                {{USER_CODE}}

                rows = int(input().strip())
                grid = []
                for _ in range(rows):
                    grid.append(input().strip().split(","))
                print(Solution().numIslands(grid))""",
                """
                [
                  {"input": "4\\n1,1,1,1,0\\n1,1,0,1,0\\n1,1,0,0,0\\n0,0,0,0,0", "expectedOutput": "1"},
                  {"input": "4\\n1,1,0,0,0\\n1,1,0,0,0\\n0,0,1,0,0\\n0,0,0,1,1", "expectedOutput": "3"},
                  {"input": "1\\n1,0,1,0,1", "expectedOutput": "3"}
                ]""",
                "bfs,dfs,matrix"
        };
    }

    // ── 5. Longest Palindromic Substring (Medium) ─────────────
    private static String[] longestPalindromicSubstring() {
        return new String[]{
                "5", "Longest Palindromic Substring", "Medium",
                """
                Given a string s, return the longest palindromic substring in s.

                Example:
                  Input: s = "cbbd"
                  Output: "bb"

                Example 2:
                  Input: s = "racecar"
                  Output: "racecar" """,
                """
                class Solution {
                    public String longestPalindrome(String s) {

                    }
                }""",
                """
                class Solution:
                    def longestPalindrome(self, s: str) -> str:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().longestPalindrome(s));
                    }
                }""",
                """
                {{USER_CODE}}

                s = input().strip()
                print(Solution().longestPalindrome(s))""",
                """
                [
                  {"input": "cbbd", "expectedOutput": "bb"},
                  {"input": "a", "expectedOutput": "a"},
                  {"input": "racecar", "expectedOutput": "racecar"}
                ]""",
                "string,dynamic-programming"
        };
    }
}

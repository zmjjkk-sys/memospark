package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode Stack problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataStack {

    private CodeProblemDataStack() {}

    public static List<String[]> problems() {
        return List.of(
                validParentheses(),
                minStack(),
                decodeString(),
                dailyTemperatures(),
                largestRectangleInHistogram()
        );
    }

    // ── 20. Valid Parentheses (Easy) ──────────────────────────
    private static String[] validParentheses() {
        return new String[]{
                "20", "Valid Parentheses", "Easy",
                // description
                """
                Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

                An input string is valid if:
                1. Open brackets must be closed by the same type of brackets.
                2. Open brackets must be closed in the correct order.
                3. Every close bracket has a corresponding open bracket of the same type.

                Example 1:
                  Input: s = "()"
                  Output: true

                Example 2:
                  Input: s = "()[]{}"
                  Output: true

                Example 3:
                  Input: s = "(]"
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean isValid(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def isValid(self, s: str) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().isValid(s));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                result = Solution().isValid(s)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "()", "expectedOutput": "true"},
                  {"input": "()[]{}", "expectedOutput": "true"},
                  {"input": "(]", "expectedOutput": "false"},
                  {"input": "([)]", "expectedOutput": "false"},
                  {"input": "{[]}", "expectedOutput": "true"}
                ]""",
                // tags
                "string,stack",
                // category
                "\u6808"
        };
    }

    // ── 155. Min Stack (Medium) ───────────────────────────────
    private static String[] minStack() {
        return new String[]{
                "155", "Min Stack", "Medium",
                // description
                """
                Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

                Implement the MinStack class:
                - MinStack() initializes the stack object.
                - void push(int val) pushes the element val onto the stack.
                - void pop() removes the element on the top of the stack.
                - int top() gets the top element of the stack.
                - int getMin() retrieves the minimum element in the stack.

                You must implement a solution with O(1) time complexity for each function.

                Example:
                  Input: ["push","push","push","getMin","pop","top","getMin"]
                         [-2,0,-3,null,null,null,null]
                  Output: [null,null,null,-3,null,0,-2]""",
                // javaTemplate
                """
                class MinStack {

                    public MinStack() {

                    }

                    public void push(int val) {

                    }

                    public void pop() {

                    }

                    public int top() {
                        return 0;
                    }

                    public int getMin() {
                        return 0;
                    }
                }""",
                // pythonTemplate
                """
                class MinStack:

                    def __init__(self):
                        pass

                    def push(self, val: int) -> None:
                        pass

                    def pop(self) -> None:
                        pass

                    def top(self) -> int:
                        pass

                    def getMin(self) -> int:
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
                        MinStack stack = new MinStack();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < ops.length; i++) {
                            if (i > 0) sb.append(",");
                            switch (ops[i].trim()) {
                                case "push":
                                    stack.push(Integer.parseInt(vals[i].trim()));
                                    sb.append("null");
                                    break;
                                case "pop":
                                    stack.pop();
                                    sb.append("null");
                                    break;
                                case "top":
                                    sb.append(stack.top());
                                    break;
                                case "getMin":
                                    sb.append(stack.getMin());
                                    break;
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
                stack = MinStack()
                results = []
                for i in range(len(ops)):
                    op = ops[i].strip()
                    if op == "push":
                        stack.push(int(vals[i].strip()))
                        results.append("null")
                    elif op == "pop":
                        stack.pop()
                        results.append("null")
                    elif op == "top":
                        results.append(str(stack.top()))
                    elif op == "getMin":
                        results.append(str(stack.getMin()))
                print(",".join(results))""",
                // testCasesJson
                """
                [
                  {"input": "push,push,push,getMin,pop,top,getMin\\n-2,0,-3,null,null,null,null", "expectedOutput": "null,null,null,-3,null,0,-2"}
                ]""",
                // tags
                "stack,design",
                // category
                "\u6808"
        };
    }

    // ── 394. Decode String (Medium) ───────────────────────────
    private static String[] decodeString() {
        return new String[]{
                "394", "Decode String", "Medium",
                // description
                """
                Given an encoded string, return its decoded string.

                The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. You may assume the input string is always valid.

                Example 1:
                  Input: s = "3[a]2[bc]"
                  Output: "aaabcbc"

                Example 2:
                  Input: s = "3[a2[c]]"
                  Output: "accaccacc"

                Example 3:
                  Input: s = "2[abc]3[cd]ef"
                  Output: "abcabccdcdcdef" """,
                // javaTemplate
                """
                class Solution {
                    public String decodeString(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def decodeString(self, s: str) -> str:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().decodeString(s));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                print(Solution().decodeString(s))""",
                // testCasesJson
                """
                [
                  {"input": "3[a]2[bc]", "expectedOutput": "aaabcbc"},
                  {"input": "3[a2[c]]", "expectedOutput": "accaccacc"},
                  {"input": "2[abc]3[cd]ef", "expectedOutput": "abcabccdcdcdef"}
                ]""",
                // tags
                "string,stack,recursion",
                // category
                "\u6808"
        };
    }

    // ── 739. Daily Temperatures (Medium) ──────────────────────
    private static String[] dailyTemperatures() {
        return new String[]{
                "739", "Daily Temperatures", "Medium",
                // description
                """
                Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

                Example 1:
                  Input: temperatures = [73,74,75,71,69,72,76,73]
                  Output: [1,1,4,2,1,1,0,0]

                Example 2:
                  Input: temperatures = [30,40,50,60]
                  Output: [1,1,1,0]

                Example 3:
                  Input: temperatures = [30,60,90]
                  Output: [1,1,0]""",
                // javaTemplate
                """
                class Solution {
                    public int[] dailyTemperatures(int[] temperatures) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] temps = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) temps[i] = Integer.parseInt(parts[i].trim());
                        int[] result = new Solution().dailyTemperatures(temps);
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

                temps = list(map(int, input().strip().split(",")))
                result = Solution().dailyTemperatures(temps)
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "73,74,75,71,69,72,76,73", "expectedOutput": "1,1,4,2,1,1,0,0"},
                  {"input": "30,40,50,60", "expectedOutput": "1,1,1,0"},
                  {"input": "30,60,90", "expectedOutput": "1,1,0"}
                ]""",
                // tags
                "array,stack,monotonic-stack",
                // category
                "\u6808"
        };
    }

    // ── 84. Largest Rectangle in Histogram (Hard) ─────────────
    private static String[] largestRectangleInHistogram() {
        return new String[]{
                "84", "Largest Rectangle in Histogram", "Hard",
                // description
                """
                Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

                Example 1:
                  Input: heights = [2,1,5,6,2,3]
                  Output: 10
                  Explanation: The largest rectangle has an area of 10 units (heights 5 and 6, width 2).

                Example 2:
                  Input: heights = [2,4]
                  Output: 4""",
                // javaTemplate
                """
                class Solution {
                    public int largestRectangleArea(int[] heights) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def largestRectangleArea(self, heights: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String[] parts = new Scanner(System.in).nextLine().trim().split(",");
                        int[] heights = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) heights[i] = Integer.parseInt(parts[i].trim());
                        System.out.println(new Solution().largestRectangleArea(heights));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                heights = list(map(int, input().strip().split(",")))
                print(Solution().largestRectangleArea(heights))""",
                // testCasesJson
                """
                [
                  {"input": "2,1,5,6,2,3", "expectedOutput": "10"},
                  {"input": "2,4", "expectedOutput": "4"}
                ]""",
                // tags
                "array,stack,monotonic-stack",
                // category
                "\u6808"
        };
    }
}

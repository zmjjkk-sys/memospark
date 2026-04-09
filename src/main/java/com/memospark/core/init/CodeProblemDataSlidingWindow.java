package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems - Sliding Window category.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataSlidingWindow {

    private CodeProblemDataSlidingWindow() {}

    public static List<String[]> problems() {
        return List.of(
                longestSubstringWithoutRepeatingCharacters(),
                findAllAnagramsInAString()
        );
    }

    // ── 3. Longest Substring Without Repeating Characters (Medium) ──
    private static String[] longestSubstringWithoutRepeatingCharacters() {
        return new String[]{
                "3", "Longest Substring Without Repeating Characters", "Medium",
                // description
                """
                Given a string s, find the length of the longest substring without repeating characters.

                Example 1:
                  Input: s = "abcabcbb"
                  Output: 3
                  Explanation: The answer is "abc", with the length of 3.

                Example 2:
                  Input: s = "bbbbb"
                  Output: 1
                  Explanation: The answer is "b", with the length of 1.

                Example 3:
                  Input: s = "pwwkew"
                  Output: 3
                  Explanation: The answer is "wke", with the length of 3.""",
                // javaTemplate
                """
                class Solution {
                    public int lengthOfLongestSubstring(String s) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def lengthOfLongestSubstring(self, s: str) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        System.out.println(new Solution().lengthOfLongestSubstring(s));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                print(Solution().lengthOfLongestSubstring(s))""",
                // testCasesJson
                """
                [
                  {"input": "abcabcbb", "expectedOutput": "3"},
                  {"input": "bbbbb", "expectedOutput": "1"},
                  {"input": "pwwkew", "expectedOutput": "3"}
                ]""",
                // tags
                "hash-table,string,sliding-window",
                // category
                "\u6ed1\u52a8\u7a97\u53e3"
        };
    }

    // ── 438. Find All Anagrams in a String (Medium) ──
    private static String[] findAllAnagramsInAString() {
        return new String[]{
                "438", "Find All Anagrams in a String", "Medium",
                // description
                """
                Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

                An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

                Example 1:
                  Input: s = "cbaebabacd", p = "abc"
                  Output: [0,6]

                Example 2:
                  Input: s = "abab", p = "ab"
                  Output: [0,1,2]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<Integer> findAnagrams(String s, String p) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def findAnagrams(self, s: str, p: str) -> list[int]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String s = sc.nextLine().trim();
                        String p = sc.nextLine().trim();
                        List<Integer> result = new Solution().findAnagrams(s, p);
                        if (result == null || result.isEmpty()) {
                            System.out.println("[]");
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < result.size(); i++) {
                                if (i > 0) sb.append(",");
                                sb.append(result.get(i));
                            }
                            System.out.println(sb);
                        }
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                s = input().strip()
                p = input().strip()
                result = Solution().findAnagrams(s, p)
                if not result:
                    print("[]")
                else:
                    print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "cbaebabacd\\nabc", "expectedOutput": "0,6"},
                  {"input": "abab\\nab", "expectedOutput": "0,1,2"}
                ]""",
                // tags
                "hash-table,string,sliding-window",
                // category
                "\u6ed1\u52a8\u7a97\u53e3"
        };
    }
}

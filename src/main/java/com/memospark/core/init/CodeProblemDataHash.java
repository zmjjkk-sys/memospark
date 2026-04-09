package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode Hash category problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataHash {

    private CodeProblemDataHash() {}

    public static List<String[]> problems() {
        return List.of(twoSum(), groupAnagrams(), longestConsecutiveSequence());
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
                "array,hash-table",
                // category
                "\u54C8\u5E0C"
        };
    }

    // ── 49. Group Anagrams (Medium) ───────────────────────────
    private static String[] groupAnagrams() {
        return new String[]{
                "49", "Group Anagrams", "Medium",
                // description
                """
                Given an array of strings strs, group the anagrams together. You can return the answer in any order.

                An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

                Example:
                  Input: strs = ["eat","tea","tan","ate","nat","bat"]
                  Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

                Example 2:
                  Input: strs = [""]
                  Output: [[""]]

                Example 3:
                  Input: strs = ["a"]
                  Output: [["a"]]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<String>> groupAnagrams(String[] strs) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String line = sc.nextLine().trim();
                        String[] strs;
                        if (line.isEmpty()) {
                            strs = new String[]{""};
                        } else {
                            strs = line.split(",");
                            for (int i = 0; i < strs.length; i++) strs[i] = strs[i].trim();
                        }
                        List<List<String>> result = new Solution().groupAnagrams(strs);
                        // sort each group internally, then sort groups
                        for (List<String> group : result) Collections.sort(group);
                        result.sort((a, b) -> {
                            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                                int cmp = a.get(i).compareTo(b.get(i));
                                if (cmp != 0) return cmp;
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

                line = input().strip()
                if not line:
                    strs = [""]
                else:
                    strs = [s.strip() for s in line.split(",")]
                result = Solution().groupAnagrams(strs)
                result = [sorted(g) for g in result]
                result.sort()
                parts = []
                for g in result:
                    parts.append("[" + ",".join(g) + "]")
                print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "eat,tea,tan,ate,nat,bat", "expectedOutput": "[[bat],[nat,tan],[ate,eat,tea]]"},
                  {"input": "", "expectedOutput": "[[]]"},
                  {"input": "a", "expectedOutput": "[[a]]"}
                ]""",
                // tags
                "array,hash-table,string,sorting",
                // category
                "\u54C8\u5E0C"
        };
    }

    // ── 128. Longest Consecutive Sequence (Medium) ────────────
    private static String[] longestConsecutiveSequence() {
        return new String[]{
                "128", "Longest Consecutive Sequence", "Medium",
                // description
                """
                Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

                You must write an algorithm that runs in O(n) time.

                Example:
                  Input: nums = [100,4,200,1,3,2]
                  Output: 4
                  Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

                Example 2:
                  Input: nums = [0,3,7,2,5,8,4,6,0,1]
                  Output: 9""",
                // javaTemplate
                """
                class Solution {
                    public int longestConsecutive(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def longestConsecutive(self, nums: list[int]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String line = sc.nextLine().trim();
                        if (line.isEmpty()) {
                            System.out.println(new Solution().longestConsecutive(new int[0]));
                        } else {
                            String[] parts = line.split(",");
                            int[] nums = new int[parts.length];
                            for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                            System.out.println(new Solution().longestConsecutive(nums));
                        }
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                line = input().strip()
                if not line:
                    nums = []
                else:
                    nums = list(map(int, line.split(",")))
                print(Solution().longestConsecutive(nums))""",
                // testCasesJson
                """
                [
                  {"input": "100,4,200,1,3,2", "expectedOutput": "4"},
                  {"input": "0,3,7,2,5,8,4,6,0,1", "expectedOutput": "9"},
                  {"input": "", "expectedOutput": "0"}
                ]""",
                // tags
                "array,hash-table,union-find",
                // category
                "\u54C8\u5E0C"
        };
    }
}

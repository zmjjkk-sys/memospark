package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — Category: 图论 (Graph)
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataGraph {

    private CodeProblemDataGraph() {}

    public static List<String[]> problems() {
        return List.of(
                numberOfIslands(),
                rottingOranges(),
                courseSchedule(),
                implementTrie()
        );
    }

    // ── 200. Number of Islands (Medium) ───────────────────────
    private static String[] numberOfIslands() {
        return new String[]{
                "200", "Number of Islands", "Medium",
                // description
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
                // javaTemplate
                """
                class Solution {
                    public int numIslands(char[][] grid) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def numIslands(self, grid: list[list[str]]) -> int:
                        pass""",
                // javaDriverCode
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
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                grid = []
                for _ in range(rows):
                    grid.append(input().strip().split(","))
                print(Solution().numIslands(grid))""",
                // testCasesJson
                """
                [
                  {"input": "4\\n1,1,1,1,0\\n1,1,0,1,0\\n1,1,0,0,0\\n0,0,0,0,0", "expectedOutput": "1"},
                  {"input": "4\\n1,1,0,0,0\\n1,1,0,0,0\\n0,0,1,0,0\\n0,0,0,1,1", "expectedOutput": "3"}
                ]""",
                // tags
                "array,dfs,bfs,union-find,matrix",
                // category
                "图论"
        };
    }

    // ── 994. Rotting Oranges (Medium) ─────────────────────────
    private static String[] rottingOranges() {
        return new String[]{
                "994", "Rotting Oranges", "Medium",
                // description
                """
                You are given an m x n grid where each cell can have one of three values:
                  0 — empty cell
                  1 — fresh orange
                  2 — rotten orange
                Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
                Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

                Example:
                  Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
                  Output: 4""",
                // javaTemplate
                """
                class Solution {
                    public int orangesRotting(int[][] grid) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def orangesRotting(self, grid: list[list[int]]) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int rows = Integer.parseInt(sc.nextLine().trim());
                        int[][] grid = new int[rows][];
                        for (int i = 0; i < rows; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            grid[i] = new int[parts.length];
                            for (int j = 0; j < parts.length; j++) grid[i][j] = Integer.parseInt(parts[j].trim());
                        }
                        System.out.println(new Solution().orangesRotting(grid));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                grid = []
                for _ in range(rows):
                    grid.append(list(map(int, input().strip().split(","))))
                print(Solution().orangesRotting(grid))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n2,1,1\\n1,1,0\\n0,1,1", "expectedOutput": "4"},
                  {"input": "3\\n2,1,1\\n0,1,1\\n1,0,1", "expectedOutput": "-1"},
                  {"input": "1\\n0,2", "expectedOutput": "0"}
                ]""",
                // tags
                "array,bfs,matrix",
                // category
                "图论"
        };
    }

    // ── 207. Course Schedule (Medium) ─────────────────────────
    private static String[] courseSchedule() {
        return new String[]{
                "207", "Course Schedule", "Medium",
                // description
                """
                There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [a, b] indicates that you must take course b before course a.
                Return true if you can finish all courses, otherwise return false.

                Example:
                  Input: numCourses = 2, prerequisites = [[1,0]]
                  Output: true

                Example 2:
                  Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean canFinish(int numCourses, int[][] prerequisites) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def canFinish(self, numCourses: int, prerequisites: list[list[int]]) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int numCourses = Integer.parseInt(sc.nextLine().trim());
                        int count = Integer.parseInt(sc.nextLine().trim());
                        int[][] prerequisites = new int[count][2];
                        for (int i = 0; i < count; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            prerequisites[i][0] = Integer.parseInt(parts[0].trim());
                            prerequisites[i][1] = Integer.parseInt(parts[1].trim());
                        }
                        System.out.println(new Solution().canFinish(numCourses, prerequisites));
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                num_courses = int(input().strip())
                count = int(input().strip())
                prerequisites = []
                for _ in range(count):
                    parts = input().strip().split(",")
                    prerequisites.append([int(parts[0]), int(parts[1])])
                print(str(Solution().canFinish(num_courses, prerequisites)).lower())""",
                // testCasesJson
                """
                [
                  {"input": "2\\n1\\n1,0", "expectedOutput": "true"},
                  {"input": "2\\n2\\n1,0\\n0,1", "expectedOutput": "false"}
                ]""",
                // tags
                "dfs,bfs,graph,topological-sort",
                // category
                "图论"
        };
    }

    // ── 208. Implement Trie (Medium) ──────────────────────────
    private static String[] implementTrie() {
        return new String[]{
                "208", "Implement Trie (Prefix Tree)", "Medium",
                // description
                """
                A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.
                Implement the Trie class:
                  - Trie() Initializes the trie object.
                  - void insert(String word) Inserts the string word into the trie.
                  - boolean search(String word) Returns true if the string word is in the trie, and false otherwise.
                  - boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix, and false otherwise.

                Example:
                  Input: ["insert","search","search","startsWith","insert","search"]
                         ["apple","apple","app","app","app","app"]
                  Output: [null,true,false,true,null,true]""",
                // javaTemplate
                """
                class Trie {

                    public Trie() {

                    }

                    public void insert(String word) {

                    }

                    public boolean search(String word) {

                    }

                    public boolean startsWith(String prefix) {

                    }
                }""",
                // pythonTemplate
                """
                class Trie:

                    def __init__(self):
                        pass

                    def insert(self, word: str) -> None:
                        pass

                    def search(self, word: str) -> bool:
                        pass

                    def startsWith(self, prefix: str) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] ops = sc.nextLine().trim().split(",");
                        String[] params = sc.nextLine().trim().split(",");
                        Trie trie = new Trie();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < ops.length; i++) {
                            if (i > 0) sb.append(",");
                            switch (ops[i].trim()) {
                                case "insert":
                                    trie.insert(params[i].trim());
                                    sb.append("null");
                                    break;
                                case "search":
                                    sb.append(trie.search(params[i].trim()));
                                    break;
                                case "startsWith":
                                    sb.append(trie.startsWith(params[i].trim()));
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
                params = input().strip().split(",")
                trie = Trie()
                results = []
                for op, param in zip(ops, params):
                    op = op.strip()
                    param = param.strip()
                    if op == "insert":
                        trie.insert(param)
                        results.append("null")
                    elif op == "search":
                        results.append(str(trie.search(param)).lower())
                    elif op == "startsWith":
                        results.append(str(trie.startsWith(param)).lower())
                print(",".join(results))""",
                // testCasesJson
                """
                [
                  {"input": "insert,search,search,startsWith,insert,search\\napple,apple,app,app,app,app", "expectedOutput": "null,true,false,true,null,true"}
                ]""",
                // tags
                "hash-table,string,design,trie",
                // category
                "图论"
        };
    }
}

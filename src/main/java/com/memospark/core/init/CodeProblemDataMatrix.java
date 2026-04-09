package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode problems — category "矩阵".
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataMatrix {

    private CodeProblemDataMatrix() {}

    public static List<String[]> problems() {
        return List.of(
                setMatrixZeroes(),
                spiralMatrix(),
                rotateImage(),
                searchA2DMatrixII()
        );
    }

    // ── 73. Set Matrix Zeroes (Medium) ─────────────────────────
    private static String[] setMatrixZeroes() {
        return new String[]{
                "73", "Set Matrix Zeroes", "Medium",
                // description
                """
                Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.

                Example:
                  Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
                  Output: [[1,0,1],[0,0,0],[1,0,1]]""",
                // javaTemplate
                """
                class Solution {
                    public void setZeroes(int[][] matrix) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def setZeroes(self, matrix: list[list[int]]) -> None:
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
                        new Solution().setZeroes(matrix);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < matrix.length; i++) {
                            if (i > 0) sb.append("\\n");
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (j > 0) sb.append(",");
                                sb.append(matrix[i][j]);
                            }
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                matrix = []
                for _ in range(rows):
                    matrix.append(list(map(int, input().strip().split(","))))
                Solution().setZeroes(matrix)
                print("\\n".join(",".join(map(str, row)) for row in matrix))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n1,1,1\\n1,0,1\\n1,1,1", "expectedOutput": "1,0,1\\n0,0,0\\n1,0,1"},
                  {"input": "3\\n0,1,2,0\\n3,4,5,2\\n1,3,1,5", "expectedOutput": "0,0,0,0\\n0,4,5,0\\n0,3,1,0"}
                ]""",
                // tags
                "array,hash-table,matrix",
                // category
                "矩阵"
        };
    }

    // ── 54. Spiral Matrix (Medium) ─────────────────────────────
    private static String[] spiralMatrix() {
        return new String[]{
                "54", "Spiral Matrix", "Medium",
                // description
                """
                Given an m x n matrix, return all elements of the matrix in spiral order.

                Example:
                  Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                  Output: [1,2,3,6,9,8,7,4,5]""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<Integer> spiralOrder(int[][] matrix) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
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
                        List<Integer> result = new Solution().spiralOrder(matrix);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append(result.get(i));
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                rows = int(input().strip())
                matrix = []
                for _ in range(rows):
                    matrix.append(list(map(int, input().strip().split(","))))
                result = Solution().spiralOrder(matrix)
                print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n1,2,3\\n4,5,6\\n7,8,9", "expectedOutput": "1,2,3,6,9,8,7,4,5"},
                  {"input": "3\\n1,2,3,4\\n5,6,7,8\\n9,10,11,12", "expectedOutput": "1,2,3,4,8,12,11,10,9,5,6,7"}
                ]""",
                // tags
                "array,matrix,simulation",
                // category
                "矩阵"
        };
    }

    // ── 48. Rotate Image (Medium) ──────────────────────────────
    private static String[] rotateImage() {
        return new String[]{
                "48", "Rotate Image", "Medium",
                // description
                """
                You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise). You have to rotate the image in-place.

                Example:
                  Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                  Output: [[7,4,1],[8,5,2],[9,6,3]]""",
                // javaTemplate
                """
                class Solution {
                    public void rotate(int[][] matrix) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def rotate(self, matrix: list[list[int]]) -> None:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int n = Integer.parseInt(sc.nextLine().trim());
                        int[][] matrix = new int[n][n];
                        for (int i = 0; i < n; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            for (int j = 0; j < n; j++) matrix[i][j] = Integer.parseInt(parts[j].trim());
                        }
                        new Solution().rotate(matrix);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < n; i++) {
                            if (i > 0) sb.append("\\n");
                            for (int j = 0; j < n; j++) {
                                if (j > 0) sb.append(",");
                                sb.append(matrix[i][j]);
                            }
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                {{USER_CODE}}

                n = int(input().strip())
                matrix = []
                for _ in range(n):
                    matrix.append(list(map(int, input().strip().split(","))))
                Solution().rotate(matrix)
                print("\\n".join(",".join(map(str, row)) for row in matrix))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n1,2,3\\n4,5,6\\n7,8,9", "expectedOutput": "7,4,1\\n8,5,2\\n9,6,3"},
                  {"input": "4\\n5,1,9,11\\n2,4,8,10\\n13,3,6,7\\n15,14,12,16", "expectedOutput": "15,13,2,5\\n14,3,4,1\\n12,6,8,9\\n16,7,10,11"}
                ]""",
                // tags
                "array,math,matrix",
                // category
                "矩阵"
        };
    }

    // ── 240. Search a 2D Matrix II (Medium) ────────────────────
    private static String[] searchA2DMatrixII() {
        return new String[]{
                "240", "Search a 2D Matrix II", "Medium",
                // description
                """
                Write an efficient algorithm that searches for a value target in an m x n integer matrix. This matrix has the following properties:

                - Integers in each row are sorted in ascending from left to right.
                - Integers in each column are sorted in ascending from top to bottom.

                Example:
                  Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
                  Output: true""",
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
                  {"input": "5\\n1,4,7,11,15\\n2,5,8,12,19\\n3,6,9,16,22\\n10,13,14,17,24\\n18,21,23,26,30\\n5", "expectedOutput": "true"},
                  {"input": "5\\n1,4,7,11,15\\n2,5,8,12,19\\n3,6,9,16,22\\n10,13,14,17,24\\n18,21,23,26,30\\n20", "expectedOutput": "false"}
                ]""",
                // tags
                "array,binary-search,divide-and-conquer,matrix",
                // category
                "矩阵"
        };
    }
}

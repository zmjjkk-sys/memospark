package com.memospark.core.init;

import java.util.List;

/**
 * Static data for 14 Binary Tree LeetCode problems.
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataBinaryTree {

    private CodeProblemDataBinaryTree() {}

    public static List<String[]> problems() {
        return List.of(
                maximumDepthOfBinaryTree(),
                invertBinaryTree(),
                symmetricTree(),
                diameterOfBinaryTree(),
                binaryTreeLevelOrderTraversal(),
                convertSortedArrayToBST(),
                validateBinarySearchTree(),
                kthSmallestElementInBST(),
                binaryTreeRightSideView(),
                flattenBinaryTreeToLinkedList(),
                constructBinaryTreeFromPreorderAndInorder(),
                lowestCommonAncestor(),
                pathSumIII(),
                binaryTreeMaximumPathSum(),
                binaryTreeInorderTraversal()
        );
    }

    // ── 104. Maximum Depth of Binary Tree (Easy) ────────────────
    private static String[] maximumDepthOfBinaryTree() {
        return new String[]{
                "104", "Maximum Depth of Binary Tree", "Easy",
                // description
                """
                Given the root of a binary tree, return its maximum depth.

                A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

                Example 1:
                  Input: root = [3,9,20,null,null,15,7]
                  Output: 3

                Example 2:
                  Input: root = [1,null,2]
                  Output: 2""",
                // javaTemplate
                """
                class Solution {
                    public int maxDepth(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxDepth(self, root) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        System.out.println(new Solution().maxDepth(root));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                print(Solution().maxDepth(root))""",
                // testCasesJson
                """
                [
                  {"input": "3,9,20,null,null,15,7", "expectedOutput": "3"},
                  {"input": "1,null,2", "expectedOutput": "2"},
                  {"input": "null", "expectedOutput": "0"}
                ]""",
                // tags
                "tree,dfs,bfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 226. Invert Binary Tree (Easy) ──────────────────────────
    private static String[] invertBinaryTree() {
        return new String[]{
                "226", "Invert Binary Tree", "Easy",
                // description
                """
                Given the root of a binary tree, invert the tree, and return its root.

                Inverting a binary tree means swapping every left child with its right child.

                Example 1:
                  Input: root = [4,2,7,1,3,6,9]
                  Output: [4,7,2,9,6,3,1]

                Example 2:
                  Input: root = [2,1,3]
                  Output: [2,3,1]""",
                // javaTemplate
                """
                class Solution {
                    public TreeNode invertTree(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def invertTree(self, root):
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    static String serialize(TreeNode root) {
                        if (root == null) return "null";
                        StringBuilder sb = new StringBuilder();
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        while (!queue.isEmpty()) {
                            TreeNode node = queue.poll();
                            if (sb.length() > 0) sb.append(",");
                            if (node == null) {
                                sb.append("null");
                            } else {
                                sb.append(node.val);
                                queue.add(node.left);
                                queue.add(node.right);
                            }
                        }
                        // Remove trailing nulls
                        String result = sb.toString();
                        while (result.endsWith(",null")) {
                            result = result.substring(0, result.length() - 5);
                        }
                        return result;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        TreeNode inverted = new Solution().invertTree(root);
                        System.out.println(serialize(inverted));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                def serialize(root):
                    if not root:
                        return "null"
                    result = []
                    queue = deque([root])
                    while queue:
                        node = queue.popleft()
                        if node is None:
                            result.append("null")
                        else:
                            result.append(str(node.val))
                            queue.append(node.left)
                            queue.append(node.right)
                    # Remove trailing nulls
                    while result and result[-1] == "null":
                        result.pop()
                    return ",".join(result)

                root = parse(input().strip())
                inverted = Solution().invertTree(root)
                print(serialize(inverted))""",
                // testCasesJson
                """
                [
                  {"input": "4,2,7,1,3,6,9", "expectedOutput": "4,7,2,9,6,3,1"},
                  {"input": "2,1,3", "expectedOutput": "2,3,1"},
                  {"input": "null", "expectedOutput": "null"}
                ]""",
                // tags
                "tree,dfs,bfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 101. Symmetric Tree (Easy) ──────────────────────────────
    private static String[] symmetricTree() {
        return new String[]{
                "101", "Symmetric Tree", "Easy",
                // description
                """
                Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

                Example 1:
                  Input: root = [1,2,2,3,4,4,3]
                  Output: true

                Example 2:
                  Input: root = [1,2,2,null,3,null,3]
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean isSymmetric(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def isSymmetric(self, root) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        System.out.println(new Solution().isSymmetric(root));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                print(str(Solution().isSymmetric(root)).lower())""",
                // testCasesJson
                """
                [
                  {"input": "1,2,2,3,4,4,3", "expectedOutput": "true"},
                  {"input": "1,2,2,null,3,null,3", "expectedOutput": "false"},
                  {"input": "1", "expectedOutput": "true"}
                ]""",
                // tags
                "tree,dfs,bfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 543. Diameter of Binary Tree (Easy) ─────────────────────
    private static String[] diameterOfBinaryTree() {
        return new String[]{
                "543", "Diameter of Binary Tree", "Easy",
                // description
                """
                Given the root of a binary tree, return the length of the diameter of the tree.

                The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

                The length of a path between two nodes is represented by the number of edges between them.

                Example 1:
                  Input: root = [1,2,3,4,5]
                  Output: 3
                  Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

                Example 2:
                  Input: root = [1,2]
                  Output: 1""",
                // javaTemplate
                """
                class Solution {
                    public int diameterOfBinaryTree(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def diameterOfBinaryTree(self, root) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        System.out.println(new Solution().diameterOfBinaryTree(root));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                print(Solution().diameterOfBinaryTree(root))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4,5", "expectedOutput": "3"},
                  {"input": "1,2", "expectedOutput": "1"},
                  {"input": "1", "expectedOutput": "0"}
                ]""",
                // tags
                "tree,dfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 102. Binary Tree Level Order Traversal (Medium) ─────────
    private static String[] binaryTreeLevelOrderTraversal() {
        return new String[]{
                "102", "Binary Tree Level Order Traversal", "Medium",
                // description
                """
                Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

                Example 1:
                  Input: root = [3,9,20,null,null,15,7]
                  Output: [[3],[9,20],[15,7]]

                Example 2:
                  Input: root = [1]
                  Output: [[1]]

                Example 3:
                  Input: root = []
                  Output: []""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<List<Integer>> levelOrder(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def levelOrder(self, root) -> list[list[int]]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        List<List<Integer>> result = new Solution().levelOrder(root);
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
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                result = Solution().levelOrder(root)
                if not result:
                    print("[]")
                else:
                    parts = []
                    for level in result:
                        parts.append("[" + ",".join(map(str, level)) + "]")
                    print("[" + ",".join(parts) + "]")""",
                // testCasesJson
                """
                [
                  {"input": "3,9,20,null,null,15,7", "expectedOutput": "[[3],[9,20],[15,7]]"},
                  {"input": "1", "expectedOutput": "[[1]]"},
                  {"input": "null", "expectedOutput": "[]"}
                ]""",
                // tags
                "tree,bfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 108. Convert Sorted Array to BST (Easy) ─────────────────
    private static String[] convertSortedArrayToBST() {
        return new String[]{
                "108", "Convert Sorted Array to Binary Search Tree", "Easy",
                // description
                """
                Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

                A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

                Example 1:
                  Input: nums = [-10,-3,0,5,9]
                  Output: The inorder traversal of the result BST is -10,-3,0,5,9

                Example 2:
                  Input: nums = [1,3]
                  Output: The inorder traversal of the result BST is 1,3

                Note: Multiple valid BSTs may exist. Your answer is correct as long as the inorder traversal of the result matches the sorted input.""",
                // javaTemplate
                """
                class Solution {
                    public TreeNode sortedArrayToBST(int[] nums) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def sortedArrayToBST(self, nums: list[int]):
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static void inorder(TreeNode root, List<String> result) {
                        if (root == null) return;
                        inorder(root.left, result);
                        result.add(String.valueOf(root.val));
                        inorder(root.right, result);
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] parts = sc.nextLine().trim().split(",");
                        int[] nums = new int[parts.length];
                        for (int i = 0; i < parts.length; i++) nums[i] = Integer.parseInt(parts[i].trim());
                        TreeNode root = new Solution().sortedArrayToBST(nums);
                        List<String> result = new ArrayList<>();
                        inorder(root, result);
                        System.out.println(String.join(",", result));
                    }
                }""",
                // pythonDriverCode
                """
                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def inorder(root, result):
                    if not root:
                        return
                    inorder(root.left, result)
                    result.append(str(root.val))
                    inorder(root.right, result)

                nums = list(map(int, input().strip().split(",")))
                root = Solution().sortedArrayToBST(nums)
                result = []
                inorder(root, result)
                print(",".join(result))""",
                // testCasesJson
                """
                [
                  {"input": "-10,-3,0,5,9", "expectedOutput": "-10,-3,0,5,9"},
                  {"input": "1,3", "expectedOutput": "1,3"},
                  {"input": "0", "expectedOutput": "0"}
                ]""",
                // tags
                "array,divide-and-conquer,tree,bst,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 98. Validate Binary Search Tree (Medium) ────────────────
    private static String[] validateBinarySearchTree() {
        return new String[]{
                "98", "Validate Binary Search Tree", "Medium",
                // description
                """
                Given the root of a binary tree, determine if it is a valid binary search tree (BST).

                A valid BST is defined as follows:
                - The left subtree of a node contains only nodes with keys less than the node's key.
                - The right subtree of a node contains only nodes with keys greater than the node's key.
                - Both the left and right subtrees must also be binary search trees.

                Example 1:
                  Input: root = [2,1,3]
                  Output: true

                Example 2:
                  Input: root = [5,1,4,null,null,3,6]
                  Output: false
                  Explanation: The root node's value is 5 but its right child's value is 4.""",
                // javaTemplate
                """
                class Solution {
                    public boolean isValidBST(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def isValidBST(self, root) -> bool:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        System.out.println(new Solution().isValidBST(root));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                print(str(Solution().isValidBST(root)).lower())""",
                // testCasesJson
                """
                [
                  {"input": "2,1,3", "expectedOutput": "true"},
                  {"input": "5,1,4,null,null,3,6", "expectedOutput": "false"},
                  {"input": "1", "expectedOutput": "true"}
                ]""",
                // tags
                "tree,dfs,bst,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 230. Kth Smallest Element in a BST (Medium) ─────────────
    private static String[] kthSmallestElementInBST() {
        return new String[]{
                "230", "Kth Smallest Element in a BST", "Medium",
                // description
                """
                Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

                Example 1:
                  Input: root = [3,1,4,null,2], k = 1
                  Output: 1

                Example 2:
                  Input: root = [5,3,6,2,4,null,null,1], k = 3
                  Output: 3""",
                // javaTemplate
                """
                class Solution {
                    public int kthSmallest(TreeNode root, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def kthSmallest(self, root, k: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        int k = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().kthSmallest(root, k));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                k = int(input().strip())
                print(Solution().kthSmallest(root, k))""",
                // testCasesJson
                """
                [
                  {"input": "3,1,4,null,2\\n1", "expectedOutput": "1"},
                  {"input": "5,3,6,2,4,null,null,1\\n3", "expectedOutput": "3"},
                  {"input": "1\\n1", "expectedOutput": "1"}
                ]""",
                // tags
                "tree,dfs,bst,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 199. Binary Tree Right Side View (Medium) ───────────────
    private static String[] binaryTreeRightSideView() {
        return new String[]{
                "199", "Binary Tree Right Side View", "Medium",
                // description
                """
                Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

                Example 1:
                  Input: root = [1,2,3,null,5,null,4]
                  Output: [1,3,4]

                Example 2:
                  Input: root = [1,null,3]
                  Output: [1,3]

                Example 3:
                  Input: root = []
                  Output: []""",
                // javaTemplate
                """
                import java.util.*;

                class Solution {
                    public List<Integer> rightSideView(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def rightSideView(self, root) -> list[int]:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        List<Integer> result = new Solution().rightSideView(root);
                        if (result == null || result.isEmpty()) {
                            System.out.println("");
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
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                result = Solution().rightSideView(root)
                if not result:
                    print("")
                else:
                    print(",".join(map(str, result)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,null,5,null,4", "expectedOutput": "1,3,4"},
                  {"input": "1,null,3", "expectedOutput": "1,3"},
                  {"input": "null", "expectedOutput": ""}
                ]""",
                // tags
                "tree,dfs,bfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 114. Flatten Binary Tree to Linked List (Medium) ────────
    private static String[] flattenBinaryTreeToLinkedList() {
        return new String[]{
                "114", "Flatten Binary Tree to Linked List", "Medium",
                // description
                """
                Given the root of a binary tree, flatten the tree into a "linked list":

                - The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
                - The "linked list" should be in the same order as a pre-order traversal of the binary tree.

                Example 1:
                  Input: root = [1,2,5,3,4,null,6]
                  Output: [1,2,3,4,5,6]

                Example 2:
                  Input: root = []
                  Output: []

                Example 3:
                  Input: root = [0]
                  Output: [0]""",
                // javaTemplate
                """
                class Solution {
                    public void flatten(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def flatten(self, root) -> None:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        if (root == null) {
                            System.out.println("");
                            return;
                        }
                        new Solution().flatten(root);
                        StringBuilder sb = new StringBuilder();
                        TreeNode curr = root;
                        while (curr != null) {
                            if (sb.length() > 0) sb.append(",");
                            sb.append(curr.val);
                            curr = curr.right;
                        }
                        System.out.println(sb);
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                if not root:
                    print("")
                else:
                    Solution().flatten(root)
                    result = []
                    curr = root
                    while curr:
                        result.append(str(curr.val))
                        curr = curr.right
                    print(",".join(result))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,5,3,4,null,6", "expectedOutput": "1,2,3,4,5,6"},
                  {"input": "null", "expectedOutput": ""},
                  {"input": "0", "expectedOutput": "0"}
                ]""",
                // tags
                "tree,dfs,linked-list,stack,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 105. Construct Binary Tree from Preorder and Inorder Traversal (Medium) ──
    private static String[] constructBinaryTreeFromPreorderAndInorder() {
        return new String[]{
                "105", "Construct Binary Tree from Preorder and Inorder Traversal", "Medium",
                // description
                """
                Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

                Example 1:
                  Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
                  Output: [3,9,20,null,null,15,7]

                Example 2:
                  Input: preorder = [-1], inorder = [-1]
                  Output: [-1]""",
                // javaTemplate
                """
                class Solution {
                    public TreeNode buildTree(int[] preorder, int[] inorder) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def buildTree(self, preorder: list[int], inorder: list[int]):
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static String serialize(TreeNode root) {
                        if (root == null) return "null";
                        StringBuilder sb = new StringBuilder();
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        while (!queue.isEmpty()) {
                            TreeNode node = queue.poll();
                            if (sb.length() > 0) sb.append(",");
                            if (node == null) {
                                sb.append("null");
                            } else {
                                sb.append(node.val);
                                queue.add(node.left);
                                queue.add(node.right);
                            }
                        }
                        String result = sb.toString();
                        while (result.endsWith(",null")) {
                            result = result.substring(0, result.length() - 5);
                        }
                        return result;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] preParts = sc.nextLine().trim().split(",");
                        int[] preorder = new int[preParts.length];
                        for (int i = 0; i < preParts.length; i++) preorder[i] = Integer.parseInt(preParts[i].trim());
                        String[] inParts = sc.nextLine().trim().split(",");
                        int[] inorder = new int[inParts.length];
                        for (int i = 0; i < inParts.length; i++) inorder[i] = Integer.parseInt(inParts[i].trim());
                        TreeNode result = new Solution().buildTree(preorder, inorder);
                        System.out.println(serialize(result));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def serialize(root):
                    if not root:
                        return "null"
                    result = []
                    queue = deque([root])
                    while queue:
                        node = queue.popleft()
                        if node is None:
                            result.append("null")
                        else:
                            result.append(str(node.val))
                            queue.append(node.left)
                            queue.append(node.right)
                    while result and result[-1] == "null":
                        result.pop()
                    return ",".join(result)

                preorder = list(map(int, input().strip().split(",")))
                inorder = list(map(int, input().strip().split(",")))
                result = Solution().buildTree(preorder, inorder)
                print(serialize(result))""",
                // testCasesJson
                """
                [
                  {"input": "3,9,20,15,7\\n9,3,15,20,7", "expectedOutput": "3,9,20,null,null,15,7"},
                  {"input": "-1\\n-1", "expectedOutput": "-1"}
                ]""",
                // tags
                "array,hash-table,divide-and-conquer,tree,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 236. Lowest Common Ancestor of a Binary Tree (Medium) ────
    private static String[] lowestCommonAncestor() {
        return new String[]{
                "236", "Lowest Common Ancestor of a Binary Tree", "Medium",
                // description
                """
                Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

                According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself)."

                Example 1:
                  Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
                  Output: 3
                  Explanation: The LCA of nodes 5 and 1 is 3.

                Example 2:
                  Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
                  Output: 5
                  Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself.""",
                // javaTemplate
                """
                class Solution {
                    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def lowestCommonAncestor(self, root, p, q):
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    static TreeNode findNode(TreeNode root, int val) {
                        if (root == null) return null;
                        if (root.val == val) return root;
                        TreeNode left = findNode(root.left, val);
                        if (left != null) return left;
                        return findNode(root.right, val);
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        int pVal = Integer.parseInt(sc.nextLine().trim());
                        int qVal = Integer.parseInt(sc.nextLine().trim());
                        TreeNode p = findNode(root, pVal);
                        TreeNode q = findNode(root, qVal);
                        TreeNode lca = new Solution().lowestCommonAncestor(root, p, q);
                        System.out.println(lca == null ? "null" : lca.val);
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                def find_node(root, val):
                    if not root:
                        return None
                    if root.val == val:
                        return root
                    left = find_node(root.left, val)
                    if left:
                        return left
                    return find_node(root.right, val)

                root = parse(input().strip())
                p_val = int(input().strip())
                q_val = int(input().strip())
                p = find_node(root, p_val)
                q = find_node(root, q_val)
                lca = Solution().lowestCommonAncestor(root, p, q)
                print("null" if not lca else lca.val)""",
                // testCasesJson
                """
                [
                  {"input": "3,5,1,6,2,0,8,null,null,7,4\\n5\\n1", "expectedOutput": "3"},
                  {"input": "3,5,1,6,2,0,8,null,null,7,4\\n5\\n4", "expectedOutput": "5"}
                ]""",
                // tags
                "tree,dfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 437. Path Sum III (Medium) ───────────────────────────────
    private static String[] pathSumIII() {
        return new String[]{
                "437", "Path Sum III", "Medium",
                // description
                """
                Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

                The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

                Example 1:
                  Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
                  Output: 3
                  Explanation: The paths that sum to 8 are: 5->3, 5->2->1, -3->11.

                Example 2:
                  Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
                  Output: 3""",
                // javaTemplate
                """
                class Solution {
                    public int pathSum(TreeNode root, int targetSum) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def pathSum(self, root, targetSum: int) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        int targetSum = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(new Solution().pathSum(root, targetSum));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                targetSum = int(input().strip())
                print(Solution().pathSum(root, targetSum))""",
                // testCasesJson
                """
                [
                  {"input": "10,5,-3,3,2,null,11,3,-2,null,1\\n8", "expectedOutput": "3"},
                  {"input": "5,4,8,11,null,13,4,7,2,null,null,5,1\\n22", "expectedOutput": "3"}
                ]""",
                // tags
                "tree,dfs,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 124. Binary Tree Maximum Path Sum (Hard) ─────────────────
    private static String[] binaryTreeMaximumPathSum() {
        return new String[]{
                "124", "Binary Tree Maximum Path Sum", "Hard",
                // description
                """
                A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

                The path sum of a path is the sum of the node's values in the path.

                Given the root of a binary tree, return the maximum path sum of any non-empty path.

                Example 1:
                  Input: root = [1,2,3]
                  Output: 6
                  Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

                Example 2:
                  Input: root = [-10,9,20,null,null,15,7]
                  Output: 42
                  Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.""",
                // javaTemplate
                """
                class Solution {
                    public int maxPathSum(TreeNode root) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def maxPathSum(self, root) -> int:
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (i < parts.length) {
                            TreeNode node = queue.poll();
                            if (node == null) continue;
                            String left = parts[i].trim();
                            if (!left.equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(left));
                                queue.add(node.left);
                            } else {
                                queue.add(null);
                            }
                            i++;
                            if (i < parts.length) {
                                String right = parts[i].trim();
                                if (!right.equals("null")) {
                                    node.right = new TreeNode(Integer.parseInt(right));
                                    queue.add(node.right);
                                } else {
                                    queue.add(null);
                                }
                                i++;
                            }
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        TreeNode root = parse(sc.nextLine().trim());
                        System.out.println(new Solution().maxPathSum(root));
                    }
                }""",
                // pythonDriverCode
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    s = s.strip()
                    if not s or s == "null":
                        return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while i < len(parts):
                        node = queue.popleft()
                        if node is None:
                            continue
                        left = parts[i].strip()
                        if left != "null":
                            node.left = TreeNode(int(left))
                            queue.append(node.left)
                        else:
                            queue.append(None)
                        i += 1
                        if i < len(parts):
                            right = parts[i].strip()
                            if right != "null":
                                node.right = TreeNode(int(right))
                                queue.append(node.right)
                            else:
                                queue.append(None)
                            i += 1
                    return root

                root = parse(input().strip())
                print(Solution().maxPathSum(root))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3", "expectedOutput": "6"},
                  {"input": "-10,9,20,null,null,15,7", "expectedOutput": "42"}
                ]""",
                // tags
                "tree,dfs,dynamic-programming,binary-tree",
                // category
                "二叉树"
        };
    }

    // ── 94. Binary Tree Inorder Traversal (Easy) ──────────────
    private static String[] binaryTreeInorderTraversal() {
        return new String[]{
                "94", "Binary Tree Inorder Traversal", "Easy",
                """
                Given the root of a binary tree, return the inorder traversal of its nodes' values.

                Example:
                  Input: root = [1,null,2,3]
                  Output: [1,3,2]""",
                """
                import java.util.*;

                class Solution {
                    public List<Integer> inorderTraversal(TreeNode root) {

                    }
                }""",
                """
                class Solution:
                    def inorderTraversal(self, root):
                        pass""",
                """
                import java.util.*;

                class TreeNode {
                    int val;
                    TreeNode left;
                    TreeNode right;
                    TreeNode() {}
                    TreeNode(int val) { this.val = val; }
                    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
                }

                {{USER_CODE}}

                public class Main {
                    static TreeNode parse(String s) {
                        if (s == null || s.isEmpty() || s.equals("null")) return null;
                        String[] parts = s.split(",");
                        TreeNode root = new TreeNode(Integer.parseInt(parts[0].trim()));
                        Queue<TreeNode> queue = new LinkedList<>();
                        queue.add(root);
                        int i = 1;
                        while (!queue.isEmpty() && i < parts.length) {
                            TreeNode node = queue.poll();
                            if (i < parts.length && !parts[i].trim().equals("null")) {
                                node.left = new TreeNode(Integer.parseInt(parts[i].trim()));
                                queue.add(node.left);
                            }
                            i++;
                            if (i < parts.length && !parts[i].trim().equals("null")) {
                                node.right = new TreeNode(Integer.parseInt(parts[i].trim()));
                                queue.add(node.right);
                            }
                            i++;
                        }
                        return root;
                    }
                    public static void main(String[] args) {
                        String s = new Scanner(System.in).nextLine().trim();
                        TreeNode root = parse(s);
                        List<Integer> result = new Solution().inorderTraversal(root);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < result.size(); i++) {
                            if (i > 0) sb.append(",");
                            sb.append(result.get(i));
                        }
                        System.out.println(sb);
                    }
                }""",
                """
                from collections import deque

                class TreeNode:
                    def __init__(self, val=0, left=None, right=None):
                        self.val = val
                        self.left = left
                        self.right = right

                {{USER_CODE}}

                def parse(s):
                    if not s or s == "null": return None
                    parts = s.split(",")
                    root = TreeNode(int(parts[0].strip()))
                    queue = deque([root])
                    i = 1
                    while queue and i < len(parts):
                        node = queue.popleft()
                        if i < len(parts) and parts[i].strip() != "null":
                            node.left = TreeNode(int(parts[i].strip()))
                            queue.append(node.left)
                        i += 1
                        if i < len(parts) and parts[i].strip() != "null":
                            node.right = TreeNode(int(parts[i].strip()))
                            queue.append(node.right)
                        i += 1
                    return root

                s = input().strip()
                root = parse(s)
                result = Solution().inorderTraversal(root)
                print(",".join(map(str, result)) if result else "")""",
                """
                [
                  {"input": "1,null,2,3", "expectedOutput": "1,3,2"},
                  {"input": "null", "expectedOutput": ""},
                  {"input": "1", "expectedOutput": "1"}
                ]""",
                "stack,tree,dfs,binary-tree",
                "二叉树"
        };
    }
}

package com.memospark.core.init;

import java.util.List;

/**
 * LeetCode Hot 100 — curated list of the most popular interview problems.
 * Each entry: { front, back, tags }
 */
public final class LeetCodeHot100Data {

    private LeetCodeHot100Data() {}

    public static List<String[]> cards() {
        return List.of(
            // ── Hash ────────────────────────────────────────
            new String[]{
                "1. Two Sum\nGiven an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.",
                "Use a HashMap: for each element, check if (target - nums[i]) exists in the map.\nTime: O(n), Space: O(n)\nKey: One-pass hash table",
                "Easy,Hash Table,Array"},
            new String[]{
                "49. Group Anagrams\nGiven an array of strings, group the anagrams together.",
                "Sort each string as key, or use character frequency as key, group into HashMap.\nTime: O(n * k log k), Space: O(n * k)\nKey: Sorted string or char-count as hash key",
                "Medium,Hash Table,String,Sorting"},
            new String[]{
                "128. Longest Consecutive Sequence\nGiven an unsorted array of integers, find the length of the longest consecutive elements sequence in O(n) time.",
                "Put all numbers in a HashSet. For each number that is the start of a sequence (num-1 not in set), count consecutive elements.\nTime: O(n), Space: O(n)\nKey: Only start counting from sequence start",
                "Medium,Hash Table,Union Find"},
            // ── Two Pointers ────────────────────────────────
            new String[]{
                "283. Move Zeroes\nGiven an integer array nums, move all 0's to the end while maintaining the relative order of non-zero elements, in-place.",
                "Two pointers: slow pointer tracks position for next non-zero, fast pointer scans array. Swap when fast finds non-zero.\nTime: O(n), Space: O(1)\nKey: Snowball technique — non-zero elements fill from left",
                "Easy,Two Pointers,Array"},
            new String[]{
                "11. Container With Most Water\nGiven n non-negative integers representing heights of lines, find two lines that together with the x-axis form a container holding the most water.",
                "Two pointers at both ends; move the shorter line inward. Area = min(h[l], h[r]) * (r - l).\nTime: O(n), Space: O(1)\nKey: Moving shorter side can only potentially increase area",
                "Medium,Two Pointers,Greedy"},
            new String[]{
                "15. 3Sum\nGiven an integer array nums, return all triplets [nums[i], nums[j], nums[k]] such that i != j != k and nums[i] + nums[j] + nums[k] == 0.",
                "Sort array. Fix one element, use two pointers for the remaining pair. Skip duplicates.\nTime: O(n^2), Space: O(1)\nKey: Sort + two pointers + skip duplicates",
                "Medium,Two Pointers,Sorting"},
            new String[]{
                "42. Trapping Rain Water\nGiven n non-negative integers representing an elevation map, compute how much water it can trap after raining.",
                "Two pointers from both ends. Track leftMax and rightMax. Water at position = min(leftMax, rightMax) - height[i].\nTime: O(n), Space: O(1)\nKey: Water level determined by the shorter side",
                "Hard,Two Pointers,Dynamic Programming,Stack"},
            // ── Sliding Window ──────────────────────────────
            new String[]{
                "3. Longest Substring Without Repeating Characters\nGiven a string s, find the length of the longest substring without repeating characters.",
                "Sliding window with HashSet/HashMap. Expand right, shrink left when duplicate found.\nTime: O(n), Space: O(min(n, m))\nKey: Maintain a window of unique characters",
                "Medium,Sliding Window,Hash Table,String"},
            new String[]{
                "438. Find All Anagrams in a String\nGiven two strings s and p, find all start indices of p's anagrams in s.",
                "Fixed-size sliding window of length p. Use char frequency array, compare window freq with p freq.\nTime: O(n), Space: O(1)\nKey: Fixed-size window + frequency comparison",
                "Medium,Sliding Window,Hash Table,String"},
            new String[]{
                "76. Minimum Window Substring\nGiven two strings s and t, return the minimum window substring of s such that every character in t is included in the window.",
                "Sliding window: expand right to include all chars of t, then shrink left to minimize. Track required count.\nTime: O(n), Space: O(m)\nKey: Expand-shrink pattern + valid window tracking",
                "Hard,Sliding Window,Hash Table,String"},
            // ── Substring / Palindrome ──────────────────────
            new String[]{
                "560. Subarray Sum Equals K\nGiven an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.",
                "Use prefix sum + HashMap. For each prefix sum, count how many previous prefix sums equal (currentSum - k).\nTime: O(n), Space: O(n)\nKey: prefixSum[j] - prefixSum[i] = k",
                "Medium,Hash Table,Prefix Sum"},
            new String[]{
                "239. Sliding Window Maximum\nGiven an array nums and a sliding window of size k, return the max value in each window position.",
                "Use a monotonic deque storing indices. Remove elements outside window and smaller than current from back.\nTime: O(n), Space: O(k)\nKey: Monotonic decreasing deque",
                "Hard,Sliding Window,Deque,Monotonic Queue"},
            // ── Stack ───────────────────────────────────────
            new String[]{
                "20. Valid Parentheses\nGiven a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.",
                "Use a stack. Push opening brackets, pop and compare for closing brackets.\nTime: O(n), Space: O(n)\nKey: Stack matches last-opened-first-closed",
                "Easy,Stack,String"},
            new String[]{
                "155. Min Stack\nDesign a stack that supports push, pop, top, and retrieving the minimum element in constant time.",
                "Use two stacks: one for values, one for tracking minimums. Or store pairs (val, currentMin).\nTime: O(1) all operations, Space: O(n)\nKey: Auxiliary stack/pair tracks running minimum",
                "Medium,Stack,Design"},
            new String[]{
                "394. Decode String\nGiven an encoded string like \"3[a2[c]]\", return the decoded string \"accaccacc\".",
                "Use two stacks: one for counts, one for strings. On '[' push, on ']' pop and repeat.\nTime: O(n * maxK), Space: O(n)\nKey: Dual stack for nested encoding",
                "Medium,Stack,String,Recursion"},
            new String[]{
                "739. Daily Temperatures\nGiven an array of daily temperatures, return an array where answer[i] is the number of days until a warmer temperature.",
                "Monotonic decreasing stack of indices. Pop when current temp > stack top's temp.\nTime: O(n), Space: O(n)\nKey: Monotonic stack for next-greater-element pattern",
                "Medium,Stack,Monotonic Stack"},
            new String[]{
                "84. Largest Rectangle in Histogram\nGiven an array of integers heights representing a histogram, find the area of the largest rectangle in the histogram.",
                "Monotonic increasing stack. For each bar, pop taller bars and compute area using stack top as height.\nTime: O(n), Space: O(n)\nKey: Stack tracks potential left boundaries; pop computes width",
                "Hard,Stack,Monotonic Stack"},
            // ── Linked List ─────────────────────────────────
            new String[]{
                "160. Intersection of Two Linked Lists\nGiven the heads of two singly linked-lists, return the node at which the two lists intersect.",
                "Two pointers: when one reaches end, redirect to the other list's head. They meet at intersection.\nTime: O(m + n), Space: O(1)\nKey: Path lengths equalize after switch",
                "Easy,Linked List,Two Pointers"},
            new String[]{
                "206. Reverse Linked List\nGiven the head of a singly linked list, reverse the list and return the reversed list.",
                "Iterative: maintain prev, curr, next pointers. Or recursive: reverse rest, then fix pointers.\nTime: O(n), Space: O(1) iterative / O(n) recursive\nKey: prev-curr-next pointer dance",
                "Easy,Linked List,Recursion"},
            new String[]{
                "234. Palindrome Linked List\nGiven the head of a singly linked list, return true if it is a palindrome.",
                "Find middle with slow/fast pointers, reverse second half, compare both halves.\nTime: O(n), Space: O(1)\nKey: Slow-fast + reverse second half",
                "Easy,Linked List,Two Pointers"},
            new String[]{
                "141. Linked List Cycle\nGiven head, determine if the linked list has a cycle in it.",
                "Floyd's cycle detection: slow pointer moves 1 step, fast moves 2 steps. If they meet, cycle exists.\nTime: O(n), Space: O(1)\nKey: Tortoise and hare algorithm",
                "Easy,Linked List,Two Pointers"},
            new String[]{
                "142. Linked List Cycle II\nGiven the head of a linked list, return the node where the cycle begins.",
                "Floyd's algorithm: after slow and fast meet, reset one pointer to head. Both move 1 step until they meet at cycle start.\nTime: O(n), Space: O(1)\nKey: Mathematical proof — distance from head to cycle start equals distance from meeting point to cycle start",
                "Medium,Linked List,Two Pointers"},
            new String[]{
                "21. Merge Two Sorted Lists\nMerge two sorted linked lists and return it as a sorted list.",
                "Use dummy head. Compare current nodes, append smaller one. Attach remaining list.\nTime: O(m + n), Space: O(1)\nKey: Dummy head simplifies edge cases",
                "Easy,Linked List,Recursion"},
            new String[]{
                "2. Add Two Numbers\nYou are given two non-empty linked lists representing two non-negative integers in reverse order. Return the sum as a linked list.",
                "Traverse both lists simultaneously, add digits + carry. Create new nodes for result.\nTime: O(max(m, n)), Space: O(max(m, n))\nKey: Handle carry propagation",
                "Medium,Linked List,Math"},
            new String[]{
                "19. Remove Nth Node From End of List\nGiven the head of a linked list, remove the nth node from the end and return its head.",
                "Two pointers: advance first pointer n steps ahead, then move both until first reaches end.\nTime: O(n), Space: O(1)\nKey: Gap of n between two pointers",
                "Medium,Linked List,Two Pointers"},
            new String[]{
                "24. Swap Nodes in Pairs\nGiven a linked list, swap every two adjacent nodes and return its head.",
                "Use dummy head. For each pair, rewire: prev->second->first->next_pair.\nTime: O(n), Space: O(1)\nKey: Careful pointer reassignment with dummy node",
                "Medium,Linked List,Recursion"},
            new String[]{
                "25. Reverse Nodes in k-Group\nGiven the head of a linked list, reverse the nodes of the list k at a time and return the modified list.",
                "Count k nodes, reverse the group, connect to next group recursively/iteratively.\nTime: O(n), Space: O(1)\nKey: Reverse sub-list + reconnect boundaries",
                "Hard,Linked List,Recursion"},
            new String[]{
                "138. Copy List with Random Pointer\nA linked list with next and random pointers. Construct a deep copy of the list.",
                "Three passes: 1) Interleave copies, 2) Set random pointers, 3) Separate lists. Or use HashMap.\nTime: O(n), Space: O(1) interleave / O(n) HashMap\nKey: Interleaving trick avoids extra space",
                "Medium,Linked List,Hash Table"},
            new String[]{
                "148. Sort List\nGiven the head of a linked list, return the list after sorting it in ascending order in O(n log n) time.",
                "Merge sort: find middle with slow/fast, recursively sort halves, merge sorted halves.\nTime: O(n log n), Space: O(log n)\nKey: Merge sort is natural for linked lists",
                "Medium,Linked List,Sorting,Merge Sort"},
            new String[]{
                "23. Merge k Sorted Lists\nYou are given an array of k linked-lists, each sorted in ascending order. Merge all into one sorted linked list.",
                "Min-heap (priority queue) of size k. Always pop smallest, push its next node.\nTime: O(N log k), Space: O(k)\nKey: Priority queue maintains k-way merge efficiently",
                "Hard,Linked List,Heap,Divide and Conquer"},
            new String[]{
                "146. LRU Cache\nDesign a data structure that follows the constraints of a Least Recently Used (LRU) cache.",
                "HashMap + Doubly Linked List. Map provides O(1) lookup, DLL provides O(1) reorder/eviction.\nTime: O(1) get/put, Space: O(capacity)\nKey: HashMap for fast access + DLL for recency order",
                "Medium,Linked List,Hash Table,Design"},
            // ── Binary Tree ─────────────────────────────────
            new String[]{
                "94. Binary Tree Inorder Traversal\nGiven the root of a binary tree, return the inorder traversal of its values.",
                "Recursive: left -> root -> right. Iterative: use stack, go left as far as possible, pop and visit, then go right.\nTime: O(n), Space: O(n)\nKey: Stack simulates recursion for iterative approach",
                "Easy,Tree,Stack,DFS"},
            new String[]{
                "104. Maximum Depth of Binary Tree\nGiven the root of a binary tree, return its maximum depth.",
                "Recursive: 1 + max(depth(left), depth(right)). Base case: null returns 0.\nTime: O(n), Space: O(h)\nKey: Post-order DFS, height = 1 + max(children)",
                "Easy,Tree,DFS,BFS"},
            new String[]{
                "226. Invert Binary Tree\nGiven the root of a binary tree, invert the tree (mirror it) and return its root.",
                "Recursively swap left and right children for every node.\nTime: O(n), Space: O(h)\nKey: Swap children then recurse",
                "Easy,Tree,DFS,BFS"},
            new String[]{
                "101. Symmetric Tree\nGiven the root of a binary tree, check whether it is a mirror of itself.",
                "Recursive: compare left subtree with right subtree mirror-wise. isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left).\nTime: O(n), Space: O(h)\nKey: Two-pointer recursion on mirrored positions",
                "Easy,Tree,DFS,BFS"},
            new String[]{
                "543. Diameter of Binary Tree\nGiven the root of a binary tree, return the length of the diameter (longest path between any two nodes).",
                "DFS returns depth; at each node, diameter = leftDepth + rightDepth. Track global max.\nTime: O(n), Space: O(h)\nKey: Diameter through a node = left depth + right depth",
                "Easy,Tree,DFS"},
            new String[]{
                "102. Binary Tree Level Order Traversal\nGiven the root of a binary tree, return the level order traversal of its values.",
                "BFS with queue. Process nodes level by level, tracking level size.\nTime: O(n), Space: O(n)\nKey: Queue-based BFS with level grouping",
                "Medium,Tree,BFS"},
            new String[]{
                "108. Convert Sorted Array to Binary Search Tree\nGiven an integer array nums sorted in ascending order, convert it to a height-balanced BST.",
                "Recursively pick middle element as root; left half becomes left subtree, right half becomes right subtree.\nTime: O(n), Space: O(log n)\nKey: Mid element ensures balance",
                "Easy,Tree,Binary Search,Divide and Conquer"},
            new String[]{
                "98. Validate Binary Search Tree\nGiven the root of a binary tree, determine if it is a valid BST.",
                "Inorder traversal should produce strictly increasing sequence. Or recursively check (min, max) range.\nTime: O(n), Space: O(h)\nKey: Pass valid range (min, max) down recursion",
                "Medium,Tree,DFS,BST"},
            new String[]{
                "230. Kth Smallest Element in a BST\nGiven the root of a BST and an integer k, return the kth smallest value.",
                "Inorder traversal of BST visits nodes in ascending order. Return the kth visited node.\nTime: O(H + k), Space: O(H)\nKey: Inorder of BST = sorted order",
                "Medium,Tree,DFS,BST"},
            new String[]{
                "199. Binary Tree Right Side View\nGiven the root of a binary tree, return the values of the nodes you can see ordered from top to bottom when looking from the right side.",
                "BFS level by level, take the last node of each level. Or DFS visiting right child first.\nTime: O(n), Space: O(n)\nKey: Last node per level in BFS",
                "Medium,Tree,BFS,DFS"},
            new String[]{
                "114. Flatten Binary Tree to Linked List\nGiven the root of a binary tree, flatten it to a linked list in-place (preorder).",
                "For each node: save right, set right = left, set left = null, find tail of flattened left, connect saved right.\nTime: O(n), Space: O(1) Morris-like / O(n) recursive\nKey: Preorder rearrangement with right-pointer linking",
                "Medium,Tree,DFS,Linked List"},
            new String[]{
                "105. Construct Binary Tree from Preorder and Inorder Traversal\nGiven two integer arrays preorder and inorder, construct and return the binary tree.",
                "Preorder first element is root. Find root in inorder to split left/right subtrees. Recurse.\nTime: O(n), Space: O(n)\nKey: Root from preorder + partition from inorder",
                "Medium,Tree,Divide and Conquer,Hash Table"},
            new String[]{
                "437. Path Sum III\nGiven the root of a binary tree and an integer targetSum, return the number of paths that sum to targetSum. Path goes downward.",
                "DFS with prefix sum HashMap. Count paths where prefixSum - targetSum exists in map.\nTime: O(n), Space: O(n)\nKey: Prefix sum technique on tree paths",
                "Medium,Tree,DFS,Prefix Sum"},
            new String[]{
                "236. Lowest Common Ancestor of a Binary Tree\nGiven a binary tree, find the lowest common ancestor (LCA) of two given nodes.",
                "Recursive: if root is p or q, return root. Recurse left and right. If both non-null, root is LCA.\nTime: O(n), Space: O(h)\nKey: Post-order — LCA is where left and right both find a target",
                "Medium,Tree,DFS"},
            new String[]{
                "124. Binary Tree Maximum Path Sum\nA path in a binary tree is a sequence of nodes where each pair of adjacent nodes has an edge. Return the maximum path sum.",
                "DFS returns max single-branch gain. At each node, update global max = node.val + leftGain + rightGain.\nTime: O(n), Space: O(h)\nKey: Max gain vs max path — gain is one-sided, path can fork at node",
                "Hard,Tree,DFS,Dynamic Programming"},
            // ── Binary Search ───────────────────────────────
            new String[]{
                "35. Search Insert Position\nGiven a sorted array and a target value, return the index if found, or the index where it would be inserted.",
                "Standard binary search. If not found, left pointer gives insertion position.\nTime: O(log n), Space: O(1)\nKey: Left boundary binary search",
                "Easy,Binary Search,Array"},
            new String[]{
                "74. Search a 2D Matrix\nWrite an efficient algorithm that searches for a value in an m x n matrix where rows and columns are sorted.",
                "Treat 2D matrix as 1D sorted array. Binary search with index mapping: row = mid/cols, col = mid%cols.\nTime: O(log(m*n)), Space: O(1)\nKey: Flatten 2D index to 1D for binary search",
                "Medium,Binary Search,Matrix"},
            new String[]{
                "34. Find First and Last Position of Element in Sorted Array\nGiven a sorted array of integers, find the starting and ending position of a given target value.",
                "Two binary searches: one for leftmost position, one for rightmost position.\nTime: O(log n), Space: O(1)\nKey: Separate searches for left and right boundaries",
                "Medium,Binary Search,Array"},
            new String[]{
                "33. Search in Rotated Sorted Array\nThere is an integer array sorted in ascending order then rotated. Given the array and target, return its index or -1.",
                "Binary search: determine which half is sorted, check if target is in sorted half, narrow search.\nTime: O(log n), Space: O(1)\nKey: One half is always sorted after rotation",
                "Medium,Binary Search,Array"},
            new String[]{
                "153. Find Minimum in Rotated Sorted Array\nSuppose an array sorted in ascending order is rotated. Find the minimum element.",
                "Binary search: if nums[mid] > nums[right], min is in right half; otherwise in left half.\nTime: O(log n), Space: O(1)\nKey: Compare mid with right boundary",
                "Medium,Binary Search,Array"},
            new String[]{
                "4. Median of Two Sorted Arrays\nGiven two sorted arrays nums1 and nums2, return the median of the two sorted arrays in O(log(m+n)) time.",
                "Binary search on the shorter array to find correct partition. Ensure maxLeft <= minRight for both arrays.\nTime: O(log(min(m,n))), Space: O(1)\nKey: Partition both arrays so left elements count = half total",
                "Hard,Binary Search,Divide and Conquer"},
            // ── Backtracking ────────────────────────────────
            new String[]{
                "46. Permutations\nGiven an array nums of distinct integers, return all possible permutations.",
                "Backtracking: for each position, try all unused elements. Use visited array or swap technique.\nTime: O(n * n!), Space: O(n)\nKey: Classic backtrack — choose, explore, unchoose",
                "Medium,Backtracking,Array"},
            new String[]{
                "78. Subsets\nGiven an integer array nums of unique elements, return all possible subsets.",
                "Backtracking: at each element, choose to include or exclude. Or iteratively build from previous subsets.\nTime: O(n * 2^n), Space: O(n)\nKey: Include/exclude binary decision tree",
                "Medium,Backtracking,Bit Manipulation"},
            new String[]{
                "17. Letter Combinations of a Phone Number\nGiven a string containing digits from 2-9, return all possible letter combinations.",
                "Backtracking: map each digit to letters, recursively build combinations.\nTime: O(4^n), Space: O(n)\nKey: Digit-to-letter mapping + DFS combinations",
                "Medium,Backtracking,String"},
            new String[]{
                "39. Combination Sum\nGiven an array of distinct integers candidates and a target, return all unique combinations that sum to target. Elements can be reused.",
                "Backtracking: for each candidate, include it (stay at same index for reuse) or move to next.\nTime: O(n^(target/min)), Space: O(target/min)\nKey: Allow same element reuse by not advancing index",
                "Medium,Backtracking,Array"},
            new String[]{
                "22. Generate Parentheses\nGiven n pairs of parentheses, generate all combinations of well-formed parentheses.",
                "Backtracking: add '(' if open < n, add ')' if close < open.\nTime: O(4^n / sqrt(n)), Space: O(n)\nKey: Valid state = close count <= open count <= n",
                "Medium,Backtracking,String,Dynamic Programming"},
            new String[]{
                "79. Word Search\nGiven an m x n board and a word, return true if word exists in the grid (adjacent cells, no reuse).",
                "DFS backtracking from each cell. Mark visited, recurse 4 directions, unmark on backtrack.\nTime: O(m * n * 4^L), Space: O(L)\nKey: Grid DFS with visited backtracking",
                "Medium,Backtracking,Matrix,DFS"},
            new String[]{
                "131. Palindrome Partitioning\nGiven a string s, partition s such that every substring of the partition is a palindrome. Return all possible partitions.",
                "Backtracking: try all prefix substrings, if palindrome, recurse on remainder.\nTime: O(n * 2^n), Space: O(n)\nKey: Partition = series of palindrome prefix choices",
                "Medium,Backtracking,String,Dynamic Programming"},
            new String[]{
                "51. N-Queens\nPlace n queens on an n x n chessboard so that no two queens attack each other. Return all distinct solutions.",
                "Backtracking row by row. Track occupied columns, diagonals (row-col) and anti-diagonals (row+col).\nTime: O(n!), Space: O(n)\nKey: Diagonal index tricks — row-col and row+col",
                "Hard,Backtracking,Array"},
            // ── Greedy ──────────────────────────────────────
            new String[]{
                "121. Best Time to Buy and Sell Stock\nGiven an array prices where prices[i] is the price on the ith day, maximize profit with one buy and one sell.",
                "Track minimum price so far; at each day, profit = price - minPrice. Update maxProfit.\nTime: O(n), Space: O(1)\nKey: One pass tracking running minimum",
                "Easy,Greedy,Array,Dynamic Programming"},
            new String[]{
                "55. Jump Game\nGiven an array of non-negative integers nums, determine if you can reach the last index starting from index 0.",
                "Greedy: track farthest reachable index. If current index > farthest, return false.\nTime: O(n), Space: O(1)\nKey: Maintain max reachable position",
                "Medium,Greedy,Array,Dynamic Programming"},
            new String[]{
                "45. Jump Game II\nGiven an array nums, return the minimum number of jumps to reach the last index.",
                "BFS-like greedy: track current level end and farthest reachable. Increment jumps when reaching level end.\nTime: O(n), Space: O(1)\nKey: Level-based BFS on jump ranges",
                "Medium,Greedy,Array,Dynamic Programming"},
            new String[]{
                "763. Partition Labels\nPartition the string into as many parts as possible so that each letter appears in at most one part.",
                "Record last occurrence of each char. Extend partition end to max(end, lastOccurrence[char]).\nTime: O(n), Space: O(1)\nKey: Greedy extend to cover all occurrences",
                "Medium,Greedy,Hash Table,Two Pointers,String"},
            // ── Dynamic Programming ─────────────────────────
            new String[]{
                "70. Climbing Stairs\nYou are climbing a staircase of n steps. Each time you can climb 1 or 2 steps. How many distinct ways to reach the top?",
                "dp[i] = dp[i-1] + dp[i-2]. Same as Fibonacci sequence.\nTime: O(n), Space: O(1)\nKey: Classic Fibonacci DP",
                "Easy,Dynamic Programming,Math"},
            new String[]{
                "118. Pascal's Triangle\nGiven an integer numRows, return the first numRows of Pascal's triangle.",
                "Each element = sum of two elements above it. row[j] = prevRow[j-1] + prevRow[j].\nTime: O(n^2), Space: O(n^2)\nKey: Build row by row from previous row",
                "Easy,Dynamic Programming,Array"},
            new String[]{
                "198. House Robber\nGiven an array representing money in each house, maximize amount without robbing adjacent houses.",
                "dp[i] = max(dp[i-1], dp[i-2] + nums[i]). Rob current + skip previous, or skip current.\nTime: O(n), Space: O(1)\nKey: Rob or skip decision at each house",
                "Medium,Dynamic Programming,Array"},
            new String[]{
                "279. Perfect Squares\nGiven an integer n, return the least number of perfect square numbers that sum to n.",
                "BFS or DP: dp[i] = min(dp[i - j*j] + 1) for all valid j.\nTime: O(n * sqrt(n)), Space: O(n)\nKey: BFS finds shortest path; DP tries all square subtractions",
                "Medium,Dynamic Programming,BFS,Math"},
            new String[]{
                "322. Coin Change\nGiven coins of different denominations and a total amount, return the fewest number of coins to make up that amount.",
                "DP: dp[i] = min(dp[i - coin] + 1) for all coins. Base: dp[0] = 0.\nTime: O(amount * n), Space: O(amount)\nKey: Bottom-up DP trying each coin at each amount",
                "Medium,Dynamic Programming,BFS"},
            new String[]{
                "139. Word Break\nGiven a string s and a dictionary of words, return true if s can be segmented into dictionary words.",
                "DP: dp[i] = true if s[0..i) can be segmented. Check all j < i where dp[j] && s[j..i) in dict.\nTime: O(n^2 * m), Space: O(n)\nKey: dp[i] depends on all valid word-ending positions before i",
                "Medium,Dynamic Programming,Hash Table,String"},
            new String[]{
                "300. Longest Increasing Subsequence\nGiven an integer array nums, return the length of the longest strictly increasing subsequence.",
                "DP: dp[i] = max(dp[j] + 1) for j < i where nums[j] < nums[i]. Optimize with binary search + tails array.\nTime: O(n log n) optimized / O(n^2) basic, Space: O(n)\nKey: Patience sorting — maintain smallest tails array",
                "Medium,Dynamic Programming,Binary Search"},
            new String[]{
                "152. Maximum Product Subarray\nGiven an integer array nums, find a contiguous subarray with the largest product.",
                "Track both maxProduct and minProduct at each position (negative * negative = positive).\nTime: O(n), Space: O(1)\nKey: Track min product too — negatives can flip to max",
                "Medium,Dynamic Programming,Array"},
            new String[]{
                "416. Partition Equal Subset Sum\nGiven an integer array nums, return true if you can partition it into two subsets with equal sum.",
                "0/1 Knapsack DP: target = totalSum / 2. dp[j] = true if sum j achievable.\nTime: O(n * sum), Space: O(sum)\nKey: Reduce to subset sum = totalSum / 2",
                "Medium,Dynamic Programming,Array"},
            new String[]{
                "32. Longest Valid Parentheses\nGiven a string containing just '(' and ')', find the length of the longest valid parentheses substring.",
                "Stack-based: push indices; on match, length = i - stack.top(). Or DP: dp[i] depends on dp[i-2] or dp[i-dp[i-1]-2].\nTime: O(n), Space: O(n)\nKey: Stack stores unmatched indices as boundaries",
                "Hard,Dynamic Programming,Stack,String"},
            // ── Multidimensional DP ─────────────────────────
            new String[]{
                "62. Unique Paths\nA robot on an m x n grid can only move right or down. How many unique paths from top-left to bottom-right?",
                "DP: dp[i][j] = dp[i-1][j] + dp[i][j-1]. First row and column are all 1.\nTime: O(m*n), Space: O(n)\nKey: Classic grid DP — sum from top and left",
                "Medium,Dynamic Programming,Math"},
            new String[]{
                "64. Minimum Path Sum\nGiven a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum.",
                "DP: dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1]).\nTime: O(m*n), Space: O(n)\nKey: Grid DP taking minimum from top or left",
                "Medium,Dynamic Programming,Matrix"},
            new String[]{
                "5. Longest Palindromic Substring\nGiven a string s, return the longest palindromic substring.",
                "Expand around center for each character (odd) and each pair (even). Or DP: dp[i][j] = s[i]==s[j] && dp[i+1][j-1].\nTime: O(n^2), Space: O(1) expand / O(n^2) DP\nKey: Expand from center is simpler and space-efficient",
                "Medium,Dynamic Programming,String"},
            new String[]{
                "72. Edit Distance\nGiven two strings word1 and word2, return the minimum number of operations (insert, delete, replace) to convert word1 to word2.",
                "DP: dp[i][j] = min(insert: dp[i][j-1]+1, delete: dp[i-1][j]+1, replace: dp[i-1][j-1]+(0 or 1)).\nTime: O(m*n), Space: O(min(m,n))\nKey: Three operations map to three DP transitions",
                "Medium,Dynamic Programming,String"},
            // ── Graph ───────────────────────────────────────
            new String[]{
                "200. Number of Islands\nGiven a 2D grid of '1's (land) and '0's (water), count the number of islands.",
                "DFS/BFS from each unvisited '1', mark all connected land as visited. Increment count per component.\nTime: O(m*n), Space: O(m*n)\nKey: Flood fill to mark connected components",
                "Medium,Graph,BFS,DFS,Union Find"},
            new String[]{
                "207. Course Schedule\nThere are n courses with prerequisites. Determine if you can finish all courses (no cycle in directed graph).",
                "Topological sort (BFS with in-degree) or DFS cycle detection.\nTime: O(V+E), Space: O(V+E)\nKey: Cycle detection in directed graph",
                "Medium,Graph,BFS,DFS,Topological Sort"},
            new String[]{
                "208. Implement Trie (Prefix Tree)\nImplement a trie with insert, search, and startsWith methods.",
                "Each node has children array/map + isEnd flag. Insert: create path. Search: follow path, check isEnd.\nTime: O(m) per operation, Space: O(n*m)\nKey: Array of 26 children per node",
                "Medium,Trie,Design,String"},
            // ── Heap / Priority Queue ───────────────────────
            new String[]{
                "215. Kth Largest Element in an Array\nGiven an integer array nums and an integer k, return the kth largest element.",
                "Quick-select (partition like quicksort, recurse one side). Or min-heap of size k.\nTime: O(n) average quickselect / O(n log k) heap, Space: O(1) / O(k)\nKey: Quick-select is O(n) average with random pivot",
                "Medium,Heap,Sorting,Divide and Conquer"},
            new String[]{
                "347. Top K Frequent Elements\nGiven an integer array nums and an integer k, return the k most frequent elements.",
                "HashMap for frequency, then min-heap of size k. Or bucket sort by frequency.\nTime: O(n) bucket sort / O(n log k) heap, Space: O(n)\nKey: Bucket sort — index = frequency, O(n) time",
                "Medium,Heap,Hash Table,Sorting,Bucket Sort"},
            new String[]{
                "295. Find Median from Data Stream\nDesign a data structure that supports adding numbers and finding the median.",
                "Two heaps: max-heap for lower half, min-heap for upper half. Balance sizes.\nTime: O(log n) add, O(1) median, Space: O(n)\nKey: Two heaps split at median — balance sizes after each add",
                "Hard,Heap,Design,Sorting"},
            // ── Bit Manipulation ────────────────────────────
            new String[]{
                "136. Single Number\nGiven a non-empty array where every element appears twice except for one, find that single one.",
                "XOR all elements. a ^ a = 0, a ^ 0 = a. Result is the single number.\nTime: O(n), Space: O(1)\nKey: XOR cancels duplicates",
                "Easy,Bit Manipulation,Array"},
            // ── Matrix ──────────────────────────────────────
            new String[]{
                "73. Set Matrix Zeroes\nGiven an m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.",
                "Use first row and first column as markers. Separate flags for first row/col themselves.\nTime: O(m*n), Space: O(1)\nKey: First row/col as in-place marker arrays",
                "Medium,Matrix,Hash Table"},
            new String[]{
                "54. Spiral Matrix\nGiven an m x n matrix, return all elements in spiral order.",
                "Maintain four boundaries: top, bottom, left, right. Traverse and shrink boundaries.\nTime: O(m*n), Space: O(1)\nKey: Four-boundary spiral traversal",
                "Medium,Matrix,Simulation"},
            new String[]{
                "48. Rotate Image\nRotate the image (n x n 2D matrix) by 90 degrees clockwise in-place.",
                "Transpose the matrix, then reverse each row. Or rotate four cells at a time.\nTime: O(n^2), Space: O(1)\nKey: Transpose + reverse rows = 90° clockwise",
                "Medium,Matrix,Math"},
            new String[]{
                "240. Search a 2D Matrix II\nSearch for a target in an m x n matrix where rows and columns are sorted in ascending order.",
                "Start from top-right corner. If target < current, move left; if target > current, move down.\nTime: O(m + n), Space: O(1)\nKey: Top-right corner search eliminates row or column each step",
                "Medium,Matrix,Binary Search,Divide and Conquer"},
            // ── Techniques ──────────────────────────────────
            new String[]{
                "169. Majority Element\nGiven an array nums, return the majority element (appears more than n/2 times).",
                "Boyer-Moore Voting: maintain candidate and count. When count=0, switch candidate.\nTime: O(n), Space: O(1)\nKey: Majority element survives cancellation",
                "Easy,Array,Hash Table,Sorting"},
            new String[]{
                "75. Sort Colors\nGiven an array with n objects colored red (0), white (1), and blue (2), sort them in-place.",
                "Dutch National Flag: three pointers — low, mid, high. Swap 0s to front, 2s to back.\nTime: O(n), Space: O(1)\nKey: Three-way partition in one pass",
                "Medium,Two Pointers,Sorting,Array"},
            new String[]{
                "31. Next Permutation\nImplement next permutation which rearranges numbers into the next lexicographically greater permutation.",
                "1) Find largest i where a[i] < a[i+1], 2) Find largest j where a[j] > a[i], 3) Swap, 4) Reverse suffix.\nTime: O(n), Space: O(1)\nKey: Find rightmost ascent, swap with smallest larger element, reverse tail",
                "Medium,Two Pointers,Array"},
            new String[]{
                "287. Find the Duplicate Number\nGiven an array of n+1 integers in range [1, n], find the one duplicate number without modifying the array.",
                "Floyd's cycle detection on index-value mapping. Slow = nums[slow], fast = nums[nums[fast]].\nTime: O(n), Space: O(1)\nKey: Array as implicit linked list — duplicate creates cycle",
                "Medium,Two Pointers,Binary Search,Bit Manipulation"},
            // ── Intervals ───────────────────────────────────
            new String[]{
                "56. Merge Intervals\nGiven an array of intervals, merge all overlapping intervals.",
                "Sort by start time. Merge if current start <= previous end. Update end to max(prev.end, curr.end).\nTime: O(n log n), Space: O(n)\nKey: Sort then greedily merge overlapping",
                "Medium,Sorting,Array"},
            // ── Design / Other ──────────────────────────────
            new String[]{
                "238. Product of Array Except Self\nGiven an integer array nums, return an array where answer[i] is the product of all elements except nums[i], without using division.",
                "Two passes: left-to-right prefix products, then right-to-left suffix products multiplied in.\nTime: O(n), Space: O(1) (output array not counted)\nKey: Prefix product * suffix product at each position",
                "Medium,Array,Prefix Sum"},
            new String[]{
                "41. First Missing Positive\nGiven an unsorted integer array nums, return the smallest missing positive integer in O(n) time and O(1) space.",
                "Cyclic sort: place each number at index (num - 1). Then scan for first mismatch.\nTime: O(n), Space: O(1)\nKey: In-place hash — nums[i] should be at index nums[i]-1",
                "Hard,Array,Hash Table"},
            new String[]{
                "621. Task Scheduler\nGiven tasks array and cooldown n, return the least intervals the CPU will take to finish all tasks.",
                "Most frequent task determines frame size. Result = (maxFreq - 1) * (n + 1) + countOfMax. Take max with total tasks.\nTime: O(n), Space: O(1)\nKey: Frame-based greedy — fill slots around most frequent task",
                "Medium,Greedy,Hash Table,Sorting"},
            new String[]{
                "647. Palindromic Substrings\nGiven a string s, return the number of palindromic substrings in it.",
                "Expand around each center (2n-1 centers for odd and even lengths). Count all palindromes found.\nTime: O(n^2), Space: O(1)\nKey: Same expand-from-center as longest palindromic substring",
                "Medium,Dynamic Programming,String"},
            new String[]{
                "494. Target Sum\nGiven an integer array nums and a target, assign + or - to each integer, find number of ways to achieve target sum.",
                "DP subset sum: find count of subsets with sum = (totalSum + target) / 2. dp[j] += dp[j - num].\nTime: O(n * sum), Space: O(sum)\nKey: Transform to subset sum problem: P = (sum + target) / 2",
                "Medium,Dynamic Programming,Backtracking"},
            new String[]{
                "338. Counting Bits\nGiven an integer n, return an array where ans[i] is the number of 1's in binary representation of i, for 0 <= i <= n.",
                "DP: ans[i] = ans[i >> 1] + (i & 1). Or ans[i] = ans[i & (i-1)] + 1.\nTime: O(n), Space: O(n)\nKey: Bit manipulation DP — relate to previously computed values",
                "Easy,Dynamic Programming,Bit Manipulation"}
        );
    }
}

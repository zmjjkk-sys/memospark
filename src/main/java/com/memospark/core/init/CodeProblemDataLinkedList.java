package com.memospark.core.init;

import java.util.List;

/**
 * Linked-list category problems (11 problems).
 * Each entry: {problemNumber, title, difficulty, description, javaTemplate, pythonTemplate,
 *              javaDriverCode, pythonDriverCode, testCasesJson, tags, category}
 */
public final class CodeProblemDataLinkedList {

    private CodeProblemDataLinkedList() {}

    public static List<String[]> problems() {
        return List.of(
                intersectionOfTwoLinkedLists(),
                reverseLinkedList(),
                palindromeLinkedList(),
                linkedListCycle(),
                mergeTwoSortedLists(),
                addTwoNumbers(),
                removeNthNodeFromEndOfList(),
                swapNodesInPairs(),
                reverseKGroup(),
                copyRandomList(),
                sortList(),
                linkedListCycleII(),
                mergeKSortedLists(),
                lruCache()
        );
    }

    // ── 160. Intersection of Two Linked Lists (Easy) ────────────
    private static String[] intersectionOfTwoLinkedLists() {
        return new String[]{
                "160", "Intersection of Two Linked Lists", "Easy",
                // description
                """
                Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

                The intersection is defined based on reference, not value. The lists are guaranteed to have no cycles.

                For this problem, the input is simplified: line 1 = list A values, line 2 = list B values, line 3 = the intersect value (0 means no intersection). Lists that share an intersection share the same tail starting from that value.

                Example 1:
                  Input: headA = [4,1,8,4,5], headB = [5,6,1,8,4,5], intersectVal = 8
                  Output: 8

                Example 2:
                  Input: headA = [1,2,3], headB = [4,5,6], intersectVal = 0
                  Output: null""",
                // javaTemplate
                """
                class Solution {
                    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def getIntersectionNode(self, headA, headB):
                        pass""",
                // javaDriverCode
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
                        ListNode headA = parse(sc.nextLine().trim());
                        ListNode headB = parse(sc.nextLine().trim());
                        int intersectVal = Integer.parseInt(sc.nextLine().trim());
                        if (intersectVal != 0) {
                            // Find the node in A where val == intersectVal and attach B's prefix to it
                            ListNode shared = headA;
                            while (shared != null && shared.val != intersectVal) shared = shared.next;
                            if (shared != null) {
                                // Rebuild B: keep B's unique prefix, then point to shared
                                ListNode origB = headB;
                                ListNode prevB = null;
                                ListNode walkB = headB;
                                while (walkB != null && walkB.val != intersectVal) { prevB = walkB; walkB = walkB.next; }
                                if (prevB != null) { prevB.next = shared; }
                                else { headB = shared; }
                            }
                        }
                        ListNode result = new Solution().getIntersectionNode(headA, headB);
                        System.out.println(result == null ? "null" : String.valueOf(result.val));
                    }
                }""",
                // pythonDriverCode
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

                headA = parse(input().strip())
                headB = parse(input().strip())
                intersect_val = int(input().strip())
                if intersect_val != 0:
                    shared = headA
                    while shared and shared.val != intersect_val:
                        shared = shared.next
                    if shared:
                        prev_b = None
                        walk_b = headB
                        while walk_b and walk_b.val != intersect_val:
                            prev_b = walk_b
                            walk_b = walk_b.next
                        if prev_b:
                            prev_b.next = shared
                        else:
                            headB = shared
                result = Solution().getIntersectionNode(headA, headB)
                print("null" if result is None else str(result.val))""",
                // testCasesJson
                """
                [
                  {"input": "4,1,8,4,5\\n5,6,1,8,4,5\\n8", "expectedOutput": "8"},
                  {"input": "1,2,3\\n4,5,6\\n0", "expectedOutput": "null"},
                  {"input": "1,3,5,7\\n2,4,5,7\\n5", "expectedOutput": "5"}
                ]""",
                // tags
                "hash-table,linked-list,two-pointers",
                // category
                "链表"
        };
    }

    // ── 206. Reverse Linked List (Easy) ─────────────────────────
    private static String[] reverseLinkedList() {
        return new String[]{
                "206", "Reverse Linked List", "Easy",
                // description
                """
                Given the head of a singly linked list, reverse the list, and return the reversed list.

                Example 1:
                  Input: head = [1,2,3,4,5]
                  Output: [5,4,3,2,1]

                Example 2:
                  Input: head = [1,2]
                  Output: [2,1]

                Example 3:
                  Input: head = []
                  Output: []""",
                // javaTemplate
                """
                class Solution {
                    public ListNode reverseList(ListNode head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def reverseList(self, head):
                        pass""",
                // javaDriverCode
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
                // pythonDriverCode
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
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4,5", "expectedOutput": "5,4,3,2,1"},
                  {"input": "1,2", "expectedOutput": "2,1"},
                  {"input": "null", "expectedOutput": "null"}
                ]""",
                // tags
                "linked-list,recursion",
                // category
                "链表"
        };
    }

    // ── 234. Palindrome Linked List (Easy) ──────────────────────
    private static String[] palindromeLinkedList() {
        return new String[]{
                "234", "Palindrome Linked List", "Easy",
                // description
                """
                Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

                Example 1:
                  Input: head = [1,2,2,1]
                  Output: true

                Example 2:
                  Input: head = [1,2]
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean isPalindrome(ListNode head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def isPalindrome(self, head) -> bool:
                        pass""",
                // javaDriverCode
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
                    public static void main(String[] args) {
                        ListNode head = parse(new Scanner(System.in).nextLine().trim());
                        System.out.println(new Solution().isPalindrome(head));
                    }
                }""",
                // pythonDriverCode
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

                head = parse(input().strip())
                result = Solution().isPalindrome(head)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "1,2,2,1", "expectedOutput": "true"},
                  {"input": "1,2", "expectedOutput": "false"},
                  {"input": "1,2,3,2,1", "expectedOutput": "true"}
                ]""",
                // tags
                "linked-list,two-pointers,stack,recursion",
                // category
                "链表"
        };
    }

    // ── 141. Linked List Cycle (Easy) ───────────────────────────
    private static String[] linkedListCycle() {
        return new String[]{
                "141", "Linked List Cycle", "Easy",
                // description
                """
                Given head, the head of a linked list, determine if the linked list has a cycle in it.

                There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.

                Input: line 1 = comma-separated node values, line 2 = pos (the index where the tail connects back to, -1 means no cycle).

                Return true if there is a cycle, otherwise return false.

                Example 1:
                  Input: head = [3,2,0,-4], pos = 1
                  Output: true

                Example 2:
                  Input: head = [1,2], pos = 0
                  Output: true

                Example 3:
                  Input: head = [1], pos = -1
                  Output: false""",
                // javaTemplate
                """
                class Solution {
                    public boolean hasCycle(ListNode head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def hasCycle(self, head) -> bool:
                        pass""",
                // javaDriverCode
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
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        ListNode head = parse(sc.nextLine().trim());
                        int pos = Integer.parseInt(sc.nextLine().trim());
                        if (pos >= 0 && head != null) {
                            // Find the node at index pos
                            ListNode target = head;
                            for (int i = 0; i < pos; i++) target = target.next;
                            // Find the tail
                            ListNode tail = head;
                            while (tail.next != null) tail = tail.next;
                            tail.next = target;
                        }
                        System.out.println(new Solution().hasCycle(head));
                    }
                }""",
                // pythonDriverCode
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

                line1 = input().strip()
                head = parse(line1)
                pos = int(input().strip())
                if pos >= 0 and head is not None:
                    target = head
                    for _ in range(pos):
                        target = target.next
                    tail = head
                    while tail.next is not None:
                        tail = tail.next
                    tail.next = target
                result = Solution().hasCycle(head)
                print(str(result).lower())""",
                // testCasesJson
                """
                [
                  {"input": "3,2,0,-4\\n1", "expectedOutput": "true"},
                  {"input": "1,2\\n0", "expectedOutput": "true"},
                  {"input": "1\\n-1", "expectedOutput": "false"}
                ]""",
                // tags
                "hash-table,linked-list,two-pointers",
                // category
                "链表"
        };
    }

    // ── 21. Merge Two Sorted Lists (Easy) ───────────────────────
    private static String[] mergeTwoSortedLists() {
        return new String[]{
                "21", "Merge Two Sorted Lists", "Easy",
                // description
                """
                You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list by splicing together the nodes of the first two lists. Return the head of the merged linked list.

                Example 1:
                  Input: list1 = [1,2,4], list2 = [1,3,4]
                  Output: [1,1,2,3,4,4]

                Example 2:
                  Input: list1 = [], list2 = []
                  Output: []

                Example 3:
                  Input: list1 = [], list2 = [0]
                  Output: [0]""",
                // javaTemplate
                """
                class Solution {
                    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def mergeTwoLists(self, list1, list2):
                        pass""",
                // javaDriverCode
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
                // pythonDriverCode
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
                // testCasesJson
                """
                [
                  {"input": "1,2,4\\n1,3,4", "expectedOutput": "1,1,2,3,4,4"},
                  {"input": "null\\nnull", "expectedOutput": "null"},
                  {"input": "null\\n0", "expectedOutput": "0"}
                ]""",
                // tags
                "linked-list,recursion",
                // category
                "链表"
        };
    }

    // ── 2. Add Two Numbers (Medium) ─────────────────────────────
    private static String[] addTwoNumbers() {
        return new String[]{
                "2", "Add Two Numbers", "Medium",
                // description
                """
                You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

                You may assume the two numbers do not contain any leading zero, except the number 0 itself.

                Example 1:
                  Input: l1 = [2,4,3], l2 = [5,6,4]
                  Output: [7,0,8]
                  Explanation: 342 + 465 = 807

                Example 2:
                  Input: l1 = [0], l2 = [0]
                  Output: [0]

                Example 3:
                  Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
                  Output: [8,9,9,9,0,0,0,1]""",
                // javaTemplate
                """
                class Solution {
                    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def addTwoNumbers(self, l1, l2):
                        pass""",
                // javaDriverCode
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
                        System.out.println(fmt(new Solution().addTwoNumbers(l1, l2)));
                    }
                }""",
                // pythonDriverCode
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
                print(fmt(Solution().addTwoNumbers(l1, l2)))""",
                // testCasesJson
                """
                [
                  {"input": "2,4,3\\n5,6,4", "expectedOutput": "7,0,8"},
                  {"input": "0\\n0", "expectedOutput": "0"},
                  {"input": "9,9,9,9,9,9,9\\n9,9,9,9", "expectedOutput": "8,9,9,9,0,0,0,1"}
                ]""",
                // tags
                "linked-list,math,recursion",
                // category
                "链表"
        };
    }

    // ── 19. Remove Nth Node From End of List (Medium) ───────────
    private static String[] removeNthNodeFromEndOfList() {
        return new String[]{
                "19", "Remove Nth Node From End of List", "Medium",
                // description
                """
                Given the head of a linked list, remove the nth node from the end of the list and return its head.

                Example 1:
                  Input: head = [1,2,3,4,5], n = 2
                  Output: [1,2,3,5]

                Example 2:
                  Input: head = [1], n = 1
                  Output: []

                Example 3:
                  Input: head = [1,2], n = 1
                  Output: [1]""",
                // javaTemplate
                """
                class Solution {
                    public ListNode removeNthFromEnd(ListNode head, int n) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def removeNthFromEnd(self, head, n: int):
                        pass""",
                // javaDriverCode
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
                        ListNode head = parse(sc.nextLine().trim());
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(fmt(new Solution().removeNthFromEnd(head, n)));
                    }
                }""",
                // pythonDriverCode
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
                n = int(input().strip())
                print(fmt(Solution().removeNthFromEnd(head, n)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4,5\\n2", "expectedOutput": "1,2,3,5"},
                  {"input": "1\\n1", "expectedOutput": "null"},
                  {"input": "1,2\\n1", "expectedOutput": "1"}
                ]""",
                // tags
                "linked-list,two-pointers",
                // category
                "链表"
        };
    }

    // ── 24. Swap Nodes in Pairs (Medium) ────────────────────────
    private static String[] swapNodesInPairs() {
        return new String[]{
                "24", "Swap Nodes in Pairs", "Medium",
                // description
                """
                Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed).

                Example 1:
                  Input: head = [1,2,3,4]
                  Output: [2,1,4,3]

                Example 2:
                  Input: head = []
                  Output: []

                Example 3:
                  Input: head = [1]
                  Output: [1]""",
                // javaTemplate
                """
                class Solution {
                    public ListNode swapPairs(ListNode head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def swapPairs(self, head):
                        pass""",
                // javaDriverCode
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
                        System.out.println(fmt(new Solution().swapPairs(head)));
                    }
                }""",
                // pythonDriverCode
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
                print(fmt(Solution().swapPairs(head)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4", "expectedOutput": "2,1,4,3"},
                  {"input": "null", "expectedOutput": "null"},
                  {"input": "1", "expectedOutput": "1"}
                ]""",
                // tags
                "linked-list,recursion",
                // category
                "链表"
        };
    }

    // ── 25. Reverse Nodes in k-Group (Hard) ─────────────────────
    private static String[] reverseKGroup() {
        return new String[]{
                "25", "Reverse Nodes in k-Group", "Hard",
                // description
                """
                Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

                k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

                You may not alter the values in the list's nodes, only nodes themselves may be changed.

                Input: line 1 = comma-separated node values, line 2 = k.
                Output: comma-separated result list.

                Example 1:
                  Input: head = [1,2,3,4,5], k = 2
                  Output: [2,1,4,3,5]

                Example 2:
                  Input: head = [1,2,3,4,5], k = 3
                  Output: [3,2,1,4,5]""",
                // javaTemplate
                """
                class Solution {
                    public ListNode reverseKGroup(ListNode head, int k) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def reverseKGroup(self, head, k: int):
                        pass""",
                // javaDriverCode
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
                        ListNode head = parse(sc.nextLine().trim());
                        int k = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(fmt(new Solution().reverseKGroup(head, k)));
                    }
                }""",
                // pythonDriverCode
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
                k = int(input().strip())
                print(fmt(Solution().reverseKGroup(head, k)))""",
                // testCasesJson
                """
                [
                  {"input": "1,2,3,4,5\\n2", "expectedOutput": "2,1,4,3,5"},
                  {"input": "1,2,3,4,5\\n3", "expectedOutput": "3,2,1,4,5"},
                  {"input": "1,2,3,4,5\\n1", "expectedOutput": "1,2,3,4,5"}
                ]""",
                // tags
                "linked-list,recursion",
                // category
                "链表"
        };
    }

    // ── 138. Copy List with Random Pointer (Medium) ─────────────
    private static String[] copyRandomList() {
        return new String[]{
                "138", "Copy List with Random Pointer", "Medium",
                // description
                """
                A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

                Construct a deep copy of the list. Return the head of the copied linked list.

                Simplified I/O: line 1 = number of nodes, then each subsequent line = "val,randomIndex" where randomIndex is the 0-based index of the node the random pointer points to (-1 means null).
                Output: the values of the copied list in order, comma-separated.

                Example 1:
                  Input: 3\\n7,2\\n13,0\\n11,-1
                  Output: 7,13,11

                Example 2:
                  Input: 1\\n1,-1
                  Output: 1""",
                // javaTemplate
                """
                class Solution {
                    public Node copyRandomList(Node head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def copyRandomList(self, head):
                        pass""",
                // javaDriverCode
                """
                import java.util.*;

                class Node {
                    int val;
                    Node next;
                    Node random;
                    Node(int val) { this.val = val; this.next = null; this.random = null; }
                }

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int n = Integer.parseInt(sc.nextLine().trim());
                        int[] vals = new int[n];
                        int[] randomIdx = new int[n];
                        for (int i = 0; i < n; i++) {
                            String[] parts = sc.nextLine().trim().split(",");
                            vals[i] = Integer.parseInt(parts[0].trim());
                            randomIdx[i] = Integer.parseInt(parts[1].trim());
                        }
                        // Build the linked list
                        Node[] nodes = new Node[n];
                        for (int i = 0; i < n; i++) nodes[i] = new Node(vals[i]);
                        for (int i = 0; i < n - 1; i++) nodes[i].next = nodes[i + 1];
                        for (int i = 0; i < n; i++) {
                            if (randomIdx[i] >= 0) nodes[i].random = nodes[randomIdx[i]];
                        }
                        Node copied = new Solution().copyRandomList(nodes[0]);
                        StringBuilder sb = new StringBuilder();
                        Node curr = copied;
                        while (curr != null) {
                            sb.append(curr.val);
                            if (curr.next != null) sb.append(",");
                            curr = curr.next;
                        }
                        System.out.println(sb.toString());
                    }
                }""",
                // pythonDriverCode
                """
                class Node:
                    def __init__(self, val=0, next=None, random=None):
                        self.val = val
                        self.next = next
                        self.random = random

                {{USER_CODE}}

                n = int(input().strip())
                vals = []
                random_idx = []
                for _ in range(n):
                    parts = input().strip().split(",")
                    vals.append(int(parts[0].strip()))
                    random_idx.append(int(parts[1].strip()))
                nodes = [Node(v) for v in vals]
                for i in range(n - 1):
                    nodes[i].next = nodes[i + 1]
                for i in range(n):
                    if random_idx[i] >= 0:
                        nodes[i].random = nodes[random_idx[i]]
                copied = Solution().copyRandomList(nodes[0])
                parts = []
                curr = copied
                while curr:
                    parts.append(str(curr.val))
                    curr = curr.next
                print(",".join(parts))""",
                // testCasesJson
                """
                [
                  {"input": "3\\n7,2\\n13,0\\n11,-1", "expectedOutput": "7,13,11"},
                  {"input": "1\\n1,-1", "expectedOutput": "1"},
                  {"input": "2\\n1,1\\n2,0", "expectedOutput": "1,2"}
                ]""",
                // tags
                "hash-table,linked-list",
                // category
                "链表"
        };
    }

    // ── 148. Sort List (Medium) ─────────────────────────────────
    private static String[] sortList() {
        return new String[]{
                "148", "Sort List", "Medium",
                // description
                """
                Given the head of a linked list, return the list after sorting it in ascending order.

                Can you sort the linked list in O(n log n) time and O(1) memory (i.e. constant space)?

                Example 1:
                  Input: head = [4,2,1,3]
                  Output: [1,2,3,4]

                Example 2:
                  Input: head = [-1,5,3,4,0]
                  Output: [-1,0,3,4,5]

                Example 3:
                  Input: head = []
                  Output: []""",
                // javaTemplate
                """
                class Solution {
                    public ListNode sortList(ListNode head) {

                    }
                }""",
                // pythonTemplate
                """
                class Solution:
                    def sortList(self, head):
                        pass""",
                // javaDriverCode
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
                        System.out.println(fmt(new Solution().sortList(head)));
                    }
                }""",
                // pythonDriverCode
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
                print(fmt(Solution().sortList(head)))""",
                // testCasesJson
                """
                [
                  {"input": "4,2,1,3", "expectedOutput": "1,2,3,4"},
                  {"input": "-1,5,3,4,0", "expectedOutput": "-1,0,3,4,5"},
                  {"input": "null", "expectedOutput": "null"}
                ]""",
                // tags
                "linked-list,two-pointers,divide-and-conquer,sorting,merge-sort",
                // category
                "链表"
        };
    }

    // ── 142. Linked List Cycle II (Medium) ─────────────────────
    private static String[] linkedListCycleII() {
        return new String[]{
                "142", "Linked List Cycle II", "Medium",
                """
                Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

                There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.

                Example:
                  Input: head = [3,2,0,-4], pos = 1
                  Output: 2 (the node where the cycle begins)""",
                """
                class Solution {
                    public ListNode detectCycle(ListNode head) {

                    }
                }""",
                """
                class Solution:
                    def detectCycle(self, head):
                        pass""",
                """
                import java.util.*;

                class ListNode {
                    int val;
                    ListNode next;
                    ListNode(int x) { val = x; next = null; }
                }

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String line = sc.nextLine().trim();
                        int pos = Integer.parseInt(sc.nextLine().trim());
                        if (line.isEmpty() || line.equals("null")) {
                            System.out.println("null");
                            return;
                        }
                        String[] parts = line.split(",");
                        ListNode[] nodes = new ListNode[parts.length];
                        for (int i = 0; i < parts.length; i++) nodes[i] = new ListNode(Integer.parseInt(parts[i].trim()));
                        for (int i = 0; i < parts.length - 1; i++) nodes[i].next = nodes[i + 1];
                        if (pos >= 0) nodes[nodes.length - 1].next = nodes[pos];
                        ListNode result = new Solution().detectCycle(nodes[0]);
                        System.out.println(result == null ? "null" : result.val);
                    }
                }""",
                """
                class ListNode:
                    def __init__(self, x):
                        self.val = x
                        self.next = None

                {{USER_CODE}}

                line = input().strip()
                pos = int(input().strip())
                if not line or line == "null":
                    print("null")
                else:
                    parts = line.split(",")
                    nodes = [ListNode(int(v.strip())) for v in parts]
                    for i in range(len(nodes) - 1):
                        nodes[i].next = nodes[i + 1]
                    if pos >= 0:
                        nodes[-1].next = nodes[pos]
                    result = Solution().detectCycle(nodes[0])
                    print("null" if result is None else result.val)""",
                """
                [
                  {"input": "3,2,0,-4\\n1", "expectedOutput": "2"},
                  {"input": "1,2\\n0", "expectedOutput": "1"},
                  {"input": "1\\n-1", "expectedOutput": "null"}
                ]""",
                "hash-table,linked-list,two-pointers",
                "链表"
        };
    }

    // ── 23. Merge k Sorted Lists (Hard) ────────────────────────
    private static String[] mergeKSortedLists() {
        return new String[]{
                "23", "Merge k Sorted Lists", "Hard",
                """
                You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.

                Example:
                  Input: lists = [[1,4,5],[1,3,4],[2,6]]
                  Output: [1,1,2,3,4,4,5,6]""",
                """
                import java.util.*;

                class Solution {
                    public ListNode mergeKLists(ListNode[] lists) {

                    }
                }""",
                """
                class Solution:
                    def mergeKLists(self, lists):
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
                        int k = Integer.parseInt(sc.nextLine().trim());
                        ListNode[] lists = new ListNode[k];
                        for (int i = 0; i < k; i++) lists[i] = parse(sc.nextLine().trim());
                        System.out.println(fmt(new Solution().mergeKLists(lists)));
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

                k = int(input().strip())
                lists = [parse(input().strip()) for _ in range(k)]
                print(fmt(Solution().mergeKLists(lists)))""",
                """
                [
                  {"input": "3\\n1,4,5\\n1,3,4\\n2,6", "expectedOutput": "1,1,2,3,4,4,5,6"},
                  {"input": "1\\nnull", "expectedOutput": "null"},
                  {"input": "0", "expectedOutput": "null"}
                ]""",
                "linked-list,divide-and-conquer,heap,merge-sort",
                "链表"
        };
    }

    // ── 146. LRU Cache (Medium) ────────────────────────────────
    private static String[] lruCache() {
        return new String[]{
                "146", "LRU Cache", "Medium",
                """
                Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

                Implement the LRUCache class:
                - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
                - int get(int key) Return the value of the key if it exists, otherwise return -1.
                - void put(int key, int value) Update or insert the value. When the cache reaches capacity, evict the least recently used key.

                The functions get and put must each run in O(1) average time complexity.

                Example:
                  Input: ["LRUCache","put","put","get","put","get","put","get","get","get"]
                         [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
                  Output: [null,null,null,1,null,-1,null,-1,3,4]""",
                """
                import java.util.*;

                class LRUCache {
                    public LRUCache(int capacity) {

                    }
                    public int get(int key) {

                    }
                    public void put(int key, int value) {

                    }
                }""",
                """
                class LRUCache:
                    def __init__(self, capacity: int):
                        pass
                    def get(self, key: int) -> int:
                        pass
                    def put(self, key: int, value: int) -> None:
                        pass""",
                """
                import java.util.*;

                {{USER_CODE}}

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        String[] ops = sc.nextLine().trim().split(",");
                        String[] vals = sc.nextLine().trim().split(";");
                        StringBuilder sb = new StringBuilder();
                        LRUCache cache = null;
                        for (int i = 0; i < ops.length; i++) {
                            String op = ops[i].trim();
                            String[] v = vals[i].trim().split(",");
                            if (op.equals("LRUCache")) {
                                cache = new LRUCache(Integer.parseInt(v[0]));
                                sb.append("null");
                            } else if (op.equals("put")) {
                                cache.put(Integer.parseInt(v[0]), Integer.parseInt(v[1]));
                                sb.append("null");
                            } else {
                                sb.append(cache.get(Integer.parseInt(v[0])));
                            }
                            if (i < ops.length - 1) sb.append(",");
                        }
                        System.out.println(sb);
                    }
                }""",
                """
                {{USER_CODE}}

                ops = input().strip().split(",")
                vals = input().strip().split(";")
                results = []
                cache = None
                for i in range(len(ops)):
                    op = ops[i].strip()
                    v = vals[i].strip().split(",")
                    if op == "LRUCache":
                        cache = LRUCache(int(v[0]))
                        results.append("null")
                    elif op == "put":
                        cache.put(int(v[0]), int(v[1]))
                        results.append("null")
                    else:
                        results.append(str(cache.get(int(v[0]))))
                print(",".join(results))""",
                """
                [
                  {"input": "LRUCache,put,put,get,put,get,put,get,get,get\\n2;1,1;2,2;1;3,3;2;4,4;1;3;4", "expectedOutput": "null,null,null,1,null,-1,null,-1,3,4"}
                ]""",
                "hash-table,linked-list,design",
                "链表"
        };
    }
}

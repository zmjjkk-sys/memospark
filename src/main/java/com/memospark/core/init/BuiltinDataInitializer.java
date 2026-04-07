package com.memospark.core.init;

import java.util.List;

/**
 * Provides built-in deck templates. No longer writes to DB directly.
 * Data is copied for each new user at registration time.
 */
public final class BuiltinDataInitializer {

    private BuiltinDataInitializer() {}

    public record DeckTemplate(String name, String description, List<String[]> cards) {}

    public static List<DeckTemplate> getTemplates() {
        return List.of(
                new DeckTemplate("Java Programming",
                        "Core Java concepts and interview questions", javaCards()),
                new DeckTemplate("Algorithms & Data Structures",
                        "Common algorithm and DS questions", algorithmCards()),
                new DeckTemplate("English Vocabulary",
                        "High-frequency advanced English words", englishCards()),
                new DeckTemplate("LeetCode Hot 100",
                        "Top 100 most popular LeetCode interview problems",
                        LeetCodeHot100Data.cards())
        );
    }

    private static List<String[]> javaCards() {
        return List.of(
                new String[]{"What is the difference between == and equals() in Java?",
                        "== compares object references (memory addresses), while equals() compares object content/values. For String, equals() checks character sequence equality.", "java,basics"},
                new String[]{"What does the 'final' keyword mean in Java?",
                        "final on a variable means it cannot be reassigned after initialization. final on a method means it cannot be overridden. final on a class means it cannot be subclassed.", "java,keywords"},
                new String[]{"What is the difference between HashMap and TreeMap?",
                        "HashMap uses hashing (O(1) average operations, no order). TreeMap uses a Red-Black tree (O(log n) operations, keys sorted in natural or comparator order).", "java,collections"},
                new String[]{"What is the volatile keyword in Java?",
                        "volatile ensures that reads/writes to a variable go directly to main memory, preventing CPU caching. It guarantees visibility but NOT atomicity for compound operations.", "java,concurrency"},
                new String[]{"What is the difference between ArrayList and LinkedList?",
                        "ArrayList uses a dynamic array (O(1) random access, O(n) insertion/deletion in middle). LinkedList uses doubly-linked nodes (O(n) access, O(1) insertion/deletion with iterator).", "java,collections"},
                new String[]{"What is autoboxing in Java?",
                        "Autoboxing is the automatic conversion between primitive types (int, double) and their wrapper class counterparts (Integer, Double) performed by the Java compiler.", "java,basics"},
                new String[]{"What is the difference between checked and unchecked exceptions?",
                        "Checked exceptions must be declared or caught (IOException, SQLException). Unchecked exceptions extend RuntimeException and don't require explicit handling (NullPointerException, ArrayIndexOutOfBoundsException).", "java,exceptions"},
                new String[]{"What is the Java Memory Model?",
                        "The Java Memory Model defines how threads interact through memory. It specifies when writes by one thread are visible to other threads, using happens-before relationships.", "java,concurrency"},
                new String[]{"What is the difference between String, StringBuilder, and StringBuffer?",
                        "String is immutable. StringBuilder is mutable and NOT thread-safe (faster). StringBuffer is mutable and thread-safe (synchronized methods, slower).", "java,strings"},
                new String[]{"What is garbage collection in Java?",
                        "Automatic memory management that reclaims memory from objects no longer reachable. The JVM uses algorithms like Mark-and-Sweep, G1GC, ZGC. Triggered when heap is low.", "java,jvm"},
                new String[]{"What is the difference between interface and abstract class?",
                        "Interface: all methods public/abstract by default, multiple inheritance supported, no state (before Java 8). Abstract class: can have state, constructors, concrete methods, single inheritance.", "java,oop"},
                new String[]{"What is a lambda expression in Java?",
                        "A lambda is an anonymous function: (params) -> body. Enables functional programming, used with functional interfaces (Runnable, Comparator, Function, Predicate).", "java,lambda"},
                new String[]{"What is the Stream API in Java?",
                        "A sequence of elements supporting sequential/parallel aggregate operations (filter, map, reduce, collect). Lazy evaluation, does not modify the source. Introduced in Java 8.", "java,streams"},
                new String[]{"What is Optional in Java?",
                        "A container object that may or may not contain a non-null value. Used to avoid NullPointerException. Key methods: isPresent(), get(), orElse(), map(), flatMap().", "java,optional"},
                new String[]{"What is the difference between Comparable and Comparator?",
                        "Comparable defines natural ordering within the class (compareTo). Comparator is an external strategy for custom ordering, can be passed to sort methods.", "java,collections"},
                new String[]{"What is synchronization in Java?",
                        "Mechanism to control thread access to shared resources. synchronized keyword on method or block acquires the intrinsic lock. Ensures only one thread executes at a time.", "java,concurrency"},
                new String[]{"What is the difference between throw and throws?",
                        "'throw' is used to explicitly throw an exception. 'throws' is used in method signatures to declare which checked exceptions the method might propagate.", "java,exceptions"},
                new String[]{"What is a static method in Java?",
                        "A method belonging to the class rather than instances. Can be called without creating an object. Cannot access instance variables or call non-static methods directly.", "java,oop"},
                new String[]{"What is the difference between deep copy and shallow copy?",
                        "Shallow copy copies object references (both point to same nested objects). Deep copy creates completely independent copies of all nested objects recursively.", "java,basics"},
                new String[]{"What is the Iterator pattern?",
                        "Provides a way to sequentially access elements of a collection without exposing its internal structure. Java's Iterable/Iterator interfaces implement this pattern.", "java,patterns"}
        );
    }

    private static List<String[]> algorithmCards() {
        return List.of(
                new String[]{"What is the time complexity of binary search?",
                        "O(log n) — each comparison halves the search space. Requires the array to be sorted. Space complexity O(1) for iterative, O(log n) for recursive.", "algorithms,search"},
                new String[]{"What data structure does BFS use?",
                        "Queue (FIFO). BFS explores nodes level by level. Used for shortest path in unweighted graphs. Time: O(V+E), Space: O(V).", "algorithms,graph"},
                new String[]{"What data structure does DFS use?",
                        "Stack (explicitly) or the call stack (recursively). DFS explores as deep as possible before backtracking. Time: O(V+E), Space: O(V).", "algorithms,graph"},
                new String[]{"What is the average time complexity of quicksort?",
                        "O(n log n) average, O(n²) worst case. In-place sorting algorithm. Pivot selection affects performance. Expected O(n log n) with random pivot.", "algorithms,sorting"},
                new String[]{"What is dynamic programming?",
                        "Optimization technique that solves problems by breaking them into overlapping subproblems, storing results (memoization/tabulation) to avoid redundant computation.", "algorithms,dp"},
                new String[]{"What is the difference between memoization and tabulation?",
                        "Memoization (top-down): recursive with caching. Tabulation (bottom-up): iterative, fills a table from base cases. Both have same time complexity.", "algorithms,dp"},
                new String[]{"What is a heap data structure?",
                        "A complete binary tree satisfying the heap property. Max-heap: parent >= children. Min-heap: parent <= children. Used in priority queues. O(log n) insert/delete.", "algorithms,ds"},
                new String[]{"What is the time complexity of mergesort?",
                        "O(n log n) always — best, average, and worst case. Stable sort. Requires O(n) extra space. Divides array in half recursively, merges sorted halves.", "algorithms,sorting"},
                new String[]{"What is a hash table collision?",
                        "When two different keys hash to the same bucket. Resolved by chaining (linked list at bucket) or open addressing (probing for next empty slot).", "algorithms,ds"},
                new String[]{"What is a balanced binary search tree?",
                        "A BST that maintains O(log n) height by rebalancing on insert/delete. Examples: AVL tree (strict balance), Red-Black tree (used in Java TreeMap/TreeSet).", "algorithms,ds"},
                new String[]{"What is the Knapsack problem?",
                        "Classic DP problem: given items with weights and values, maximize value within weight capacity. 0/1 Knapsack: O(nW) DP solution. Fractional: greedy O(n log n).", "algorithms,dp"},
                new String[]{"What is Big O notation?",
                        "Describes algorithm's worst-case time/space complexity as input grows. Common: O(1) constant, O(log n) logarithmic, O(n) linear, O(n log n), O(n²) quadratic.", "algorithms,complexity"},
                new String[]{"What is a trie data structure?",
                        "A tree where each node represents a character in a string. Efficient for prefix searches, autocomplete. Insert/search O(m) where m is word length.", "algorithms,ds"},
                new String[]{"What is topological sort?",
                        "Linear ordering of vertices in a DAG such that for every edge u→v, u comes before v. Used in dependency resolution. Algorithms: Kahn's (BFS), DFS-based.", "algorithms,graph"},
                new String[]{"What is Dijkstra's algorithm?",
                        "Finds shortest paths from source to all vertices in weighted graph (non-negative weights). O((V+E) log V) with binary heap. Uses greedy approach with priority queue.", "algorithms,graph"},
                new String[]{"What is the sliding window technique?",
                        "Maintains a subset of elements in a window that slides over the data. Reduces O(n²) brute force to O(n) for subarray/substring problems.", "algorithms,technique"},
                new String[]{"What is a monotonic stack?",
                        "A stack maintaining elements in monotonically increasing or decreasing order. Used for next greater/smaller element problems. O(n) amortized.", "algorithms,ds"},
                new String[]{"What is amortized time complexity?",
                        "Average time per operation over a sequence of operations. Example: dynamic array append is O(1) amortized (occasional O(n) resize averaged over many O(1) appends).", "algorithms,complexity"},
                new String[]{"What is Union-Find (Disjoint Set Union)?",
                        "Data structure to track elements in disjoint sets. Supports union and find operations. With path compression + union by rank: nearly O(1) amortized (O(α(n))).", "algorithms,ds"},
                new String[]{"What is the two-pointer technique?",
                        "Uses two pointers moving toward each other or in the same direction to reduce O(n²) solutions to O(n). Used in sorted array problems, palindrome checks.", "algorithms,technique"}
        );
    }

    private static List<String[]> englishCards() {
        return List.of(
                new String[]{"ephemeral", "Lasting for a very short time; transitory.\nExample: 'Social media trends are often ephemeral, forgotten within days.'", "english,adjective"},
                new String[]{"ubiquitous", "Present, appearing, or found everywhere.\nExample: 'Smartphones have become ubiquitous in modern society.'", "english,adjective"},
                new String[]{"serendipity", "The occurrence of events by chance in a happy or beneficial way.\nExample: 'Finding my dream job through a chance meeting was pure serendipity.'", "english,noun"},
                new String[]{"eloquent", "Fluent or persuasive in speaking or writing.\nExample: 'Her eloquent speech moved the entire audience.'", "english,adjective"},
                new String[]{"ambiguous", "Open to more than one interpretation; not having one obvious meaning.\nExample: 'The contract contained several ambiguous clauses that led to disputes.'", "english,adjective"},
                new String[]{"pragmatic", "Dealing with things sensibly and realistically based on practical considerations.\nExample: 'A pragmatic approach to the problem yielded faster results.'", "english,adjective"},
                new String[]{"paradigm", "A typical example or pattern; a model or framework.\nExample: 'Agile development represents a paradigm shift in software engineering.'", "english,noun"},
                new String[]{"resilient", "Able to withstand or recover quickly from difficult conditions.\nExample: 'The resilient startup survived three economic downturns.'", "english,adjective"},
                new String[]{"meticulous", "Showing great attention to detail; very careful and precise.\nExample: 'The meticulous auditor found every discrepancy in the accounts.'", "english,adjective"},
                new String[]{"verbose", "Using more words than needed; wordy.\nExample: 'His verbose emails could always be summarized in two sentences.'", "english,adjective"},
                new String[]{"lucid", "Expressed clearly; easy to understand. Also: mentally clear.\nExample: 'Despite the complexity, her lucid explanation made it accessible.'", "english,adjective"},
                new String[]{"tenacious", "Holding firmly to something; persistent and determined.\nExample: 'His tenacious pursuit of excellence drove him to practice daily.'", "english,adjective"},
                new String[]{"abstain", "Formally decline to vote or participate; refrain from something.\nExample: 'Three members chose to abstain from the controversial vote.'", "english,verb"},
                new String[]{"benevolent", "Well meaning and kindly; generous.\nExample: 'The benevolent donor funded scholarships for hundreds of students.'", "english,adjective"},
                new String[]{"convoluted", "Extremely complex and difficult to follow.\nExample: 'The convoluted tax code confuses even accountants.'", "english,adjective"},
                new String[]{"diligent", "Having or showing care and conscientiousness in work or duties.\nExample: 'Her diligent research produced a comprehensive report.'", "english,adjective"},
                new String[]{"erratic", "Not even or regular in pattern or movement; unpredictable.\nExample: 'The erratic Wi-Fi signal made video calls frustrating.'", "english,adjective"},
                new String[]{"frugal", "Sparing or economical with money or food; simple and plain.\nExample: 'His frugal lifestyle allowed him to retire early.'", "english,adjective"},
                new String[]{"gregarious", "Fond of company; sociable.\nExample: 'The gregarious sales rep made friends everywhere she went.'", "english,adjective"},
                new String[]{"haphazard", "Lacking any obvious principle of organization; random.\nExample: 'The haphazard file system made finding documents impossible.'", "english,adjective"}
        );
    }
}

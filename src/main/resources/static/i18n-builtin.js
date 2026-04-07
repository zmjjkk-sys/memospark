/* ── Built-in deck & card Chinese translations ── */
const builtinZh = {
  decks: {
    'Java Programming': { name: 'Java 编程', description: 'Java 核心概念与编程知识' },
    'Algorithms & Data Structures': { name: '算法与数据结构', description: '常见算法与数据结构知识点' },
    'English Vocabulary': { name: '英语词汇', description: 'GRE/高级英语词汇学习' },
    'LeetCode Hot 100': { name: 'LeetCode 热题 100', description: 'LeetCode 最热门的 100 道面试算法题' },
  },
  cards: {
    // ── Java Programming (20) ──────────────────────────
    'What is the difference between == and equals() in Java?': {
      front: 'Java 中 == 和 equals() 有什么区别？',
      back: '== 比较对象引用（内存地址），而 equals() 比较对象内容/值。对于 String，equals() 检查字符序列是否相等。',
    },
    "What does the 'final' keyword mean in Java?": {
      front: "Java 中 'final' 关键字的含义是什么？",
      back: 'final 修饰变量表示初始化后不可重新赋值；修饰方法表示不可被重写；修饰类表示不可被继承。',
    },
    'What is the difference between HashMap and TreeMap?': {
      front: 'HashMap 和 TreeMap 有什么区别？',
      back: 'HashMap 使用哈希（平均 O(1) 操作，无序）。TreeMap 使用红黑树（O(log n) 操作，键按自然序或比较器排序）。',
    },
    'What is the volatile keyword in Java?': {
      front: 'Java 中 volatile 关键字的作用是什么？',
      back: 'volatile 确保变量的读写直接操作主内存，防止 CPU 缓存。保证可见性，但不保证复合操作的原子性。',
    },
    'What is the difference between ArrayList and LinkedList?': {
      front: 'ArrayList 和 LinkedList 有什么区别？',
      back: 'ArrayList 使用动态数组（O(1) 随机访问，中间插入/删除 O(n)）。LinkedList 使用双向链表（O(n) 访问，迭代器插入/删除 O(1)）。',
    },
    'What is autoboxing in Java?': {
      front: 'Java 中什么是自动装箱？',
      back: '自动装箱是 Java 编译器自动在基本类型（int、double）与其包装类（Integer、Double）之间进行的转换。',
    },
    'What is the difference between checked and unchecked exceptions?': {
      front: '受检异常和非受检异常有什么区别？',
      back: '受检异常必须声明或捕获（IOException、SQLException）。非受检异常继承 RuntimeException，不需要显式处理（NullPointerException、ArrayIndexOutOfBoundsException）。',
    },
    'What is the Java Memory Model?': {
      front: 'Java 内存模型是什么？',
      back: 'Java 内存模型定义了线程如何通过内存进行交互。它规定了一个线程的写入何时对其他线程可见，使用 happens-before 关系。',
    },
    'What is the difference between String, StringBuilder, and StringBuffer?': {
      front: 'String、StringBuilder 和 StringBuffer 有什么区别？',
      back: 'String 是不可变的。StringBuilder 是可变的且非线程安全（更快）。StringBuffer 是可变的且线程安全（同步方法，较慢）。',
    },
    'What is garbage collection in Java?': {
      front: 'Java 中什么是垃圾回收？',
      back: '自动内存管理，回收不再可达的对象所占用的内存。JVM 使用 Mark-and-Sweep、G1GC、ZGC 等算法。在堆内存不足时触发。',
    },
    'What is the difference between interface and abstract class?': {
      front: '接口和抽象类有什么区别？',
      back: '接口：方法默认 public/abstract，支持多继承，无状态（Java 8 之前）。抽象类：可以有状态、构造器、具体方法，单继承。',
    },
    'What is a lambda expression in Java?': {
      front: 'Java 中什么是 Lambda 表达式？',
      back: 'Lambda 是匿名函数：(参数) -> 方法体。支持函数式编程，用于函数式接口（Runnable、Comparator、Function、Predicate）。',
    },
    'What is the Stream API in Java?': {
      front: 'Java 中什么是 Stream API？',
      back: '支持顺序/并行聚合操作（filter、map、reduce、collect）的元素序列。惰性求值，不修改源数据。Java 8 引入。',
    },
    'What is Optional in Java?': {
      front: 'Java 中什么是 Optional？',
      back: '一个可能包含也可能不包含非空值的容器对象。用于避免 NullPointerException。关键方法：isPresent()、get()、orElse()、map()、flatMap()。',
    },
    'What is the difference between Comparable and Comparator?': {
      front: 'Comparable 和 Comparator 有什么区别？',
      back: 'Comparable 在类内部定义自然排序（compareTo）。Comparator 是用于自定义排序的外部策略，可传递给排序方法。',
    },
    'What is synchronization in Java?': {
      front: 'Java 中什么是同步？',
      back: '控制线程访问共享资源的机制。synchronized 关键字用于方法或代码块，获取内置锁。确保同一时间只有一个线程执行。',
    },
    'What is the difference between throw and throws?': {
      front: 'throw 和 throws 有什么区别？',
      back: "throw 用于显式抛出异常。throws 用于方法签名中声明方法可能传播哪些受检异常。",
    },
    'What is a static method in Java?': {
      front: 'Java 中什么是静态方法？',
      back: '属于类而非实例的方法。无需创建对象即可调用。不能直接访问实例变量或调用非静态方法。',
    },
    'What is the difference between deep copy and shallow copy?': {
      front: '深拷贝和浅拷贝有什么区别？',
      back: '浅拷贝复制对象引用（两者指向相同的嵌套对象）。深拷贝递归创建所有嵌套对象的完全独立副本。',
    },
    'What is the Iterator pattern?': {
      front: '什么是迭代器模式？',
      back: '提供一种按顺序访问集合元素的方式，而不暴露其内部结构。Java 的 Iterable/Iterator 接口实现了这个模式。',
    },

    // ── Algorithms & Data Structures (20) ──────────────
    'What is the time complexity of binary search?': {
      front: '二分查找的时间复杂度是多少？',
      back: 'O(log n) —— 每次比较将搜索空间缩小一半。要求数组已排序。空间复杂度：迭代 O(1)，递归 O(log n)。',
    },
    'What data structure does BFS use?': {
      front: 'BFS 使用什么数据结构？',
      back: '队列（FIFO）。BFS 逐层探索节点。用于无权图的最短路径。时间：O(V+E)，空间：O(V)。',
    },
    'What data structure does DFS use?': {
      front: 'DFS 使用什么数据结构？',
      back: '栈（显式）或调用栈（递归）。DFS 尽可能深入探索后再回溯。时间：O(V+E)，空间：O(V)。',
    },
    'What is the average time complexity of quicksort?': {
      front: '快速排序的平均时间复杂度是多少？',
      back: '平均 O(n log n)，最坏 O(n²)。原地排序算法。枢轴选择影响性能。随机枢轴期望 O(n log n)。',
    },
    'What is dynamic programming?': {
      front: '什么是动态规划？',
      back: '将问题分解为重叠子问题，存储结果（记忆化/制表法）以避免重复计算的优化技术。',
    },
    'What is the difference between memoization and tabulation?': {
      front: '记忆化和制表法有什么区别？',
      back: '记忆化（自顶向下）：带缓存的递归。制表法（自底向上）：迭代，从基础情况填表。两者时间复杂度相同。',
    },
    'What is a heap data structure?': {
      front: '什么是堆数据结构？',
      back: '满足堆性质的完全二叉树。最大堆：父节点 ≥ 子节点。最小堆：父节点 ≤ 子节点。用于优先队列。插入/删除 O(log n)。',
    },
    'What is the time complexity of mergesort?': {
      front: '归并排序的时间复杂度是多少？',
      back: '始终 O(n log n) —— 最好、平均和最坏情况。稳定排序。需要 O(n) 额外空间。递归将数组对半分割，合并已排序的两半。',
    },
    'What is a hash table collision?': {
      front: '什么是哈希表冲突？',
      back: '两个不同的键哈希到同一个桶。通过链地址法（桶中链表）或开放寻址法（探测下一个空槽）解决。',
    },
    'What is a balanced binary search tree?': {
      front: '什么是平衡二叉搜索树？',
      back: '通过在插入/删除时重新平衡来保持 O(log n) 高度的 BST。例如：AVL 树（严格平衡）、红黑树（Java TreeMap/TreeSet 使用）。',
    },
    'What is the Knapsack problem?': {
      front: '什么是背包问题？',
      back: '经典 DP 问题：给定物品的重量和价值，在重量限制内最大化价值。0/1 背包：O(nW) DP 解法。分数背包：贪心 O(n log n)。',
    },
    'What is Big O notation?': {
      front: '什么是大 O 表示法？',
      back: '描述算法随输入增长的最坏情况时间/空间复杂度。常见：O(1) 常数，O(log n) 对数，O(n) 线性，O(n log n)，O(n²) 二次。',
    },
    'What is a trie data structure?': {
      front: '什么是字典树（Trie）？',
      back: '每个节点代表字符串中一个字符的树。高效用于前缀搜索、自动补全。插入/搜索 O(m)，m 为单词长度。',
    },
    'What is topological sort?': {
      front: '什么是拓扑排序？',
      back: 'DAG 中顶点的线性排序，使得对于每条边 u→v，u 排在 v 前面。用于依赖关系解析。算法：Kahn（BFS）、基于 DFS。',
    },
    "What is Dijkstra's algorithm?": {
      front: '什么是 Dijkstra 算法？',
      back: '在加权图（非负权重）中找从源点到所有顶点的最短路径。使用二叉堆 O((V+E) log V)。使用贪心策略配合优先队列。',
    },
    'What is the sliding window technique?': {
      front: '什么是滑动窗口技术？',
      back: '维护一个在数据上滑动的元素子集窗口。将子数组/子串问题的 O(n²) 暴力解优化为 O(n)。',
    },
    'What is a monotonic stack?': {
      front: '什么是单调栈？',
      back: '保持元素单调递增或递减顺序的栈。用于下一个更大/更小元素问题。均摊 O(n)。',
    },
    'What is amortized time complexity?': {
      front: '什么是均摊时间复杂度？',
      back: '一系列操作中每个操作的平均时间。例如：动态数组追加均摊 O(1)（偶尔的 O(n) 扩容分摊到多次 O(1) 追加中）。',
    },
    'What is Union-Find (Disjoint Set Union)?': {
      front: '什么是并查集（Union-Find）？',
      back: '追踪不相交集合中元素的数据结构。支持合并和查找操作。路径压缩 + 按秩合并：近 O(1) 均摊（O(α(n))）。',
    },
    'What is the two-pointer technique?': {
      front: '什么是双指针技术？',
      back: '使用两个指针相向移动或同向移动，将 O(n²) 解法优化为 O(n)。用于有序数组问题、回文检查。',
    },

    // ── English Vocabulary (20) ────────────────────────
    'ephemeral': {
      front: 'ephemeral',
      back: '短暂的；转瞬即逝的。\n例句：社交媒体趋势往往是短暂的，几天内就被遗忘。',
    },
    'ubiquitous': {
      front: 'ubiquitous',
      back: '无处不在的。\n例句：智能手机在现代社会已变得无处不在。',
    },
    'serendipity': {
      front: 'serendipity',
      back: '意外发现美好事物的运气；机缘巧合。\n例句：通过一次偶然的会面找到理想工作，纯粹是机缘巧合。',
    },
    'eloquent': {
      front: 'eloquent',
      back: '雄辩的；口才好的；有说服力的。\n例句：她雄辩的演讲打动了全场观众。',
    },
    'ambiguous': {
      front: 'ambiguous',
      back: '模棱两可的；含糊不清的。\n例句：合同中有几项含糊不清的条款导致了纠纷。',
    },
    'pragmatic': {
      front: 'pragmatic',
      back: '务实的；实用主义的。\n例句：务实的方法产生了更快的结果。',
    },
    'paradigm': {
      front: 'paradigm',
      back: '范式；典型例子；模型。\n例句：敏捷开发代表了软件工程中的范式转变。',
    },
    'resilient': {
      front: 'resilient',
      back: '有韧性的；能迅速恢复的。\n例句：这家有韧性的初创公司挺过了三次经济衰退。',
    },
    'meticulous': {
      front: 'meticulous',
      back: '一丝不苟的；非常仔细的。\n例句：一丝不苟的审计员发现了账目中的每一个差异。',
    },
    'verbose': {
      front: 'verbose',
      back: '冗长的；啰嗦的。\n例句：他冗长的邮件总是可以用两句话概括。',
    },
    'lucid': {
      front: 'lucid',
      back: '清晰的；易懂的；头脑清醒的。\n例句：尽管内容复杂，她清晰的解释让人容易理解。',
    },
    'tenacious': {
      front: 'tenacious',
      back: '坚韧不拔的；顽强的。\n例句：他对卓越的执着追求驱使他每天练习。',
    },
    'abstain': {
      front: 'abstain',
      back: '弃权；节制；戒绝。\n例句：三名成员选择在争议性投票中弃权。',
    },
    'benevolent': {
      front: 'benevolent',
      back: '仁慈的；慷慨的。\n例句：这位慷慨的捐赠者资助了数百名学生的奖学金。',
    },
    'convoluted': {
      front: 'convoluted',
      back: '错综复杂的；难以理解的。\n例句：错综复杂的税法连会计师都感到困惑。',
    },
    'diligent': {
      front: 'diligent',
      back: '勤奋的；勤勉的。\n例句：她勤奋的研究产出了一份全面的报告。',
    },
    'erratic': {
      front: 'erratic',
      back: '不稳定的；不规律的；难以预测的。\n例句：不稳定的 Wi-Fi 信号让视频通话令人沮丧。',
    },
    'frugal': {
      front: 'frugal',
      back: '节俭的；朴素的。\n例句：他节俭的生活方式使他得以提前退休。',
    },
    'gregarious': {
      front: 'gregarious',
      back: '合群的；爱社交的。\n例句：这位爱社交的销售代表走到哪里都能交到朋友。',
    },
    'haphazard': {
      front: 'haphazard',
      back: '杂乱无章的；随意的。\n例句：杂乱无章的文件系统使查找文档变得不可能。',
    },

    // ── LeetCode Hot 100 ──────────────────────────────
    // ── Hash ──
    '1. Two Sum\nGiven an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.': {
      front: '1. Two Sum\n给定一个整数数组 nums 和一个整数目标值 target，请你找出和为目标值的那两个整数，并返回它们的下标。',
      back: '使用 HashMap：遍历每个元素，检查 (target - nums[i]) 是否已存在于 map 中。\n时间：O(n)，空间：O(n)\n关键：一次遍历哈希表',
    },
    '49. Group Anagrams\nGiven an array of strings, group the anagrams together.': {
      front: '49. Group Anagrams\n给定一个字符串数组，将字母异位词组合在一起。',
      back: '将每个字符串排序后作为键，或使用字符频率作为键，存入 HashMap 中分组。\n时间：O(n * k log k)，空间：O(n * k)\n关键：排序后的字符串或字符计数作为哈希键',
    },
    '128. Longest Consecutive Sequence\nGiven an unsorted array of integers, find the length of the longest consecutive elements sequence in O(n) time.': {
      front: '128. Longest Consecutive Sequence\n给定一个未排序的整数数组，找出最长连续序列的长度，要求 O(n) 时间复杂度。',
      back: '将所有数字放入 HashSet。对于每个序列起始数字（num-1 不在集合中），计算连续元素个数。\n时间：O(n)，空间：O(n)\n关键：只从序列起点开始计数',
    },
    // ── Two Pointers ──
    '283. Move Zeroes\nGiven an integer array nums, move all 0\'s to the end while maintaining the relative order of non-zero elements, in-place.': {
      front: '283. Move Zeroes\n给定一个整数数组 nums，将所有 0 移动到数组末尾，同时保持非零元素的相对顺序，要求原地操作。',
      back: '双指针：慢指针标记下一个非零元素的位置，快指针扫描数组。快指针找到非零元素时交换。\n时间：O(n)，空间：O(1)\n关键：滚雪球技巧——非零元素从左侧依次填充',
    },
    '11. Container With Most Water\nGiven n non-negative integers representing heights of lines, find two lines that together with the x-axis form a container holding the most water.': {
      front: '11. Container With Most Water\n给定 n 个非负整数表示线段高度，找到两条线与 x 轴组成的容器能容纳最多的水。',
      back: '双指针分别在两端；移动较短的线段向内。面积 = min(h[l], h[r]) * (r - l)。\n时间：O(n)，空间：O(1)\n关键：移动较短边才有可能增大面积',
    },
    '15. 3Sum\nGiven an integer array nums, return all triplets [nums[i], nums[j], nums[k]] such that i != j != k and nums[i] + nums[j] + nums[k] == 0.': {
      front: '15. 3Sum\n给定一个整数数组 nums，返回所有满足 i != j != k 且 nums[i] + nums[j] + nums[k] == 0 的三元组。',
      back: '排序数组。固定一个元素，对剩余部分使用双指针。跳过重复值。\n时间：O(n^2)，空间：O(1)\n关键：排序 + 双指针 + 跳过重复',
    },
    '42. Trapping Rain Water\nGiven n non-negative integers representing an elevation map, compute how much water it can trap after raining.': {
      front: '42. Trapping Rain Water\n给定 n 个非负整数表示高度图，计算下雨后能接多少水。',
      back: '双指针从两端出发。跟踪 leftMax 和 rightMax。位置处的水量 = min(leftMax, rightMax) - height[i]。\n时间：O(n)，空间：O(1)\n关键：水位由较矮的一侧决定',
    },
    // ── Sliding Window ──
    '3. Longest Substring Without Repeating Characters\nGiven a string s, find the length of the longest substring without repeating characters.': {
      front: '3. Longest Substring Without Repeating Characters\n给定一个字符串 s，请你找出其中不含有重复字符的最长子串的长度。',
      back: '使用 HashSet/HashMap 的滑动窗口。向右扩展，遇到重复时收缩左边界。\n时间：O(n)，空间：O(min(n, m))\n关键：维护一个不含重复字符的窗口',
    },
    '438. Find All Anagrams in a String\nGiven two strings s and p, find all start indices of p\'s anagrams in s.': {
      front: '438. Find All Anagrams in a String\n给定两个字符串 s 和 p，找出 s 中所有 p 的字母异位词的起始索引。',
      back: '固定大小为 p 长度的滑动窗口。使用字符频率数组，比较窗口频率和 p 的频率。\n时间：O(n)，空间：O(1)\n关键：固定大小窗口 + 频率比较',
    },
    '76. Minimum Window Substring\nGiven two strings s and t, return the minimum window substring of s such that every character in t is included in the window.': {
      front: '76. Minimum Window Substring\n给定两个字符串 s 和 t，返回 s 中包含 t 所有字符的最小窗口子串。',
      back: '滑动窗口：向右扩展以包含 t 的所有字符，然后收缩左边界以最小化窗口。跟踪所需字符计数。\n时间：O(n)，空间：O(m)\n关键：扩展-收缩模式 + 有效窗口追踪',
    },
    // ── Substring / Palindrome ──
    '560. Subarray Sum Equals K\nGiven an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.': {
      front: '560. Subarray Sum Equals K\n给定一个整数数组 nums 和一个整数 k，返回和等于 k 的连续子数组的个数。',
      back: '使用前缀和 + HashMap。对于每个前缀和，计算有多少个之前的前缀和等于 (currentSum - k)。\n时间：O(n)，空间：O(n)\n关键：prefixSum[j] - prefixSum[i] = k',
    },
    '239. Sliding Window Maximum\nGiven an array nums and a sliding window of size k, return the max value in each window position.': {
      front: '239. Sliding Window Maximum\n给定一个数组 nums 和大小为 k 的滑动窗口，返回每个窗口位置的最大值。',
      back: '使用存储索引的单调双端队列。移除窗口外的元素和从队尾移除比当前元素小的元素。\n时间：O(n)，空间：O(k)\n关键：单调递减双端队列',
    },
    // ── Stack ──
    '20. Valid Parentheses\nGiven a string s containing just the characters \'(\', \')\', \'{\', \'}\', \'[\' and \']\', determine if the input string is valid.': {
      front: '20. Valid Parentheses\n给定一个只包含 \'(\'、\')\'、\'{\'、\'}\'、\'[\' 和 \']\' 的字符串 s，判断字符串是否有效。',
      back: '使用栈。遇到左括号压栈，遇到右括号弹出并比较。\n时间：O(n)，空间：O(n)\n关键：栈匹配"后开先合"原则',
    },
    '155. Min Stack\nDesign a stack that supports push, pop, top, and retrieving the minimum element in constant time.': {
      front: '155. Min Stack\n设计一个支持 push、pop、top 操作，并能在常数时间内检索到最小元素的栈。',
      back: '使用两个栈：一个存值，一个跟踪最小值。或者存储 (val, currentMin) 对。\n时间：所有操作 O(1)，空间：O(n)\n关键：辅助栈/配对跟踪当前最小值',
    },
    '394. Decode String\nGiven an encoded string like "3[a2[c]]", return the decoded string "accaccacc".': {
      front: '394. Decode String\n给定一个编码字符串如 "3[a2[c]]"，返回解码后的字符串 "accaccacc"。',
      back: '使用两个栈：一个存计数，一个存字符串。遇到 \'[\' 压栈，遇到 \']\' 弹出并重复。\n时间：O(n * maxK)，空间：O(n)\n关键：双栈处理嵌套编码',
    },
    '739. Daily Temperatures\nGiven an array of daily temperatures, return an array where answer[i] is the number of days until a warmer temperature.': {
      front: '739. Daily Temperatures\n给定每日温度数组，返回一个数组，其中 answer[i] 是等到更高温度需要的天数。',
      back: '单调递减栈存储索引。当前温度大于栈顶温度时弹出。\n时间：O(n)，空间：O(n)\n关键：单调栈用于"下一个更大元素"模式',
    },
    '84. Largest Rectangle in Histogram\nGiven an array of integers heights representing a histogram, find the area of the largest rectangle in the histogram.': {
      front: '84. Largest Rectangle in Histogram\n给定整数数组 heights 表示柱状图，找出柱状图中最大矩形的面积。',
      back: '单调递增栈。对于每个柱子，弹出更高的柱子并以栈顶高度计算面积。\n时间：O(n)，空间：O(n)\n关键：栈跟踪潜在左边界；弹出时计算宽度',
    },
    // ── Linked List ──
    '160. Intersection of Two Linked Lists\nGiven the heads of two singly linked-lists, return the node at which the two lists intersect.': {
      front: '160. Intersection of Two Linked Lists\n给定两个单链表的头节点，返回两个链表相交的节点。',
      back: '双指针：一个到达末尾时重定向到另一个链表的头部。它们会在交点相遇。\n时间：O(m + n)，空间：O(1)\n关键：交换后路径长度相等',
    },
    '206. Reverse Linked List\nGiven the head of a singly linked list, reverse the list and return the reversed list.': {
      front: '206. Reverse Linked List\n给定单链表的头节点，反转链表并返回反转后的链表。',
      back: '迭代法：维护 prev、curr、next 三个指针。或递归法：先反转剩余部分，再修复指针。\n时间：O(n)，空间：迭代 O(1) / 递归 O(n)\n关键：prev-curr-next 指针交换',
    },
    '234. Palindrome Linked List\nGiven the head of a singly linked list, return true if it is a palindrome.': {
      front: '234. Palindrome Linked List\n给定单链表的头节点，判断该链表是否为回文链表。',
      back: '用快慢指针找中点，反转后半部分，比较两半。\n时间：O(n)，空间：O(1)\n关键：快慢指针 + 反转后半部分',
    },
    '141. Linked List Cycle\nGiven head, determine if the linked list has a cycle in it.': {
      front: '141. Linked List Cycle\n给定一个链表的头节点，判断链表中是否有环。',
      back: 'Floyd 环检测：慢指针每次走 1 步，快指针每次走 2 步。如果相遇则存在环。\n时间：O(n)，空间：O(1)\n关键：龟兔赛跑算法',
    },
    '142. Linked List Cycle II\nGiven the head of a linked list, return the node where the cycle begins.': {
      front: '142. Linked List Cycle II\n给定链表的头节点，返回链表入环的第一个节点。',
      back: 'Floyd 算法：慢指针和快指针相遇后，将一个指针重置到头部。两者各走一步直到再次相遇即为环的起点。\n时间：O(n)，空间：O(1)\n关键：数学证明——头到环入口的距离等于相遇点到环入口的距离',
    },
    '21. Merge Two Sorted Lists\nMerge two sorted linked lists and return it as a sorted list.': {
      front: '21. Merge Two Sorted Lists\n将两个升序链表合并为一个新的升序链表并返回。',
      back: '使用哑节点。比较当前节点，追加较小的那个。最后连接剩余链表。\n时间：O(m + n)，空间：O(1)\n关键：哑节点简化边界情况',
    },
    '2. Add Two Numbers\nYou are given two non-empty linked lists representing two non-negative integers in reverse order. Return the sum as a linked list.': {
      front: '2. Add Two Numbers\n给定两个非空链表，表示两个逆序存储的非负整数。返回以链表形式表示的两数之和。',
      back: '同时遍历两个链表，逐位相加并处理进位。为结果创建新节点。\n时间：O(max(m, n))，空间：O(max(m, n))\n关键：处理进位传播',
    },
    '19. Remove Nth Node From End of List\nGiven the head of a linked list, remove the nth node from the end and return its head.': {
      front: '19. Remove Nth Node From End of List\n给定链表头节点，删除倒数第 n 个节点并返回链表头。',
      back: '双指针：先将第一个指针前进 n 步，然后两个指针同时移动直到第一个到达末尾。\n时间：O(n)，空间：O(1)\n关键：两指针之间保持 n 的间隔',
    },
    '24. Swap Nodes in Pairs\nGiven a linked list, swap every two adjacent nodes and return its head.': {
      front: '24. Swap Nodes in Pairs\n给定一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。',
      back: '使用哑节点。对于每一对：重新连接 prev->second->first->next_pair。\n时间：O(n)，空间：O(1)\n关键：使用哑节点仔细重新分配指针',
    },
    '25. Reverse Nodes in k-Group\nGiven the head of a linked list, reverse the nodes of the list k at a time and return the modified list.': {
      front: '25. Reverse Nodes in k-Group\n给定链表的头节点，每 k 个节点一组进行反转，返回修改后的链表。',
      back: '计数 k 个节点，反转该组，递归/迭代连接到下一组。\n时间：O(n)，空间：O(1)\n关键：反转子链表 + 重新连接边界',
    },
    '138. Copy List with Random Pointer\nA linked list with next and random pointers. Construct a deep copy of the list.': {
      front: '138. Copy List with Random Pointer\n一个带有 next 和 random 指针的链表。构造该链表的深拷贝。',
      back: '三次遍历：1) 交错插入副本节点，2) 设置 random 指针，3) 分离链表。或使用 HashMap。\n时间：O(n)，空间：交错法 O(1) / HashMap O(n)\n关键：交错插入技巧避免额外空间',
    },
    '148. Sort List\nGiven the head of a linked list, return the list after sorting it in ascending order in O(n log n) time.': {
      front: '148. Sort List\n给定链表的头节点，请将其按升序排列并返回排序后的链表，时间复杂度 O(n log n)。',
      back: '归并排序：用快慢指针找中点，递归排序两半，合并已排序的两半。\n时间：O(n log n)，空间：O(log n)\n关键：归并排序天然适合链表',
    },
    '23. Merge k Sorted Lists\nYou are given an array of k linked-lists, each sorted in ascending order. Merge all into one sorted linked list.': {
      front: '23. Merge k Sorted Lists\n给定 k 个升序排列的链表，将它们合并成一个升序链表。',
      back: '大小为 k 的最小堆（优先队列）。始终弹出最小的，将其下一个节点入堆。\n时间：O(N log k)，空间：O(k)\n关键：优先队列高效地维护 k 路归并',
    },
    '146. LRU Cache\nDesign a data structure that follows the constraints of a Least Recently Used (LRU) cache.': {
      front: '146. LRU Cache\n设计一个遵循最近最少使用（LRU）缓存约束的数据结构。',
      back: 'HashMap + 双向链表。Map 提供 O(1) 查找，双向链表提供 O(1) 重新排序/淘汰。\n时间：get/put O(1)，空间：O(capacity)\n关键：HashMap 快速访问 + 双向链表维护访问顺序',
    },
    // ── Binary Tree ──
    '94. Binary Tree Inorder Traversal\nGiven the root of a binary tree, return the inorder traversal of its values.': {
      front: '94. Binary Tree Inorder Traversal\n给定二叉树的根节点，返回其中序遍历结果。',
      back: '递归：左 -> 根 -> 右。迭代：使用栈，尽可能向左走，弹出并访问，然后转右。\n时间：O(n)，空间：O(n)\n关键：栈模拟递归实现迭代方法',
    },
    '104. Maximum Depth of Binary Tree\nGiven the root of a binary tree, return its maximum depth.': {
      front: '104. Maximum Depth of Binary Tree\n给定二叉树的根节点，返回其最大深度。',
      back: '递归：1 + max(depth(left), depth(right))。基准情况：null 返回 0。\n时间：O(n)，空间：O(h)\n关键：后序 DFS，高度 = 1 + max(子节点高度)',
    },
    '226. Invert Binary Tree\nGiven the root of a binary tree, invert the tree (mirror it) and return its root.': {
      front: '226. Invert Binary Tree\n给定二叉树的根节点，翻转该二叉树（镜像）并返回其根节点。',
      back: '递归地交换每个节点的左右子节点。\n时间：O(n)，空间：O(h)\n关键：交换子节点然后递归',
    },
    '101. Symmetric Tree\nGiven the root of a binary tree, check whether it is a mirror of itself.': {
      front: '101. Symmetric Tree\n给定一棵二叉树的根节点，检查它是否是镜像对称的。',
      back: '递归：镜像比较左子树和右子树。isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)。\n时间：O(n)，空间：O(h)\n关键：双指针递归在镜像位置比较',
    },
    '543. Diameter of Binary Tree\nGiven the root of a binary tree, return the length of the diameter (longest path between any two nodes).': {
      front: '543. Diameter of Binary Tree\n给定二叉树的根节点，返回直径长度（任意两节点之间的最长路径）。',
      back: 'DFS 返回深度；在每个节点处，直径 = leftDepth + rightDepth。跟踪全局最大值。\n时间：O(n)，空间：O(h)\n关键：经过某节点的直径 = 左深度 + 右深度',
    },
    '102. Binary Tree Level Order Traversal\nGiven the root of a binary tree, return the level order traversal of its values.': {
      front: '102. Binary Tree Level Order Traversal\n给定二叉树的根节点，返回其层序遍历结果。',
      back: 'BFS 使用队列。逐层处理节点，记录每层大小。\n时间：O(n)，空间：O(n)\n关键：基于队列的 BFS 按层分组',
    },
    '108. Convert Sorted Array to Binary Search Tree\nGiven an integer array nums sorted in ascending order, convert it to a height-balanced BST.': {
      front: '108. Convert Sorted Array to Binary Search Tree\n给定一个升序排列的整数数组 nums，将其转换为一棵高度平衡的 BST。',
      back: '递归地选择中间元素作为根；左半部分成为左子树，右半部分成为右子树。\n时间：O(n)，空间：O(log n)\n关键：中间元素确保平衡',
    },
    '98. Validate Binary Search Tree\nGiven the root of a binary tree, determine if it is a valid BST.': {
      front: '98. Validate Binary Search Tree\n给定二叉树的根节点，判断它是否是一个有效的 BST。',
      back: '中序遍历应产生严格递增序列。或递归检查 (min, max) 范围。\n时间：O(n)，空间：O(h)\n关键：向下传递有效范围 (min, max)',
    },
    '230. Kth Smallest Element in a BST\nGiven the root of a BST and an integer k, return the kth smallest value.': {
      front: '230. Kth Smallest Element in a BST\n给定 BST 的根节点和一个整数 k，返回第 k 小的值。',
      back: 'BST 的中序遍历按升序访问节点。返回第 k 个访问的节点。\n时间：O(H + k)，空间：O(H)\n关键：BST 的中序遍历 = 有序序列',
    },
    '199. Binary Tree Right Side View\nGiven the root of a binary tree, return the values of the nodes you can see ordered from top to bottom when looking from the right side.': {
      front: '199. Binary Tree Right Side View\n给定二叉树的根节点，从右侧观察，返回从上到下能看到的节点值。',
      back: 'BFS 逐层遍历，取每层最后一个节点。或 DFS 先访问右子节点。\n时间：O(n)，空间：O(n)\n关键：BFS 中每层的最后一个节点',
    },
    '114. Flatten Binary Tree to Linked List\nGiven the root of a binary tree, flatten it to a linked list in-place (preorder).': {
      front: '114. Flatten Binary Tree to Linked List\n给定二叉树的根节点，将其原地展开为链表（先序）。',
      back: '对每个节点：保存右子树，将右指针指向左子树，左指针置空，找到展开后的左子树尾部，连接保存的右子树。\n时间：O(n)，空间：类 Morris O(1) / 递归 O(n)\n关键：先序重排并通过右指针链接',
    },
    '105. Construct Binary Tree from Preorder and Inorder Traversal\nGiven two integer arrays preorder and inorder, construct and return the binary tree.': {
      front: '105. Construct Binary Tree from Preorder and Inorder Traversal\n给定两个整数数组 preorder 和 inorder，构造并返回二叉树。',
      back: '先序遍历的第一个元素是根。在中序遍历中找到根的位置以分割左右子树。递归。\n时间：O(n)，空间：O(n)\n关键：根来自先序 + 分割来自中序',
    },
    '437. Path Sum III\nGiven the root of a binary tree and an integer targetSum, return the number of paths that sum to targetSum. Path goes downward.': {
      front: '437. Path Sum III\n给定二叉树的根节点和一个整数 targetSum，返回路径和等于 targetSum 的路径数。路径方向向下。',
      back: 'DFS 配合前缀和 HashMap。计算 prefixSum - targetSum 在 map 中出现的次数。\n时间：O(n)，空间：O(n)\n关键：前缀和技术应用于树路径',
    },
    '236. Lowest Common Ancestor of a Binary Tree\nGiven a binary tree, find the lowest common ancestor (LCA) of two given nodes.': {
      front: '236. Lowest Common Ancestor of a Binary Tree\n给定一棵二叉树，找到两个给定节点的最近公共祖先（LCA）。',
      back: '递归：如果 root 是 p 或 q，返回 root。分别递归左右子树。如果两侧都非空，则 root 就是 LCA。\n时间：O(n)，空间：O(h)\n关键：后序遍历——LCA 是左右两侧都找到目标的位置',
    },
    '124. Binary Tree Maximum Path Sum\nA path in a binary tree is a sequence of nodes where each pair of adjacent nodes has an edge. Return the maximum path sum.': {
      front: '124. Binary Tree Maximum Path Sum\n二叉树中的路径是相邻节点之间有边连接的节点序列。返回最大路径和。',
      back: 'DFS 返回最大单分支增益。在每个节点处，更新全局最大值 = node.val + leftGain + rightGain。\n时间：O(n)，空间：O(h)\n关键：最大增益 vs 最大路径——增益是单侧的，路径可在节点处分叉',
    },
    // ── Binary Search ──
    '35. Search Insert Position\nGiven a sorted array and a target value, return the index if found, or the index where it would be inserted.': {
      front: '35. Search Insert Position\n给定一个排序数组和一个目标值，如果找到则返回索引，否则返回它将被插入的位置。',
      back: '标准二分查找。如果未找到，left 指针给出插入位置。\n时间：O(log n)，空间：O(1)\n关键：左边界二分查找',
    },
    '74. Search a 2D Matrix\nWrite an efficient algorithm that searches for a value in an m x n matrix where rows and columns are sorted.': {
      front: '74. Search a 2D Matrix\n编写一个高效算法，在行列有序的 m x n 矩阵中搜索一个值。',
      back: '将二维矩阵视为一维有序数组。二分查找并进行索引映射：row = mid/cols，col = mid%cols。\n时间：O(log(m*n))，空间：O(1)\n关键：将二维索引展平为一维进行二分查找',
    },
    '34. Find First and Last Position of Element in Sorted Array\nGiven a sorted array of integers, find the starting and ending position of a given target value.': {
      front: '34. Find First and Last Position of Element in Sorted Array\n给定一个有序整数数组，找出给定目标值的开始和结束位置。',
      back: '两次二分查找：一次找最左位置，一次找最右位置。\n时间：O(log n)，空间：O(1)\n关键：分别搜索左边界和右边界',
    },
    '33. Search in Rotated Sorted Array\nThere is an integer array sorted in ascending order then rotated. Given the array and target, return its index or -1.': {
      front: '33. Search in Rotated Sorted Array\n一个升序排列的整数数组经过旋转。给定数组和目标值，返回其索引或 -1。',
      back: '二分查找：判断哪一半是有序的，检查目标值是否在有序的那一半中，缩小搜索范围。\n时间：O(log n)，空间：O(1)\n关键：旋转后总有一半是有序的',
    },
    '153. Find Minimum in Rotated Sorted Array\nSuppose an array sorted in ascending order is rotated. Find the minimum element.': {
      front: '153. Find Minimum in Rotated Sorted Array\n假设一个升序数组经过旋转。找到最小元素。',
      back: '二分查找：如果 nums[mid] > nums[right]，最小值在右半部分；否则在左半部分。\n时间：O(log n)，空间：O(1)\n关键：将 mid 与右边界比较',
    },
    '4. Median of Two Sorted Arrays\nGiven two sorted arrays nums1 and nums2, return the median of the two sorted arrays in O(log(m+n)) time.': {
      front: '4. Median of Two Sorted Arrays\n给定两个有序数组 nums1 和 nums2，以 O(log(m+n)) 的时间复杂度返回两个数组的中位数。',
      back: '在较短的数组上进行二分查找以找到正确的分割点。确保两个数组的 maxLeft <= minRight。\n时间：O(log(min(m,n)))，空间：O(1)\n关键：分割两个数组使左侧元素数量 = 总数的一半',
    },
    // ── Backtracking ──
    '46. Permutations\nGiven an array nums of distinct integers, return all possible permutations.': {
      front: '46. Permutations\n给定一个不含重复数字的数组 nums，返回其所有可能的全排列。',
      back: '回溯：对每个位置，尝试所有未使用的元素。使用 visited 数组或交换技巧。\n时间：O(n * n!)，空间：O(n)\n关键：经典回溯——选择、探索、撤销',
    },
    '78. Subsets\nGiven an integer array nums of unique elements, return all possible subsets.': {
      front: '78. Subsets\n给定一个含有唯一元素的整数数组 nums，返回所有可能的子集。',
      back: '回溯：对每个元素，选择包含或排除。或从前一个子集迭代构建。\n时间：O(n * 2^n)，空间：O(n)\n关键：包含/排除的二叉决策树',
    },
    '17. Letter Combinations of a Phone Number\nGiven a string containing digits from 2-9, return all possible letter combinations.': {
      front: '17. Letter Combinations of a Phone Number\n给定一个包含数字 2-9 的字符串，返回所有可能的字母组合。',
      back: '回溯：将每个数字映射到对应字母，递归构建组合。\n时间：O(4^n)，空间：O(n)\n关键：数字到字母的映射 + DFS 组合',
    },
    '39. Combination Sum\nGiven an array of distinct integers candidates and a target, return all unique combinations that sum to target. Elements can be reused.': {
      front: '39. Combination Sum\n给定一个无重复元素的整数数组 candidates 和一个目标值 target，找出所有和为目标值的组合。元素可以重复使用。',
      back: '回溯：对每个候选数，包含它（留在当前索引以允许重用）或跳到下一个。\n时间：O(n^(target/min))，空间：O(target/min)\n关键：不前移索引以允许同一元素重复使用',
    },
    '22. Generate Parentheses\nGiven n pairs of parentheses, generate all combinations of well-formed parentheses.': {
      front: '22. Generate Parentheses\n给定 n 对括号，生成所有有效的括号组合。',
      back: '回溯：如果 open < n 则添加 \'(\'，如果 close < open 则添加 \')\'。\n时间：O(4^n / sqrt(n))，空间：O(n)\n关键：有效状态 = close 计数 <= open 计数 <= n',
    },
    '79. Word Search\nGiven an m x n board and a word, return true if word exists in the grid (adjacent cells, no reuse).': {
      front: '79. Word Search\n给定一个 m x n 字符网格和一个单词，判断该单词是否存在于网格中（相邻单元格，不可重复使用）。',
      back: '从每个单元格开始 DFS 回溯。标记已访问，四个方向递归，回溯时取消标记。\n时间：O(m * n * 4^L)，空间：O(L)\n关键：网格 DFS 配合访问标记回溯',
    },
    '131. Palindrome Partitioning\nGiven a string s, partition s such that every substring of the partition is a palindrome. Return all possible partitions.': {
      front: '131. Palindrome Partitioning\n给定一个字符串 s，将 s 分割使得每个子串都是回文串。返回所有可能的分割方案。',
      back: '回溯：尝试所有前缀子串，如果是回文则对剩余部分递归。\n时间：O(n * 2^n)，空间：O(n)\n关键：分割 = 一系列回文前缀的选择',
    },
    '51. N-Queens\nPlace n queens on an n x n chessboard so that no two queens attack each other. Return all distinct solutions.': {
      front: '51. N-Queens\n在 n x n 棋盘上放置 n 个皇后，使得皇后彼此不能互相攻击。返回所有不同的解法。',
      back: '逐行回溯。跟踪已占用的列、对角线（row-col）和反对角线（row+col）。\n时间：O(n!)，空间：O(n)\n关键：对角线索引技巧——row-col 和 row+col',
    },
    // ── Greedy ──
    '121. Best Time to Buy and Sell Stock\nGiven an array prices where prices[i] is the price on the ith day, maximize profit with one buy and one sell.': {
      front: '121. Best Time to Buy and Sell Stock\n给定一个数组 prices，其中 prices[i] 是第 i 天的股票价格，通过一次买入和卖出最大化利润。',
      back: '跟踪到目前为止的最低价格；每天的利润 = price - minPrice。更新 maxProfit。\n时间：O(n)，空间：O(1)\n关键：一次遍历跟踪运行最小值',
    },
    '55. Jump Game\nGiven an array of non-negative integers nums, determine if you can reach the last index starting from index 0.': {
      front: '55. Jump Game\n给定一个非负整数数组 nums，判断你是否能从索引 0 到达最后一个索引。',
      back: '贪心：跟踪最远可达索引。如果当前索引 > 最远可达，返回 false。\n时间：O(n)，空间：O(1)\n关键：维护最大可达位置',
    },
    '45. Jump Game II\nGiven an array nums, return the minimum number of jumps to reach the last index.': {
      front: '45. Jump Game II\n给定一个数组 nums，返回到达最后一个索引的最少跳跃次数。',
      back: '类似 BFS 的贪心：跟踪当前层的终点和最远可达位置。到达层终点时跳跃次数加一。\n时间：O(n)，空间：O(1)\n关键：基于层级的 BFS 处理跳跃范围',
    },
    '763. Partition Labels\nPartition the string into as many parts as possible so that each letter appears in at most one part.': {
      front: '763. Partition Labels\n将字符串划分为尽可能多的片段，使得每个字母最多出现在一个片段中。',
      back: '记录每个字符的最后出现位置。将分区终点扩展到 max(end, lastOccurrence[char])。\n时间：O(n)，空间：O(1)\n关键：贪心扩展以覆盖所有出现位置',
    },
    // ── Dynamic Programming ──
    '70. Climbing Stairs\nYou are climbing a staircase of n steps. Each time you can climb 1 or 2 steps. How many distinct ways to reach the top?': {
      front: '70. Climbing Stairs\n你正在爬一个 n 级台阶的楼梯。每次可以爬 1 或 2 级。有多少种不同的方法到达顶部？',
      back: 'dp[i] = dp[i-1] + dp[i-2]。与 Fibonacci 数列相同。\n时间：O(n)，空间：O(1)\n关键：经典 Fibonacci DP',
    },
    '118. Pascal\'s Triangle\nGiven an integer numRows, return the first numRows of Pascal\'s triangle.': {
      front: '118. Pascal\'s Triangle\n给定一个整数 numRows，返回杨辉三角的前 numRows 行。',
      back: '每个元素 = 上方两个元素之和。row[j] = prevRow[j-1] + prevRow[j]。\n时间：O(n^2)，空间：O(n^2)\n关键：从上一行逐行构建',
    },
    '198. House Robber\nGiven an array representing money in each house, maximize amount without robbing adjacent houses.': {
      front: '198. House Robber\n给定一个数组表示每间房屋中的金额，在不抢劫相邻房屋的情况下最大化金额。',
      back: 'dp[i] = max(dp[i-1], dp[i-2] + nums[i])。抢当前的 + 跳过前一个，或跳过当前的。\n时间：O(n)，空间：O(1)\n关键：每间房屋做抢或不抢的决策',
    },
    '279. Perfect Squares\nGiven an integer n, return the least number of perfect square numbers that sum to n.': {
      front: '279. Perfect Squares\n给定一个整数 n，返回和为 n 的完全平方数的最少数量。',
      back: 'BFS 或 DP：dp[i] = min(dp[i - j*j] + 1)，对所有有效的 j。\n时间：O(n * sqrt(n))，空间：O(n)\n关键：BFS 找最短路径；DP 尝试所有平方数减法',
    },
    '322. Coin Change\nGiven coins of different denominations and a total amount, return the fewest number of coins to make up that amount.': {
      front: '322. Coin Change\n给定不同面额的硬币和总金额，返回凑成总金额所需的最少硬币数。',
      back: 'DP：dp[i] = min(dp[i - coin] + 1)，遍历所有硬币。基准：dp[0] = 0。\n时间：O(amount * n)，空间：O(amount)\n关键：自底向上 DP 对每个金额尝试每种硬币',
    },
    '139. Word Break\nGiven a string s and a dictionary of words, return true if s can be segmented into dictionary words.': {
      front: '139. Word Break\n给定一个字符串 s 和一个单词字典，判断 s 是否可以被拆分为字典中的单词。',
      back: 'DP：dp[i] = true 如果 s[0..i) 可以被拆分。检查所有 j < i 使得 dp[j] && s[j..i) 在字典中。\n时间：O(n^2 * m)，空间：O(n)\n关键：dp[i] 依赖于之前所有有效的单词结束位置',
    },
    '300. Longest Increasing Subsequence\nGiven an integer array nums, return the length of the longest strictly increasing subsequence.': {
      front: '300. Longest Increasing Subsequence\n给定一个整数数组 nums，返回最长严格递增子序列的长度。',
      back: 'DP：dp[i] = max(dp[j] + 1)，对 j < i 且 nums[j] < nums[i]。用二分查找 + tails 数组优化。\n时间：优化 O(n log n) / 基础 O(n^2)，空间：O(n)\n关键：耐心排序——维护最小尾部数组',
    },
    '152. Maximum Product Subarray\nGiven an integer array nums, find a contiguous subarray with the largest product.': {
      front: '152. Maximum Product Subarray\n给定一个整数数组 nums，找出乘积最大的连续子数组。',
      back: '在每个位置同时跟踪 maxProduct 和 minProduct（负数 * 负数 = 正数）。\n时间：O(n)，空间：O(1)\n关键：同时跟踪最小乘积——负数可以翻转为最大值',
    },
    '416. Partition Equal Subset Sum\nGiven an integer array nums, return true if you can partition it into two subsets with equal sum.': {
      front: '416. Partition Equal Subset Sum\n给定一个整数数组 nums，判断是否能将其分割成两个和相等的子集。',
      back: '0/1 背包 DP：target = totalSum / 2。dp[j] = true 如果和 j 可达。\n时间：O(n * sum)，空间：O(sum)\n关键：转化为子集和 = totalSum / 2 的问题',
    },
    '32. Longest Valid Parentheses\nGiven a string containing just \'(\' and \')\', find the length of the longest valid parentheses substring.': {
      front: '32. Longest Valid Parentheses\n给定一个只包含 \'(\' 和 \')\' 的字符串，找出最长有效括号子串的长度。',
      back: '基于栈：压入索引；匹配时，长度 = i - stack.top()。或 DP：dp[i] 取决于 dp[i-2] 或 dp[i-dp[i-1]-2]。\n时间：O(n)，空间：O(n)\n关键：栈存储未匹配索引作为边界',
    },
    // ── Multidimensional DP ──
    '62. Unique Paths\nA robot on an m x n grid can only move right or down. How many unique paths from top-left to bottom-right?': {
      front: '62. Unique Paths\n一个机器人在 m x n 网格上只能向右或向下移动。从左上角到右下角有多少条不同的路径？',
      back: 'DP：dp[i][j] = dp[i-1][j] + dp[i][j-1]。第一行和第一列全为 1。\n时间：O(m*n)，空间：O(n)\n关键：经典网格 DP——上方和左方之和',
    },
    '64. Minimum Path Sum\nGiven a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum.': {
      front: '64. Minimum Path Sum\n给定一个 m x n 的非负整数网格，找一条从左上角到右下角的路径使得路径上的数字总和最小。',
      back: 'DP：dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])。\n时间：O(m*n)，空间：O(n)\n关键：网格 DP 取上方或左方的最小值',
    },
    '5. Longest Palindromic Substring\nGiven a string s, return the longest palindromic substring.': {
      front: '5. Longest Palindromic Substring\n给定一个字符串 s，返回 s 中最长的回文子串。',
      back: '以每个字符为中心向两边扩展（奇数长度），以每对字符为中心扩展（偶数长度）。或 DP：dp[i][j] = s[i]==s[j] && dp[i+1][j-1]。\n时间：O(n^2)，空间：扩展法 O(1) / DP O(n^2)\n关键：从中心扩展更简单且节省空间',
    },
    '72. Edit Distance\nGiven two strings word1 and word2, return the minimum number of operations (insert, delete, replace) to convert word1 to word2.': {
      front: '72. Edit Distance\n给定两个单词 word1 和 word2，返回将 word1 转换为 word2 所需的最少操作数（插入、删除、替换）。',
      back: 'DP：dp[i][j] = min(插入: dp[i][j-1]+1, 删除: dp[i-1][j]+1, 替换: dp[i-1][j-1]+(0 或 1))。\n时间：O(m*n)，空间：O(min(m,n))\n关键：三种操作映射到三个 DP 转移',
    },
    // ── Graph ──
    '200. Number of Islands\nGiven a 2D grid of \'1\'s (land) and \'0\'s (water), count the number of islands.': {
      front: '200. Number of Islands\n给定一个由 \'1\'（陆地）和 \'0\'（水）组成的二维网格，计算岛屿的数量。',
      back: '从每个未访问的 \'1\' 开始 DFS/BFS，将所有相连的陆地标记为已访问。每个连通分量计数加一。\n时间：O(m*n)，空间：O(m*n)\n关键：洪水填充标记连通分量',
    },
    '207. Course Schedule\nThere are n courses with prerequisites. Determine if you can finish all courses (no cycle in directed graph).': {
      front: '207. Course Schedule\n有 n 门课程有先修要求。判断你是否能完成所有课程（有向图中无环）。',
      back: '拓扑排序（BFS 配合入度）或 DFS 环检测。\n时间：O(V+E)，空间：O(V+E)\n关键：有向图中的环检测',
    },
    '208. Implement Trie (Prefix Tree)\nImplement a trie with insert, search, and startsWith methods.': {
      front: '208. Implement Trie (Prefix Tree)\n实现一个 Trie（前缀树），包含 insert、search 和 startsWith 方法。',
      back: '每个节点有子节点数组/映射 + isEnd 标志。插入：创建路径。搜索：沿路径查找，检查 isEnd。\n时间：每次操作 O(m)，空间：O(n*m)\n关键：每个节点 26 个子节点的数组',
    },
    // ── Heap / Priority Queue ──
    '215. Kth Largest Element in an Array\nGiven an integer array nums and an integer k, return the kth largest element.': {
      front: '215. Kth Largest Element in an Array\n给定一个整数数组 nums 和一个整数 k，返回第 k 大的元素。',
      back: '快速选择（像快排一样分区，只递归一侧）。或大小为 k 的最小堆。\n时间：快速选择平均 O(n) / 堆 O(n log k)，空间：O(1) / O(k)\n关键：快速选择使用随机枢轴平均 O(n)',
    },
    '347. Top K Frequent Elements\nGiven an integer array nums and an integer k, return the k most frequent elements.': {
      front: '347. Top K Frequent Elements\n给定一个整数数组 nums 和一个整数 k，返回出现频率前 k 高的元素。',
      back: 'HashMap 统计频率，然后大小为 k 的最小堆。或按频率桶排序。\n时间：桶排序 O(n) / 堆 O(n log k)，空间：O(n)\n关键：桶排序——索引 = 频率，O(n) 时间',
    },
    '295. Find Median from Data Stream\nDesign a data structure that supports adding numbers and finding the median.': {
      front: '295. Find Median from Data Stream\n设计一个数据结构，支持添加数字和查找中位数。',
      back: '两个堆：最大堆存较小的一半，最小堆存较大的一半。平衡两堆大小。\n时间：添加 O(log n)，中位数 O(1)，空间：O(n)\n关键：两个堆在中位数处分割——每次添加后平衡大小',
    },
    // ── Bit Manipulation ──
    '136. Single Number\nGiven a non-empty array where every element appears twice except for one, find that single one.': {
      front: '136. Single Number\n给定一个非空数组，其中每个元素出现两次，只有一个出现一次，找出那个只出现一次的元素。',
      back: '对所有元素做异或运算。a ^ a = 0，a ^ 0 = a。结果就是那个唯一的数。\n时间：O(n)，空间：O(1)\n关键：异或消除重复',
    },
    // ── Matrix ──
    '73. Set Matrix Zeroes\nGiven an m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.': {
      front: '73. Set Matrix Zeroes\n给定一个 m x n 矩阵，如果一个元素为 0，则将其所在行和列全部设为 0。要求原地操作。',
      back: '使用第一行和第一列作为标记。第一行/列本身用单独的标志。\n时间：O(m*n)，空间：O(1)\n关键：第一行/列作为原地标记数组',
    },
    '54. Spiral Matrix\nGiven an m x n matrix, return all elements in spiral order.': {
      front: '54. Spiral Matrix\n给定一个 m x n 矩阵，按螺旋顺序返回所有元素。',
      back: '维护四个边界：top、bottom、left、right。遍历并收缩边界。\n时间：O(m*n)，空间：O(1)\n关键：四边界螺旋遍历',
    },
    '48. Rotate Image\nRotate the image (n x n 2D matrix) by 90 degrees clockwise in-place.': {
      front: '48. Rotate Image\n将图像（n x n 二维矩阵）原地顺时针旋转 90 度。',
      back: '先转置矩阵，再翻转每一行。或每次旋转四个单元格。\n时间：O(n^2)，空间：O(1)\n关键：转置 + 翻转行 = 顺时针旋转 90°',
    },
    '240. Search a 2D Matrix II\nSearch for a target in an m x n matrix where rows and columns are sorted in ascending order.': {
      front: '240. Search a 2D Matrix II\n在行列均升序排列的 m x n 矩阵中搜索目标值。',
      back: '从右上角开始。如果 target < 当前值，向左移动；如果 target > 当前值，向下移动。\n时间：O(m + n)，空间：O(1)\n关键：从右上角搜索，每步消除一行或一列',
    },
    // ── Techniques ──
    '169. Majority Element\nGiven an array nums, return the majority element (appears more than n/2 times).': {
      front: '169. Majority Element\n给定一个数组 nums，返回多数元素（出现次数超过 n/2 次）。',
      back: 'Boyer-Moore 投票算法：维护候选人和计数。当计数为 0 时切换候选人。\n时间：O(n)，空间：O(1)\n关键：多数元素在抵消中存活',
    },
    '75. Sort Colors\nGiven an array with n objects colored red (0), white (1), and blue (2), sort them in-place.': {
      front: '75. Sort Colors\n给定一个包含 n 个对象的数组，颜色为红色（0）、白色（1）和蓝色（2），原地排序。',
      back: '荷兰国旗问题：三个指针——low、mid、high。将 0 交换到前面，2 交换到后面。\n时间：O(n)，空间：O(1)\n关键：一次遍历的三路分区',
    },
    '31. Next Permutation\nImplement next permutation which rearranges numbers into the next lexicographically greater permutation.': {
      front: '31. Next Permutation\n实现下一个排列，将数字重新排列成字典序中的下一个更大排列。',
      back: '1) 找到最大的 i 使得 a[i] < a[i+1]，2) 找到最大的 j 使得 a[j] > a[i]，3) 交换，4) 反转后缀。\n时间：O(n)，空间：O(1)\n关键：找到最右上升点，与最小的更大元素交换，反转尾部',
    },
    '287. Find the Duplicate Number\nGiven an array of n+1 integers in range [1, n], find the one duplicate number without modifying the array.': {
      front: '287. Find the Duplicate Number\n给定一个包含 n+1 个整数的数组，范围在 [1, n] 内，在不修改数组的情况下找出唯一的重复数。',
      back: 'Floyd 环检测应用于索引-值映射。slow = nums[slow]，fast = nums[nums[fast]]。\n时间：O(n)，空间：O(1)\n关键：数组作为隐式链表——重复值形成环',
    },
    // ── Intervals ──
    '56. Merge Intervals\nGiven an array of intervals, merge all overlapping intervals.': {
      front: '56. Merge Intervals\n给定一个区间数组，合并所有重叠的区间。',
      back: '按起始时间排序。如果当前起始 <= 前一个结束则合并。更新结束为 max(prev.end, curr.end)。\n时间：O(n log n)，空间：O(n)\n关键：排序后贪心合并重叠部分',
    },
    // ── Design / Other ──
    '238. Product of Array Except Self\nGiven an integer array nums, return an array where answer[i] is the product of all elements except nums[i], without using division.': {
      front: '238. Product of Array Except Self\n给定一个整数数组 nums，返回一个数组，其中 answer[i] 等于 nums 中除 nums[i] 之外所有元素的乘积，不能使用除法。',
      back: '两次遍历：从左到右的前缀积，然后从右到左的后缀积乘进去。\n时间：O(n)，空间：O(1)（不计输出数组）\n关键：每个位置的前缀积 * 后缀积',
    },
    '41. First Missing Positive\nGiven an unsorted integer array nums, return the smallest missing positive integer in O(n) time and O(1) space.': {
      front: '41. First Missing Positive\n给定一个未排序的整数数组 nums，在 O(n) 时间和 O(1) 空间内返回最小的缺失正整数。',
      back: '循环排序：将每个数字放到索引 (num - 1) 的位置。然后扫描第一个不匹配的位置。\n时间：O(n)，空间：O(1)\n关键：原地哈希——nums[i] 应该在索引 nums[i]-1 处',
    },
    '621. Task Scheduler\nGiven tasks array and cooldown n, return the least intervals the CPU will take to finish all tasks.': {
      front: '621. Task Scheduler\n给定任务数组和冷却时间 n，返回 CPU 完成所有任务所需的最少间隔数。',
      back: '最高频任务决定帧大小。结果 = (maxFreq - 1) * (n + 1) + countOfMax。取与总任务数的较大值。\n时间：O(n)，空间：O(1)\n关键：基于帧的贪心——围绕最高频任务填充空位',
    },
    '647. Palindromic Substrings\nGiven a string s, return the number of palindromic substrings in it.': {
      front: '647. Palindromic Substrings\n给定一个字符串 s，返回其中回文子串的数量。',
      back: '以每个中心点扩展（2n-1 个中心点用于奇数和偶数长度）。统计所有找到的回文。\n时间：O(n^2)，空间：O(1)\n关键：与最长回文子串相同的从中心扩展方法',
    },
    '494. Target Sum\nGiven an integer array nums and a target, assign + or - to each integer, find number of ways to achieve target sum.': {
      front: '494. Target Sum\n给定一个整数数组 nums 和一个目标值，为每个整数分配 + 或 - 号，找出达到目标和的方法数。',
      back: 'DP 子集和：找和为 (totalSum + target) / 2 的子集数量。dp[j] += dp[j - num]。\n时间：O(n * sum)，空间：O(sum)\n关键：转化为子集和问题：P = (sum + target) / 2',
    },
    '338. Counting Bits\nGiven an integer n, return an array where ans[i] is the number of 1\'s in binary representation of i, for 0 <= i <= n.': {
      front: '338. Counting Bits\n给定一个整数 n，返回一个数组，其中 ans[i] 是 i 的二进制表示中 1 的个数，0 <= i <= n。',
      back: 'DP：ans[i] = ans[i >> 1] + (i & 1)。或 ans[i] = ans[i & (i-1)] + 1。\n时间：O(n)，空间：O(n)\n关键：位运算 DP——利用之前计算的值',
    },
  },
};

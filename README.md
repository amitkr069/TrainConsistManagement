### Use Case 19: Binary Search for Bogie ID (Optimized Searching)


#### Goal was to -> 
Find a bogie ID efficiently using binary search on sorted data.



#### Flow ->

User provides sorted bogie IDs.

User provides a search key.

System initializes low and high indexes.

System finds the middle index.

Key is compared with middle value.

Search range is halved.

Steps repeat until found or exhausted.

Result is displayed.

Program continues.


#### Key Concepts Used in Use Case 19

Binary Search – An optimized searching technique that repeatedly divides the search range in half.

Divide-and-Conquer Strategy – Breaks the problem into smaller parts each iteration.

Sorted Data Precondition – Binary search only works correctly on ordered data.

Index-Based Traversal – Uses low, high, and mid positions for navigation.

String Comparison – Uses compareTo() for lexicographic ordering checks.

Time Complexity Awareness – Demonstrates O(log n) efficiency compared to O(n).



#### Key Benefits

Improves search performance drastically.

Introduces algorithmic optimization concepts.

Shows importance of preconditions.

Builds efficient lookup capability.

Complements UC18 with an advanced technique.

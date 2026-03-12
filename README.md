### Use Case 13: Performance Comparison (Loops vs Streams)

Here we are filtering the list by capacity and storing in list and comparing the performances of loop and stream.


#### Goal was to -> 
Compare performance of loop-based logic versus stream-based logic using time measurement.



#### Flow -> 

User prepares a collection of bogies.

System records start time using System.nanoTime().

Filtering is performed using a loop or stream.

System records end time.

Elapsed time is calculated.

Execution time is displayed.

Program continues.


#### Key Concepts Used in Use Case 13

System.nanoTime() – Provides high-resolution time measurement used for benchmarking small blocks of code accurately.

Performance Benchmarking – Technique to evaluate how long a specific operation takes to execute.

Loop-Based Processing – Traditional iteration using for or enhanced for loops for filtering logic.

Stream-Based Processing – Declarative iteration using Stream API pipelines such as filter() and collect().

Micro-Measurement Awareness – Teaches that small code sections require precise timing instead of coarse clocks like milliseconds.

Evidence-Driven Optimization – Encourages decisions based on measured results rather than intuition.


#### Key Benefits

Introduces performance awareness to students.

Demonstrates practical benchmarking techniques.

Compares imperative and declarative styles.

Avoids premature optimization assumptions.

Builds mindset of measurement-driven development.

Please refer to the output after compiling and running the Program

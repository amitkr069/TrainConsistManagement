#### Use Case 10: Count Total Seats in Train (reduce)

In this use case we are displaying the total capacity of the train using map and reduce in stream API.

##### Goal was to -> 
Aggregate seating capacities into a single total value using Stream reduction.


#### Flow

User creates a list of bogies.

System converts the list into a stream

map() extracts capacity values

reduce() sums the capacities.

Total seating capacity is displayed.

Program continues.


#### Key Concepts Used in Use Case 10

map() Operation – Transforms each bogie object into its numeric capacity value so that mathematical operations can be applied.

reduce() Method – Combines multiple values into a single result, such as summing all seat capacities into one total number.

Method Reference – Uses concise syntax like Integer::sum to define aggregation logic clearly.

Functional Aggregation – Replaces manual loops with declarative computation pipelines.

Stream Pipeline – Chains transformation and aggregation steps into a single readable flow.

Numeric Analytics – Enables quantitative analysis over collection data for planning purposes.



#### Key Benefits

Introduces aggregation logic in functional style.

Provides real operational metrics for the train.

Improves planning and utilization analysis.

Replaces error-prone manual summation loops.

Builds foundation for advanced analytics use cases.






Please refer to the output after compiling and running the Program

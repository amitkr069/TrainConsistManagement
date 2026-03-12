### Use Case 12: Safety Compliance Check for Goods Bogies

Here we are performing a safety compliance check for the cargo type and its bogit type using stream


#### Goal was to -> 
Encapsulate bogie rules using functional interfaces and apply them using lambda expressions.


#### Flow -> 

User prepares a list of goods bogies.

System converts the list into a stream.

allMatch() checks every bogie against safety rules.

Conditional logic verifies cylindrical bogie cargo.

If all checks pass, the train is marked safe.

Result is displayed to the user.

Program continues.



#### Key Concepts Used in Use Case 12

Streams API – Provides a declarative way to process collections by transforming and validating data without manual loops.

allMatch() Terminal Operation – Evaluates whether every element in the stream satisfies a given condition, ideal for safety compliance checks.

Lambda Expressions – Express validation rules inline, making business logic readable and concise.

Conditional Logic in Streams – Combines logical operators inside stream predicates to enforce domain-specific constraints.

Short-Circuit Evaluation – Stops processing as soon as a rule fails, improving performance and safety validation speed.

Business Rule Modeling – Converts real-world safety policies into executable Java logic.


#### Key Benefits

Enforces real-world safety constraints programmatically.

Prevents unsafe cargo configurations early.

Introduces stream-based validation patterns.

Replaces manual loops with declarative rules.

Improves reliability of train formation logic.

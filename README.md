### Use Case 20: Exception Handling During Search Operations


#### Goal was to -> 
Prevent search operations on an empty train by throwing an exception early.


#### Flow

User triggers a search operation.

System checks whether the bogie collection is empty.

If no bogies are available, the system throws an IllegalStateException.

The operation stops immediately.

User receives a meaningful error message.



#### Key Concepts Used in Use Case 20

Defensive Programming – A coding approach where the system validates conditions before performing operations to avoid invalid execution paths.

IllegalStateException – A runtime exception used when a method is invoked at an inappropriate time or state, such as searching when no data exists.

Fail-Fast Principle – The idea of stopping execution as soon as an invalid condition is detected instead of letting the program continue incorrectly.

State Validation – Ensures the train has bogies before attempting any search logic.

Runtime Exception Handling – Demonstrates how Java handles unchecked exceptions during execution without forcing callers to catch them.



#### Key Benefits

Prevents invalid operations early.

Improves system reliability.

Makes error handling explicit and readable.

Introduces real-world defensive coding practices.

Teaches students when and why to throw runtime exceptions.

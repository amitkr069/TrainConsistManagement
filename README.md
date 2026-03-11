### Use Case 8: Filter Passenger Bogies Using Streams

In this use case we are using stream API to filter list.


##### Goal was to -> 
Filter passenger bogies using Stream pipelines based on seating capacity.


##### Flow of this use case

User creates a list of bogies.

The system converts the list into a stream.

filter() is applied with a condition.

Matching bogies are collected into a new list.

Filtered bogies are displayed.

Program continues.


 
#### Key Concepts Used in Use Case 8

Stream API – A modern Java feature that processes collections in a declarative style, allowing operations such as filtering, mapping, and aggregation without manual loops.

stream() Method – Converts a collection into a stream pipeline so that functional operations can be applied to bogie data.

filter() Operation – Selects elements that satisfy a given condition, such as capacity greater than a specific value.

Lambda Expressions – Provide concise behavior definition for filtering logic instead of long conditional loops.

collect() / toList() – Converts the processed stream back into a collection that can be stored or displayed.

Declarative Programming Style – Focuses on what to do instead of how to iterate, improving readability and intent clarity.



#### Key Benefits

Reduces boilerplate looping code.

Improves clarity of business rules.

Introduces functional-style programming in Java.

Enhances maintainability of collection processing.

Prepares us for advanced stream operations in later use cases

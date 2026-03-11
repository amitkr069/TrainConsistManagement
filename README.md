### Use Case 7: Sort Bogies by Capacity (Comparator)

In this use case we are sorting the list based on capacity using comparator.

##### Goal was to -> 
Sort passenger bogies based on their seating capacity using a custom Comparator.



##### Flow of this use case:

User creates passenger bogie objects.

Bogies are stored in a List.

The system applies a Comparator to sort by capacity.

Sorted bogies are displayed in order.

Program continues.


##### Key Concepts Used in UC7

Comparator Interface – A functional interface in Java used to define custom comparison logic so that objects can be ordered based on business rules instead of natural ordering.

Custom Objects – Bogies are modeled as Java objects with properties such as name and capacity, allowing richer behavior than simple strings.

List Collection – Stores multiple bogie objects dynamically so that sorting and iteration can be applied easily.

sort() Method – Applies the Comparator logic to rearrange elements in the list according to the defined comparison criteria.

Lambda Expressions – Provide a concise way to express comparison logic without creating separate classes.

Separation of Data and Logic – Keeps bogie data independent from sorting behavior, improving maintainability and clarity.



##### Key Benefits

Introduces object-based collection handling instead of primitive lists.

Teaches students how to apply business rules during sorting.

Improves train planning and capacity analysis.

Demonstrates clean separation between data structure and behavior.

Prepares us for enterprise-level collection processing.

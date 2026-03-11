### Use Case 9: Group Bogies by Type (Collectors.groupingBy)

In this use case we are grouping by the name of the Bogie type and storing it in map.


##### Goal was to -> 
Group bogies into categories using Stream collectors.


##### Flow

User creates a list of bogies.

System converts the list into a stream.

groupingBy() collector is applied.

Bogies are grouped into a Map.

Grouped result is displayed.

Program continues.


#### Key Concepts Used in Use Case 9

Collectors.groupingBy() – A stream collector that classifies elements based on a key function and stores them into a Map where each key represents a group of bogies.

Stream Pipeline – A sequence of operations applied on data, allowing transformation from a list into a structured grouped result.

Map Output Structure – groupingBy produces a Map where the key represents the category and the value represents the list of bogies belonging to that category.

Lambda Classification Logic – Defines how bogies are categorized, such as grouping by bogie name or type.

Data Aggregation – Collects multiple elements into logical clusters for easier analysis and reporting.

Structured Transformation – Converts flat data into hierarchical organization suitable for dashboards and planning.



#### Key Benefits

Transforms flat collections into meaningful structures.

Supports reporting and monitoring use cases.

Introduces advanced stream collectors.

Improves readability and organization of data.

Builds foundation for analytics and dashboards.

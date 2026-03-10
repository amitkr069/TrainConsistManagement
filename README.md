### Use Case 3: Track Unique Bogie IDs (Set – HashSet)

In this use case - adding, removing and checking bogies has been implemented using set.

To enforce uniqueness, Set data structure has been introduced.

Goal was to -> Ensure no duplicate bogie IDs are added to the train.

Actor: User

##### Flow of this use case -> 

User adds bogie IDs

System inserts into HashSet

Duplicates are ignored

Unique IDs are displayed.



##### Key Concepts Used in Use Case 3

HashSet – Stores unique elements.

Set Interface – Collection type that does not allow duplicate elements.

HashSet – Implementation of Set that stores elements using hashing for fast access.

add() Method – Inserts values into the set.

Automatic Deduplication – HashSet ensures uniqueness without manual checks.

Unordered Storage – Elements are not stored using index positions.



##### Key Benefits

Enforces business constraints.

Prevents data corruption.

Teaches students when to use Set instead of List.

Introduces uniqueness as a real-world requirement.

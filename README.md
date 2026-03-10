### Use Case 4: Maintain Ordered Bogie IDs

In this use case we are adding, removing bogies from front and rear both.
also we are adding bogie at a given position.

Data Structures used -> Linked List and HashSet;


Goal was to -> Ensure no duplicate bogie IDs are added to the train.



##### Flow of this use case is ->

User adds bogie IDs

System inserts into HashSet

Duplicates are ignored

Unique IDs are displayed.


##### Key Concepts Used in Use Case 4

LinkedList – A doubly linked list implementation of the List interface where elements are connected using node references instead of indexes.

Node Structure Concept – Each element contains data and links to previous and next nodes, enabling efficient insertions and deletions.

addFirst() / addLast() – Methods to attach bogies at the beginning or end of the train.

add(index, element) – Inserts a bogie in the middle of the consist.

removeFirst() / removeLast() – Detaches bogies from the head or tail.

Order Preservation – Maintains the physical sequence of train bogies.


##### Key Benefits

Models real-world chaining behavior.

Teaches when LinkedList is better than ArrayList.

Demonstrates insertion and deletion efficiency.

Helps us visualize node-based structures.

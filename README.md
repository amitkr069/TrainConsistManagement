### Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

Here we are handling the exceptions.
if capacity is <= 0 then the system will throw an error and bogie cannot be added.


#### Goal ->
Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.


#### Flow

User attempts to create a passenger bogie.

System validates the capacity value.

If capacity ≤ 0, a custom exception is thrown.

If capacity is valid, the bogie is created successfully

System continues execution safely.


#### Key Concepts Used in Use Case 14

Custom Exception – A user-defined exception class that represents domain-specific errors such as invalid bogie capacity.

Exception Inheritance – Creating a new exception by extending Exception to represent checked exceptions.

throw Keyword – Used to explicitly raise an exception when business rules are violated.

throws Declaration – Declares that a method or constructor may pass an exception to the caller.

Fail-Fast Validation – Detects errors early and stops incorrect object creation.

Business Rule Enforcement – Encapsulates railway constraints directly into object construction logic.


#### Key Benefits

Protects the system from corrupted input.

Encapsulates validation inside domain objects.

Introduces checked exceptions clearly.

Encourages defensive programming.

Prevents downstream failures in later use cases.

Please refer to the output after compiling and running the Program

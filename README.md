### Use Case 15: Safe Cargo Assignment Using try-catch-finally

Here we are taking input as cargo type and its shape.
if cargo type is petroleum and shape is not cylindrical then the system will throw error

#### Goal was to ->
Safely handle unsafe cargo assignments without crashing the Train Consist Management App.


#### Flow

User attempts to assign cargo to a goods bogie.

System checks shape and cargo compatibility.

If unsafe, an exception is thrown.

Exception is caught in the catch block.

An error message is displayed.

finally block executes cleanup or logging.

Program continues safely.



#### Key Concepts Used in Use Case 15

try-catch-finally – Structured blocks used to detect, handle, and finalize exception-prone logic.

Runtime Exception – An unchecked exception raised during program execution rather than compile time.

Custom Runtime Exception – Domain-specific exception for unsafe cargo assignments.

throw Keyword – Used to signal unsafe operational conditions.

Graceful Failure Handling – Prevents application crashes while informing the user properly.

finally Block – Executes mandatory logic such as logging or cleanup whether an exception occurs or not.


#### Key Benefits

Improves runtime safety of cargo operations.

Demonstrates checked vs unchecked exception usage.

Teaches structured error handling.

Ensures system stability during failures.

Encourages defensive operational coding.

Please refer to the output after compiling and running the Program

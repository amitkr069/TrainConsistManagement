### Use Cse 11: Validate Train ID & Cargo Codes (Regex)


#### Goal was to -> 
Validate Train ID and Cargo Code formats using Regular Expressions.



#### Flow was -> 

The user enters the Train ID and Cargo Code.

System compiles a regex pattern.

Matcher checks input against the pattern.

If the format matches, input is accepted.

If not, validation fails, and an error message is shown.

Program continues.


#### Key Concepts Used in Use Case 11

Regular Expressions (Regex) – A pattern language used to describe valid text formats, enabling the system to enforce structure rules such as TRN-1234.

Pattern Class – Represents a compiled regular expression that can be reused to validate multiple inputs efficiently.

Matcher Class – Applies a Pattern to a given input string and determines whether the input matches the required format.

matches() Method – Verifies whether the entire input string conforms exactly to the regex pattern.

Format Enforcement – Ensures that Train IDs and Cargo Codes follow strict business rules before being processed further.

Data Integrity Validation – Prevents malformed data from entering the system and corrupting train operations.



#### Key Benefits

Ensures correctness of user and system input.

Protects downstream processing from invalid data.

Introduces regex-based validation techniques.

Teaches students format enforcement in enterprise applications.

Builds foundation for robust input handling.

Please refer to the output after compiling and running the Program

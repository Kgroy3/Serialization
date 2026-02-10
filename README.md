
# Serialization & Deserialization – Object Persistence
This project demonstrates **Java Serialization and Deserialization** to achieve **object persistence**, allowing an object's state to be saved to a file and restored later.

# Concepts Covered
- Serialization and Deserialization in Java
- `Serializable` interface
- `ObjectOutputStream` and `ObjectInputStream`
- Importance of `serialVersionUID`
- Use of `transient` keyword
- Handling `ClassNotFoundException`
- Real-world use of object persistence
# Technologies Used
- Java
- Java Serialization API
- Eclipse ide
- 
# project Structure
||─ Student.java ──Serialization.java ── README.md

## Program Description
 # Student Class
  - Implements `Serializable`
  - Contains:
  - `id`
  - `name`
  - `password` (marked as `transient`)

# Serialization
- Object state is saved to `student.ser` using `ObjectOutputStream`

# Deserialization
- Object is restored from file using `ObjectInputStream`
- Transient fields are not restore 


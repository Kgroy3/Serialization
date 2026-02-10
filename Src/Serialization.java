import java.io.*;

public class Serialization {

    public static void main(String[] args) {

        Student student = new Student(101, "Krishna", "secret123");

        // 🔹 Serialization
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(student);
            out.close();
            System.out.println("Object Serialized Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 🔹 Deserialization
        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("student.ser"));
            Student restoredStudent = (Student) in.readObject();
            in.close();

            System.out.println("ID: " + restoredStudent.getId());
            System.out.println("Name: " + restoredStudent.getName());
            System.out.println("Password: " + restoredStudent.getPassword()); // null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

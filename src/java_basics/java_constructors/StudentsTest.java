package java_basics.java_constructors;

public class StudentsTest {
    public static void main(String[] args) {
        // create an object of class Student
        Students student = new Students(1, "malek");
        //calling the method print using the reference variable student
        student.print();
    }
}

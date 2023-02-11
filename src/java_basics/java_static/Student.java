package java_basics.java_static;

import java_basics.java_constructors.Students;

public class Student {
    int id;
    String name;
    static String course;

    public Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public static void assignCourse(String courseName) {
        course = courseName;
    }

    public void printCourse() {
        System.out.println(course);
    }
}

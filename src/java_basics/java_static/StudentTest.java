package java_basics.java_static;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1,"anika");
        Student student1 = new Student(2,"malek");
        //assignCourse is shared with all object
        Student.assignCourse("java selenium");
        student.printCourse();

    }
}

package learSinglton;

public class Student {

     static Student student;
    public static String name;

    private Student (String name){
        this.name = name;
    }

    public static Student getStudent(String name){
        if(student == null){
            student = new Student(name);
        }
        return student;
    }
}

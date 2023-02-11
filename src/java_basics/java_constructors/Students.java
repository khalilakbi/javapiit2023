package java_basics.java_constructors;

public class Students {
    int id;
    String name;

    //parameterized constructor.
    public Students(int studentId, String studentName){
        id = studentId;
        name = studentName;
    }

    //method

    public void print(){
        System.out.println(id+" "+name);
    }

}

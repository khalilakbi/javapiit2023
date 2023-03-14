package learSinglton;

public class TestStudent {
    public static void main(String[] args) {
        Student.getStudent("mehnaz");
        Student.getStudent("sharmin");
        System.out.println(Student.name);
        System.out.println(Student.name);

    }
}

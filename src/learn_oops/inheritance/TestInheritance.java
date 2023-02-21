package learn_oops.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
//        Person person = new Person(24,"sharmin");
//        person.assignLastName("malek");
//        person.printInfo();
//        Employer employer = new Employer(34, "malak",100000);
//        employer.assignLastName("just at");
//        employer.printInfo();

        Tester tester = new Tester(23,"malek",10000,1000);
        tester.assignLastName("arup");
        tester.printInfo();
        Developer developer = new Developer(23,"malek",10000,1000);
        developer.assignLastName("malek");
        developer.printInfo();
    }
}

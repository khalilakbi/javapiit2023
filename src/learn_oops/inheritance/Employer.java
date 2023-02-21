package learn_oops.inheritance;

public class Employer extends Person{
    int salary;
    public Employer(int age,String name,int salary){
        super(age,name);// Person(123,"sharmin")
        this.salary = salary;
    }

}

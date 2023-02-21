package learn_oops.inheritance;

public class Tester extends Employer{
    int bonus;
    public Tester(int age,String name,int salary,int bonus){
        super(age,name,salary);
        this.bonus = bonus;
    }
}

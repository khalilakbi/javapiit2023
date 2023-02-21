package learn_oops.inheritance;

public class Developer extends Employer{
    int bonus;
    public Developer(int age,String name,int salary,int bonus){
        super(age,name,salary);
        this.bonus = bonus;
    }
}

package learn_oops.inheritance;

public class Person {

    int age;
    String name;
    String lastName;
    public Person(int age, String name){//this is a reference variable refer to current class
        this.age = age;
        this.name = name;

    }

    public void assignLastName(String lastName){
        this.lastName = lastName;
    }
    public void printInfo(){
        System.out.println(age +" "+name+" "+ lastName);
    }

}

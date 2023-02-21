package learn_oops.absraction;

public class BMW extends Car{
    @Override
    public void drive() {
        System.out.println("bmw is driving");
    }

    @Override
    public void stop() {
        System.out.println("bmw is stopped");
    }
    public void bmwDoSomething(){
        System.out.println("doing something");
    }
}

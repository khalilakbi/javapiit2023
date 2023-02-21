package learn_oops.absraction;

public class TestAbstrction {
    public static void main(String[] args) {
        //Car c = new Car();// can't create instance of absract class
        Car c = new BMW();
        c.stop();
        BMW b = new BMW();
        b.stop();
        b.bmwDoSomething();
    }
}

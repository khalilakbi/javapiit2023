package learn_oops.learn_interface;

public class TestInterface {
    public static void main(String[] args) {
       WebDriver d = new Chrome();
       d.open();

       Chrome c = new Chrome();
       c.closeChrome();
    }
}

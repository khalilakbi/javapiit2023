package learn_oops.learn_interface;

public class Chrome implements WebDriver{

    @Override
    public void clickOnElement() {
        System.out.println("we click on element");
    }

    @Override
    public void enterText() {
        System.out.println("we enter a text");
    }

    @Override
    public void open() {
        System.out.println("We open browser");
    }

    @Override
    public void search() {
        System.out.println("we search element");
    }

    @Override
    public void minimize() {
        System.out.println("we minimize browser");
    }
    public void closeChrome(){
        System.out.println("we close chome");
    }
}

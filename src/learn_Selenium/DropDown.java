package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class DropDown {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        WebElement element = driver.findElement(By.id("select-demo"));
        Select select = new Select(element);
        select.selectByVisibleText("Wednesday");
        System.out.println(select.isMultiple());




    }
}

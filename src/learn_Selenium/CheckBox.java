package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class CheckBox {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> listCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        listCheckBox.get(1).click();
        System.out.println(listCheckBox.get(1).isSelected());
//        for(WebElement element : listCheckBox){
//            element.click();
//        }
    }
}

package learn_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class HandleAlert {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        driver.findElement(By.xpath("//button[@class='btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900']")).click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
    }
}

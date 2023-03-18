package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BrowserMethods {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement element = driver.findElement(By.name("q"));
        System.out.println(element.getCssValue("margin-top"));
//        element.sendKeys("selenium", Keys.ENTER);
//        String tetile  = driver.getTitle();
//        System.out.println(tetile);
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        System.out.println(driver.getPageSource());
    }
}

package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Set;

public class HandleNewWindow {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
        String id1 = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title='Follow @Lambdatesting on Twitter']")).click();
        Set<String> ids = driver.getWindowHandles();
        for(String s : ids){
            if(!s.equals(id1)){
                driver.switchTo().window(s);
            }
        }
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().defaultContent();
    }
}

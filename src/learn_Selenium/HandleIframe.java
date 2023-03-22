package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class HandleIframe {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        //driver.switchTo().frame("frame1"); //switch using id
        driver.switchTo().frame(frame);

        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
    }
}

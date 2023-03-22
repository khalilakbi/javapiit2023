package learn_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class LearnTestNg {
    WebDriver driver;
    @BeforeMethod//@BeforeClass//@BeforeSuite//@BeforeTest
    public void setUp(){
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Test(priority = 1)
    public void testValidLogin() throws InterruptedException {
        String exxpected = "Paul Collings";

        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String actualReslt = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
        Assert.assertEquals(exxpected, actualReslt);
    }

    @Test(priority = 2)
    public void testInvalidLogin() throws InterruptedException {
        String exxpected = "Invalid credentials";

        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Ad");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
        Assert.assertEquals(exxpected,actualResult);
    }
    @AfterMethod//@AfterClass//@AfterSuite//@AfterTest
    public void tearDown(){
        driver.close();
    }
}

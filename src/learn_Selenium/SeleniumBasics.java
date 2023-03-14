package learn_Selenium;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class SeleniumBasics {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator+"resources"+File.separator+"chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator+"resources"+File.separator+"geckodriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        System.setProperty("webdriver.gecko.driver",firefoxPath);

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        chromeDriver.manage().window().maximize();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get("https://www.amazon.com/");
//        WebElement inputText = chromeDriver.findElement(By.id("user-message"));
//        inputText.sendKeys("iphone");
//        //chromeDriver.findElement(By.id("showInput")).click();
//        WebElement textOutPut = chromeDriver.findElement(By.xpath("//p[@id = 'message']"));
//        boolean isDis = textOutPut.isDisplayed();
//        System.out.println(isDis);
//        String output = textOutPut.getText();
//        System.out.println(output);
        String expected = "9";
        WebElement input1 = chromeDriver.findElement(By.id("sum1"));
        WebElement input2 = chromeDriver.findElement(By.id("sum2"));
        WebElement valueButton = chromeDriver.findElement(By.xpath("//button[text()='Get values']"));
        input1.sendKeys("3");
        input2.sendKeys("4");
        valueButton.click();
        WebElement result = chromeDriver.findElement(By.id("addmessage"));
        String actualResult = result.getText();

        try {
            Assert.assertEquals(actualResult,expected);
        }catch (ComparisonFailure ex){
            System.out.println(ex.getMessage());
        }



    }
}

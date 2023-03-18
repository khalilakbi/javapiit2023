package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class RadioButton {
    static WebDriver driver;

    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);

        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");

        clickOnRadioButton("Male");

    }

    static void clickOnRadioButton(String gender) {
        List<WebElement> listRadioButton = driver.findElements(By.xpath("//div[@class='px-10 pt-20 pb-5']//label"));
        for(WebElement element : listRadioButton){
            if(element.getText().equals(gender)){
                element.click();
            }
        }

    }
}

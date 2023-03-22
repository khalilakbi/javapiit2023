package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class DropDownNonSelect {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String value = "Indiana";
        driver.get("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
        List<WebElement> listDropDown = driver.findElements(By.xpath("//ul[@role='tree']//li"));
        for(WebElement element : listDropDown){
            if(element.getText().equals(value)){
                element.click();
                break;
            }

        }
    }
}

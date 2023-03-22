package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HandleWebTable {
    public static void main(String[] args) {
        String chromePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "chromedriver.exe";
        String firefoxPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.gecko.driver", firefoxPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/table-pagination-demo");
        //get text from cell
//        String val = driver.findElement(By.xpath("//table//tbody//tr[1]//td[3]")).getText();
//        System.out.println(val);
//        List<WebElement> listRow1 = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
//        List<String> listText = new ArrayList<>();
//        for(WebElement element : listRow1){
//            listText.add(element.getText());
//        }
//        System.out.println(listText);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                String val = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[" + j + "]")).getText();
                System.out.println(val);

            }

        }
    }
}

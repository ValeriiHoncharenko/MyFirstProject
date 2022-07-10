import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomeWork2 {
        public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                WebDriver driver = new ChromeDriver();

        //    Go to https://testautomationpractice.blogspot.com/

                driver.get("https://testautomationpractice.blogspot.com");
        //    Locate the table and locate all Authors on the table with xpath and print them on console

                List <WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td/../td[2]"));
                for(WebElement e: allColumnsInRow)
                {
                        System.out.println(e.getText());
                }
                Thread.sleep(5000);
                driver.close();

        }
}
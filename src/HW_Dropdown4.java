import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class HW_Dropdown4 {
    public static void main(String[] args) throws InterruptedException {
        String searchText = "Email";
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://demo.automationtesting.in/Register.html");
        WebElement mySelectElement = driver.findElement(By.xpath("//*[@id='Skills']"));
        mySelectElement.click();
        Select dropdown= new Select(mySelectElement);
        List<WebElement> options = dropdown.getOptions();

        for (WebElement option : options)
        {
            option.click();
            System.out.println(option.getText());
            if (option.getText().equals(searchText)) {
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
    }
}

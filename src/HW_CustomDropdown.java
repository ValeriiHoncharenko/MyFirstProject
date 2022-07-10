import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class HW_CustomDropdown {
    public static void main(String[] args) throws InterruptedException {

        String search1="Python";
        String search2="Ruby";
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='example27']//../div/button"));
        dropdown.click();
        Thread.sleep(1000);
        List<WebElement> elementPython = driver.findElements(By.xpath("//*[@id='example27']//../div//ul//li//label"));
        for (WebElement option : elementPython)
        {
            if (option.getText().equals(search1)) {
                option.click();
            }
            else if(option.getText().equals(search2)){
                option.click();
            }
        }
        driver.close();
    }
}

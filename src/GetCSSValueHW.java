import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueHW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement button = driver.findElement(By.cssSelector(".sf-with-ul"));

        String colorBtn =button.getCssValue("background-color");
        System.out.println(colorBtn);
        button.click();
        String Btn1 =button.getCssValue("background");
        System.out.println(Btn1);
        driver.quit();
    }
}
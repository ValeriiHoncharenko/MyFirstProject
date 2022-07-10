import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumJavaClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}

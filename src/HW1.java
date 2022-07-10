import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        Go to website number 1 of your choice using get() method
        driver.get("https://google.com");

//        Maximize window
        driver.manage().window().maximize();

//        Go to website number 2 of your choice using get() method
        driver.get("https://costco.com");

//        Go to website number 3 of your choice using get() method
        driver.get("https://Uber.com");

//        Go to website number 4 of your choice using navigate() method
        driver.navigate().to("https://bestbuy.com");

//        Print 4th website title on your console using getTitle() method
        String title1 = driver.getTitle();
        System.out.println("Title is " + title1);

//        Go back using back() method and Print 3rd website title
        driver.navigate().back();
        String title2 = driver.getTitle();
        System.out.println("Title is " + title2);

//        Go back using back() method and Print 2nd website URL
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println("Url is " + url);

//        Go back using back() method and Print 1st website title
        driver.navigate().back();
        String title3 = driver.getTitle();
        System.out.println("Title is " + title3);

//        Close window
            driver.close();

    }
}

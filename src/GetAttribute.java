
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String userName = "yoll-student";
        String pwd = "Bootcamp5#";
//    1st Part
//    Go to Orange HRM (http://dev-hrm.yoll.io)
        driver.get("http://dev-hrm.yoll.io");

//            Maximize window
        driver.manage().window().maximize();

//            Enter below credentials and click to Login Button
//            User-> yoll-student
        WebElement userTextBox = driver.findElement(By.id("txtUsername"));
        userTextBox.sendKeys(userName);
//    Pwd -> Bootcamp5#
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);


        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();
        Thread.sleep(5000);

//    Look for a Subscribe button on the page and return true or false if button is displayed
      WebElement buttonSubscribe = driver.findElement(By.id("Subscriber_link"));
      Boolean buttonIsDisplayed = buttonSubscribe.isDisplayed();
      System.out.println("Button Subscribe is displayed: " + buttonIsDisplayed);
        Thread.sleep(5000);

//
//2nd Part
//
// 1. Navigate to https://demo.nopcommerce.com/digital-downloads
        driver.get("https://demo.nopcommerce.com/digital-downloads");

//            2. Print values for ‘placeholder’ attribute for the search bar.
        WebElement searchBar = driver.findElement(By.id("small-searchterms"));
        System.out.println("Value placeholder attribute is: " + searchBar.getAttribute("placeholder"));
        Thread.sleep(5000);
        driver.close();
    }
}

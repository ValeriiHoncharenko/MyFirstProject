import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_CSS {
    public static void main(String[] args) throws InterruptedException {





  //  Then using child elements locate all the elements: what are human rights, topics, About Us, etc.
  //  Same locator will identify 6 elements
 //   Part 2
 //   Write CSS for Donate Button
System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        //  Visit https://www.ohchr.org/
        driver.get("https://www.ohchr.org/");




      //  Using CSS locate the navigation bar element
        driver.findElement(By.cssSelector( "#block-mainnavigationohchr"));



        Thread.sleep(5000);
        driver.close();

}
}
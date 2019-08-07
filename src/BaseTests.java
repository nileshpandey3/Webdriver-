import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    public static WebDriver driver;


    @Test
    public void goToHomeUrl(){

        System.setProperty("webdriver.chrome.driver","/Users/nileshpandey/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");
        driver.manage().window().setSize(new Dimension(1600,900));


    }
}

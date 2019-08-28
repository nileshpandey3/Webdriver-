import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    public static WebDriver driver;




    @Test
    public void goToHomeUrl() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/nileshpandey/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");
        driver.manage().window().setSize(new Dimension(1600,900));

        WebElement contactUs = driver.findElement(By.id("contact-us"));
        contactUs.click();
        /*driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.click();
        firstName.sendKeys("Nilesh");*/


        WebElement buttonCLick = ((ChromeDriver) driver).findElementById("button-clicks");
        buttonCLick.click();
        Assertions.assertTrue(((ChromeDriver) driver).findElementByXPath("//*[@id=\"button-clicks\"]").isDisplayed());
        //WebElement webElementClick = ((ChromeDriver) driver).findElementByClassName("btn btn-default btn-lg dropdown-toggle");
        driver.quit();



    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }




}


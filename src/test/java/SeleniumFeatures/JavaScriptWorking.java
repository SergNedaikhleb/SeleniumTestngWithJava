package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptWorking {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://javascriptkit.com/javatutors/event2.shtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@name='fd0']"));

        ((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");

        driver.quit();
    }
}

package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://rediffmail.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("appautomator@rediffmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebDriverWait wa = new WebDriverWait(driver, 10);
        wa.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mailList']/table/tbody/tr[2]/td[5]/table/tbody/tr/td[3]/span/div")));

        driver.findElement(By.xpath("//*[@id='mailList']/table/tbody/tr[2]/td[5]/table/tbody/tr/td[3]/span/div")).click();

        driver.quit();
    }
}

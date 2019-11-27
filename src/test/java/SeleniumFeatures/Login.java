package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class Login {

    static String encodedPassword = "QXBwaXVtMTIz";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // disable automated extension only for ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver dr = new ChromeDriver(options);

        dr.get("http://rediff.com/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        dr.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        dr.findElement(By.xpath("//*[@id='login1']")).sendKeys("appautomator@rediffmail.com");
        dr.findElement(By.xpath("//*[@id='password']")).sendKeys(getDecodedPassword());
        dr.findElement(By.xpath("//*[@type='submit']")).click();
    }

    public static String getDecodedPassword() {
        return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
    }
}

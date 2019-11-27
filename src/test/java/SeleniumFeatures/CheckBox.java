package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // disable automated extension only for ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver dr = new ChromeDriver(options);

        dr.get("http://tizag.com/htmlT/htmlcheckboxes.php");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> cb = dr.findElements(By.xpath("//div[@class='display'][1]//input[@name='sports']"));
        System.out.println(cb.size());

        for(WebElement e : cb){
            System.out.println(e.isSelected());
            System.out.println(e.getAttribute("value"));

            if (e.getAttribute("value").equals("footbal") || e.getAttribute("value").equals("baseball")){
                e.click();
            }
        }

        System.out.println("----------------------");
        for(WebElement e : cb) {
            System.out.println(e.isSelected());
        }
        dr.quit();
    }
}

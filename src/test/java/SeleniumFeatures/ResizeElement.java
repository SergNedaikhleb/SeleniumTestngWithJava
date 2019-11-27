package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ResizeElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver dr = new ChromeDriver(options);
        dr.get("https://jqueryui.com/resizable/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println(dr.findElements(By.tagName("iframe")).size());

        dr.switchTo().frame(0);

        WebElement resize = dr.findElement(By.xpath("//*[@id='resizable']/div[3]"));

        Actions act = new Actions(dr);

        act.moveToElement(resize).dragAndDropBy(resize, 200, 100).build().perform();

        dr.quit();
    }
}

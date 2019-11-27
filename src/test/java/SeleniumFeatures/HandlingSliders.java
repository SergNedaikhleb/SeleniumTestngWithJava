package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingSliders {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // disable automated extension only for ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> box = driver.findElements(By.tagName("iframe"));
        System.out.println(box.size());

        driver.switchTo().frame(0);
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

        Actions slideIt = new Actions(driver);
        slideIt.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();

        driver.quit();
}}

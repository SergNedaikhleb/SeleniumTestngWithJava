package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleFrames {
    public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

    // disable automated extension only for ChromeDriver
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
    WebDriver driver = new ChromeDriver(options);

    driver.get("https://jqueryui.com/draggable/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    List<WebElement> box = driver.findElements(By.tagName("iframe"));
    System.out.println(box.size());

    // first method
        driver.switchTo().frame(0);
        WebElement moveBox = driver.findElement(By.xpath("//*[@id='draggable']"));
        System.out.println(moveBox.getText());

        driver.switchTo().defaultContent();

        WebElement pageElement = driver.findElement(By.xpath("//*[@id='content']/h1"));
        System.out.println(pageElement.getText());

        // second method
//        WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
//        driver.switchTo().frame(frame);
//
//        WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));
//        System.out.println(element.getText());
//
//        driver.switchTo().defaultContent();
//
//        WebElement pageElement = driver.findElement(By.xpath("//*[@id='content']/h1"));
//        System.out.println(pageElement.getText());

    driver.quit();
}}

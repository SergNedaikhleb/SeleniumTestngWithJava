package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // disable automated extension only for ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> radioList = driver.findElements(By.xpath("//input[@name='group1']"));

        System.out.println("There are "+radioList.size()+" radiobuttons");
        System.out.println("=============================");

        for (WebElement e : radioList) {
            System.out.println(e.getAttribute("value"));
            System.out.println(e.isSelected());

            if (e.getAttribute("value").equals("Cheese")) {
                e.click();
            }
        }

        System.out.println("=============================");
        for (WebElement e : radioList) {
            System.out.println(e.getAttribute("value"));
            System.out.println(e.isSelected());

        }

        driver.quit();
    }}

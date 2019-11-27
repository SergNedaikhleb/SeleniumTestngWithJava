package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicket {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.tripadvisor.in/CheapFlightsHome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement fromWhere = driver.findElement(By.xpath("//div[@class='orig ui_column is-6 is-6-tablet map-pin-fill ui_icon pickerType ui_typeahead']//input[@class='query origWithLabel']"));
        fromWhere.clear();
        fromWhere.sendKeys("Kairo");
        WebElement toWhere = driver.findElement(By.xpath("//div[@class='dest ui_column is-6 is-6-tablet map-pin-fill ui_icon pickerType ui_typeahead']//input[@class='query destWithLabel']"));
        toWhere.clear();
        toWhere.sendKeys("Minsk");
        driver.findElement(By.xpath("//span[@class='unified-picker focused']/span[@class='picker-inner']")).click();

        String date = "10-June 2020";
        String splitter[] = date.split("-");
        String checkInmonth_year = splitter[1];
        String day = splitter[0];

        List<WebElement> elem =driver.findElements(By.xpath("//div[@class='rsdc-months']//span[contains(@class, 'rsdc-day')]"));

        for(int i=0; i<elem.size(); i++) {
            System.out.println(elem.get(i).getText());
//            if(elem.get(i).getText().equals(checkInmonth_year)) {
//               driver.findElements()
//            }
        }
        driver.quit();
    }
}

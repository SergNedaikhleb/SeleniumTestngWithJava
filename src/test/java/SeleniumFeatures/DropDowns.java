package SeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDowns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        op.setExperimentalOption("useAutomationExtension", false);
        WebDriver dr = new ChromeDriver(op);

        dr.get("https://rediff.com/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        dr.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        dr.findElement(By.xpath("//div/form/div/div[7]/a")).click();

        WebElement dropDown = dr.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));


        List<WebElement> list = dropDown.findElements(By.tagName("option"));
        System.out.println(list.size());

        String elem;
        for(int i=0; i<list.size(); i++) {
            elem = list.get(i).getAttribute("value");
            if(elem.equals("10")){
                list.get(i).click();
            }
        }

        dr.quit();
    }
}

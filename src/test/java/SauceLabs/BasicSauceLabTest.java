package SauceLabs;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicSauceLabTest {

    WebDriver dr;

    @Test
    public void test() throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("platform", Platform.WIN8_1);
        cap.setCapability("version", "44.0");
        dr = new RemoteWebDriver(new URL("http://appautomator:518f756cf-114f-40a7-88dc-7871e27"), cap);

        dr.get("http://www.rediff.com/");
        Thread.sleep(5000);

    }

}

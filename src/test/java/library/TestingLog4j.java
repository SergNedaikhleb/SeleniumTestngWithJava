package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class TestingLog4j {

    Logger logger;

    @Test
    public void testLogs() {
        System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver/geckodriver.exe");

        logger = Logger.getLogger("devpinoyLogger");
        logger.debug("Starting Selenium tests");

        WebDriver driver = new FirefoxDriver();
        logger.debug("Mozilla Browser opens");
        driver.get("http://google.com");
        logger.debug("Navigate to Google");


    }
}

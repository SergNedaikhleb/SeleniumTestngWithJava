package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    @BeforeMethod
    public void beforemethod() throws IllegalAccessException{

     //  WebDriver driver = new WebDriverFactory().create("Firefox");
      //  setWebDriver(driver);


        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void setWebDriver(WebDriver driver){
        dr.set(driver);
    }


    public WebDriver getWebDriver(){
        return dr.get();
    }

    @AfterMethod
    public void aftermethod(){
        getWebDriver().quit();
        dr.set(null);
    }
}

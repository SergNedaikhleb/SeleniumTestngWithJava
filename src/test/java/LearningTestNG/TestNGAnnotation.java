package LearningTestNG;

import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeClass
    public void beforeClass() { System.out.println("Initialize Selenium"); }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Opening browser");
    }

    @Test
    public void test1() {
        System.out.println("Inside test 1");
    }

    @Test
    public void test2() {
        System.out.println("Inside test 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing browser");
    }

    @AfterClass
    public void afterClass() { System.out.println("Destroy Selenium"); }
}

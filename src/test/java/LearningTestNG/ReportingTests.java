package LearningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTests {

    @Test
    public void login() {System.out.println("login");}

    @Test
    public void logout() { Assert.assertEquals("Test", "Test1");}
}

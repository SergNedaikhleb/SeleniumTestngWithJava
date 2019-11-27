package LearningTestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    @Test
    public void loginWithEmail() {
        System.out.println("Inside test login with email"); }

    @Test
    public void loginWithFacebook() {
        System.out.println("Inside test login with Facebook");
        Assert.assertEquals("TestString", "TestString1");
    }


}

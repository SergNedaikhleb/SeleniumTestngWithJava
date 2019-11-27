package LearningTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class LearningTestngPriority {

    @Test(priority=1)
    public void login() { System.out.println("Log in");
        Assert.assertEquals("String 1", "String 1");
    }

    @Test(priority=2)
    public void navigating() { System.out.println("navigating"); }

//    @Test(priority=2)
//    public void logout() { System.out.println("Log out"); }

    @Test(priority = 3, dependsOnMethods = {"login", "navigating"})
    public void logout() {System.out.println("Log out");}
}

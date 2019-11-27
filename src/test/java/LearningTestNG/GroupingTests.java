package LearningTestNG;

import org.testng.annotations.Test;

public class GroupingTests {

    @Test(groups={"performance"})
    public void feature1() { System.out.println("Inside feature 1");}

    @Test(groups={"regression"})
    public void feature2() { System.out.println("Inside feature 2");}

    @Test(groups={"performance", "regression"})
    public void feature3() { System.out.println("Inside feature 3");}

}

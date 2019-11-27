package LearningTestNG.Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    public void onTestSuccess(ITestResult tr) {
        System.out.print("TestCase PASS"); }

    public void onTestFailure(ITestResult tr) {
        System.out.print("TestCase FAIL"); }
}

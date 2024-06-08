package listenerdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart:: Test case " + result.getName() + " is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess :: Test case " + result.getName() + " is started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure :: Test case " + result.getName() + " is started");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped :: Test case " + result.getName() + " is started");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage :: Test case " + result.getName() + " is started");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout :: Test case " + result.getName() + " is started");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart :: Test case " + context.getCurrentXmlTest().getName() + " is started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish :: Test case " + context.getCurrentXmlTest().getName() + " is started");
    }
}

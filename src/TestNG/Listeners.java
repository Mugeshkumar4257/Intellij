package TestNG;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("tc is gng to execute");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("tc is passed");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("tc is failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("tc is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("End");
    }
}

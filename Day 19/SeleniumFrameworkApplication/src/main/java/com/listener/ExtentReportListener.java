package com.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.report.ExtentFactory;
import com.report.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    private ExtentReports extentReports;
    private ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        this.extentTest = extentReports.createTest(result.getName());
        ExtentFactory.getInstance().setExtentTest(extentTest);
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentFactory.failTest("Exception details " + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
      //  ITestListener.super.onStart(context);
        this.extentReports = ExtentReportManager.setUpExtentReport();
    }

    @Override
    public void onFinish(ITestContext context) {
        this.extentReports.flush();
    }
}

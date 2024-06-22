package com.report;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.driver.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class ExtentFactory {
    private static final ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

    private ExtentFactory(){}

    private static final ExtentFactory instance = new ExtentFactory();

    public static ExtentFactory getInstance() {
        return instance;
    }

    public void setExtentTest(ExtentTest obj) {
        extent.set(obj);
    }

    public ExtentTest getExtentTest() {
        return extent.get();
    }

    public void removeTest() {
        extent.remove();
    }

    public static String captureApplicationScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) DriverFactory.getInstance().getDriver();
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        byte[] fileContent = null;

        try {
            fileContent = FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.getEncoder().encodeToString(fileContent);
    }


    public static void passTest(String message) {
        getInstance().getExtentTest().log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
    }

    public static void failTest(String message) {
        getInstance().getExtentTest().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(captureApplicationScreenshot()).build());

    }

}

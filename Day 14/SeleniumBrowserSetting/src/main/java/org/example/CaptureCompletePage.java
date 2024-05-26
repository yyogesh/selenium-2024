package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureCompletePage {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/policies_center/");

        captureScreenShot(driver, "policies_center");
    }

    public static void captureScreenShot(ChromeDriver driver, String fileName) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenShots/"+fileName+".png"));
    }
}

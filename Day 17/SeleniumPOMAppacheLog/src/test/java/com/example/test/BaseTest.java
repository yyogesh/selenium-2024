package com.example.test;

import com.example.report.ExtentReportUtils;
import com.example.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite
    public void initDriver() {
        ExtentReportUtils.setUpReport();
        driver = Driver.getDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
    }
}

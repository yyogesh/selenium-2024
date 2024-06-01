package com.example.testng.BeforeAfterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeTestMethod {
    private static  final String baseUrl = "https://www.google.com/";
    private WebDriver webDriver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("BeforeTest: launching Chrome browser");
        webDriver = new ChromeDriver();
        webDriver.get(baseUrl);
    }

    @AfterTest
    public void terminateBrowser() {
        System.out.println("AfterTest: Cleaning up resource....");
        webDriver.close();
    }
}

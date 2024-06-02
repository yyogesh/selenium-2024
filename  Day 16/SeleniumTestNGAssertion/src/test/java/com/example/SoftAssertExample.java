package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    private WebDriver driver;
    private SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();

        // Initialize SoftAssert
        softAssert = new SoftAssert();
    }


    @Test
    public void testSoftAssertions() {
        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle, "Incorrect Title", "Title is incorrect");

        String actualUrl = driver.getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("google"), "URL does not contain 'google'");
        System.out.println("Soft Assertion");

//        String actualText = driver.findElement(By.tagName("h1")).getText();
//        softAssert.assertEquals(actualText, "Welcome", "Heading text is incorrect");

        // ... more assertions

        // Perform other test actions

        softAssert.assertAll(); // This will consolidate all the soft assertions and report failures
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

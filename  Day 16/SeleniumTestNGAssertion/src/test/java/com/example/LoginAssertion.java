package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginAssertion {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:9000/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test(priority = 1)
    public void loginFailed() {
        // open login page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // enter username
        driver.findElement(By.id("login-input")).sendKeys("admin");

        // enter password
        driver.findElement(By.id("password-input")).sendKeys("Test@1234");

        // click on login button
        driver.findElement(By.tagName("button")).click();

        WebElement globalErrorMessage = driver.findElement(By.cssSelector("[data-testid='global-message__ERROR']"));

        // Assertions
        Assert.assertNotEquals("Authentication failed1", globalErrorMessage.getText());
        Assert.assertTrue(globalErrorMessage.isDisplayed());

    }
    @Test(priority = 2)
    public void loginToLocalApplication() {
        // open login page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // enter username
        driver.findElement(By.id("login-input")).sendKeys("admin");

        // enter password
        driver.findElement(By.id("password-input")).sendKeys("Test@123");

        // click on login button
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facet_quality_gate-header")));
        // Assertions
        String actual = 	driver.getCurrentUrl();
        String expect = "http://localhost:9000/projects";
        Assert.assertEquals(actual, expect);

    }
}

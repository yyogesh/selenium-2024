package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToLocalhost {
    @Test
    public void loginToLocationApplication() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("login-input")).sendKeys("admin");
        driver.findElement(By.id("password-input")).sendKeys("Test@123");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facet_quality_gate-header")));

        // Assertions
        String actual = driver.getCurrentUrl();
        String expect = "http://localhost:9000/projects";
        Assert.assertEquals(actual, expect);

    }
}

package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvocationCountDemo {
    ChromeDriver driver ;
    @Test(invocationCount = 3)
    public void loginToApplication() {
        // Launch browser
        driver = new ChromeDriver();

        // open login page
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // click on login button
        driver.findElement(By.tagName("button")).click();

    }
}

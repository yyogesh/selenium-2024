package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SoftAssertion {
    WebDriver driver;
    SoftAssert softassert;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        softassert = new SoftAssert();
        driver.manage().window().maximize();

        driver.get("https://www.pcloudy.com/");
    }

    @Test(priority=0)
    public void testPCloudyLogin() {
        WebElement loginHeader = driver.findElement(By.xpath("//a[text()='Login']"));
        loginHeader.click();
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("ramit.dhamija@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ramit9876");
        WebElement loginButton = driver.findElement(By.id("kc-login"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String expectedTitle = "Mobile App Testing, Continuous Testing Cloud, Mobile Testing Tools | pCloudy";
        String actualTitle = driver.getTitle();

        softassert.assertEquals(actualTitle, expectedTitle, "pCloudy Login Test Failed");
        System.out.println("Soft Assertion statement is executed");

        softassert.assertAll();
    }

    @AfterTest
    public void tearDown() {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}

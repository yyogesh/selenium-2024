package com.example.testng.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvider {
    @Test(dataProvider = "getMockData")
    public void login(String username ,String password) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.tagName("button")).click();
    }


    @org.testng.annotations.DataProvider
    public Object[][] getMockData() {
        Object [] [] data = new Object [2] [2] ;
        data [0] [0] = "Admin";
        data [0] [1] = "admin123" ;
        data [1] [0] = "superAdmin";
        data [1] [1] = "test@123" ;
        return data ;
    }
}

package com.example.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DemoTestNG {

    public void launchGoogle() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    public void launchFacebook() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}

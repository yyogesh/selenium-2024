package com.base;

import com.driver.BrowserFactory;
import com.driver.DriverFactory;
import com.properties.ConfigReader;
import com.properties.DataLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void setup() {
        WebDriver driver = BrowserFactory.getBrowserInstance(ConfigReader.getInstance().getPropertyValue("browser"));
        DriverFactory.getInstance().setDriver(driver);
        DriverFactory.getInstance().getDriver().get(DataLoader.getInstance().getAppUrl());
    }

    @AfterSuite
    public void tearDown() {
        DriverFactory.getInstance().getDriver().quit();
    }
}

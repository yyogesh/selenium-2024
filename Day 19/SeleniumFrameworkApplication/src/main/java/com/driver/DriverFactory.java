package com.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverFactory() {}

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver driverObj) {
        driver.set(driverObj);
    }
}

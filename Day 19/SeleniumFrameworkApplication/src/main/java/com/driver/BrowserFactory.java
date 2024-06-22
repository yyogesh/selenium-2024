package com.driver;

import com.properties.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static Logger logger = LogManager.getLogger(BrowserFactory.class);

    public static WebDriver getBrowserInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            logger.info("Unsupported browser type mentioned in the config.properties file.");
            logger.info("Chrome browser selected for test as default.");
            driver = new ChromeDriver();
        }
        return driver;
    }
}

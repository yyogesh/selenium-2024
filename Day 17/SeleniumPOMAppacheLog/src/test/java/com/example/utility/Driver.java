package com.example.utility;

import com.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        String browser = ConfigReader.getProperty("browser");
        if (driver == null){
            switch (browser){
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}

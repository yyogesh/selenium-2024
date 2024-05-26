package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoBrowser {
    public static void main(String[] ar) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }
}

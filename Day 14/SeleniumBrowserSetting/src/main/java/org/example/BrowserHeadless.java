package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserHeadless {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(currentUrl);
    }
}

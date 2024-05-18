package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTitleUrl {
    public static void main(String[] args) {
        // Open Google chrome browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/table.html");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}

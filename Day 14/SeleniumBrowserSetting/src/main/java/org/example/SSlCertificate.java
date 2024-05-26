package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSlCertificate {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
    }
}

package org.example.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathContain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg");

        driver.findElement(By.xpath("//input[contains(@aria-label,'First')]")).sendKeys("Test@test.com");
        driver.findElement(By.xpath("//input[starts-with(@aria-label,'Sur')]")).sendKeys("Sur@test.com");
        driver.findElements(By.xpath("//a[text()='Already have an account?']"));

        //(//input[@type='text'])[last()-3]

        // //form[@method='post']/child::input[@id='ri']
    }
}

package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

        Alert promptAlert  = driver.switchTo().alert();

        String alertText = promptAlert.getText();
        System.out.println("Alert text is " + alertText);

        promptAlert.sendKeys("Test User");
        promptAlert.accept();
    }
}

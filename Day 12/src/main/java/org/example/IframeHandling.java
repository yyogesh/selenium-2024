package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/dialog/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

     //   driver.findElement(By.xpath("//button[@title='Close']")).click();

        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Close']")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Demos")).click();
    }
}

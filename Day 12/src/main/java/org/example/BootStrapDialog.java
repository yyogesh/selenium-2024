package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BootStrapDialog {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // open application
        driver.get("https://getbootstrap.com/docs/5.3/components/modal");
        ////button[@data-bs-target='#exampleModalLive']
        Thread.sleep(2000);
        js.executeScript("document.querySelector(\"button[data-bs-target='#exampleModalLive']\").scrollIntoView();");
        driver.findElement(By.cssSelector("button[data-bs-target='#exampleModalLive']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@id='exampleModalLive']//div[@class='modal-footer']/button")).click();
    }
}

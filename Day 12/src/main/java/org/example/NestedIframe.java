package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // switch from html page to parent frame
        driver.switchTo().frame("frame-top");

        // Switch from parent frame to child frame.
        driver.switchTo().frame("frame-middle");

        // identify the webElement
        WebElement element = driver.findElement(By.id("content"));

        //print the text of web element
        System.out.println("Text of second iframe is :"+ element.getText());

        // come out from child frame to parent frame
        driver.switchTo().parentFrame();

        // come out from parent frame to html page
        driver.switchTo().defaultContent();
    }
}

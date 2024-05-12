package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadionButtonHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        // open application
        driver.get("file:///D:/Ysquare/Selenium/Project/Day9/src/main/java/org/example/radio.html");
        WebElement radio1 = driver.findElement(By.id("html"));
        WebElement radio2 = driver.findElement(By.id("css"));

        // Display status
        boolean isDisplayedStatus = radio1.isDisplayed();
        System.out.println("is displayed status is :" + isDisplayedStatus);

        // Enable status
        boolean isEnableStatus = radio1.isEnabled();
        System.out.println("Is enable status is :" + isEnableStatus);

        radio2.click();
        System.out.println("Radio Button Option css Selected");

        boolean isSelectedStatus = radio1.isSelected();
        System.out.println("Is selected status after click :" + isSelectedStatus);
    }
}

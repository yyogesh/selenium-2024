package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class NewWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("mainWindowHandle " + mainWindowHandle);
        // All child windows are stored in a set of strings.
        Set<String> allWindowHandles = driver.getWindowHandles();

        System.out.println("allWindowHandles " + allWindowHandles);

        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
           String childWindow = iterator.next();
           if(!mainWindowHandle.equalsIgnoreCase(childWindow)) { // ABC // Abc
               driver.switchTo().window(childWindow);
               System.out.println("Heading of child window is:: " + driver.findElement(By.id("sampleHeading")).getText());
               driver.close();
           }
        }
        driver.switchTo().window(mainWindowHandle);
    }
}

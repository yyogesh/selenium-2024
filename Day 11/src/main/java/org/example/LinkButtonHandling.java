package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinkButtonHandling {
    public static void main(String[] args) {
        // Open google Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // open application
        driver.get("https://www.facebook.com/");

        // identify the link
        WebElement link = driver.findElement(By.linkText("Forgotten password?"));

        // Display status of link
        boolean isDisplayStatus = link.isDisplayed();
        System.out.println("is display status is :" + isDisplayStatus);

        // Enable status
        boolean isEnableStatus = link.isEnabled();
        System.out.println("Is enable status is :" + isEnableStatus);

        // get the link name
        String linkName = link.getText();
        System.out.println("Link name is :" + linkName);

        // click on link
        link.click();
    }
}
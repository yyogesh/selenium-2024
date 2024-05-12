package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // ALT + ENTER
//        WebElement element = driver.findElement(By.id("email"));
//        element.sendKeys("Test@Test.com");

        driver.findElement(By.id("email")).sendKeys("Test@Test.com");
        driver.findElement(By.id("pass")).sendKeys("Test@123");

        driver.findElement(By.linkText("Forgotten password?")).click();

        driver.findElement(By.partialLinkText("password?")).click();
        // CSS ID
        // CSS CLASS NAME
        // NAME ATTRIBUTE
        // XPATH
        // LINK TEXT
        // PARTIAL LINK TEXT
        // HTML TAG NAME
        // /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input

    }
}
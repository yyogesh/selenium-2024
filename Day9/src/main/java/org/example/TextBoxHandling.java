package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxHandling {
    public static void main(String[] args) throws InterruptedException {
        // Open Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // open application
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        // identify text box.
        WebElement emailTextBox = driver.findElement(By.name("email"));

        // text box is displayed or not
        boolean isDisplayedStatus = emailTextBox.isDisplayed();
        System.out.println("Is displayed status is :" + isDisplayedStatus);

        // text box is enabled or not
        boolean enableStatus = emailTextBox.isEnabled();
        System.out.println("Is enabled status is :" + enableStatus);

        // enter value in text box
        emailTextBox.sendKeys("selenium@test.com");
        Thread.sleep(5000);


        String enteredValue =  emailTextBox.getAttribute("value");
        System.out.println("Entered value of text box is :" + enteredValue);

        emailTextBox.clear();
    }
}

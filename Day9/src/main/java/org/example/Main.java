package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@test.com");

        driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("abc@test.com");

        // input[aria-label^='First']

        // input[aria-label$='First']

        // input[aria-label*='First']

        // #fullname_field > .clearfix

        // #fullname_field .clearfix
    }
}
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssHandling {
    public static void main(String[] args) {
        // Open Google chrome browser
        ChromeDriver driver = new ChromeDriver();

        // open application
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        // identify element\
        WebElement button = driver.findElement(By.id("form_submit"));

        String borderStyle = button.getCssValue("border-style");
        System.out.println("borderStyle value is :" + borderStyle);

        String textAlingn = button.getCssValue("text-align");
        System.out.println("textAlingn value is :" + textAlingn);

        String backgroundColor = button.getCssValue("background-color");
        System.out.println("back ground color code is :" + backgroundColor);
    }
}

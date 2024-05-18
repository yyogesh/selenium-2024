package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {
    public static void main(String[] args) throws InterruptedException {
        // Open Google chrome browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        // click on any link
        driver.findElement(By.linkText("Broken Images")).click();
        Thread.sleep(5000);

        // click on back button of browser
        driver.navigate().back();
        Thread.sleep(5000);

        // click on forword button of browser
        driver.navigate().forward();
        Thread.sleep(5000);

        // refresh the url
        driver.navigate().refresh();
    }
}

package org.example.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Test@test.com");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test@test.com");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Test@test.com");

        driver.findElements(By.xpath("//*[@id=\"email\"][@id=\"pass\"]"));

       // driver.findElements(By.cssSelector(""));
       // driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Test@test.com");

        // //input[@aria-label='First name']

//        driver.close();
//        driver.quit();
    }
}

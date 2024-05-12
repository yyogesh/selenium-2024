package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropdownHandling {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///D:/Ysquare/Selenium/Project/Day9/src/main/java/org/example/dropdown.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // identify dropdown field.
        WebElement color = driver.findElement(By.id("SelectID_One"));

        // select a value from list
        Select selectColor = new Select(color);
        Select selectColorTwo = new Select(driver.findElement(By.id("SelectID_Two")));
        Select selectColorThree = new Select(driver.findElement(By.id("SelectID_Three")));


        selectColor.selectByIndex(2);
        // selecting option based on value attribute
        selectColorTwo.selectByValue("orangevalue");
        selectColorThree.selectByVisibleText("Dog");

        System.out.println("Selected value in dropdown is: " + selectColor.getFirstSelectedOption().getText());
    }
}

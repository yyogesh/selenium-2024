package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownSelectMenuExample {
    public static void main(String[] args) throws InterruptedException {

        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

        //Step#2- Launching URL
        driver.get("https://demoqa.com/select-menu");

        //Maximizing window
        driver.manage().window().maximize();

        //Step#3- Selecting the dropdown element by locating its id
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        List<WebElement> lst = select.getOptions();

        System.out.println("The dropdown options are:");
        for(WebElement option: lst) {
            System.out.println(option.getText());
        }

        System.out.println("select isMultiple " + select.isMultiple());
    }
}

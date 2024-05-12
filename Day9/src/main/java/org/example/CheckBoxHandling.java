package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        // open application
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        // form input:nth-of-type(1) css selector
        // //form[@id='checkboxes']/input[1] xpath
        // identify check box
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        // displayed or not
        boolean isDiplayedStatus = checkBox1.isDisplayed();
        System.out.println("is displayed status is :" + isDiplayedStatus);

        // Enable status
        boolean isEnableStatus = checkBox1.isEnabled();
        System.out.println("Is enable status is :" + isEnableStatus);

        // select check box .
        checkBox1.click();
        Thread.sleep(5000);


        // check selected status of check box
        boolean isSelectedStatus = checkBox1.isSelected();
        System.out.println("Is selected status after click is :" + isSelectedStatus);

        Thread.sleep(2000);
        // un select check box
        checkBox1.click();
    }
}

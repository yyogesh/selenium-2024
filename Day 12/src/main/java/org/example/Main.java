package org.example;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // NoSuchElementException

        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        // TimeoutException

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        // TimeoutException
    }
}
package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutor {
    public static void main(String[] args) {
        // Open google Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // open application
        driver.get("http://the-internet.herokuapp.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0, 600)");
    }
}

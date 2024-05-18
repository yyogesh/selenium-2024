package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExecuteAsyncScriptExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launching the Site.
        driver.get("https://demo.guru99.com/V4/");

        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);


        //Declare and set the start time
        long start_time = System.currentTimeMillis();

        //Call executeAsyncScript() method to wait for 5 seconds
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

        //Get the difference (currentTime - startTime)  of times.
        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));

      //  driver.quit();
      //  driver.close();
    }
}

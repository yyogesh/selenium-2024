package org.example.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScrollDemo {
 //window.scrollTo(0, document.body.scrollHeight)
 public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver = new ChromeDriver();

     JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/privacy/explanation");

     Thread.sleep(3000);
     //window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' })
     javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 }
}

package org.example.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");

        Thread.sleep(3000);
        javascriptExecutor.executeScript("document.getElementById('user_email_login').value= 'abc@gmail.com'");
        javascriptExecutor.executeScript("document.getElementById('user_password').value= '123456'");
        javascriptExecutor.executeScript("document.getElementById('user_submit').click();");
        javascriptExecutor.executeScript("alert('Enter correct login detail')");
    }
}
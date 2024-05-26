package org.example.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuteNavigate {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/privacy/explanation");

        Thread.sleep(3000);
        //Fetching the Domain Name of the site. Tostring() change object to name.
        String DomainName = javascriptExecutor.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site = "+DomainName);

        //Fetching the URL of the site. Tostring() change object to name
        String url = javascriptExecutor.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = "+url);

        //Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = javascriptExecutor.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName);

        javascriptExecutor.executeScript("window.location='http://www.google.com'");

    }
}

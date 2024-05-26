package org.example;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class BrowserCookies {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Cookie cookie = new Cookie("test", "testValue");
        driver.manage().addCookie(cookie);

        Set<Cookie> cookies = driver.manage().getCookies();

        for(Cookie cookie1: cookies) {
            System.out.println(cookie1.getName() + " === " + cookie1.getExpiry() + " === " + cookie1.getDomain() + " === " + cookie1.getValue());
        }

        driver.manage().deleteCookieNamed("test");

        System.out.println("*********************************************************");
        Set<Cookie> cookies2 = driver.manage().getCookies();

        for(Cookie cookie2: cookies2) {
            System.out.println(cookie2.getName() + " === " + cookie2.getExpiry() + " === " + cookie2.getDomain() + " === " + cookie2.getValue());
        }

    }
}

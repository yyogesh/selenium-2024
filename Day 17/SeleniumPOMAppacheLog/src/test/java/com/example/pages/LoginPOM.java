package com.example.pages;

import com.example.test.BaseTest;
import org.openqa.selenium.By;

public class LoginPOM extends BaseTest {
    // Locators
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.id("login");

    // Methods
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}

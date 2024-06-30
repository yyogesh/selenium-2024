package com.example.pages;

import com.example.test.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    // username
    @FindBy(name = "username")
    WebElement userNameTextBox;

    // password
    @FindBy(name = "password")
    WebElement passwordTextBox;

    // login button
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginBTn;

    public LoginPage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    public void loginToApplication(String userName, String password) {
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        loginBTn.click();
    }
}

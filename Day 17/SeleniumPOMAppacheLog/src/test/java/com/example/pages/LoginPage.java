package com.example.pages;

import com.example.report.ExtentReportUtils;
import com.example.test.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // driver.findElement(By.name("username")).sendKeys("Admin");
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

    Logger logger = LogManager.getLogger(LoginPage.class);

    public void loginToApplication(String username, String password) {
        userNameTextBox.sendKeys(username);
        logger.info("Username is entered in username text box");
        ExtentReportUtils.addStep("Username entered in user input box");

        passwordTextBox.sendKeys(password);
        logger.warn("Password is entered in Password text box");
        ExtentReportUtils.addStep("Password entered in password input box");

        loginBTn.click();
        logger.info("Login button is clicked.");
        ExtentReportUtils.addStep("Login button clicked");
    }

}

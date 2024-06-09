package com.example.pages;

import com.example.test.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminlink;

    @FindBy(xpath = "//img[@alt=\"profile picture\"]")
    WebElement profilePicture;

    @FindBy(linkText = "Logout")
    WebElement logoutLink;

    public HomePage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    public void clickOnAdminLInk() {
        adminlink.click();
    }

    public void logoutFromApplication() {
        profilePicture.click();
        logoutLink.click();
    }
}

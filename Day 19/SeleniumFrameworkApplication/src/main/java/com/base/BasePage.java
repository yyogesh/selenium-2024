package com.base;

import com.report.ExtentFactory;
import org.openqa.selenium.WebElement;

public class BasePage {
    public void click(WebElement element, String elementName) {
        element.click();
        ExtentFactory.passTest(elementName + " is Clicked");
    }

    public void sendKeys(WebElement element, String elementName, String value) {
        element.sendKeys(value);
        ExtentFactory.passTest(elementName + " is entered value " + value);

    }
}

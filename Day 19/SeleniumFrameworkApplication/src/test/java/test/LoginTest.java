package test;

import com.base.BaseTest;
import com.properties.DataLoader;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(DataLoader.getInstance().getUserName(), DataLoader.getInstance().getPassword());
    }

//    public void waitForElementToBePresent(WebElement element, String elementName) {
//
//        WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getDriver(),
//                Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
//
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}

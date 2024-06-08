package listenerdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginDemo {
    @Test
    public void loginToLocalApplication() {
        ChromeDriver driver = new ChromeDriver();
        // open login page
        driver.get("http://localhost:9000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // enter username
        driver.findElement(By.id("login-input")).sendKeys("admin");

        // enter password
        driver.findElement(By.id("password-input")).sendKeys("Test@123");

    }
}

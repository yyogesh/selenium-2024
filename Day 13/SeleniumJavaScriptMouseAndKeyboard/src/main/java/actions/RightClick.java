package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open facebook login page
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);
        // Right click on Email text box.
        WebElement emailTextBox = driver.findElement(By.id("email"));
        Actions action = new Actions(driver);
        action.contextClick(emailTextBox).build().perform();

    }
}

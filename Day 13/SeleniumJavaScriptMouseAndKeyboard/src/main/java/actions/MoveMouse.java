package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open application
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        // Move mouse over Account & List link
        WebElement accountAndListLink = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.moveToElement(accountAndListLink).build().perform();
        Thread.sleep(3000);

        // click on your order link
        WebElement yourOrderLink = driver.findElement(By.xpath("//span[text()='Your Orders']/parent::a"));
        action.click(yourOrderLink).build().perform();

        // Enter email id
        WebElement emailIdTextBox = driver.findElement(By.id("ap_email"));
        action.sendKeys(emailIdTextBox, "test@test.com").build().perform();
    }
}

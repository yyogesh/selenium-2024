package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");


        Thread.sleep(3000);
        WebElement userSubmitElement = driver.findElement(By.id("user_submit"));
        Actions actions = new Actions(driver);

        actions.click(userSubmitElement).perform();
//        actions.doubleClick(userSubmitElement).perform();
//        actions.clickAndHold(userSubmitElement).perform();
//        actions.dragAndDrop(userSubmitElement, userSubmitElement).perform();
//        actions.moveToElement(userSubmitElement).perform();
        actions.contextClick(userSubmitElement).perform();
        actions.sendKeys(userSubmitElement).perform();
    }
}

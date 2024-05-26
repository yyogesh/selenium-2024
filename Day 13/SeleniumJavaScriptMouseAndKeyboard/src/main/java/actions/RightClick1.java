package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick1 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Launch the Application Under Test (AUT)
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        // Right click the button to launch right click menu options
        Actions action = new Actions(driver);

        WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
        action.contextClick(link).perform();
        // Click on Edit link on the displayed menu options
        WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        element.click();

    }
}

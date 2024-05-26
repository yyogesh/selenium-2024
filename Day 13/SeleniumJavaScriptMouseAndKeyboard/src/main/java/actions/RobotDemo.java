package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotDemo {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Using the WebDriver
        WebDriver driver = new ChromeDriver();

        // Accessing the URL
        driver.get("http://the-internet.herokuapp.com/upload");

        Thread.sleep(2000);
        Robot selRobo = new Robot();

        // Selecting the path using StringSelection
        StringSelection stringSelection=
                new StringSelection("C:\\Users\\Yogesh\\Downloads\\Green Black Modern Tennis Club Logo.png");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Choosing the WebElement and performing a click on it
        Actions actions=new Actions(driver);
        WebElement choosingButton= driver.findElement(By.id("file-upload"));
        actions.moveToElement(choosingButton).click().build().perform();

        selRobo.delay(2000);
        selRobo.keyPress(KeyEvent.VK_CONTROL);
        selRobo.keyPress(KeyEvent.VK_V);

        selRobo.keyRelease(KeyEvent.VK_CONTROL);
        selRobo.keyRelease(KeyEvent.VK_V);

        selRobo.delay(2000);

        selRobo.keyPress(KeyEvent.VK_ENTER);
        selRobo.keyRelease(KeyEvent.VK_ENTER);
    }
}

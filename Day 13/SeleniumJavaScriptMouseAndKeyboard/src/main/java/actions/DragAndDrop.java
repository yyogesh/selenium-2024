package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open application
        driver.get("https://jqueryui.com/droppable/");

        // drag and drop operation
        driver.switchTo().frame(0);
        WebElement smallBox = driver.findElement(By.id("draggable"));
        WebElement biggerBox = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(smallBox, biggerBox).build().perform();

    }
}

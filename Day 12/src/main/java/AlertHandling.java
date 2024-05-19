import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // open application
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        // click on button to get java script alert.
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text is :: " + alertText);

        alert.accept();// ok
        // alert.dismiss(); // cancel


    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureAshotElement {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg");
        Thread.sleep(3000);
        // //form[@id="reg"]
        Screenshot screenshot = new AShot().takeScreenshot(driver, driver.findElement(By.xpath("//form[@id=\"reg\"]")));
        ImageIO.write(screenshot.getImage(), "png", new File("./screenShots/reg_form.png"));
    }
}

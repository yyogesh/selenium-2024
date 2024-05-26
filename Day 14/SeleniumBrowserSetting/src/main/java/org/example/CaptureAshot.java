package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureAshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/policies_center/");
        Thread.sleep(3000);
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "png", new File("./screenShots/fullPage.png"));
    }
}

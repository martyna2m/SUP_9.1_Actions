package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotMaker {
    private WebDriver driver;

    public ScreenshotMaker(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenShot() {
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH.mm.ss");
            String timestamp = dateFormat.format(new Date());

            String fileName = "screenshot_" + timestamp + ".png";
            Path fileLocalization = Path.of("src/test/resources/screenshots/" + fileName);

            Files.copy(screenshotFile.toPath(), fileLocalization);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

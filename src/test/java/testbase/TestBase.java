package testbase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBase {
    public WebDriver driver;
    public Actions actions;


    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
        actions = new Actions(driver);

    }

    @AfterEach
    void closeDriver() {
        driver.quit();
    }

    protected void openWebsite(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


}


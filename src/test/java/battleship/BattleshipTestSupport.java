package battleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class BattleshipTestSupport {

    protected WebDriver driver;

    @BeforeEach
    void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package battleship.g92500;

import battleship.g92500.support.WebDriverSetup;
import battleship.g92500.pages.UserStory2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para o cenário UserStory2.
 * O jogador consulta as regras do Battleship.
 */
public class UserStory2Test {

    private WebDriver driver;
    private UserStory2 userStory2;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        userStory2 = new UserStory2(driver);
    }

    @Test
    public void testConsultRules() {
        userStory2.openHomePage();
        assertTrue(userStory2.isRulesTextPresent("Rules of Battleship"), 
                   "As regras do jogo devem estar visíveis na página.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

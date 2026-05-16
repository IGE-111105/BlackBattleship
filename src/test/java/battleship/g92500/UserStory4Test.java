package battleship.g92500;

import battleship.g92500.pages.UserStory4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para o cenário UserStory4.
 * O jogador verifica a opção de jogar contra o computador.
 */
public class UserStory4Test {

    private WebDriver driver;
    private UserStory4 userStory4;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        userStory4 = new UserStory4(driver);
    }

    @Test
    public void testPlayWithComputerOption() {
        userStory4.openHomePage();
        assertTrue(userStory4.isPlayWithComputerOptionVisible(), 
                   "A opção de jogar contra o computador deve estar visível.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

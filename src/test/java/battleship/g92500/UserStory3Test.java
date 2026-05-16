package battleship.g92500;

import battleship.g92500.pages.UserStory3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para o cenário UserStory3.
 * O jogador verifica a opção de jogar com um amigo.
 */
public class UserStory3Test {

    private WebDriver driver;
    private UserStory3 userStory3;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        userStory3 = new UserStory3(driver);
    }

    @Test
    public void testPlayWithFriendOption() {
        userStory3.openHomePage();
        assertTrue(userStory3.isPlayWithFriendOptionVisible(), 
                   "A opção de jogar com um amigo deve estar visível.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

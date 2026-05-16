package battleship.g92500;

import battleship.g92500.pages.UserStory1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Page Test Class para o cenário UserStory1.
 * O jogador abre a página principal do Battleship Online e verifica se o título está presente.
 */
public class UserStory1Test {

    private WebDriver driver;
    private UserStory1 userStory1;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Execução sem interface gráfica para ambiente CI
        driver = new ChromeDriver(options);
        userStory1 = new UserStory1(driver);
    }

    @Test
    public void testOpenMainPage() {
        userStory1.openHomePage();
        String title = userStory1.getTitleText();
        assertEquals("Battleship Online", title, "O título da página deve ser 'Battleship Online'");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

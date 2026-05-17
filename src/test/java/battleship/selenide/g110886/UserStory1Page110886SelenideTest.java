package battleship.selenide.g110886;

import battleship.pages.UserStory1Page110886;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes da User Story 1 - versão Selenide que reutiliza o Page Object Selenium.
 */
public class UserStory1Page110886SelenideTest {

    @Test
    void shouldDisplayRules() {
        // 1) abre com Selenide (Selenide cria o WebDriver)
        open("https://papergames.io/en/battleship");

        // 2) obtém o WebDriver criado pelo Selenide
        var driver = WebDriverRunner.getWebDriver();

        // 3) cria o Page Object Selenium passando o driver (agora não é null)
        UserStory1Page110886 page = new UserStory1Page110886(driver);

        // 4) usa o método do Page Object (open() no Page Object não é necessário porque já abrimos)
        // se quiseres usar o método open() do Page Object, não faças Selenide.open() acima:
        // page.open();

        assertTrue(page.areRulesVisible());
    }
}
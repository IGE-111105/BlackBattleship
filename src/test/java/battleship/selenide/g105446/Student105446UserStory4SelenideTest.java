package battleship.selenide.g105446;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Selenide test for UserStory4 - Navegar para torneios.
 * @author 105446
 */
public class Student105446UserStory4SelenideTest {

    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("Como jogador, quero navegar para a página de torneios")
    void playerCanNavigateToTournaments() {
        open("https://papergames.io/en/");
        $x("//img[@alt='Battleship']").click();
        $(".position-relative > .front").click();
        $x("//input[@id='mat-input-serverApp0']").shouldBe(visible);
    }
}
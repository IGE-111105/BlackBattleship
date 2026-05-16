package battleship.selenide.g105446;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Selenide test for UserStory3 - Fazer login.
 * @author 105446
 */
public class Student105446UserStory3SelenideTest {

    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("Como jogador, quero fazer login para aceder à minha conta")
    void playerCanLogin() {
        open("https://papergames.io/en/");
        $x("//img[@alt='Battleship']").click();
        $(".btn-outline-dark").click();
        $(".dialog-close").shouldBe(visible);
    }
}
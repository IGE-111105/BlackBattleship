package battleship.selenide.g105446;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Selenide test for UserStory1 - Criar nickname para jogar.
 * @author 105446
 */
public class Student105446UserStory1SelenideTest {

    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("Como jogador, quero criar um nickname para me identificar no jogo")
    void playerCanCreateNickname() {
        open("https://papergames.io/en/battleship");
        $(".btn-secondary:nth-child(2)").click();
        $(".input-xl").shouldBe(visible);
    }
}
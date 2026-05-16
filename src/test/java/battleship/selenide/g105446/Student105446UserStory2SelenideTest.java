package battleship.selenide.g105446;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Selenide test for UserStory2 - Ver o leaderboard.
 * @author 105446
 */
public class Student105446UserStory2SelenideTest {

    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    @Test
    @DisplayName("Como jogador, quero ver o leaderboard para ver os melhores jogadores")
    void playerCanSeeLeaderboard() {
        open("https://papergames.io/en/");
        $x("//img[@alt='Battleship']").click();
        $(".item:nth-child(1)").shouldBe(visible);
    }
}
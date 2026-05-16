package battleship.g105446;

import battleship.pages.g105446.UserStory1Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para UserStory1 - Criar nickname para jogar.
 * @author 105446
 */
public class UserStory1Test extends BattleshipTestSupport105446 {

    @Test
    @DisplayName("Como jogador, quero criar um nickname para me identificar no jogo")
    void playerCanCreateNickname() {
        UserStory1Page page = new UserStory1Page(driver);
        page.open();
        page.clickPlayVsRobot();
        assertTrue(page.isNicknameInputVisible(),
                "O campo de nickname deve estar visível após clicar em Play vs Robot.");
    }
}
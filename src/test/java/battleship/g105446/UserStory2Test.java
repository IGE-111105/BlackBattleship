package battleship.g105446;

import battleship.pages.g105446.UserStory2Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para UserStory2 - Ver o leaderboard.
 * @author 105446
 */
public class UserStory2Test extends BattleshipTestSupport105446 {

    @Test
    @DisplayName("Como jogador, quero ver o leaderboard para ver os melhores jogadores")
    void playerCanSeeLeaderboard() {
        UserStory2Page page = new UserStory2Page(driver);
        page.open();
        page.clickBattleshipImage();
        assertTrue(page.isLeaderboardVisible(),
                "O leaderboard deve estar visível na página do Battleship.");
    }
}
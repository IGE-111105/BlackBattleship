package battleship.g105446;

import battleship.pages.g105446.UserStory4Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para UserStory4 - Navegar para torneios.
 * @author 105446
 */
public class UserStory4Test extends BattleshipTestSupport105446 {

    @Test
    @DisplayName("Como jogador, quero navegar para a página de torneios")
    void playerCanNavigateToTournaments() {
        UserStory4Page page = new UserStory4Page(driver);
        page.open();
        page.clickBattleshipImage();
        page.clickTournamentButton();
        assertTrue(page.isTournamentPageVisible(),
                "A página de torneios deve estar visível após clicar no botão.");
    }
}
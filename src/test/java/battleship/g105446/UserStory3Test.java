package battleship.g105446;

import battleship.pages.g105446.UserStory3Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class para UserStory3 - Fazer login.
 * @author 105446
 */
public class UserStory3Test extends BattleshipTestSupport105446 {

    @Test
    @DisplayName("Como jogador, quero fazer login para aceder à minha conta")
    void playerCanLogin() {
        UserStory3Page page = new UserStory3Page(driver);
        page.open();
        page.clickBattleshipImage();
        page.clickLoginButton();
        assertTrue(page.isLoginDialogVisible(),
                "O diálogo de login deve estar visível após clicar em Login.");
    }
}
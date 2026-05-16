package battleship;

import battleship.pages.UserStory2Page;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory2Test extends BattleshipTestSupport {

    @Test
    void userCanReadBattleshipRules() {
        UserStory2Page page = new UserStory2Page(driver);

        page.open();

        assertTrue(page.areRulesAvailable(),
                "The Battleship rules should be available on the page.");
    }
}

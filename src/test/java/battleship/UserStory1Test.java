package battleship;

import battleship.pages.UserStory1Page;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory1Test extends BattleshipTestSupport {

    @Test
    void userCanOpenBattleshipHomePage() {
        UserStory1Page page = new UserStory1Page(driver);

        page.open();

        assertTrue(page.isBattleshipHomePageVisible(),
                "The Battleship home page should open and show the game title.");
    }
}

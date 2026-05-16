package battleship;

import battleship.pages.UserStory4Page;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory4Test extends BattleshipTestSupport {

    @Test
    void userCanChooseAutomaticOpponent() {
        UserStory4Page page = new UserStory4Page(driver);

        page.open();

        assertTrue(page.hasAutomaticOpponentOption(),
                "The page should present an option to play against a robot, computer or random opponent.");
    }
}

package battleship;

import battleship.pages.UserStory3Page;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory3Test extends BattleshipTestSupport {

    @Test
    void userCanChooseToPlayWithFriend() {
        UserStory3Page page = new UserStory3Page(driver);

        page.open();

        assertTrue(page.hasFriendGameOption(),
                "The page should present an option to play with or invite a friend.");
    }
}

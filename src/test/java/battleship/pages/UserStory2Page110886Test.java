package battleship.pages;

import battleship.pages.UserStory2Page110886;
import battleship.pages.BattleshipPageTest110886;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory2Page110886Test extends BattleshipPageTest110886 {

    @Test
    void shouldDisplayFriendOption() {

        UserStory2Page110886 page = new UserStory2Page110886(driver);

        page.open();

        assertTrue(page.isPlayWithFriendVisible());
    }
}
package battleship.pages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory4Page110886Test extends BattleshipPageTest110886 {

    @Test
    void shouldStartRobotGame() {

        UserStory4Page110886 page =
                new UserStory4Page110886(driver);

        page.open();

        assertTrue(page.isGameBoardVisible());
    }
}
package battleship.pages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory3Page110886Test extends BattleshipPageTest110886 {

    @Test
    void shouldInsertNickname() {

        UserStory3Page110886 page =
                new UserStory3Page110886(driver);

        page.open();

        page.clickPlayRobot();

        page.enterNickname("Player110886");

        assertTrue(
                page.nicknameWasInserted("Player110886")
        );
    }
}
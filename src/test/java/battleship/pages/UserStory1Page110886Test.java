package battleship.pages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory1Page110886Test extends BattleshipPageTest110886 {

    @Test
    void shouldDisplayRules() {

        UserStory1Page110886 page = new UserStory1Page110886(driver);

        page.open();

        assertTrue(page.areRulesVisible());
    }
}
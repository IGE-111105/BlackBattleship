package battleship.pages;

import battleship.pages.UserStory1Page110886;
import battleship.pages.BattleshipPageTest110886;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory1Page110886Test extends BattleshipPageTest110886 {

    @Test
    void shouldDisplayRules() {

        UserStory1Page110886 page = new UserStory1Page110886(driver);

        page.open();

        assertTrue(page.areRulesVisible());
    }
}
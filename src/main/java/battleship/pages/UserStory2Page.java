package battleship.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for the user story where the player reads the game rules.
 */
public class UserStory2Page extends BattleshipPage {

    public UserStory2Page(WebDriver driver) {
        super(driver);
    }

    public boolean areRulesAvailable() {
        return containsInSource("Rules of Battleship game online")
                && containsInSource("10x10 grid")
                && containsInSource("First to sink all opponent ships wins");
    }
}

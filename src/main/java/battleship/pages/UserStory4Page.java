package battleship.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for the user story where the player chooses an automatic opponent.
 */
public class UserStory4Page extends BattleshipPage {

    public UserStory4Page(WebDriver driver) {
        super(driver);
    }

    public boolean hasAutomaticOpponentOption() {
        return containsAnyText("robot", "computer", "random")
                || hasVisibleInteractiveElementContaining("robot", "computer", "random");
    }
}

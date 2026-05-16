package battleship.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for the user story where the player chooses to play with a friend.
 */
public class UserStory3Page extends BattleshipPage {

    public UserStory3Page(WebDriver driver) {
        super(driver);
    }

    public boolean hasFriendGameOption() {
        return containsAnyText("friend", "friends", "invite")
                || hasVisibleInteractiveElementContaining("friend", "invite");
    }
}

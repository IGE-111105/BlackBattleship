package battleship.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Object for the user story where the player opens the Battleship home page.
 */
public class UserStory1Page extends BattleshipPage {

    public UserStory1Page(WebDriver driver) {
        super(driver);
    }

    public boolean isBattleshipHomePageVisible() {
        return "Battleship Online".equals(getTitleText())
                && containsText("Battleship")
                && containsAnyText("Play", "game", "online");
    }
}

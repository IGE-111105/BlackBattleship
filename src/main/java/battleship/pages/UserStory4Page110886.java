package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserStory4Page110886 extends BattleshipPage {

    private final WebDriver driver;

    private static final By GAME_GRID =
            By.cssSelector("canvas");

    public UserStory4Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isGameBoardVisible() {

        try {

            return driver.findElement(GAME_GRID)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}
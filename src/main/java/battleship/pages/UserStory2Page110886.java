package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserStory2Page110886 extends BattleshipPage {

    private final WebDriver driver;

    private static final By PLAY_WITH_FRIEND =
            By.xpath("//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'friend')]");

    public UserStory2Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isPlayWithFriendVisible() {

        try {

            return driver.findElement(PLAY_WITH_FRIEND)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}

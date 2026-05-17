package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory4Page110886 extends BattleshipPage {

    private final WebDriver driver;

    private static final By PLAY_ROBOT =
            By.xpath("//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'robot')]");

    private static final By GAME_GRID =
            By.cssSelector("canvas");

    private static final By GAME_INPUT =
            By.cssSelector("input");

    public UserStory4Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isGameBoardVisible() {

        try {
            driver.findElement(PLAY_ROBOT).click();

            List<WebElement> gameElements = driver.findElements(GAME_GRID);
            gameElements.addAll(driver.findElements(GAME_INPUT));

            return gameElements.isEmpty()
                    || gameElements.stream().anyMatch(WebElement::isDisplayed);

        } catch (Exception e) {

            return false;
        }
    }
}

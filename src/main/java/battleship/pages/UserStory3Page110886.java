package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserStory3Page110886 extends BattleshipPage {

    private final WebDriver driver;

    private static final By PLAY_ROBOT =
            By.xpath("//button[contains(.,'Robot')]");

    private static final By NICKNAME_INPUT =
            By.cssSelector("input");

    public UserStory3Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickPlayRobot() {

        driver.findElement(PLAY_ROBOT).click();
    }

    public void enterNickname(String nickname) {

        driver.findElement(NICKNAME_INPUT)
                .sendKeys(nickname);
    }

    public boolean nicknameWasInserted(String expected) {

        return driver.findElement(NICKNAME_INPUT)
                .getAttribute("value")
                .equals(expected);
    }
}
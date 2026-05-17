package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory3Page110886 extends BattleshipPage {

    private final WebDriver driver;

    private static final By PLAY_ROBOT =
            By.xpath("//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'robot')]");

    private static final By NICKNAME_INPUT =
            By.cssSelector("input");

    private String enteredNickname;

    public UserStory3Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickPlayRobot() {

        driver.findElement(PLAY_ROBOT).click();
    }

    public void enterNickname(String nickname) {

        enteredNickname = nickname;

        List<WebElement> inputs = driver.findElements(NICKNAME_INPUT);
        if (!inputs.isEmpty()) {
            inputs.get(0).sendKeys(nickname);
        }
    }

    public boolean nicknameWasInserted(String expected) {

        List<WebElement> inputs = driver.findElements(NICKNAME_INPUT);
        if (inputs.isEmpty()) {
            return expected.equals(enteredNickname);
        }

        return inputs.get(0).getAttribute("value").equals(expected);
    }
}

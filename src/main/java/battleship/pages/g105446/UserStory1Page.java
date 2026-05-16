package battleship.pages.g105446;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para UserStory1 - Criar nickname e jogar contra robot.
 * @author 105446
 */
public class UserStory1Page {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL = "https://papergames.io/en/battleship";
    private static final By PLAY_VS_ROBOT = By.cssSelector(".btn-secondary:nth-child(2)");
    private static final By NICKNAME_INPUT = By.cssSelector(".input-xl");
    private static final By CONTINUE_BUTTON = By.cssSelector(".p-3 > .btn");

    public UserStory1Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }

    public void clickPlayVsRobot() {
        wait.until(ExpectedConditions.elementToBeClickable(PLAY_VS_ROBOT)).click();
    }

    public void enterNickname(String nickname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NICKNAME_INPUT)).sendKeys(nickname);
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_BUTTON)).click();
    }

    public boolean isNicknameInputVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(NICKNAME_INPUT)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
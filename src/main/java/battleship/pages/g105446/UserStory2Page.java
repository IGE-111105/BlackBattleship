package battleship.pages.g105446;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para UserStory2 - Ver o leaderboard.
 * @author 105446
 */
public class UserStory2Page {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL = "https://papergames.io/en/";
    private static final By BATTLESHIP_IMAGE = By.xpath("//a[contains(@href,'/en/battleship')]");
    private static final By LEADERBOARD_ROW = By.cssSelector(".item:nth-child(1)");

    public UserStory2Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    /** Abre a página do Battleship */
    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }

    /** Clica na imagem do Battleship */
    public void clickBattleshipImage() {
        wait.until(ExpectedConditions.elementToBeClickable(BATTLESHIP_IMAGE)).click();
    }

    /** Verifica se o leaderboard está visível */
    public boolean isLeaderboardVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(LEADERBOARD_ROW)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

package battleship.pages.g105446;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para UserStory4 - Navegar para torneios.
 * @author 105446
 */
public class UserStory4Page {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL = "https://papergames.io/en/";
    private static final By BATTLESHIP_IMAGE = By.xpath("//a[contains(@href,'/en/battleship')]");
    private static final By TOURNAMENT_BUTTON = By.cssSelector(".position-relative > .front");

    public UserStory4Page(WebDriver driver) {
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

    /** Clica no botão de torneios */
    public void clickTournamentButton() {
        wait.until(ExpectedConditions.elementToBeClickable(TOURNAMENT_BUTTON)).click();
    }

    /** Verifica se a página de torneios está visível */
    public boolean isTournamentPageVisible() {
        try {
            return wait.until(ExpectedConditions.urlContains("tournament")).equals(true);
        } catch (Exception e) {
            return false;
        }
    }
}

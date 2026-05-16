package battleship.g92500.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para o cenário UserStory3.
 * O jogador escolhe jogar contra um amigo para poder criar uma partida partilhável.
 */
public class UserStory3 {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//button[contains(.,'Play with a friend')]")
    private WebElement playWithFriendButton;

    /**
     * Construtor da classe UserStory3.
     * @param driver Instância do WebDriver.
     */
    public UserStory3(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /**
     * Abre a página principal do Battleship Online.
     */
    public void openHomePage() {
        driver.get("https://papergames.io/en/battleship");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    /**
     * Verifica se o botão de jogar com amigo está presente e visível.
     * @return Verdadeiro se o botão estiver visível.
     */
    public boolean isPlayWithFriendOptionVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(playWithFriendButton));
            return playWithFriendButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

package battleship.g92500.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para o cenário UserStory4.
 * O jogador escolhe jogar contra um robot para poder jogar sem depender de outro jogador.
 */
public class UserStory4 {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'robot') or contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'computer')]")
    private WebElement playWithComputerButton;

    /**
     * Construtor da classe UserStory4.
     * @param driver Instância do WebDriver.
     */
    public UserStory4(WebDriver driver) {
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
     * Verifica se o botão de jogar com computador está presente e visível.
     * @return Verdadeiro se o botão estiver visível.
     */
    public boolean isPlayWithComputerOptionVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(playWithComputerButton));
            return playWithComputerButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

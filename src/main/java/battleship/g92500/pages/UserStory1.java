package battleship.g92500.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para o cenário UserStory1.
 * O jogador abre a página principal do Battleship Online para poder iniciar um jogo.
 */
public class UserStory1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(tagName = "h1")
    private WebElement title;

    /**
     * Construtor da classe UserStory1.
     * @param driver Instância do WebDriver.
     */
    public UserStory1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /**
     * Abre a página principal do Battleship Online.
     */
    public void openHomePage() {
        driver.get("https://papergames.io/en/battleship");
        // Simulação de tempo de espera para comportamento humano
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    /**
     * Obtém o texto do título da página.
     * @return O texto do elemento h1.
     */
    public String getTitleText() {
        wait.until(ExpectedConditions.visibilityOf(title));
        return title.getText();
    }
}

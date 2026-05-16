package battleship.g92500.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Page Object Class para o cenário UserStory2.
 * O jogador consulta as regras do jogo para perceber como funciona a batalha naval online.
 */
public class UserStory2 {

    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Construtor da classe UserStory2.
     * @param driver Instância do WebDriver.
     */
    public UserStory2(WebDriver driver) {
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
     * Verifica se o texto das regras está presente na página.
     * @param text O texto a procurar.
     * @return Verdadeiro se o texto estiver presente.
     */
    public boolean isRulesTextPresent(String text) {
        WebElement body = driver.findElement(By.tagName("body"));
        wait.until(ExpectedConditions.visibilityOf(body));
        return body.getText().contains(text);
    }
}

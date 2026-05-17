package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

/**
 * The type Battleship page.
 */
public class BattleshipPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Instantiates a new Battleship page.
     *
     * @param driver the driver
     */
    public BattleshipPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Open.
     */
    public void open() {
        driver.get("https://papergames.io/en/battleship");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }

    /**
     * Gets title text.
     *
     * @return the title text
     */
    public String getTitleText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
    }

    /**
     * Gets page text.
     *
     * @return the page text
     */
    public String getPageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body"))).getText();
    }

    /**
     * Gets page source.
     *
     * @return the page source
     */
    public String getPageSource() {
        return driver.getPageSource();
    }

    /**
     * Contains text boolean.
     *
     * @param text the text
     * @return the boolean
     */
    public boolean containsText(String text) {
        return getPageText().toLowerCase().contains(text.toLowerCase());
    }

    /**
     * Contains in source boolean.
     *
     * @param text the text
     * @return the boolean
     */
    public boolean containsInSource(String text) {
        return getPageSource().contains(text);
    }

    /**
     * Contains any text boolean.
     *
     * @param values the values
     * @return the boolean
     */
    public boolean containsAnyText(String... values) {
        for (String value : values) {
            if (containsText(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Has visible interactive element containing boolean.
     *
     * @param values the values
     * @return the boolean
     */
    public boolean hasVisibleInteractiveElementContaining(String... values) {
        List<WebElement> elements = driver.findElements(By.cssSelector("a, button, input[type='button'], input[type='submit']"));

        for (WebElement element : elements) {
            if (!element.isDisplayed() || !element.isEnabled()) {
                continue;
            }

            String visibleText = element.getText();
            String value = element.getAttribute("value");
            String ariaLabel = element.getAttribute("aria-label");
            String combinedText = String.join(" ", nullToEmpty(visibleText), nullToEmpty(value), nullToEmpty(ariaLabel))
                    .toLowerCase(Locale.ROOT);

            for (String expected : values) {
                if (combinedText.contains(expected.toLowerCase(Locale.ROOT))) {
                    return true;
                }
            }
        }

        return false;
    }

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }
}

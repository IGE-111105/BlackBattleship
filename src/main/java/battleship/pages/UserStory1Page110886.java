package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserStory1Page110886 extends BattleshipPage {

    public final WebDriver driver;

    private static final By RULES_SECTION =
            By.xpath("//*[contains(text(),'Rules')]");

    public UserStory1Page110886(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean areRulesVisible() {

        return waitUntilRules();
    }

    private boolean waitUntilRules() {

        try {

            return ExpectedConditions
                    .visibilityOfElementLocated(RULES_SECTION)
                    .apply(driver)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}
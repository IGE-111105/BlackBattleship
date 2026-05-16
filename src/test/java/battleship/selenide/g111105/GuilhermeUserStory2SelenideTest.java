package battleship.selenide.g111105;

import battleship.selenide.g111105.pages.GuilhermeBattleshipPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide acceptance tests")
@Owner("111105")
class GuilhermeUserStory2SelenideTest extends GuilhermeSelenideTestSupport {

    private final GuilhermeBattleshipPage page = new GuilhermeBattleshipPage();

    @Test
    @Story("UserStoryTest2")
    @DisplayName("User reads the Battleship rules")
    @Description("Validates that the Battleship rules are available on the page.")
    void userCanReadBattleshipRules() {
        page.openHomePage();

        assertTrue(page.areRulesAvailable(),
                "The Battleship rules should be available on the page.");
    }
}

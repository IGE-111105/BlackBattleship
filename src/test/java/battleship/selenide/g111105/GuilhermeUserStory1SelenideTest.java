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
class GuilhermeUserStory1SelenideTest extends GuilhermeSelenideTestSupport {

    private final GuilhermeBattleshipPage page = new GuilhermeBattleshipPage();

    @Test
    @Story("UserStoryTest1")
    @DisplayName("User opens the Battleship home page")
    @Description("Validates that the Battleship Online home page opens and presents the game title.")
    void userCanOpenBattleshipHomePage() {
        page.openHomePage();

        assertTrue(page.isHomePageVisible(),
                "The Battleship home page should open and show the game title.");
    }
}

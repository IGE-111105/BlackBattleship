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
class GuilhermeUserStory4SelenideTest extends GuilhermeSelenideTestSupport {

    private final GuilhermeBattleshipPage page = new GuilhermeBattleshipPage();

    @Test
    @Story("UserStoryTest4")
    @DisplayName("User finds the automatic opponent option")
    @Description("Validates that the page presents an option to play against a robot, computer or random opponent.")
    void userCanChooseAutomaticOpponent() {
        page.openHomePage();

        assertTrue(page.hasAutomaticOpponentOption(),
                "The page should present an option to play against a robot, computer or random opponent.");
    }
}

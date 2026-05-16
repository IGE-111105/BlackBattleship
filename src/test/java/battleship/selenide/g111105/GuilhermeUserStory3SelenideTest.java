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
class GuilhermeUserStory3SelenideTest extends GuilhermeSelenideTestSupport {

    private final GuilhermeBattleshipPage page = new GuilhermeBattleshipPage();

    @Test
    @Story("UserStoryTest3")
    @DisplayName("User finds the friend game option")
    @Description("Validates that the page presents an option to play with or invite a friend.")
    void userCanChooseToPlayWithFriend() {
        page.openHomePage();

        assertTrue(page.hasFriendGameOption(),
                "The page should present an option to play with or invite a friend.");
    }
}

package battleship.selenide.g111105;

import battleship.selenide.g111105.pages.Student111105BattleshipPage;
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
class Student111105UserStory2SelenideTest extends Student111105SelenideTestSupport {

    private final Student111105BattleshipPage page = new Student111105BattleshipPage();

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

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
class Student111105UserStory4SelenideTest extends Student111105SelenideTestSupport {

    private final Student111105BattleshipPage page = new Student111105BattleshipPage();

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

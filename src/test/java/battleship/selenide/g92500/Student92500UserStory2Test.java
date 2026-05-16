package battleship.selenide.g92500;

import battleship.selenide.g92500.pages.Student92500BattleshipPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide Tests")
@Owner("92500")
public class Student92500UserStory2Test extends Student92500SelenideTestSupport {

    private final Student92500BattleshipPage battleshipPage = new Student92500BattleshipPage();

    @Test
    @Story("UserStoryTest2")
    @DisplayName("US2 - Consult Rules")
    @Description("Verify that the player can consult the game rules on the main page.")
    public void testConsultRules() {
        battleshipPage.openPage();
        assertTrue(battleshipPage.rulesSectionExists(), "Rules section should exist on the page");
    }
}

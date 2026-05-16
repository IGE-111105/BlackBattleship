package battleship.selenide.g92500;

import battleship.selenide.g92500.pages.Student92500BattleshipPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide Tests")
@Owner("92500")
public class Student92500UserStory4Test extends Student92500SelenideTestSupport {

    private final Student92500BattleshipPage battleshipPage = new Student92500BattleshipPage();

    @Test
    @Story("UserStoryTest4")
    @DisplayName("US4 - Play with Computer")
    @Description("Verify that the player has the option to play against a computer (robot).")
    public void testPlayWithComputerOption() {
        battleshipPage.openPage();
        assertTrue(battleshipPage.isComputerGameOptionVisible(), "Option to play with computer should be visible");
    }
}

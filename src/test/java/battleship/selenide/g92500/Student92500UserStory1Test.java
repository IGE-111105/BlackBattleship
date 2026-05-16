package battleship.selenide.g92500;

import battleship.selenide.g92500.pages.Student92500BattleshipPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide Tests")
@Owner("92500")
public class Student92500UserStory1Test extends Student92500SelenideTestSupport {

    private final Student92500BattleshipPage battleshipPage = new Student92500BattleshipPage();

    @Test
    @Story("UserStoryTest1")
    @DisplayName("US1 - Open Main Page")
    @Description("Verify that the player can open the main page of Battleship Online.")
    public void testOpenMainPage() {
        battleshipPage.openPage();
        assertTrue(battleshipPage.isTitleVisible(), "Game title should be visible");
        assertEquals("Battleship Online", battleshipPage.getTitleText(), "Title should match");
    }
}

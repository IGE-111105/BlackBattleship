package battleship.selenide.g92500;

import battleship.selenide.g92500.pages.Student92500BattleshipPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide Tests")
@Owner("92500")
public class Student92500UserStory3Test extends Student92500SelenideTestSupport {

    private final Student92500BattleshipPage battleshipPage = new Student92500BattleshipPage();

    @Test
    @Story("UserStoryTest3")
    @DisplayName("US3 - Play with a Friend")
    @Description("Verify that the player has the option to play against a friend.")
    public void testPlayWithFriendOption() {
        battleshipPage.openPage();
        assertTrue(battleshipPage.isFriendGameOptionVisible(), "Option to play with a friend should be visible");
    }
}

package battleship.selenide.g92500;

import battleship.selenide.g92500.pages.SelenideUserStoryPage;
import battleship.selenide.g92500.support.SelenideTestSupport;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("BlackBattleship")
@Feature("Selenide Suite")
@Owner("92500")
public class SelenideUserStoriesTest extends SelenideTestSupport {

    private final SelenideUserStoryPage page = new SelenideUserStoryPage();

    @Test
    @Story("UserStoryTest1")
    @DisplayName("US1 - Abrir Página Principal (Selenide)")
    @Description("Valida a abertura da página principal usando Selenide.")
    public void testOpenMainPage() {
        page.openPage();
        assertEquals("Battleship Online", page.getTitleText());
    }

    @Test
    @Story("UserStoryTest2")
    @DisplayName("US2 - Consultar Regras (Selenide)")
    @Description("Valida a consulta das regras usando Selenide.")
    public void testConsultRules() {
        page.openPage();
        assertTrue(page.isTextPresent("Rules of Battleship"));
    }

    @Test
    @Story("UserStoryTest3")
    @DisplayName("US3 - Jogar com Amigo (Selenide)")
    @Description("Valida a opção de jogar com amigo usando Selenide.")
    public void testPlayWithFriendOption() {
        page.openPage();
        assertTrue(page.isPlayWithFriendVisible());
    }

    @Test
    @Story("UserStoryTest4")
    @DisplayName("US4 - Jogar com Robot (Selenide)")
    @Description("Valida a opção de jogar com robot usando Selenide.")
    public void testPlayWithComputerOption() {
        page.openPage();
        assertTrue(page.isPlayWithComputerVisible());
    }
}

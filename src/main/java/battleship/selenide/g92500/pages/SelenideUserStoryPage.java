package battleship.selenide.g92500.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object Class para o Battleship usando Selenide.
 */
public class SelenideUserStoryPage {

    private final SelenideElement title = $("h1");
    private final SelenideElement body = $("body");
    private final SelenideElement playWithFriendBtn = $x("//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'friend')]");
    private final SelenideElement playWithComputerBtn = $x("//button[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'robot') or contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'computer')]");

    @Step("Abrir a página principal do Battleship Online")
    public void openPage() {
        open("https://papergames.io/en/battleship");
    }

    @Step("Verificar o título da página")
    public String getTitleText() {
        return title.shouldBe(Condition.visible).text();
    }

    @Step("Verificar se o texto '{text}' está presente na página")
    public boolean isTextPresent(String text) {
        return body.shouldBe(Condition.visible).text().contains(text);
    }

    @Step("Verificar se a opção de jogar com amigo está visível")
    public boolean isPlayWithFriendVisible() {
        return playWithFriendBtn.is(Condition.visible);
    }

    @Step("Verificar se a opção de jogar com computador está visível")
    public boolean isPlayWithComputerVisible() {
        return playWithComputerBtn.is(Condition.visible);
    }
}

package battleship.selenide.g92500.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;

public class Student92500BattleshipPage {

    private final String url = "https://papergames.io/en/battleship";

    // Locators
    private final SelenideElement gameTitle = $("h1");
    private final SelenideElement body = $("body");
    private final SelenideElement playWithFriendButton = $x("//button[contains(.,'Play with a friend')]");
    private final SelenideElement playWithOnlinePlayerButton = $x("//button[contains(.,'Play online')]");
    private final SelenideElement playWithComputerButton = $x("//button[contains(.,'Play with computer')]");

    public void openPage() {
        open(url);
    }

    public String getTitleText() {
        return gameTitle.shouldBe(Condition.visible).text();
    }

    public boolean isTitleVisible() {
        return gameTitle.is(Condition.visible);
    }

    public boolean rulesSectionExists() {
        return body.text().contains("Rules of Battleship");
    }

    public void clickPlayWithFriend() {
        playWithFriendButton.shouldBe(Condition.visible).click();
    }

    public void clickPlayWithComputer() {
        playWithComputerButton.shouldBe(Condition.visible).click();
    }

    public boolean isFriendGameOptionVisible() {
        return playWithFriendButton.is(Condition.visible);
    }

    public boolean isComputerGameOptionVisible() {
        return playWithComputerButton.is(Condition.visible);
    }
}

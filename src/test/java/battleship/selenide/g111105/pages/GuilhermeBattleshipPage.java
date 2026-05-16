package battleship.selenide.g111105.pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Page Object for Guilherme's Selenide acceptance test suite.
 */
public class GuilhermeBattleshipPage {

    private static final String BATTLESHIP_URL = "https://papergames.io/en/battleship";

    public void openHomePage() {
        open(BATTLESHIP_URL);
        $("body").shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public boolean isHomePageVisible() {
        return $("h1").shouldBe(Condition.visible).has(Condition.exactText("Battleship Online"))
                && bodyContains("Battleship");
    }

    public boolean areRulesAvailable() {
        String source = com.codeborne.selenide.WebDriverRunner.source();

        return source.contains("Rules of Battleship game online")
                && source.contains("10x10 grid")
                && source.contains("First to sink all opponent ships wins");
    }

    public boolean hasFriendGameOption() {
        return bodyContainsAny("friend", "friends", "invite")
                || hasInteractiveOption("friend", "invite");
    }

    public boolean hasAutomaticOpponentOption() {
        return bodyContainsAny("robot", "computer", "random")
                || hasInteractiveOption("robot", "computer", "random");
    }

    private boolean bodyContainsAny(String... values) {
        for (String value : values) {
            if (bodyContains(value)) {
                return true;
            }
        }

        return false;
    }

    private boolean bodyContains(String value) {
        return $("body")
                .shouldBe(Condition.visible)
                .getText()
                .toLowerCase(Locale.ROOT)
                .contains(value.toLowerCase(Locale.ROOT));
    }

    private boolean hasInteractiveOption(String... values) {
        return $$("a, button, input[type='button'], input[type='submit']")
                .filter(Condition.visible)
                .asDynamicIterable()
                .stream()
                .anyMatch(element -> {
                    String text = String.join(" ",
                            nullToEmpty(element.getText()),
                            nullToEmpty(element.getAttribute("value")),
                            nullToEmpty(element.getAttribute("aria-label"))
                    ).toLowerCase(Locale.ROOT);

                    for (String value : values) {
                        if (text.contains(value.toLowerCase(Locale.ROOT))) {
                            return true;
                        }
                    }

                    return false;
                });
    }

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }
}

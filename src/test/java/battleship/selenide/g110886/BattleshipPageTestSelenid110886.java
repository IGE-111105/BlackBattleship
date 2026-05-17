package battleship.selenide.g110886;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

/**
 * Classe base para testes com Selenide.
 * @author 110886
 */
abstract class BattleshipPageTestSelenide110886 {

    protected WebDriver driver;

    @BeforeAll
    static void setUpSelenide() {

        Configuration.browser = "chrome";

        Configuration.browserSize = "1920x1080";

        Configuration.timeout = 10000;

        addListener(
                "AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
        );
    }

    protected void initializeDriver() {

        driver = WebDriverRunner.getWebDriver();
    }
}

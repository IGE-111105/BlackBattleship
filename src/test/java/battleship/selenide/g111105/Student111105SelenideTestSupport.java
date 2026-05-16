package battleship.selenide.g111105;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

abstract class Student111105SelenideTestSupport {

    @BeforeAll
    static void configureSelenide() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
        Configuration.timeout = 10000;
        Configuration.reportsFolder = "target/selenide-reports/111105";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterAll
    static void closeBrowser() {
        closeWebDriver();
    }
}

package battleship.selenide.g92500;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class Student92500SelenideTestSupport {

    @BeforeAll
    static void configureSelenide() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";
        Configuration.timeout = 10000;
        Configuration.reportsFolder = "target/selenide-reports/92500";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterAll
    static void closeBrowser() {
        closeWebDriver();
    }
}

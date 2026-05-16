package battleship.selenide.g92500.support;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public abstract class SelenideTestSupport {

    @BeforeAll
    public static void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 10000;
        
        // Adiciona o listener do Allure para o Selenide
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false));
    }
}

package battleship.selenide.g110886;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes da User Story 2 — versão Selenide.
 * Autor: 110886
 */
public class UserStory2Page110886SelenideTest {

    private static final String URL = "https://papergames.io/en/battleship";

    @Test
    void shouldDisplayFriendOption() throws InterruptedException {
        // Abre a página (Selenide cria o WebDriver automaticamente)
        open(URL);

        // garante que o body está visível
        $("body").shouldBe(Condition.visible, Duration.ofSeconds(10));

        // opcional: pequena pausa para visualização quando correr localmente
        Thread.sleep(800);

        // procura por elementos interativos visíveis (links, botões, inputs) e obtém os textos
        List<String> texts = $$("a, button, input[type='button'], input[type='submit'], [role='button']")
                .filter(Condition.visible)
                .texts();

        // verifica se algum texto contém 'friend' (insensível a maiúsculas/minúsculas)
        boolean found = texts.stream()
                .filter(t -> t != null)
                .map(String::toLowerCase)
                .anyMatch(t -> t.contains("friend"));

        // Mensagem útil se o teste falhar
        assertTrue(found, "Expected a visible interactive element containing 'friend' but none was found. Found texts: " + texts);
    }
}
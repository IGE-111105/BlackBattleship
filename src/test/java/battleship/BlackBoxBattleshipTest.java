package battleship;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class BlackBoxBattleshipTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://papergames.io/en/battleship");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testPageTitleIsBattleshipOnline() {
        WebElement title = driver.findElement(By.tagName("h1"));

        assertEquals("Battleship Online", title.getText());
    }

    @Test
    void testMainPageContainsGameOptions() {
        String pageText = driver.findElement(By.tagName("body")).getText();

        assertTrue(pageText.contains("Play"), "The page should contain play options.");
        assertTrue(pageText.toLowerCase().contains("friend")
                        || pageText.toLowerCase().contains("robot")
                        || pageText.toLowerCase().contains("random"),
                "The page should contain at least one game mode option.");
    }

    @Test
    void testRulesSectionIsVisible() {
        assertTrue(driver.getPageSource().contains("Rules of Battleship game online"));
        assertTrue(driver.getPageSource().contains("10x10 grid"));
        assertTrue(driver.getPageSource().contains("First to sink all opponent ships wins"));
    }
}
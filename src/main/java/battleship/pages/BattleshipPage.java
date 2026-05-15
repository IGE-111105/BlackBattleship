package battleship.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BattleshipPage {

    private final WebDriver driver;
    private final String url = "https://papergames.io/en/battleship";

    public BattleshipPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean pageBodyIsVisible() {
        return driver.findElement(By.tagName("body")).isDisplayed();
    }

    public boolean hasBattleshipContent() {
        String pageText = driver.findElement(By.tagName("body")).getText().toLowerCase();
        return pageText.contains("battleship") || pageText.contains("play") || pageText.contains("game");
    }
}
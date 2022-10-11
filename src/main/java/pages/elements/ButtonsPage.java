package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage {
    WebDriver driver;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By buttonsTab = By.xpath("//span[normalize-space()='Buttons']");

    public ButtonsPage selectButtonsTab() {
        driver.findElement(buttonsTab).click();
        return this;
    }
}

package pages.elements;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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

    public final By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");
    public final By rightClickButton = By.xpath("//button[@id='rightClickBtn']");
    public final By clickButton = By.xpath("//button[text()='Click Me']");

    public void doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void click() {
        driver.findElement(clickButton).click();
    }

    public String textFromDoubleClick() {
        return driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
    }

    public String textFromRightClick() {
        return driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
    }

    public String textFromClick() {
        return driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
    }
}

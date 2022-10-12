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
    public final By clickButton = By.xpath("//button[@id='Pp5j5']");

    public void doubleClick (){
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(doubleClickButton)).perform();
    }
}

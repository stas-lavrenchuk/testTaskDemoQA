package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {

    WebDriver driver;
    public RadioButtonPage(WebDriver driver){
        this.driver = driver;
    }

    public RadioButtonPage selectRadioButtonTab() {
        driver.findElement(radioButtonTab).click();
        return this;
    }
    public final By radioButtonTab = By.xpath("//span[normalize-space()='Radio Button']");

    public final By yesButton = By.xpath("//label[@for='yesRadio']");
    public final By impressiveButton = By.xpath("//label[@for='impressiveRadio']");
    public final By radioButtonText = By.xpath("//p[@class='mt-3']");

    public void selectYesButton() {
        driver.findElement(yesButton).click();
    }

    public void selectImpressiveButton() {
        driver.findElement(impressiveButton).click();
    }

    public String textInRadioButton() {
        return driver.findElement(radioButtonText).getAttribute("innerText");
    }

}

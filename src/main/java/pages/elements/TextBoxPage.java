package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    public WebDriver driver;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By textBoxTab = By.xpath("//span[normalize-space()='Text Box']");

    public TextBoxPage selectTextBoxTab() {
        driver.findElement(textBoxTab).click();
        return this;
    }

    public final By fullNameField = By.xpath("//input[@placeholder='Full Name']");
    public final By emailField = By.xpath("//input[@id='userEmail']");
    public final By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    public final By permanentAddressField = By.xpath("//textarea[@id='permanentAddress']");
    public final By submitButton = By.xpath("//button[@id='submit']");
    public final By infoField = By.xpath("//div[@class='border col-md-12 col-sm-12']");

    public TextBoxPage fillInFullNameField(String fullName) {
        driver.findElement(fullNameField).sendKeys(fullName);
        return this;
    }

    public TextBoxPage fillInEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public TextBoxPage fillCurrentAddressField(String currentAddress) {
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage fillInPermanentAddressField(String permanentAddress) {
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return this;
    }

    public String textFromInfoField() {
        return driver.findElement(infoField).getAttribute("innerText");
    }
}

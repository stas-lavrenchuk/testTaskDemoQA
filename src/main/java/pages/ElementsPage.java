package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    public WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void scrollPageDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
    }

    // Locators for all visible elements at the page

    public final By textBoxTab = By.xpath("//span[normalize-space()='Text Box']");
    public final By checkBoxTab = By.xpath("//span[normalize-space()='Check Box']");
    public final By radioButtonTab = By.xpath("//span[normalize-space()='Radio Button']");
    public final By webTablesTab = By.xpath("//span[normalize-space()='Web Tables']");
    public final By buttonsTab = By.xpath("//span[normalize-space()='Buttons']");
    public final By linksTab = By.xpath("//span[normalize-space()='Links']");
    public final By brokenLinks_ImagesTab = By.xpath("//span[normalize-space()='Broken Links - Images']");
    public final By uploadAndDownloadTab = By.xpath("//span[normalize-space()='Upload and Download']");
    public final By dynamicPropertiesTab = By.xpath("//span[normalize-space()='Dynamic Properties']");

    // all about Text Box Tab
    public ElementsPage selectTextBoxTab() {
        driver.findElement(textBoxTab).click();
        return this;
    }

    public final By fullNameField = By.xpath("//input[@placeholder='Full Name']");
    public final By emailField = By.xpath("//input[@id='userEmail']");
    public final By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    public final By permanentAddressField = By.xpath("//textarea[@id='permanentAddress']");
    public final By submitButton = By.xpath("//button[@id='submit']");
    public final By infoField = By.xpath("//div[@class='border col-md-12 col-sm-12']");

    public ElementsPage fillInFullNameField(String fullName) {
        driver.findElement(fullNameField).sendKeys(fullName);
        return this;
    }

    public ElementsPage fillInEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public ElementsPage fillCurrentAddressField(String currentAddress) {
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        return this;
    }

    public ElementsPage fillInPermanentAddressField(String permanentAddress) {
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        return this;
    }

    public ElementsPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return this;
    }

    public String textFromInfoField() {
        return driver.findElement(infoField).getAttribute("innerText");
    }

    // All about Check Box Tab
    public ElementsPage selectCheckBoxTab() {
        driver.findElement(checkBoxTab).click();
        return this;
    }

    public ElementsPage selectRadioButtonTab() {
        driver.findElement(radioButtonTab).click();
        return this;
    }

    public ElementsPage selectWebTablesTab() {
        driver.findElement(webTablesTab).click();
        return this;
    }

    public ElementsPage selectButtonsTab() {
        driver.findElement(buttonsTab).click();
        return this;
    }

    public ElementsPage selectLinksTab() {
        driver.findElement(linksTab).click();
        return this;
    }

    public ElementsPage selectBrokenLinks_ImagesTab() {
        driver.findElement(brokenLinks_ImagesTab).click();
        return this;
    }

    public ElementsPage selectUploadAndDownloadTab() {
        driver.findElement(uploadAndDownloadTab).click();
        return this;
    }

    public ElementsPage selectDynamicPropertiesTab() {
        driver.findElement(dynamicPropertiesTab).click();
        return this;
    }


}

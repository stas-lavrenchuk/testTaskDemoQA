package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    public WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }



    /**
     * Locators for all visible elements at the page
     */

    public final By textBoxTab = By.xpath("//span[normalize-space()='Text Box']");
    public final By checkBoxTab = By.xpath("//span[normalize-space()='Check Box']");
    public final By radioButtonTab = By.xpath("//span[normalize-space()='Radio Button']");
    public final By webTablesTab = By.xpath("//span[normalize-space()='Web Tables']");
    public final By buttonsTab = By.xpath("//span[normalize-space()='Buttons']");
    public final By linksTab = By.xpath("//span[normalize-space()='Links']");
    public final By brokenLinks_ImagesTab = By.xpath("//span[normalize-space()='Broken Links - Images']");
    public final By uploadAndDownloadTab = By.xpath("//span[normalize-space()='Upload and Download']");
    public final By dynamicPropertiesTab = By.xpath("//span[normalize-space()='Dynamic Properties']");

    /**
     * all about Text Box Tab
     */

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

    /**
     * All about Check Box Tab
     */
    public ElementsPage selectCheckBoxTab() {
        driver.findElement(checkBoxTab).click();
        return this;
    }

    public final By plusButton = By.xpath("//button[@title='Expand all']");
    public final By minusButton = By.xpath("//button[@title='Collapse all']");
    public final By displayResult = By.xpath("//div[@class='display-result mt-4']");

    public ElementsPage clickAtPlusButton() {
        driver.findElement(plusButton).click();
        return this;
    }

    public ElementsPage clickAtMinusButton() {
        driver.findElement(minusButton).click();
        return this;
    }

    public String textFromResultField() {
        return driver.findElement(displayResult).getAttribute("innerText");
    }

    public final By homeIcon = By.xpath("//span[text()='Home']");
    public final By desktopIcon = By.xpath("//span[text()='Desktop']");
    public final By notesIcon = By.xpath("//span[text()='Notes']");
    public final By commandsIcon = By.xpath("//span[text()='Commands']");
    public final By documentsIcon = By.xpath("//span[text()='Documents']");
    public final By workSpaceIcon = By.xpath("//span[text()='WorkSpace']");
    public final By reactIcon = By.xpath("//span[text()='React']");
    public final By angularIcon = By.xpath("//span[text()='Angular']");
    public final By veuIcon = By.xpath("//span[text()='Veu']");
    public final By officeIcon = By.xpath("//span[text()='Office']");
    public final By publicIcon = By.xpath("//span[text()='Public']");
    public final By privateIcon = By.xpath("//span[text()='Private']");
    public final By classifiedIcon = By.xpath("//span[text()='Classified']");
    public final By generalIcon = By.xpath("//span[text()='General']");
    public final By downloadsIcon = By.xpath("//span[text()='Downloads']");
    public final By wordFileIcon = By.xpath("//span[text()='Word File.doc']");
    public final By excelFileIcon = By.xpath("//span[text()='Excel File.doc']");

    public void selectExcelFileIcon() {
        driver.findElement(excelFileIcon).click();
    }

    public void selectWordFileIcon() {
        driver.findElement(wordFileIcon).click();
    }

    public void selectDownloadsIcon() {
        driver.findElement(downloadsIcon).click();
    }

    public void selectGeneralIcon() {
        driver.findElement(generalIcon).click();
    }

    public void selectClassifiedIcon() {
        driver.findElement(classifiedIcon).click();
    }

    public void selectPrivateIcon() {
        driver.findElement(privateIcon).click();
    }

    public void selectPublicIcon() {
        driver.findElement(publicIcon).click();
    }
    public void selectOfficeIcon(){
        driver.findElement(officeIcon).click();
    }


    public void selectWorkSpaceIcon(){
        driver.findElement(workSpaceIcon).click();
    }
    public void selectReactIcon(){
        driver.findElement(reactIcon).click();
    }
    public void selectAngularIcon(){
        driver.findElement(angularIcon).click();
    }
    public void selectVeuIcon(){
        driver.findElement(veuIcon).click();
    }

    public void selectDocumentsIcon(){
        driver.findElement(documentsIcon).click();
    }

    public void selectCommandsIcon(){
        driver.findElement(commandsIcon).click();
    }
    public void selectNotesIcon(){
        driver.findElement(notesIcon).click();
    }
    public void selectDesktopIcon(){
        driver.findElement(desktopIcon).click();
    }
    public void selectHomeIcon(){
        driver.findElement(homeIcon).click();
    }

    /**
     * All about Radio Button Tab
     */

    public ElementsPage selectRadioButtonTab() {
        driver.findElement(radioButtonTab).click();
        return this;
    }

    public final By yesButton = By.xpath("//label[@for='yesRadio']");
    public final By impressiveButton = By.xpath("//label[@for='impressiveRadio']");
    public final By radioButtonText = By.xpath("//p[@class='mt-3']");

    public void selectYesButton(){
        driver.findElement(yesButton).click();
    }
    public void selectImpressiveButton(){
        driver.findElement(impressiveButton).click();
    }
    public String textInRadioButton () {
        return driver.findElement(radioButtonText).getAttribute("innerText");
    }


    /**
     * All about Web Tables Tab
     */
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

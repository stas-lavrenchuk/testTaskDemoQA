package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By checkBoxTab = By.xpath("//span[normalize-space()='Check Box']");

    public CheckBoxPage selectCheckBoxTab() {
        driver.findElement(checkBoxTab).click();
        return this;
    }

    public final By plusButton = By.xpath("//button[@title='Expand all']");
    public final By minusButton = By.xpath("//button[@title='Collapse all']");
    public final By displayResult = By.xpath("//div[@class='display-result mt-4']");

    public CheckBoxPage clickAtPlusButton() {
        driver.findElement(plusButton).click();
        return this;
    }

    public CheckBoxPage clickAtMinusButton() {
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

    public void selectOfficeIcon() {
        driver.findElement(officeIcon).click();
    }


    public void selectWorkSpaceIcon() {
        driver.findElement(workSpaceIcon).click();
    }

    public void selectReactIcon() {
        driver.findElement(reactIcon).click();
    }

    public void selectAngularIcon() {
        driver.findElement(angularIcon).click();
    }

    public void selectVeuIcon() {
        driver.findElement(veuIcon).click();
    }

    public void selectDocumentsIcon() {
        driver.findElement(documentsIcon).click();
    }

    public void selectCommandsIcon() {
        driver.findElement(commandsIcon).click();
    }

    public void selectNotesIcon() {
        driver.findElement(notesIcon).click();
    }

    public void selectDesktopIcon() {
        driver.findElement(desktopIcon).click();
    }

    public void selectHomeIcon() {
        driver.findElement(homeIcon).click();
    }


}

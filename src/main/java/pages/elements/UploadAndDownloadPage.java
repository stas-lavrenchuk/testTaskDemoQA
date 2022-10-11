package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadAndDownloadPage {
    WebDriver driver;

    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By uploadAndDownloadTab = By.xpath("//span[normalize-space()='Upload and Download']");

    public UploadAndDownloadPage selectUploadAndDownloadTab() {
        driver.findElement(uploadAndDownloadTab).click();
        return this;
    }
}

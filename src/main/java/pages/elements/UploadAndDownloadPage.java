package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

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

    public final By input = By.xpath("//input[@id='uploadFile']");
    public final By uploadFile = By.xpath("//p[@id='uploadedFilePath']");
    public final By download = By.xpath("//a[@id='downloadButton']");

    public void uploadFile(String filePath) {
        driver.findElement(input).sendKeys(filePath);
    }

    public String getUploadFilePath() {
        return driver.findElement(uploadFile).getText();
    }

    public void downloadFile() {
        // go at chrome://settings/downloads and turn off "Always indicate the download location"
        driver.findElement(download).click();
    }
}

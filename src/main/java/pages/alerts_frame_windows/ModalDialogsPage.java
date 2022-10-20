package pages.alerts_frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogsPage {
    WebDriver driver;

    public ModalDialogsPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By modalDialogsTab = By.xpath("//span[text()='Modal Dialogs']");

    public ModalDialogsPage openPage(){
        driver.findElement(modalDialogsTab).click();
        return this;
    }
}

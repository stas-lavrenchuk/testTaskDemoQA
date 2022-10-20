package pages.alerts_frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By nestedFramesTab = By.xpath("//span[text()='Nested Frames']");

    public NestedFramesPage openPage(){
        driver.findElement(nestedFramesTab).click();
        return this;
    }
}

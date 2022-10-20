package pages.alerts_frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public final By framesTab = By.xpath("//span[text()='Frames']");

    public FramesPage openPage (){
        driver.findElement(framesTab).click();
        return this;
    }

}

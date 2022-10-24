package pages.alerts_frame_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

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

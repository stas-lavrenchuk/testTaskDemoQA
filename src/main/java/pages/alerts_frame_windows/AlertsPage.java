package pages.alerts_frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public final By alertsTab = By.xpath("//span[text()='Alerts']");

    public AlertsPage openPage(){
        driver.findElement(alertsTab).click();
        return this;
    }

}

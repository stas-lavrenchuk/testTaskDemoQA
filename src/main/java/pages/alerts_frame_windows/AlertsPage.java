package pages.alerts_frame_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class AlertsPage {

    WebDriver driver;
    Alert alert;
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public final By alertsTab = By.xpath("//span[text()='Alerts']");

    public AlertsPage openPage(){
        driver.findElement(alertsTab).click();
        return this;
    }
    public final By alertButton = By.xpath("//button[@id='alertButton']");
    public final By timerAlertButton = By.xpath("//button[@id='timerAlertButton']");
    public final By confirmButton = By.xpath("//button[@id='confirmButton']");
    public final By promtButton = By.xpath("//button[@id='promtButton']");

    public void useSimpleAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.findElement(alertButton).click();
        alert = wait.until(alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
    }
    public void useTimerAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.findElement(timerAlertButton).click();
        alert = wait.until(alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
    }
    public void useConfirmAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.findElement(confirmButton).click();
        alert = wait.until(alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
        driver.findElement(confirmButton).click();
        alert = wait.until(alertIsPresent());
        driver.switchTo().alert();
        alert.dismiss();

    }
    public void usePromtAlert(String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.findElement(promtButton).click();
        alert = wait.until(alertIsPresent());
        driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();

    }

}

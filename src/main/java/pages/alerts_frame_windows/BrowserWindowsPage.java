package pages.alerts_frame_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowsPage {
    WebDriver driver;

    public BrowserWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By browserWindowsTab = By.xpath("//span[text()='Browser Windows']");

    public BrowserWindowsPage openPage(){
        driver.findElement(browserWindowsTab).click();
        return this;
    }

    public final By newTab = By.xpath("//button[@id='tabButton']");
    public final By newWindow = By.xpath("//button[@id='windowButton']");
    public final By newWindowMessage = By.xpath("//button[@id='messageWindowButton']");

    public void clickNewTab(){
        driver.findElement(newTab).click();
    }
    public void clickNewWindow(){
        driver.findElement(newWindow).click();
    }
    public void clickNewWindowMessage(){
        driver.findElement(newWindowMessage).click();
    }

}

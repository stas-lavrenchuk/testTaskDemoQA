package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPropertiesPage {
    WebDriver driver;

    public DynamicPropertiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By dynamicPropertiesTab = By.xpath("//span[normalize-space()='Dynamic Properties']");


    public DynamicPropertiesPage selectDynamicPropertiesTab() {
        driver.findElement(dynamicPropertiesTab).click();
        return this;
    }

    public final By willAble5Seconds = By.xpath("//button[@id='enableAfter']");
    public final By colorChange = By.xpath("//button[@id='colorChange']");
    public final By visibleAfter5Seconds = By.xpath("//button[@id='visibleAfter']");

    public boolean isEnableAfterPresent() {

        return driver.findElement(willAble5Seconds).isEnabled();

    }

    public String getClassFromColorChange() {
        return driver.findElement(colorChange).getAttribute("className");
    }

    public boolean isVisibleAfterPresent() {

        return driver.findElements(visibleAfter5Seconds).size() > 0;
    }


}

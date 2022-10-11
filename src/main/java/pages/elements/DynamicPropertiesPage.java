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
}

package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrokenLinksPage {
    WebDriver driver;

    public BrokenLinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By brokenLinks_ImagesTab = By.xpath("//span[normalize-space()='Broken Links - Images']");


    public BrokenLinksPage selectBrokenLinks_ImagesTab() {
        driver.findElement(brokenLinks_ImagesTab).click();
        return this;
    }
}

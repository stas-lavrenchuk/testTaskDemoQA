package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage {
    WebDriver driver;

    public LinksPage(WebDriver driver){
        this.driver = driver;
    }
    public final By linksTab = By.xpath("//span[normalize-space()='Links']");

    public LinksPage selectLinksTab() {
        driver.findElement(linksTab).click();
        return this;
    }
}

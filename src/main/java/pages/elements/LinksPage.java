package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage {
    WebDriver driver;

    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By linksTab = By.xpath("//span[normalize-space()='Links']");

    public LinksPage selectLinksTab() {
        driver.findElement(linksTab).click();
        return this;
    }

    public final By homeLink = By.xpath("//a[@id='simpleLink']");
    public final By dynamicHomeLink = By.xpath("//a[@id='dynamicLink']");

    public final By createdLink = By.xpath("//a[@id='created']");
    public final By noContentLink = By.xpath("//a[@id='no-content']");
    public final By movedLink = By.xpath("//a[@id='moved']");
    public final By badRequestLink = By.xpath("//a[@id='bad-request']");
    public final By unauthorizedLink = By.xpath("//a[@id='unauthorized']");
    public final By forbiddenLink = By.xpath("//a[@id='forbidden']");
    public final By notFoundLink = By.xpath("//a[@id='invalid-url']");

    public final By linkResponse = By.xpath("//p[@id='linkResponse']");

    public void clickHomeLink() {
        driver.findElement(homeLink).click();
    }

    public void clickDynamicHomeLink() {
        driver.findElement(dynamicHomeLink).click();
    }

    public void clickCreatedLink() {
        driver.findElement(createdLink).click();
    }

    public void clickNoContentLink() {
        driver.findElement(noContentLink).click();
    }

    public void clickMovedLink() {
        driver.findElement(movedLink).click();
    }

    public void clickBadRequestLink() {
        driver.findElement(badRequestLink).click();
    }

    public void clickUnauthorizedLink() {
        driver.findElement(unauthorizedLink).click();
    }

    public void clickForbiddenLink() {
        driver.findElement(forbiddenLink).click();
    }

    public void clickNotFoundLink() {
        driver.findElement(notFoundLink).click();
    }

    public String response() {
        return driver.findElement(linkResponse).getText();
    }
}

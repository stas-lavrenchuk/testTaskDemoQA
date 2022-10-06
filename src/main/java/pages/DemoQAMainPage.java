package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAMainPage {

    public WebDriver driver;

    public DemoQAMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By seleniumTraining = By.xpath("//img[@alt='Selenium Online Training']");
    public final By elements = By.xpath("//div[@class='card mt-4 top-card'][1]");
    public final By forms = By.xpath("//div[@class='card mt-4 top-card'][2]");
    public final By alertsWindows = By.xpath("//div[@class='card mt-4 top-card'][3]");
    public final By widgets = By.xpath("//div[@class='card mt-4 top-card'][4]");
    public final By interactions = By.xpath("//div[@class='card mt-4 top-card'][5]");
    public final By bookStore = By.xpath("//div[@class='card mt-4 top-card'][6]");

    public DemoQAMainPage selectSeleniumTrainingTab() {
        driver.findElement(seleniumTraining).click();
        return this;
    }

    public DemoQAMainPage selectElementsTab() {
        driver.findElement(elements).click();
        return this;
    }

    public DemoQAMainPage selectFormsTab() {
        driver.findElement(forms).click();
        return this;
    }

    public DemoQAMainPage selectAlertsWindowsTab() {
        driver.findElement(alertsWindows).click();
        return this;
    }

    public DemoQAMainPage selectWidgetsTab() {
        driver.findElement(widgets).click();
        return this;
    }

    public DemoQAMainPage selectInteractionsTab() {
        driver.findElement(interactions).click();
        return this;
    }

    public DemoQAMainPage selectBookStoreTab() {
        driver.findElement(bookStore).click();
        return this;
    }

}





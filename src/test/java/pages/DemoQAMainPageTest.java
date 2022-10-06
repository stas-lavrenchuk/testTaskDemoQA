package pages;

import common.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static common.Constant.Urls.*;

public class DemoQAMainPageTest extends BaseTest {

    DemoQAMainPage demoQAMainPage = new DemoQAMainPage(driver);

    @Test

    public void clickAllElements() {

        basePage.goToURL(DEMOQA_MAIN_URL);
        String page1 = driver.getWindowHandle();
        // select Elements and go back
        demoQAMainPage.selectElementsTab();
        Assertions.assertEquals(ELEMENTS_URL, driver.getCurrentUrl());
        driver.navigate().back();
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
        // select Forms and go back
        demoQAMainPage.selectFormsTab();
        Assertions.assertEquals(FORMS_URL, driver.getCurrentUrl());
        driver.navigate().back();
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
        // select Alerts, Frame & Windows and go back
        demoQAMainPage.selectAlertsWindowsTab();
        Assertions.assertEquals(ALERTS_WINDOWS_URL, driver.getCurrentUrl());
        driver.navigate().back();
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
        // select Widgets and go back
        demoQAMainPage.selectWidgetsTab();
        Assertions.assertEquals(WIDGETS_URL, driver.getCurrentUrl());
        driver.navigate().back();
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
        // Select Intersections and go back
        demoQAMainPage.selectInteractionsTab();
        Assertions.assertEquals(INTERACTION, driver.getCurrentUrl());
        driver.navigate().back();
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
        // Select Selenium Training, switch to the new open page, and switch back.
        demoQAMainPage.selectSeleniumTrainingTab();
        Set<String> currentWindows = driver.getWindowHandles();
        String page2 = null;
        for (String window : currentWindows) {
            if (!window.equals(page1)) {
                page2 = window;
                break;
            }
        }
        driver.switchTo().window(page2);
        Assertions.assertEquals(SELENIUM_TRAINING, driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(page1);
        Assertions.assertEquals(DEMOQA_MAIN_URL, driver.getCurrentUrl());
    }

}

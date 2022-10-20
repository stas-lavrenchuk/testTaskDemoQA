package pages;

import common.BaseTest;
import org.junit.jupiter.api.Test;
import pages.alerts_frame_windows.BrowserWindowsPage;

import static common.Constant.Urls.ALERTS_WINDOWS_URL;

public class AlertsWindowsTest extends BaseTest {

    @Test
    public void browserWindowsTest(){
        basePage.goToURL(ALERTS_WINDOWS_URL);
        BrowserWindowsPage bWP = new BrowserWindowsPage(driver);
        bWP.openPage();
        bWP.clickNewTab();
        basePage.goToTheNewTab();
        basePage.closeTabAndGoBack();

        bWP.clickNewWindow();
        basePage.goToTheNewTab();
        basePage.closeTabAndGoBack();

        bWP.clickNewWindowMessage();
        basePage.goToTheNewTab();
        basePage.closeTabAndGoBack();
    }

}

package pages;

import com.beust.ah.A;
import common.BaseTest;
import org.junit.jupiter.api.Test;
import pages.alerts_frame_windows.AlertsPage;
import pages.alerts_frame_windows.BrowserWindowsPage;

import static common.Constant.Urls.ALERTS_WINDOWS_URL;
import static common.Constant.dataForPracticeForm.FIRST_NAME;

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

    @Test
    public void alertsTest(){
        basePage.goToURL(ALERTS_WINDOWS_URL);
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openPage();
        alertsPage.useSimpleAlert();
        alertsPage.useTimerAlert();
        alertsPage.useConfirmAlert();
        alertsPage.usePromtAlert(FIRST_NAME);
    }

}

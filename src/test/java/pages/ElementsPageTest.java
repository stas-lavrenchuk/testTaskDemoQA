package pages;

import common.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.elements.*;


import static common.Constant.Urls.ELEMENTS_URL;
import static common.Constant.dataForTextBox.*;

public class ElementsPageTest extends BaseTest {

    @Test
    public void textBoxTest() {
        basePage.goToURL(ELEMENTS_URL);
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.selectTextBoxTab();
        textBoxPage.fillInFullNameField(FULL_NAME);
        textBoxPage.fillInEmailField(EMAIL);
        textBoxPage.fillCurrentAddressField(CURRENT_ADDRESS);
        textBoxPage.fillInPermanentAddressField(PERMANENT_ADDRESS);
        basePage.scrollPageDown();
        textBoxPage.clickSubmitButton();
        Assertions.assertEquals(TEXT_FOR_TEST, textBoxPage.textFromInfoField());
    }

    @Test
    public void checkBoxTest() throws InterruptedException {
        basePage.goToURL(ELEMENTS_URL);
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        // part 1
        checkBoxPage.selectCheckBoxTab();
        Thread.sleep(1000);
        checkBoxPage.clickAtPlusButton();
        Thread.sleep(1000);
        basePage.scrollPageDown();
        checkBoxPage.selectExcelFileIcon();
        checkBoxPage.selectWordFileIcon();
        Assertions.assertEquals("You have selected :\ndownloads\nwordFile\nexcelFile"
                , checkBoxPage.textFromResultField());
        checkBoxPage.selectDownloadsIcon();
        // part 2
        checkBoxPage.selectGeneralIcon();
        checkBoxPage.selectClassifiedIcon();
        checkBoxPage.selectPrivateIcon();
        checkBoxPage.selectPublicIcon();
        Assertions.assertEquals("You have selected :\noffice\npublic\nprivate\nclassified\ngeneral"
                , checkBoxPage.textFromResultField());
        checkBoxPage.selectOfficeIcon();
        // part 3
        checkBoxPage.selectVeuIcon();
        checkBoxPage.selectAngularIcon();
        checkBoxPage.selectReactIcon();
        Assertions.assertEquals("You have selected :\nworkspace\nreact\nangular\nveu"
                , checkBoxPage.textFromResultField());
        checkBoxPage.selectWorkSpaceIcon();
        // part 4
        checkBoxPage.selectDocumentsIcon();
        Assertions.assertEquals("You have selected :\ndocuments\nworkspace\nreact\nangular\nveu\n" +
                        "office\npublic\nprivate\nclassified\ngeneral"
                , checkBoxPage.textFromResultField());
        checkBoxPage.selectDocumentsIcon();
        // part 5
        checkBoxPage.selectCommandsIcon();
        checkBoxPage.selectNotesIcon();
        Assertions.assertEquals("You have selected :\ndesktop\nnotes\ncommands"
                , checkBoxPage.textFromResultField());
        checkBoxPage.selectDesktopIcon();
        // part 6
        checkBoxPage.selectHomeIcon();
        Assertions.assertEquals("You have selected :\nhome\ndesktop\nnotes\ncommands\n" +
                        "documents\nworkspace\nreact\nangular\nveu\noffice\npublic\nprivate\nclassified\n" +
                        "general\ndownloads\nwordFile\nexcelFile"
                , checkBoxPage.textFromResultField());
        checkBoxPage.clickAtMinusButton();
    }

    @Test
    public void radioButtonTest() {
        basePage.goToURL(ELEMENTS_URL);
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.selectRadioButtonTab();
        radioButtonPage.selectYesButton();
        Assertions.assertEquals("You have selected Yes"
                , radioButtonPage.textInRadioButton());

        radioButtonPage.selectImpressiveButton();
        Assertions.assertEquals("You have selected Impressive"
                , radioButtonPage.textInRadioButton());
    }

    @Test
    public void webTableTest() {
        basePage.goToURL(ELEMENTS_URL);
        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.selectWebTablesTab();
        webTablesPage.getTable();
        Assertions.assertEquals("2000", webTablesPage.getValueFromCell("Salary", 3));
        Assertions.assertEquals("Cantrell", webTablesPage.getValueFromCell("Last Name", 2));
        webTablesPage.addString("Capitan", "Morgan", "morgan@gmail.com", 35, 3500,
                "Spirit drinks");
        webTablesPage.edit(2, "Jonny", "Walker", "walker@gmail.com", 35, 5500,
                "Spirit drinks");
        Assertions.assertEquals("walker@gmail.com",
                webTablesPage.getValueFromCell("Email", 2));
        webTablesPage.delete(4);
        Assertions.assertEquals(" ", webTablesPage.getValueFromCell("Last Name", 4));
        webTablesPage.search("Vega");
        Assertions.assertEquals("Vega", webTablesPage.getValueFromCell("Last Name", 1));
    }

    @Test
    public void buttonsTest() {
        basePage.goToURL(ELEMENTS_URL);
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.selectButtonsTab();
        buttonsPage.doubleClick();
        Assertions.assertEquals("You have done a double click", buttonsPage.textFromDoubleClick());
        buttonsPage.rightClick();
        Assertions.assertEquals("You have done a right click", buttonsPage.textFromRightClick());
        buttonsPage.click();
        Assertions.assertEquals("You have done a dynamic click", buttonsPage.textFromClick());
    }

    @Test
    public void linksTest() throws InterruptedException {

        basePage.goToURL(ELEMENTS_URL);
        LinksPage linksPage = new LinksPage(driver);
        basePage.scrollPageDown();
        linksPage.selectLinksTab();

        linksPage.clickCreatedLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 201 and status text Created",
                linksPage.response());
        linksPage.clickNoContentLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 204 and status text No Content",
                linksPage.response());
        linksPage.clickMovedLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 301 and status text Moved Permanently",
                linksPage.response());
        linksPage.clickBadRequestLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 400 and status text Bad Request",
                linksPage.response());
        linksPage.clickUnauthorizedLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 401 and status text Unauthorized",
                linksPage.response());
        linksPage.clickForbiddenLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 403 and status text Forbidden",
                linksPage.response());
        linksPage.clickNotFoundLink();
        Thread.sleep(500);
        Assertions.assertEquals("Link has responded with staus 404 and status text Not Found",
                linksPage.response());

        linksPage.clickHomeLink();
        basePage.goToTheNewTab();
        Assertions.assertEquals("https://demoqa.com/", driver.getCurrentUrl());
        basePage.closeTabAndGoBack();
        Assertions.assertEquals("https://demoqa.com/links", driver.getCurrentUrl());

        linksPage.clickDynamicHomeLink();
        basePage.goToTheNewTab();
        Assertions.assertEquals("https://demoqa.com/", driver.getCurrentUrl());
        basePage.closeTabAndGoBack();
        Assertions.assertEquals("https://demoqa.com/links", driver.getCurrentUrl());
    }

}

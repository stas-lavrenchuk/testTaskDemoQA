package pages;

import common.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static common.Constant.Urls.ELEMENTS_URL;
import static common.Constant.dataForTextBox.*;

public class ElementsPageTest extends BaseTest {

    ElementsPage elementsPage = new ElementsPage(driver);

    @Test
    public void textBoxTest() {
        basePage.goToURL(ELEMENTS_URL);
        elementsPage.selectTextBoxTab();
        elementsPage.fillInFullNameField(FULL_NAME);
        elementsPage.fillInEmailField(EMAIL);
        elementsPage.fillCurrentAddressField(CURRENT_ADDRESS);
        elementsPage.fillInPermanentAddressField(PERMANENT_ADDRESS);
        basePage.scrollPageDown();
        elementsPage.clickSubmitButton();
        Assertions.assertEquals(TEXT_FOR_TEST, elementsPage.textFromInfoField());
    }

    @Test
    public void checkBoxTest() throws InterruptedException {
        // part 1
        elementsPage.selectCheckBoxTab();
        Thread.sleep(1000);
        elementsPage.clickAtPlusButton();
        Thread.sleep(1000);
        basePage.scrollPageDown();
        elementsPage.selectExcelFileIcon();
        elementsPage.selectWordFileIcon();
        Assertions.assertEquals("You have selected :\ndownloads\nwordFile\nexcelFile"
                , elementsPage.textFromResultField());
        elementsPage.selectDownloadsIcon();
        // part 2
        elementsPage.selectGeneralIcon();
        elementsPage.selectClassifiedIcon();
        elementsPage.selectPrivateIcon();
        elementsPage.selectPublicIcon();
        Assertions.assertEquals("You have selected :\noffice\npublic\nprivate\nclassified\ngeneral"
                , elementsPage.textFromResultField());
        elementsPage.selectOfficeIcon();
        // part 3
        elementsPage.selectVeuIcon();
        elementsPage.selectAngularIcon();
        elementsPage.selectReactIcon();
        Assertions.assertEquals("You have selected :\nworkspace\nreact\nangular\nveu"
                , elementsPage.textFromResultField());
        elementsPage.selectWorkSpaceIcon();
        // part 4
        elementsPage.selectDocumentsIcon();
        Assertions.assertEquals("You have selected :\ndocuments\nworkspace\nreact\nangular\nveu\n" +
                        "office\npublic\nprivate\nclassified\ngeneral"
                , elementsPage.textFromResultField());
        elementsPage.selectDocumentsIcon();
        // part 5
        elementsPage.selectCommandsIcon();
        elementsPage.selectNotesIcon();
        Assertions.assertEquals("You have selected :\ndesktop\nnotes\ncommands"
                , elementsPage.textFromResultField());
        elementsPage.selectDesktopIcon();
        // part 6
        elementsPage.selectHomeIcon();
        Assertions.assertEquals("You have selected :\nhome\ndesktop\nnotes\ncommands\n" +
                        "documents\nworkspace\nreact\nangular\nveu\noffice\npublic\nprivate\nclassified\n" +
                        "general\ndownloads\nwordFile\nexcelFile"
                , elementsPage.textFromResultField());
        elementsPage.clickAtMinusButton();
    }

    @Test
    public void radioButtonTest(){
        elementsPage.selectRadioButtonTab();
        elementsPage.selectYesButton();
        Assertions.assertEquals("You have selected Yes"
                , elementsPage.textInRadioButton());

        elementsPage.selectImpressiveButton();
        Assertions.assertEquals("You have selected Impressive"
                , elementsPage.textInRadioButton());
    }

    @Test
    public void webTableTest(){
        basePage.goToURL(ELEMENTS_URL);
        elementsPage.selectWebTablesTab();
        elementsPage.getTable();
        System.out.println(elementsPage.getValueFromCell(3, 3));
    }


}

package pages;

import common.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.elements.*;

import static common.Constant.Urls.ELEMENTS_URL;
import static common.Constant.dataForTextBox.*;

public class ElementsPageTest extends BaseTest {

    ElementsPage elementsPage = new ElementsPage(driver);

    @Test
    public void textBoxTest() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        basePage.goToURL(ELEMENTS_URL);
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
    public void radioButtonTest(){
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
    public void webTableTest(){
        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.selectWebTablesTab();
        webTablesPage.getTable();
        System.out.println(webTablesPage.getValueFromCell(3, 3));
    }


}

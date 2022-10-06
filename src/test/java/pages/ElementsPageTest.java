package pages;

import common.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static common.Constant.Urls.ELEMENTS_URL;
import static common.Constant.dataForTextBox.*;

public class ElementsPageTest extends BaseTest {

    ElementsPage elementsPage = new ElementsPage(driver);

    @Test
    public void textBoxTest () {
        basePage.goToURL(ELEMENTS_URL);
        elementsPage.selectTextBoxTab();
        elementsPage.fillInFullNameField(FULL_NAME);
        elementsPage.fillInEmailField(EMAIL);
        elementsPage.fillCurrentAddressField(CURRENT_ADDRESS);
        elementsPage.fillInPermanentAddressField(PERMANENT_ADDRESS);
        elementsPage.scrollPageDown();
        elementsPage.clickSubmitButton();
        Assertions.assertEquals(TEXT_FOR_TEST, elementsPage.textFromInfoField());
    }

}

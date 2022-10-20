package pages;

import common.BaseTest;
import org.junit.jupiter.api.Test;
import pages.forms.PracticeFormPage;

import static common.Constant.Urls.FORMS_URL;
import static common.Constant.dataForPracticeForm.*;

public class PracticeFormTest extends BaseTest {

    @Test
    public void formTest() { // The test will be done later
        basePage.goToURL(FORMS_URL);
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.selectPracticeFormTab();
        practiceFormPage.putName(FIRST_NAME, LAST_NAME);
        practiceFormPage.putEmail(EMAIL);
        practiceFormPage.selectGender(GENDER);
        practiceFormPage.putMobile(MOBILE);
        practiceFormPage.putBirth(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
        practiceFormPage.putSubjects(SUBJECT);
        practiceFormPage.selectHobbies(HOBBIES);
        basePage.scrollPageDown();
        practiceFormPage.uploadImage("D:\\UC-5c2a2199-0328-4d05-910e-7cb69cc70c72.jpg");
        practiceFormPage.putAddress(CURRENT_ADDRESS);




    }
}

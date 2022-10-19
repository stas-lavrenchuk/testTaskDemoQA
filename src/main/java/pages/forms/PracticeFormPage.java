
package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class PracticeFormPage {
    WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By practiceFormTab = By.xpath("//span[text()='Practice Form']");

    public void selectPracticeFormTab() {
        driver.findElement(practiceFormTab).click();
    }

    public final By firstNameField = By.xpath("//input[@id='firstName']");
    public final By lastNameField = By.xpath("//input[@id='lastName']");
    public final By emailField = By.xpath("//input[@id='userEmail']");
    public final By genderMale = By.xpath("//label[@for='gender-radio-1']");
    public final By genderFemale = By.xpath("//label[@for='gender-radio-2']");
    public final By otherGender = By.xpath("//label[@for='gender-radio-3']");
    public final By mobileField = By.xpath("//input[@id='userNumber']");
    public final By dataOfBirth = By.xpath("//input[@id='dateOfBirthInput']");
    public final By selectMonth = By.xpath("//select[@class='react-datepicker__month-select']");
    public final By selectYear = By.xpath("//select[@class='react-datepicker__year-select']");
    public final By subjectsField = By.xpath("//input[@id='subjectsInput']");
    public final By hobbiesSport = By.xpath("//label[@for='hobbies-checkbox-1']");
    public final By hobbiesReading = By.xpath("//label[@for='hobbies-checkbox-2']");
    public final By hobbiesMusic = By.xpath("//label[@for='hobbies-checkbox-3']");
    public final By imageInput = By.xpath("//input[@id='uploadPicture']");
    public final By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    public final By selectState = By.xpath("//div[contains(text(),'Select State')]");
    public final By selectCity = By.xpath("//div[contains(text(),'Select City')]");
    public final By submitButton = By.xpath("//button[@id='submit']");

    public void putName(String firstName, String lastName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void putEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void selectGender(String gender) {
        if (Objects.equals(gender, "Male")) {
            driver.findElement(genderMale).click();
        } else if (Objects.equals(gender, "Female")) {
            driver.findElement(genderFemale).click();
        } else if (Objects.equals(gender, "Other")) {
            driver.findElement(otherGender).click();
        }
    }

    public void putMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void putBirth(String year, String month, String day) {
        driver.findElement(dataOfBirth).click();
        List<WebElement> years = driver.findElement(selectYear).findElements(By.xpath("//option"));
        for (WebElement e : years) {
            if (Objects.equals(e.getAttribute("innerText"), year)) {
                e.click();
            }
        }
        List<WebElement> months = driver.findElement(selectMonth).findElements(By.xpath("//option"));
        for (WebElement e : months) {
            if (Objects.equals(e.getAttribute("innerText"), month)) {
                e.click();
            }
        }
        driver.findElement(By.xpath("(//div[@aria-disabled='false' and text()='" + day + "'])[1]")).click();
    }

    public void putSubjects(String subject) {
        driver.findElement(subjectsField).sendKeys(subject);
        driver.findElement(subjectsField).sendKeys(Keys.ENTER);
    }

    public void selectHobbies(String hobbies) {
        if (Objects.equals(hobbies, "Sports")) {
            driver.findElement(hobbiesSport).click();
        } else if (Objects.equals(hobbies, "Reading")) {
            driver.findElement(hobbiesReading).click();
        } else if (Objects.equals(hobbies, "Music")) {
            driver.findElement(hobbiesMusic).click();
        }
    }

    public void uploadImage(String filePath) {
        driver.findElement(imageInput).sendKeys(filePath);
    }

    public void putAddress(String address) {
        driver.findElement(currentAddressField).sendKeys(address);
    }


}

package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTablesPage {
    WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By webTablesTab = By.xpath("//span[normalize-space()='Web Tables']");

    public WebTablesPage selectWebTablesTab() {
        driver.findElement(webTablesTab).click();
        return this;
    }

    public final By webTable = By.xpath("//div[@class='ReactTable -striped -highlight']");
    public final By rowsBy = By.xpath("//div[@role='row']");
    public final By headingRowBy = By.xpath("(//div[@role='row'])[1]");
    public final By columnsBy = By.xpath("//div[@role='columnheader']");
    public final By addBy = By.xpath("//button[@id='addNewRecordButton']");
    public final By firstNameFieldBy = By.xpath("//input[@placeholder = 'First Name']");
    public final By lastNameFieldBy = By.xpath("//input[@placeholder = 'Last Name']");
    public final By emailFieldBy = By.xpath("//input[@placeholder = 'name@example.com']");
    public final By ageFieldBy = By.xpath("//input[@placeholder = 'Age']");
    public final By salaryFieldBy = By.xpath("//input[@placeholder = 'Salary']");
    public final By departmentFieldBy = By.xpath("//input[@placeholder = 'Department']");
    public final By submitButtonBy = By.xpath("//button[@id='submit']");
    public final By searchField = By.xpath("//input[@placeholder = 'Type to search']");
    public final By searchButton = By.xpath("//div[@class='input-group-append']");


    public WebElement getTable() {
        return driver.findElement(webTable);
    }


    public List<WebElement> getRows() {
        List<WebElement> rows = getTable().findElements(rowsBy);
        rows.remove(0);
        return rows;
    }

    public List<WebElement> getHeadings() {
        WebElement headingRow = getTable().findElement(headingRowBy);
        return headingRow.findElements(columnsBy);
    }

    public List<List<WebElement>> getRowsWithColumns() {
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<>();
        for (int i = 0; i < getRows().size(); i++) {
            rowsWithColumns.add(driver.findElements(By.xpath(String.format("(//div[@role='row'])[%d]//div[@role='gridcell']", i + 2))));
        }
        return rowsWithColumns;
    }

    public List<Map<String, WebElement>> getRowsWithColumnsByHeadings() {
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = new ArrayList<>();
        Map<String, WebElement> rowByHeadings;
        List<WebElement> headingColumns = getHeadings();
        for (List<WebElement> row : rowsWithColumns) {
            rowByHeadings = new HashMap<>();
            for (int i = 0; i < headingColumns.size(); i++) {
                String heading = headingColumns.get(i).getText();
                WebElement cell = row.get(i);
                rowByHeadings.put(heading, cell);
            }
            rowsWithColumnsByHeadings.add(rowByHeadings);
        }
        return rowsWithColumnsByHeadings;
    }

    public String getValueFromCell(int row, int column) {
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        return rowsWithColumns.get(row - 1).get(column - 1).getText();
    }

    public String getValueFromCell(String columnName, int rowNumber) {
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = getRowsWithColumnsByHeadings();
        return rowsWithColumnsByHeadings.get(rowNumber - 1).get(columnName).getText();
    }

    public void addString(String firstName, String lastName, String email, int age, int salary, String department) {
        driver.findElement(addBy).click();
        driver.findElement(firstNameFieldBy).sendKeys(firstName);
        driver.findElement(lastNameFieldBy).sendKeys(lastName);
        driver.findElement(emailFieldBy).sendKeys(email);
        driver.findElement(ageFieldBy).sendKeys(Integer.toString(age));
        driver.findElement(salaryFieldBy).sendKeys(Integer.toString(salary));
        driver.findElement(departmentFieldBy).sendKeys(department);
        driver.findElement(submitButtonBy).click();

    }

    public void search(String data) {
        driver.findElement(searchField).sendKeys(data);
        driver.findElement(searchButton).click();
    }

    public void edit(int stringNumber, String firstName, String lastName,
                     String email, int age, int salary, String department) {
        driver.findElement(By.xpath("//span[@id='edit-record-" + stringNumber + "']")).click();
        driver.findElement(firstNameFieldBy).clear();
        driver.findElement(firstNameFieldBy).sendKeys(firstName);
        driver.findElement(lastNameFieldBy).clear();
        driver.findElement(lastNameFieldBy).sendKeys(lastName);
        driver.findElement(emailFieldBy).clear();
        driver.findElement(emailFieldBy).sendKeys(email);
        driver.findElement(ageFieldBy).clear();
        driver.findElement(ageFieldBy).sendKeys(Integer.toString(age));
        driver.findElement(salaryFieldBy).clear();
        driver.findElement(salaryFieldBy).sendKeys(Integer.toString(salary));
        driver.findElement(departmentFieldBy).clear();
        driver.findElement(departmentFieldBy).sendKeys(department);
        driver.findElement(submitButtonBy).click();
    }

    public void delete(int stringNumber) {
        driver.findElement(By.xpath("//span[@id='delete-record-" + stringNumber + "']")).click();
    }

}

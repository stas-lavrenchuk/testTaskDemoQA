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
    public final By cellBy = By.xpath("//div[@role='gridcell']");

    public WebElement getTable(){
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
            rowsWithColumns.add(driver.findElements(By.xpath(String.format("(//div[@role='row'])[%d]//div[@role='gridcell']", i+2))));
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

    public String getValueFromCell (int row, int column){
        List<List< WebElement>> rowsWithColumns = getRowsWithColumns();
        return rowsWithColumns.get(row - 1).get(column - 1).getText();
    }

    public String getValueFromCell(String columnName, int rowNumber){
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = getRowsWithColumnsByHeadings();
        return rowsWithColumnsByHeadings.get(rowNumber-1).get(columnName).getText();
    }

}

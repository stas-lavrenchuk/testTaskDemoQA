package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void goToURL(String url) {
        driver.get(url);
    }

    public void scrollPageDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
    }

    public void scrollPageUP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
    }

    public void zoom (int i){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '"+ i+ "%'");
    }

    public void goToTheNewTab() {
        String page1 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();
        String page2 = null;
        for (String window : currentWindows) {
            if (!window.equals(page1)) {
                page2 = window;
                break;
            }
        }
        driver.switchTo().window(page2);

    }

    public void closeTabAndGoBack() {
        String page2 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();
        String page1 = null;
        for (String window : currentWindows) {
            if (!window.equals(page2)) {
                page1 = window;
                break;
            }
        }
        driver.close();
        driver.switchTo().window(page1);
    }


}
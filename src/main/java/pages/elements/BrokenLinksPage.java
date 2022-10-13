package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static common.Constant.Urls.DEMOQA_MAIN_URL;

public class BrokenLinksPage {
    WebDriver driver;

    public BrokenLinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By brokenLinks_ImagesTab = By.xpath("//span[normalize-space()='Broken Links - Images']");


    public BrokenLinksPage selectBrokenLinks_ImagesTab() {
        driver.findElement(brokenLinks_ImagesTab).click();
        return this;
    }


    public void findBrokenImages() {
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        for (WebElement image : imagesList) {
            if (Objects.equals(image.getAttribute("naturalWidth"), "0")) {
                System.out.println("Image " + image.getAttribute("src") + " is broken");
            }
        }
    }

    public void findBrokenLinks() {
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println(url + " URL is empty");
                continue;
            }
            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!url.startsWith(DEMOQA_MAIN_URL)) {
                System.out.println(url + " URL belongs to another domain");
            }
        }

    }
}

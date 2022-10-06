package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (Config.BROWSER_AND_PLATFORM) {
            case "CHROME_WINDOWS":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "CHROME_MAC":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;

            case "MOZILLA_WIN":
                System.setProperty("webdriver.geckodriver.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.TimeoutVariables.IMPLICIT_WAIT));
        return driver;
    }
}

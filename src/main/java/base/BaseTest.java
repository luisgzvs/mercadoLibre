package base;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver;
    private String userDir = System.getProperty("user.dir");

    public static WebDriver getDriver() { return driver; }

    @BeforeTest
    @Parameters({"browser", "startURL", "executionType"})
    public void setup(String browser, String startURL2, String executionType) {
        driver = setupDriver(browser, startURL2, executionType);
    }

    private WebDriver setupDriver(String browser, String startURL, String executionType) {
        if (executionType.toLowerCase().equals("local")) {
            return createDriver(browser, startURL);
        } else {
            System.out.print("not required");
            return null;
        }
    }

    private WebDriver createDriver(String browserType, String startURL) {
        try {
            WebDriver driver = null;
            if (browserType.toLowerCase().equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", userDir + "/chromedriver");
                driver = new ChromeDriver();
            } else if (browserType.toLowerCase().equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", userDir + "/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(startURL);
            driver.manage().window().maximize();
            return driver;
        } catch (Exception e) {
            System.out.println(e);
            return driver;
        }
    }

    @AfterSuite
    public void closeDriver() {
        driver.close();
    }


}

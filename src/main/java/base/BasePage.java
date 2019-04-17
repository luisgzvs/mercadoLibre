package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    protected WebDriver driver;

    protected BasePage() {
        this.driver = BaseTest.getDriver();
    }

    protected void waitUntilElementIsClickable(WebElement element) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void hoverToElement(WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    protected void clickElement(WebElement element) {
        element.click();
    }

    protected String returnNumberFromText(WebElement element) {
        return element.getText();
    }



}

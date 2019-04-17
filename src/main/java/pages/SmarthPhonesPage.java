package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmarthPhonesPage extends BasePage{

    @FindBy(xpath = "//div[@class='quantity-results']")
    private WebElement quaintityResults;

    public SmarthPhonesPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void returnNumberOfResultsPhones(){
        waitUntilElementIsClickable(quaintityResults);
        System.out.print(returnNumberFromText(quaintityResults));
    }
}

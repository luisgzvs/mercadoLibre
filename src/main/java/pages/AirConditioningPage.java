package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirConditioningPage extends BasePage{

    @FindBy(xpath = "//div[@class='quantity-results']")
    private WebElement quaintityResults;

    public AirConditioningPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void returnNumberOfResultsAir(){
        waitUntilElementIsClickable(quaintityResults);
        System.out.print(returnNumberFromText(quaintityResults));
    }

}

package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BabysRoomPage extends BasePage {

    @FindBy(xpath = "//div[@class='quantity-results']")
    private WebElement quaintityResults;

    public BabysRoomPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void returnNumberOfResultsBabysRoom(){
        waitUntilElementIsClickable(quaintityResults);
        System.out.print(returnNumberFromText(quaintityResults));
    }

}

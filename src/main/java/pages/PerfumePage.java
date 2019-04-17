package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

public class PerfumePage extends BasePage {

    Random r = new Random();
    int randomNumber = r.nextInt((10 - 1) + 1) + 1;

    @FindBy(xpath = "//div[@class='quantity-results']")
    private WebElement quaintityResults;

    @FindBy(xpath = "//a[@title='Capital Federal']")
    private WebElement capitalLink;

    @FindBy(xpath = "//section[@id='results-section']//li[2]")
    private WebElement randomProduct;

    @FindBy(xpath = "//section[@id='results-section']//li[2]//span[@class='main-title']")
    private WebElement randomTitle;

    @FindBy(xpath = "//section[@id='results-section']//li[2]//span[@class='price__fraction']")
    private WebElement randomPrice;

    @FindBy(xpath = "//h1[@class='item-title__primary ']")
    private WebElement randomTitle2;

    @FindBy(xpath = "//span[@class='price-tag-fraction']")
    private WebElement randomPrice2;

    public PerfumePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void returnNumberOfResultsPerfume(){
        waitUntilElementIsClickable(quaintityResults);
        System.out.print(returnNumberFromText(quaintityResults));
    }

    public String getRandomTitleOne(){
        waitUntilElementIsClickable(capitalLink);
        clickElement(capitalLink);
        waitUntilElementIsClickable(randomTitle);
        String randomProductTitle1 = randomTitle.getText();
        return randomProductTitle1;
    }

    public String getRandomPriceOne(){
        String randomProductPrice1 = randomPrice.getText();
        return randomProductPrice1;
    }

    public String getRandomProductTitle2(){
        clickElement(randomTitle);
        waitUntilElementIsClickable(randomTitle2);
        String randomProductTitle2 = randomTitle2.getText();
        return randomProductTitle2;
    }

    public String getRandomProductPrice2(){
        String randomProductPrice2 = randomPrice2.getText();
        return randomProductPrice2;
    }






}

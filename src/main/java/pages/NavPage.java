package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavPage extends BasePage{

    @FindBy(xpath = "//a[@class='nav-menu-item-link nav-menu-categories-link']")
    private WebElement categoriesLink;

    @FindBy(linkText = "Hogar y Electrodomésticos")
    private WebElement homeandElectronicsLink;

    @FindBy(linkText = "Climatización")
    private WebElement airConditioningLink;

    @FindBy(linkText = "Tecnología")
    private WebElement techonologyLink;

    @FindBy(linkText = "Celulares y Smartphones")
    private WebElement smarthPhonesLink;

    @FindBy(linkText = "Belleza y Cuidado Personal")
    private WebElement BeautyLink;

    @FindBy(linkText = "Perfumes Importados")
    private WebElement PerfumeLink;

    @FindBy(linkText = "Herramientas e Industrias")
    private WebElement IndustryLink;

    @FindBy(linkText = "Industria Textil")
    private WebElement TextileLink;

    @FindBy(linkText = "Juguetes y Bebés")
    private WebElement ToysBabyLink;

    @FindBy(linkText = "Cuarto del Bebé")
    private WebElement BabysRoom;

    public NavPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AirConditioningPage gotoAirConditioning() {
        waitUntilElementIsClickable(categoriesLink);
        hoverToElement(categoriesLink);
        waitUntilElementIsClickable(homeandElectronicsLink);
        hoverToElement(homeandElectronicsLink);
        waitUntilElementIsClickable(airConditioningLink);
        clickElement(airConditioningLink);
        return new AirConditioningPage(driver);
    }

    public SmarthPhonesPage gotoSmartphonesPage() {
        waitUntilElementIsClickable(categoriesLink);
        hoverToElement(categoriesLink);
        waitUntilElementIsClickable(techonologyLink);
        hoverToElement(techonologyLink);
        waitUntilElementIsClickable(smarthPhonesLink);
        clickElement(smarthPhonesLink);
        return new SmarthPhonesPage(driver);
    }

    public PerfumePage gotoPerfumePage() {
        waitUntilElementIsClickable(categoriesLink);
        hoverToElement(categoriesLink);
        waitUntilElementIsClickable(BeautyLink);
        hoverToElement(BeautyLink);
        waitUntilElementIsClickable(PerfumeLink);
        clickElement(PerfumeLink);
        return new PerfumePage(driver);
    }

    public TextileIndustryPage gotoTextilePage() {
        waitUntilElementIsClickable(categoriesLink);
        hoverToElement(categoriesLink);
        waitUntilElementIsClickable(IndustryLink);
        hoverToElement(IndustryLink);
        waitUntilElementIsClickable(TextileLink);
        clickElement(TextileLink);
        return new TextileIndustryPage(driver);
    }

    public BabysRoomPage gotoBabyRoomPage() {
        waitUntilElementIsClickable(categoriesLink);
        hoverToElement(categoriesLink);
        waitUntilElementIsClickable(ToysBabyLink);
        hoverToElement(ToysBabyLink);
        waitUntilElementIsClickable(BabysRoom);
        clickElement(BabysRoom);
        return new BabysRoomPage(driver);
    }




}

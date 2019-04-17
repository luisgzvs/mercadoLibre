import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavPage;
import pages.SmarthPhonesPage;

public class SmarthPhoneTest extends BaseTest {

    private NavPage navigationPage;
    private SmarthPhonesPage smarthPhonesPage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void PrintNumberOfResultsForSmarthPhones() {
        smarthPhonesPage = navigationPage.gotoSmartphonesPage();
        System.out.print("Celulares y Smarthphones: ");
        smarthPhonesPage.returnNumberOfResultsPhones();
    }
}

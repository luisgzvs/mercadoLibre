import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AirConditioningPage;
import pages.NavPage;

public class AirConditioningTest extends BaseTest {

    private NavPage navigationPage;
    private AirConditioningPage airConditioningPage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void PrintNumberOfResultsForAirConditioning() {
        airConditioningPage = navigationPage.gotoAirConditioning();
        System.out.print("Climatización: ");
        airConditioningPage.returnNumberOfResultsAir();
    }

}

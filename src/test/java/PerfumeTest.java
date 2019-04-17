import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavPage;
import pages.PerfumePage;
import pages.SmarthPhonesPage;

public class PerfumeTest extends BaseTest {

    private NavPage navigationPage;
    private PerfumePage perfumePage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void PrintNumberOfResultsForSmarthPhones() {
        perfumePage = navigationPage.gotoPerfumePage();
        System.out.print("Perfumes: ");
        perfumePage.returnNumberOfResultsPerfume();
    }
}

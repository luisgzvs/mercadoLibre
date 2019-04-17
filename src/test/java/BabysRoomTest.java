import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BabysRoomPage;
import pages.NavPage;

public class BabysRoomTest extends BaseTest {
    private NavPage navigationPage;
    private BabysRoomPage babysRoomPage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void PrintNumberOfResultsForTextileIndustry() {
        babysRoomPage = navigationPage.gotoBabyRoomPage();
        System.out.print("Cuarto de Bebé: ");
        babysRoomPage.returnNumberOfResultsBabysRoom();
    }
}

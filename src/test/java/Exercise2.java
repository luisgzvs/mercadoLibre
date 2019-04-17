import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavPage;
import pages.PerfumePage;

public class Exercise2 extends BaseTest {

    private NavPage navigationPage;
    private PerfumePage perfumePage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void AssertValues() {
        perfumePage = navigationPage.gotoPerfumePage();
        String productTitle1 = perfumePage.getRandomTitleOne();
        String productTitle2 = perfumePage.getRandomProductTitle2();
        Assert.assertEquals(productTitle1, productTitle2);
        String productPrice1 = perfumePage.getRandomPriceOne();
        String productPrice2 = perfumePage.getRandomProductPrice2();
        Assert.assertEquals(productPrice1, productPrice2);
    }

}

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavPage;
import pages.TextileIndustryPage;

public class TextileIndustryTest extends BaseTest{

    private NavPage navigationPage;
    private TextileIndustryPage textileIndustryPage;

    @BeforeClass
    public void setupTest() {
        navigationPage = new NavPage(getDriver());
    }

    @Test
    public void PrintNumberOfResultsForTextileIndustry() {
        textileIndustryPage = navigationPage.gotoTextilePage();
        System.out.print("Industria Textil: ");
        textileIndustryPage.returnNumberOfResultsTextile();
    }
}

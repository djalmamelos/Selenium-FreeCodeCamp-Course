package Part3_4.com.demoqa.test.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {


    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue( "\n Actual Response (" + actualResponse +
                                ") \n Does not Contain '400'and 'Bad Request'",
                actualResponse.contains("400")
                        && actualResponse.contains("Bad Request"));
                ;
    }


}

package Part3_4.com.demoqa.test.part4.windows;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {


    @Test
    public void testNewWindowURL() {
        var windowPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowPage.clickNewWindowButton();
        windowPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL, "\n Actual & Expected URLs Do Not Match\n");
    }
}

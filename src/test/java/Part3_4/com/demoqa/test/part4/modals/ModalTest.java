package Part3_4.com.demoqa.test.part4.modals;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test

    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.ClickModalDialogs();
        modalDialogsPage.ClickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "\n The Message Does Not Contain 'small modal'\n");
        modalDialogsPage.clickCloseButton();
    }
}

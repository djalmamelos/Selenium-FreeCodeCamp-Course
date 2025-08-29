package Part3_4.com.demoqa.test.part4.Alerts;

import Part3_4.com.demoqa.base.BaseTest;
import com.demoqa.pages.Alerts_Frames_Windows.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;


@Test
public class AlertsTest extends BaseTest {



    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().ClickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\nActual and Expected do not Match\n");
        acceptAlert();
    }

    public void testConfirmationAlert(){
        String expectedConfirmationResult = "You selected Cancel";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindowsCard().ClickAlerts();
        alertsPage.clickConfirmButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult, "\n You Did Not Select Cancel \n");


    }

    public void testPromptALert(){
        String alertText = "Selenium with Java";
        String expectedResult = "You entered " + alertText;

        var alertsPage = homePage.goToAlertsFramesWindowsCard().ClickAlerts();
        alertsPage.clickpromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.setPromptResult();
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual Result and Expected Do not Match\n");

    }



}

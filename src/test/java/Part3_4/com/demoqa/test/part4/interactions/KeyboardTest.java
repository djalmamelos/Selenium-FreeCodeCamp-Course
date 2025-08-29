package Part3_4.com.demoqa.test.part4.interactions;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {


    @Test
    public void testApplicationUsingKeyboard(){
        var textboxPage = homePage.goToElements().clickTextBox();
        textboxPage.setFullName("Djalma de Almeida Melo Sobrinho");
        textboxPage.setEmail("djalmaqa@gmail.com");
        textboxPage.setCurrentAddress("1234 Selenium Av");
        textboxPage.setCurrentAddress("51111-230");
        textboxPage.setCurrentAddress("Recife");
        textboxPage.clickSubmitButton();
        String actualAddress = textboxPage.getCurrentAddress();

        Assert.assertTrue(actualAddress.contains("51111-230"),
                "\n Actual Address does not contain CEP\n");
    }



}

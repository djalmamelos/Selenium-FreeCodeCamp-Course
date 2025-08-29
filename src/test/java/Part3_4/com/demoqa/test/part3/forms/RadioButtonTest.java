package Part3_4.com.demoqa.test.part3.forms;

import Part3_4.com.demoqa.base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue("\n Female Radio Button is Not Selected \n",
                isFemaleRadioButtonSelected);
    }
}

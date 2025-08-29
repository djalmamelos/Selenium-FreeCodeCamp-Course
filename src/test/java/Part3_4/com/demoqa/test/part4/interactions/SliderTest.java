package Part3_4.com.demoqa.test.part4.interactions;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {


    @Test
    public void testSliderResult(){
        int x = 325;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "100";
        Assert.assertEquals(actualValue,expectedValue, "\n Actual & Expected Value do not Match \n");

    }




}

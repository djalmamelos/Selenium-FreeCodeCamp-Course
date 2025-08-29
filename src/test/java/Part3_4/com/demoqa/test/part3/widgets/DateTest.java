package Part3_4.com.demoqa.test.part3.widgets;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {


    @Test
    public void testSelectingDate(){
        String month = "June";
        String monthNumber = "06";
        String day = "24";
        String year = "2025";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);



        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate,
                "\n Actual & Expected Dates Do Not Match" +
                "\n Actual Date   : " + actualDate +
                "\n Expected Date : " + expectedDate );

    }
}

package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.*;

public class DatePickerMenuPage extends WidgetPage{

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropdown = By.cssSelector(".react-datepicker__month-select");
    private By yearDropdown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day') and text()='" + day + "']");
    }


    public void clickSelectDate() {
        click(selectDateField);

    }

    public void clickDay(String day) {
        click(dayValue(day));
    }
    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }


    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropdown,month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropdown,year);
    }


}

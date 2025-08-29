package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class WidgetPage extends HomePage {

    private By selectMenuItem = By.xpath("(//span[normalize-space()='Select Menu'])[1]");
    private By DatePickerMenuItem = By.xpath("(//span[normalize-space()='Date Picker'])[1]");
    private By ProgressBarMenuItem = By.xpath("(//span[normalize-space()='Progress Bar'])[1]");
    private By SliderMenuItem = By.xpath("(//span[normalize-space()='Slider'])[1]");


    public SliderPage clickSlider(){
        scrollToElementJS(SliderMenuItem);
        click(SliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(ProgressBarMenuItem);
        click(ProgressBarMenuItem);
        return new ProgressBarPage();
    }
    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(DatePickerMenuItem);
        click(DatePickerMenuItem);
        return new DatePickerMenuPage();
    }



}

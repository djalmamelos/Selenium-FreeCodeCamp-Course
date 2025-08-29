package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetPage{

private By SliderRangeButton = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
private By sliderValue = By.id("sliderValue");


public String getSliderValue (){
    return getAttribute(sliderValue, "value");
}

public void moveSlider(int x,int y){
    dragAndDropBy(find(SliderRangeButton), x, y);

}
}

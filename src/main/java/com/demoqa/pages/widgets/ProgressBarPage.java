package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetPage{

private By StartButton = By.id("startStopButton");
private By ProgressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");


public void clickStartButton(){
    click(StartButton);
}

public String getProgressValue(){
    fluentWaitUntilVisible(30, ProgressValue);
    return getText(ProgressValue);
}
}

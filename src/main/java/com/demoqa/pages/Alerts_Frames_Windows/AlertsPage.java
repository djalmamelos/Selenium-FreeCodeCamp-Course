package com.demoqa.pages.Alerts_Frames_Windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{

private By infoalertButton = By.id("alertButton");
private By confirmalertButton = By.id("confirmButton");
private By confirmationResult = By.id("confirmResult");
private By promptAlertButton = By.id("promtButton");
private By promptResult = By.id("promptResult");

public void clickInformationAlertButton(){
    click(infoalertButton);
}

    public void clickConfirmButton(){
        click(confirmalertButton);
    }

    public String getConfirmationResult() {
    return find(confirmationResult).getText();
    }

    public void clickpromptAlertButton(){
        click(promptAlertButton);
    }
    public String setPromptResult(){
        return find(promptResult).getText();
    }


}

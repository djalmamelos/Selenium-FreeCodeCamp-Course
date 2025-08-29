package com.demoqa.pages.Alerts_Frames_Windows;

import org.openqa.selenium.By;

public class ModalDialogPage extends Alerts_Frames_WindowsPage{

private By  SmallModalButton = By.id("showSmallModal");
private By SmallModalText = By.xpath("//div[contains(text(),'small modal')]");
private By  closeSmallModal= By.id("closeSmallModal");


public void ClickSmallModalButton() {
    click(SmallModalButton);
}

public String getSmallModalText() {
    return find(SmallModalText).getText();
}

public void clickCloseButton() {
    click(closeSmallModal);
}
}

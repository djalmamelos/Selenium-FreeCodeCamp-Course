package com.demoqa.pages.Alerts_Frames_Windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("(//span[normalize-space()='Modal Dialogs'])[1]");
    private By alertsMenuItem = By.xpath("(//span[normalize-space()='Alerts'])[1]");
    private By framesMenuItem = By.xpath("(//span[normalize-space()='Frames'])[1]");
    private By browserWindowsMenuItem = By.xpath("(//span[normalize-space()='Browser Windows'])[1]");

    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new  BrowserWindowsPage();
    }

    public FramesPage clickFrames() {
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public ModalDialogPage ClickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogPage();
    }

    public AlertsPage ClickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }


}

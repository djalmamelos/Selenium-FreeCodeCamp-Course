package com.demoqa.pages;

import com.demoqa.pages.Alerts_Frames_Windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetPage;
import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("(//h5[normalize-space()='Elements'])[1]");
    private By widgetsCard = By.xpath("(//h5[normalize-space()='Widgets'])[1]");
    private By AlertsFrameWindowsCard = By.xpath("(//h5[normalize-space()='Alerts, Frame & Windows'])[1]");

    public  FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
    public WidgetPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollToElementJS(AlertsFrameWindowsCard);
        click(AlertsFrameWindowsCard);
        return new Alerts_Frames_WindowsPage();
    }

}

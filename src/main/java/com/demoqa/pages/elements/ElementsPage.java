package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import com.demoqa.pages.elements.WebTablesPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("(//li[@id='item-3'])[1]");
    private By LinksMenuItem = By.xpath("(//span[normalize-space()='Links'])[1]");
    private By dynamicPropertiesMenuItem = By.xpath("//span[normalize-space()='Dynamic Properties']");
    private By textboxMenuItem = By.xpath("(//span[normalize-space()='Text Box'])[1]");


    public TextBoxPage clickTextBox(){
        scrollToElementJS(textboxMenuItem);
        click(textboxMenuItem);
        return  new TextBoxPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }
    public WebTablesPage clickWebTables () {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(LinksMenuItem);
        return new LinksPage();
    }
}

package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{


    private By fullnameField = By.id("userName");
    private By currentAddress = By.xpath("(//textarea[@id='currentAddress'])[1]");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");





    public void setFullName(String name){
        scrollToElementJS(fullnameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullnameField), Keys.chord(name)).perform();
        sendKeys(find(fullnameField), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address){
        find(currentAddress).sendKeys(address + Keys.ENTER);

    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }
}

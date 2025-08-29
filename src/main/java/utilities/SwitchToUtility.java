package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{


    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }


    public static String getAlertText(){
     return    switchTo().alert().getText();
    }

    public static String acceptAlert(){
        switchTo().alert().accept();
        return "";
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }
    public static void SwitchToFrameString(String value){
        switchTo().frame(value);
    }
    public static void SwitchToDefaultContent(){
        switchTo().defaultContent();
    }

    public static void SwitchToFrameIndex(int index){
        switchTo().frame(index);
    }

    public static void SwitchToFrameElement(WebElement element){
        switchTo().frame(element);
    }

    public static void SwitchToWindow(String handle){
        switchTo().window(handle);
    }
}

package com.demoqa.pages.Alerts_Frames_Windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton(){
        click(newWindowButton);
    }


    public void switchToNewWindow(){
        //Step 1: Get The Current "Main" Window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main WIndow ID: " + currentHandle + "\n");

        // Step 2: Get All Window Handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open WIndows: " + allHandles.size());

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            } else {
                SwitchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }

        // Step 3: Switch To the New Window Using The Window Handle
    }
}

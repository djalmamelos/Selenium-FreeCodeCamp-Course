package com.demoqa.pages.Alerts_Frames_Windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By HeaderFrameText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    public String getHeaderFramesText(){
        return find(HeaderFrameText).getText();
    }

    private void switchToBigBox(){
        SwitchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
//        SwitchToFrameIndex(2);
    SwitchToFrameElement(find(iFrameSmallBox));
    }


    public String getTextinBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text " + bigFrameText);
        SwitchToDefaultContent();
        return bigFrameText;
    }

    public String getTextinSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        SwitchToDefaultContent();
        return smallFrameText;
    }
}

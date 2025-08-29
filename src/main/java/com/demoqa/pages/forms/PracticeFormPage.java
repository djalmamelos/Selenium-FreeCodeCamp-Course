package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage{

    private final By femaleRadioLabel = By.cssSelector("label[for='gender-radio-2']");
    private final By femaleRadioInput = By.id("gender-radio-2");
    private final By sportsHobbyCheckbox = By.cssSelector("[for='hobbies-checkbox-1']");
    private final By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox = By.cssSelector("label[for='hobbies-checkbox-3']");
    private final By submitButton = By.id("submit");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioLabel);
        click(femaleRadioLabel);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioInput).isSelected();
    }

    public void clickSportsCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }
    public void clickMusicCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }
    public void unclickReadingCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton(){
//        scrollToElementJS(submitButton); comentado para o teste falhar
        click(submitButton);
    }

}

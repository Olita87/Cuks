package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrack_Page {

    public VyTrack_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="prependedInput")
    public WebElement userNameLogIn ;

}

package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy_Page {

    public Etsy_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath ="//input[@id='global-enhancements-search-query']")
   public WebElement etsySearchBar ;

    @FindBy (xpath= "//button[@aria-label='Search']")
    public WebElement etsySearchButton;
}

package com.cydeo.step_definition;

import com.cydeo.pages.Etsy_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinition {

    Etsy_Page etsyPage=new Etsy_Page();


    @Given("user is on Etsy page")
    public void user_is_on_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com/ ");

    }
    @Then("user sees expected title")
    public void user_sees_expected_title() {
      //  Assert.assertTrue(Driver.getDriver().getTitle().equals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"));
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.etsySearchBar.sendKeys("Wooden Spoon");

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        etsyPage.etsySearchButton.click();

    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));

    }


}

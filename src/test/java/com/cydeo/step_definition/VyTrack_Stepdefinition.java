package com.cydeo.step_definition;

import com.cydeo.pages.VyTrack_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VyTrack_Stepdefinition {
    VyTrack_Page page = new VyTrack_Page();
    @Given("user is on a Vytrack Login page")
    public void user_is_on_a_vytrack_login_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        page.userNameLogIn.sendKeys("storemanager221");

    }
    @Given("user enters username {string}, user entered the password {string}")
    public void user_enters_username_user_entered_the_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is hovering over the Fleet module")
    public void user_is_hovering_over_the_fleet_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("click on vehicle module")
    public void click_on_vehicle_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see on the Export Grid dropdown")
    public void user_should_be_able_to_see_on_the_export_grid_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies Export Grid dropdown is on the left side of the page")
    public void user_verifies_export_grid_dropdown_is_on_the_left_side_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see refresh")
    public void user_should_be_able_to_see_refresh() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that Reset button is clickable")
    public void user_verifies_that_reset_button_is_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies Refresh button is on the left side of the Reset button")
    public void user_verifies_refresh_button_is_on_the_left_side_of_the_reset_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user sees Grid Settings Button")
    public void user_sees_grid_settings_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies Grid Settings Button is on the right side of the page")
    public void user_verifies_grid_settings_button_is_on_the_right_side_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

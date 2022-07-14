
Feature: User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  Scenario: user is on a VyTrack Website and is able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons
    Given user is on a Vytrack Login page
    And user enters username "storemanager221", user entered the password "UserUser123"
    And user clicks login button
    Then user is hovering over the Fleet module
    And click on vehicle module
    And user should be able to see on the Export Grid dropdown
    And user verifies Export Grid dropdown is on the left side of the page
    Then user should be able to see refresh
    And user verifies that Reset button is clickable
    And user verifies Refresh button is on the left side of the Reset button
    And user sees Grid Settings Button
    And user verifies Grid Settings Button is on the right side of the page




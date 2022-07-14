
Feature: Etsy
  Scenario: TC#51: Etsy Title Verification
  1. User is on https://www.etsy.com/
  2. User sees title is as expected.

  Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
  everyone

    Given user is on Etsy page
    Then user sees expected title


  @wip
    Scenario: TC#52: Etsy Search Functionality Title Verification (without parameterization)
    1. User is on https://www.etsy.com/
    2. User types Wooden Spoon in the search box
    3. User clicks search button
    4. User sees Wooden Spoon is in the title

      Given user is on Etsy page
      When user types Wooden Spoon in the search box
      And user clicks on search button
      Then user sees Wooden Spoon is in the title
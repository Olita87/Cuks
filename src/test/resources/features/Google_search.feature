Feature:Google Search Functionality Title Verification
  User story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

@wip
  Scenario: Search functionality
    Given user is on Google search page
    When user types Apple in a Google search bar
    And user clicks search
    Then User sees apple – Google Search is in the google title

Feature: Logout function
  As a user I should land in home page after successfully sign out

  Background:
    Given user successfully logged in

  Scenario: logout from amazon website successfully
    When user hover over accounts and lists menu
    And user clicks logout button
    Then user lands in login page

  Scenario: logout verification with different pages
    When user clicks customer support button
    And user hover over accounts and lists menu
    And user clicks logout button
    Then user lands in login page

  Scenario: logout verification after using "back" button from web browser
    When user hover over accounts and lists menu
    And user clicks logout button
    And user clicks back button
    And user hover over accounts and lists menu
    And user clicks orders button
    Then user lands in login page



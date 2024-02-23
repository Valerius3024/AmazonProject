Feature: As i user i should land in login page after correctly giving user Id and pass.
  Scenario: login with valid credentials
    Given user at home page
    When user enters email and password
    And user clicks login button
    Then user succesfully


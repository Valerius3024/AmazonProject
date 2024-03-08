Feature: Login Function
  As a user I should land in login page after correctly giving valid credentials

  Background:
    Given user at home page

  Scenario: login with valid credentials
    When user enters email and password
    And user clicks login button
    Then user succesfully login

  Scenario Outline: Login with invalid credentials (Negative Scenario)
    When user enters invalid "<email>" and "<password>"
    And user clicks login button
    Then user show "Bir sorun oluştu" error message
    Examples:
      | email         | password   |
      | abc@gmail.com | 12345689ab |
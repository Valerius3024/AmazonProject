Feature: Search Product
  As a user, I should find the product I want on the Amazon website

  Background:
    Given user at home page
    When user enters email and password
    Then user clicks login button

  Scenario Outline: The user should find their desired product using the search field
    When the user searches by "<product name>" in the search field
    Then the search result should show minimum one product whose name includes "<product name>"
    Examples:
      | product name |
      | tahta kaşık  |
      | termos       |

  Scenario: The user should not be able to find the invalid product using the search field (Negative Scenario)
    When the user searches by "lemanore" in the search field
    Then the search result should show minimum one product whose name includes "lemanore"







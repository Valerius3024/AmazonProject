Feature: Cart Transactions

  As a user, I should manage the products in my cart and complete the shopping

  Background:
    Given user at home page
    When user enters email and password
    Then user clicks login button

  Scenario: When user add an item to the cart, user should see the cart icon update and increasing the number of items in the cart.

    When the user add a product to cart
    And the cart icon should be updated
    Then The number of items should be increased




Feature: Remove Product

  Background:
    Given User is on the login page
    And User logs in with valid credentials
    And User searches and adds "MacBook Air" to cart
    And User clicks shopping cart button

  Scenario: Remove product from cart
    When User clicks "MacBook Air" remote button
    Then User should see cart is empty

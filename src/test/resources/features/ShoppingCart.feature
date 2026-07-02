Feature: Shopping Cart

  Background:
    Given User is on the login page
    And User logs in with valid credentials
    And User searches and adds "MacBook Air" to cart

    Scenario:
      When User clicks shopping cart button
      Then User should see checkout button
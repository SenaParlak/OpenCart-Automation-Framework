Feature: Shopping Cart

  Background:
    Given User is on the login page
    When User logs in with valid credentials

    Scenario: Add product to cart
      When User searches and adds "MacBook Air" to cart
      Then User should see product add successfully
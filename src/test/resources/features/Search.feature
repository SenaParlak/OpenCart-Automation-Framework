Feature: Search

  Background:
    Given User is on the login page
    When User logs in with valid credentials

    Scenario: User search products
      When User searches products
      |iphone|
      |macbook|
      |samsung|
      Then User should see search page
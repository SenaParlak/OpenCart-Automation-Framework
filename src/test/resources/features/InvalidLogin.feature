Feature: Invalid login

  Background:
    Given User is on the login page

  Scenario Outline: Invalid login
    When User logs in with invalid "<email>" and "<password>"
    Then User should see warning message

      Examples:
        |email|password|
        |sena111@sena.com|wrongpassword|
        |wrongemail@sena.com|test123   |

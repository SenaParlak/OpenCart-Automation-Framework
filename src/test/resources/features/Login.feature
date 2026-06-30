Feature: Login

  Scenario Outline: Successful login

    Given User is on the login page
    When User logs in with valid "<email>" and "<password>"
    Then User should see account page

    Examples:
    |email|password|
    |sena111@sena.com|test1234|
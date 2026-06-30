Feature: Logout


    Scenario: Successful logout

      Given User is on the login page
      When User logs in with valid credentials
      And User clicks logout button
      Then User should see logout page
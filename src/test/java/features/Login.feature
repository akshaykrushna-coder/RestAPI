Feature: Application login

  Scenario: Home Page Default Login
    Given User is on landing page
    When User login with "Akshayk" and "Akki@1233"
    Then Home is displayed
    Then Cards are displayed

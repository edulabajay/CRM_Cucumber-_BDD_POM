Feature: CRM Application Test

  Scenario: Validate free crm home page test
    Given user should open browser
    Then user is on login page
    Then user enters username and password
    Then click on login button
    Then homepage is displayed
    Then validate home page title

Feature: CRM Web Application Application Test

  Scenario: Validate free crm home page test
    Given user should open browser
    Then user is on login page
    Then user logged successfully by entering valid username and password
    Then validate home page title

    Scenario: Validate Free CRM Contacts Page
    Given User should on Add Contact link
    When User enters first_name "John" and middle_name "Doe" and last_name "Smith" and company_name "ABC Corp"
    Then close the browser
  
    
    

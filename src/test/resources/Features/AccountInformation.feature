Feature: Account Information
  User view and modify the account information

  Scenario: View Account summary
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User view the current balance
    And User checks the negative balance
    And User checks Total received
    And User provide filters to check the number of incoming payments and number of results were verified
    Then User download the payment history
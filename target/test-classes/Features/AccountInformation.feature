Feature: Account Information
  User view and modify the account information
  @AccountSummary
  Scenario: View Account summary
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User view the current balance
    And User checks the negative balance
    And User checks Total received
    Then User download the payment history
  
  @SystemPayments  
  Scenario: View Account summary by adding payment filter as System Payments
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User provide filters as System Payments and check the number of incoming payments
    Then User get the payment account details based on System filter
    
  @MemberPayments  
  Scenario: View Account summary by adding payment filter as Member Payments
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User provide filters as Member Payments and check the number of incoming payments
    Then User get the payment details based on Member filter
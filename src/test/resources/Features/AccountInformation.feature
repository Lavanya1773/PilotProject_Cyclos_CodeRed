Feature: Account Information
  User view and modify the account information
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
  @AccountSummary
  Scenario: View Account summary
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User view the current balance
    And User checks the negative balance
    And User checks Total received
    Then User download the payment history
<<<<<<< HEAD
=======
<<<<<<< HEAD

  @SystemPayments
  Scenario: View Account summary by adding payment filter as System Payments
=======
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
  
  @SystemPayments  
  Scenario: View Account summary by adding payment filter as System Payments
  
<<<<<<< HEAD
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User provide filters as System Payments and check the number of incoming payments
    Then User get the payment account details based on System filter
<<<<<<< HEAD
=======
<<<<<<< HEAD

  @MemberPayments
  Scenario: View Account summary by adding payment filter as Member Payments
=======
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    
  @MemberPayments  
  Scenario: View Account summary by adding payment filter as Member Payments
  
<<<<<<< HEAD
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    Given User launch the url
    When User provide valid username and password
    And User choose the Banking Tab
    And User provide filters as Member Payments and check the number of incoming payments
<<<<<<< HEAD
    Then User get the payment details based on Member filter
=======
<<<<<<< HEAD
    Then User get the payment details based on Member filter
=======
    Then User get the payment details based on Member filter
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c

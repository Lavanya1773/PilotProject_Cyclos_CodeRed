Feature: User Buy and print voucher
<<<<<<< HEAD

  Scenario: Buying and print vouchers
    Given User launched url
    When User provides Name and password
    And User choose the marketpalce tab
    And User selects the buy voucher
    And User selects the Gift voucher
    And User enters the amount and submit
    Then User print the gift voucher pdf and the submission verified.

  Scenario: Checking My vouchers
    Given User launched url
    When User provides Name and password
    And User choose the marketpalce tab
    And User Selects the my voucher option
    And User Verfied the page is successfully opened
    Then User download the gift voucher pdf
=======
 
Scenario: Buying and print vouchers
<<<<<<< HEAD

=======
 
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
Given User launched url
When User provides Name and password
And User choose the marketpalce tab
And User selects the buy voucher
And User selects the Gift voucher
And User enters the amount and submit
Then User print the gift voucher pdf and the submission verified.
<<<<<<< HEAD


Scenario: Checking My vouchers

=======
 
 
Scenario: Checking My vouchers
 
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
Given User launched url
When User provides Name and password
And User choose the marketpalce tab
And User Selects the my voucher option
And User Verfied the page is successfully opened
<<<<<<< HEAD
Then User download the gift voucher pdf
=======
Then User download the gift voucher pdf
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c

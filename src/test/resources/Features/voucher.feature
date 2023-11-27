Feature: User Buy and print voucher
 
@GiftVoucher
  Scenario: Buying and print vouchers
    Given User launched url
    When User provides Name and password
    And User choose the marketpalce tab
    And User selects the buy voucher
    And User selects the Gift voucher
    And User enters the amount and submit
    Then User print the gift voucher pdf and the submission verified.
 
@Myvoucher
  Scenario: Checking My vouchers
    Given User launched url
    When User provides Name and password
    And User choose the marketpalce tab
    And User Selects the my voucher option
    And User Verfied the page is successfully opened
    Then User download the gift voucher pdf

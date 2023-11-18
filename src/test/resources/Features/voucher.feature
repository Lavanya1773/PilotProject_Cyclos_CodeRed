Feature: User Buy and print voucher

Scenario: Buying and print vouchers

Given User launch the url
When User provide valid username and password
And User choose the marketpalce tab
And User selects the buy voucher
And User selects the Gift voucher
And User enters the amount and submit
Then User print the gift voucher pdf and the submission verified.

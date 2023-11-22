Feature: User access the Payment option to perform payment related actions in Cyclos

  @UserToUserPayment
  Scenario: User to User payment
    Given User launched the url
    When User provide username and password
    And User choose the Payment to user Tab
    And User selects the ReceiverName and amount
    And User choose the schedule as Pay now
    Then User gets a verification message

  @ReceiveQRPayments
  Scenario: Receiving QR Code Payment
    Given User launched the url
    When User provide username and password
    And User choose the Receive QR Payments Tab
    And User provides the amount which will be converted into a QR code
    Then User gets the QR

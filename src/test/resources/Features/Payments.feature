Feature: User access the Payment option to perform payment related actions in Cyclos
  
	@UserToUserPayment
  Scenario: User to User payment
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Payment to user Tab
    And User selects the ReceiverName and amount
    And User choose the schedule as Pay now
    Then User gets a verification message
  
 @SinglePaymentInFuture
  Scenario: Single Payment in future
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Payment to user Tab
    And User selects the ReceiverName and amount
    And User choose the schedule as Single Payment in Future
    And User provide the schedule date
    Then User gets a verification message
    
  @RequestPaymentFromUser
  Scenario: Request payment from user
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Request From User Tab
    And User provides the ReceiverName and amount
    And provide Expiration Date
    Then User gets a verification message
    
  @ReceiveQRPayments
  Scenario: Receiving QR Code Payment
  
    Given User launch the url
    When User provide valid username and password
    And User choose the Receive QR Payments Tab
    And User provides the amount which will be converted into a QR code
    Then User gets the QR
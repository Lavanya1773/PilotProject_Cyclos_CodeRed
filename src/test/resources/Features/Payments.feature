Feature: User access the Payment option to perform payment related actions in Cyclos

  @UserToUserPayment
  Scenario: User to User payment
<<<<<<< HEAD
=======
  
<<<<<<< HEAD
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    Given User launched the url
    When User provide username and password
    And User choose the Payment to user Tab
    And User selects the ReceiverName and amount
    And User choose the schedule as Pay now
    Then User gets a verification message
<<<<<<< HEAD
=======
<<<<<<< HEAD

  @ReceiveQRPayments
  Scenario: Receiving QR Code Payment
=======
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    
  @ReceiveQRPayments
  Scenario: Receiving QR Code Payment
  
<<<<<<< HEAD
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    Given User launched the url
    When User provide username and password
    And User choose the Receive QR Payments Tab
    And User provides the amount which will be converted into a QR code
    Then User gets the QR

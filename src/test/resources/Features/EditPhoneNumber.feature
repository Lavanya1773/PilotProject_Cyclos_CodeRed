Feature: To Edit Phone Number in Demo Cyclos classic payment software Application and do functions

  @MobileNumber
  Scenario: Add Mobile Number in Phone
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User click the Phone in leftside Column
    And User click the Phone in profile
    And User click the new for Adding Mobile
    And User select the Mobile number
    And User enter the Mobile Nuumber Name
      | Name | MobileNumber   |
      | Arun | +91 9809876543 |
    Then User Click the save and should able to see the phone edit Message

  @LandlineNumber
  Scenario: Add Landline Number in Phone
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User click the Phone in leftside Column
    And User click the Phone in profile
    And User click the new for Adding Landline
    And User select the Landline number
    And User enter the Landline number Name
      | Name2    | Landline       |
      | Nirupama | (201) 555-1111 |
    Then User Click the save and should able to see the LandLine phone edit Message

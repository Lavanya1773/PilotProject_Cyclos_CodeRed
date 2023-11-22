Feature: To Register in Demo Cyclos classic payment software Application

  Scenario: Register the User details
    Given User is on Demo Cyclos classic Homepage
    When User click the register button
    And User enter the Name
    And User enter the LoginName
    And User enter the Email
    And User enter the Password
    And User enter the confirmPassword
    And User click the RegistrationAgreement
    Then User click Submit button

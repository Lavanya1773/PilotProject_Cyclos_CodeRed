Feature: To Manage password  in Demo Cyclos classic payment software Application and do functions

  @ManagePassword
  Scenario: Change password with valid input
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User Click Change Password
    And User Click Change Option
    And User enter the Old password New password Confirm New password
      | OldPassword  | NewPassword  | ConfirmNewPassword |
      | Lavanya@1703 | Lavanya@1703 | Lavanya@1703       |
    Then User Click the Confirm button and able to see Password reset message

  Scenario: Change password with Invalid input
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User Click Change Password
    And User Click Change Option
    And User enter the Old password New password Confirm New password
      | OldPassword  | NewPassword  | ConfirmNewPassword |
      | Lavanya@1703 | Lavanya@1703 | Lavanya@170        |
    Then User Click the Confirm button and able to see Password Error reset message

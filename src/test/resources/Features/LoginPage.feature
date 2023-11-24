Feature: To Login in Demo Cyclos classic payment software Application and do functions

  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    Then User should be able to login Successfully Message

  @Invalidcredentials
  Scenario Outline: Login with Invalid credentials
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides Invalid Sign in name "<InLoginName>"
    And User proides Invalid Sign in Password "<InPassword>"
    Then User click submit for invalid and should be able to login Error Message

    Examples: 
      | InLoginName | InPassword   |
      | Lavanya1703 | Lavanya@170  |
      | Lavanya170  | Lavanya@1703 |

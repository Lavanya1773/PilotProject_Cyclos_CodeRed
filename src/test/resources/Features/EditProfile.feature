Feature: To Edit User profile in Demo Cyclos classic payment software Application and do functions

  Scenario: Edit User Profile
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User click edit option
    And User enter Website
<<<<<<< HEAD
      | Website    |
      | Expleo.com |
=======
      | Website      |
      |leafground.com|
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
    And User choose Gender
    And User choose Business type
    Then User click save and should able to see edit success message

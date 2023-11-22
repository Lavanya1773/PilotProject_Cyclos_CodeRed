Feature: To Edit Address in Demo Cyclos classic payment software Application and do functions
<<<<<<< HEAD
 
=======

>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
  @MobileNumber
  Scenario: Edit Address in profile
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User click the Address
    And User click the new in Address
    And User enter the Name Address Zip code City State and Country using sheetname "<sheetname>" and rownumber <rownumber>
    And User Choose the Visibility
    Then User Click the save and user get Save Successfull Message
    
    Examples:
      | sheetname | rownumber |
      | sheet1    |         0 |
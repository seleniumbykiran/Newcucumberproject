Feature: Test login funcitonality

  Scenario Outline: Check login is successful with valid credential
    Given Browser is open in new
    And user is on login page in new project
    When user enters <username> and <password>
    And user clicks on Login
    Then user navigates to Login Page
    
    
    Examples:
    |username||password|
    |standard_user||secret_sauce|
    |problem_user||secret_sauce|
Feature: Testing Google Search Functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enter the text on search field
    And hits the enter button
    Then user navigate to search result

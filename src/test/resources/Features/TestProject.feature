
@testproject
Feature: feature to test google search functionality

  Scenario Outline: validate google search is working
    Given browser opens
    And user is on test project page
    When user enters <username> and <password>
    And hits login
    Then user is navigated to the registry page

    Examples:
                | username | password  |
                |  kate  | 12345    |
                |   jay  |  123   |

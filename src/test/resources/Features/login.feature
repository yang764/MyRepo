#Author : Michael Hang

Feature: feature to test login functionality

  Scenario: check login is successful with valid credential

    Given user is on login page
    When users enter username and password
    And clicks on login button
    Then user is navigated to the home page

@Tabs@Regression
Feature: Verify all the tabs are present in the appliation

  Background: User has launched the app
    Given user enters the url for the app
    Then Application should get displayed

  Scenario: Verify all the tabs are present in the appliation
    Given user clicks on Myaccount link
    When user enters the mobile number
    And user clicks on the proceed button
    And user enters the password
    And user clicks on the proceed link again
    Then user should get logged in
    And user should see all the below tabs
    |Dashboard|
    |My Policies|
    |My Searches|
    |Help|
    |My Vehicle|
    |My Profile| 
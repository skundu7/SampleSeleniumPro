@login@Regression
Feature: Login into the appliation

  Background: User has launched the app
    Given user enters the url for the app
    Then Application should get displayed

  Scenario: Login to the application
    Given user clicks on Myaccount link
    When user enters the mobile number
    And user clicks on the proceed button
    And user enters the password
    And user clicks on the proceed link again
    Then user should get logged in

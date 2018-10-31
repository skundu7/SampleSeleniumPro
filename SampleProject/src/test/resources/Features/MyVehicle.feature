@MyVehicle@Regression
Feature: Verify My vehile

  Background: User Login to the application
    Given user enters the url for the app
    Then Application should get displayed
    Given user clicks on Myaccount link
    When user enters the mobile number
    And user clicks on the proceed button
    And user enters the password
    And user clicks on the proceed link again
    Then user should get logged in

  Scenario: User is able to see all his policies
    Given user clicks on "My Vehicle" tab
    When user adds  "I20" in the vehile list
    And user enters "ExpiryDate" for  type "Cars" and model "I20" using Calendar
    Then vehicle "I20" should get added 
    
  
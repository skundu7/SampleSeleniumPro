@MyProfile@Regression
Feature: verify My profile funtionality

  Background: User Login to the application
    Given user enters the url for the app
    Then Application should get displayed
    Given user clicks on Myaccount link
    When user enters the mobile number
    And user clicks on the proceed button
    And user enters the password
    And user clicks on the proceed link again
    Then user should get logged in

  Scenario: User is able to add family member in his profile
    Given user clicks on "My Profile" tab
    When user clicks on Add Family members button
    And user enters Name for "Member1" of the family 
    And user enters date for "Member1" using calendar
    And user enters Relation for "Member1" of the family member
    When user cliks on Save
  
    
  
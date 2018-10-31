@MyFamilyMembers@Regression
Feature: verify Family Members in my profile page

  Background: User Login to the application
    Given user enters the url for the app
    Then Application should get displayed
    Given user clicks on Myaccount link
    When user enters the mobile number
    And user clicks on the proceed button
    And user enters the password
    And user clicks on the proceed link again
    Then user should get logged in

  Scenario: User verifies family members
    Given user clicks on "My Profile" tab
    Then user should be on "My Profile" page
    And user should see saved family members
    |Member 1|
    |Member 2|
    |Member 3|
    |Member 4|
    And user should see details of family members
    |Member1|
    |Member2|
    |Member3|
    |Member4|
    
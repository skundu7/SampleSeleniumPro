@Policies@Regression
Feature: Verify my Policies 

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
    Given user clicks on "My Policies" tab
    Then user should see all his policies
      | New India Assurance |
      | National Insurance  |
      | Iffco TOKIO         |
      | Bharti AXA          |
      | HDFC ERGO           |
      | Bharti AXA          |

  Scenario: User should be able to see his car policies
    Given user clicks on "My Policies" tab
    When user selects the car tab
    Then user should see all his car policies
      | National Insurance |
      | Iffco TOKIO        |
      | Bharti AXA         |
      | Bharti AXA         |

  Scenario: User should be able to see his Two wheeler policies
    Given user clicks on "My Policies" tab
    When user selects the Two Wheeler tab
    Then user should see all his two wheeler policies
      | New India Assurance |
      | HDFC ERGO           |

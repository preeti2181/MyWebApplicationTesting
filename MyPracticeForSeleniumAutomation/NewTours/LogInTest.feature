Feature: NewTours Application Testing
Scenario: NewTours Application LogIn Functionality Testing

    Given open firefoxdriver and navigate to NewTours Application
    When user enters valid username and password and Click on signin button
    Then user should be able to Login Successfully and close the application

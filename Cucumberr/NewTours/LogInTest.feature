Feature: NewTours Application Testing
Scenario Outline: NewTours Application LogIn Functionality Testing

Given Open FireFox Browser and Navigate to NewTours Application
When User Enters Valid "<UserName>" and "<Password>" and Click on SigIn button
Then User shoud be able to LogIn Successfully and close the Application

Examples:

|   UserName  |   Password  |
|   tutorial  |   tutorial  |
|   tutorial  |   tutorial  |
|   tutorial  |   tutorial  |

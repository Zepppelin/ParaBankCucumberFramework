Feature: Transfer fund Feature

Background: User is Logged In

Given User navigates to the login Page
And User logged in the App

Scenario: Trasfer fund from one account to another acount

Given User Is On Transfer Fund Page
When The Title Of The Page Is ParaBank Transfer Funds
Then User enters the trasfer amount
And User Selects the from account
And User selects the to account
Then user clicks on trasfer button
And user verify the trasfer Complete success message
Then user closes the app window

Scenario: Validate the error message when the amount field is empty

Given User navigates to Transfer Fund Page
When user clicks on trasfer button without entering the amount
Then Error message "The amount cannot be empty." is displayed
Then app window is closed by user


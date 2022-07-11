Feature: Open New Account Feature

Background: User is Logged In

Given User on login page
And User logged in the application

Scenario: Open New Checking Acccount

Given User Is On Open New Account Page
When The Title Of The Page Is ParaBank Open Account
Then User Selects The new Account Type As Checking
And User Selects the existing account
Then User Clicks On Open New Account Button
Then User Verify The Account Opening Success Message
Then user closes the window


Scenario: Open New Savings Acccount

Given User Is Already On Open New Account Page
When Title Of The Page Is ParaBank Open Account
Then User Selects The new Account Type As Savings
And User selects existing account
Then User Clicks On Open New Account
Then User Verify The Opened Account Success Message
Then user closed the browser



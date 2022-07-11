Feature: ParaBank Login feature

Background: User is Logged In
Given user is on login page

Scenario: ParaBank Login Scenario

Given User Is Already On Login Page
When The Title Of The Page Is ParaBank
Then User Enters username And password  and clicks on login button
Then User successfully logged in the application
Then user closed the window



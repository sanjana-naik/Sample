Feature: Login functionality

Scenario: Successful login with valid credentials

Given user is on Login Page
When user enters valid Username "admin" and Password "manager"
And clicks on Login button
And clicks remember me checkbox
Then  Message displayed Login Successfully
Feature: Login functionality

@regression
Scenario Outline: Successful login with valid credentials

Given user is on Login Page
When user enters "<username>" and "<password>"
And clicks on Login button
Then  Message displayed Login Successfully "<expected result>"

Examples:
|username |password |expected result|
|admin |manager|actiTIME -  Enter Time-Track|
|admi |manager|actiTIME - [Login]|
|admin |admin|actiTIME - [Login]|
|admin12 |manager|actiTIME - [Login]|


@smoke
Scenario: verify home page is displayed

Given user is on Login Page
When user enters valid Username "admin" and Password "manager"
And clicks on Login button
Then Home page is displayed


@ft
Scenario: user searches for the product

Given user is on home page
When user searches for the product
|product|quantity|
|shoes|2|
|watches|3|
|bags|5|
Then shoes page should be displayed
Feature: Free CRM contact Feature

Scenario Outline: Free CRM contact details Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on HomePage
Then move to new contact details page
Then user enters contact details "<firstname>" and "<lastname>" and "<Description>"
Then close the browser

Examples:
     | username | password | firstname | lastname |Description |
     | rakhideulkar10@gmail.com | Rakhi@123 | Rakhi | Deulkar | first Contact|
     | rakhideulkar10@gmail.com | Rakhi@123 | Mario | Deulkar | Second Contact|

     
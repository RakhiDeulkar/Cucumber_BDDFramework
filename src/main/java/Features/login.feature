Feature: Free CRM Login Feature

#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "rakhideulkar10@gmail.com" and "Rakhi@123"
#Then user clicks on Login button
#Then user is on HomePage


#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on HomePage
Then close the browser

Examples:
     | username | password |
     | rakhideulkar10@gmail.com | Rakhi@123 |
     | 123    | 455 |

     
    


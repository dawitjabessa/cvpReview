Feature: Application Login

#Scenario: Home page default login
#Given User is on NetBanking landing page
#When User login into application with "adam" and password "1234"
#Then Home page is populated
#And Cards displayed are "true"

Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login into application with <username> and password <password>
Then Home page is populated
And Cards displayed are <display> 


Examples:
|username |password|display |
|john     | 2345   |false |
#|Jin      | 1234   |true  |

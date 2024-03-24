Feature: login to app with data 
Scenario: login with correct credientials
Given I am at the landing page 
When I enter the username as "shubhamparakh"
And I enter the Password as "shubham18@"
And I click on submit Button
Then I should logged into app
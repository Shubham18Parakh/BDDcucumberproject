Feature: Signup Functionality
Scenario Outline: Sign Up to  Application
Given user is at sign up 
When user enters name as "<name>" in form
When user enters age as <age> in form
And user confirms "<gender>" radio button
Then user gets created 

Examples:
|name|age|gender|
|Jhony|23|male|
|punk|40|male|
|danial|45|male|
|lisa|28|female|
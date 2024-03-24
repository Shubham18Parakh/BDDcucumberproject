@profile
Feature: profile functionality
@sanity
Scenario: verification of add prifile
Given User is at the home page
When user click on add button
And user enter the details
Then Profile should get added
@regression
Scenario: verification of edit prifile
Given User is at the home page
When user click on edit button
And user update the details
Then Profile should get updated

@functional
Scenario: verification of delete prifile
Given User is at the home page
When user click on delete button
Then Profile should get deleted



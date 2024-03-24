Feature:login functionality
Scenario:login to application
Given user I am at the login page
When I enter username
And I enter password
And I click on login button
Then I should get looged into the application

Scenario: Validate title
Given user I am at the login page
Then I should see the title
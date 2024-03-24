Feature: Order Information
Background:
Given user should br logged into Application
When user click on orders button
Then user redirects to order Page

Scenario: Fetch Currently Placed Order 
When user click on current order button
When user should see current order Information

Scenario: Fetch past order Placed Order 
When user click on past order button
When user should see past order Information

Scenario: Fetch cancelled order Placed Order 
When user click on cancle order button
When user should see cancelled order Information
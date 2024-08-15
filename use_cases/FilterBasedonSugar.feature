@tag42
Feature: Filter based on sugar degree

Scenario: valid Filtering desserts
Given User is loggedRR in the system
When the user need a dessert with sugar percantage 1
Then the dessert with this value of suger shown
 
Scenario: valid Filtering desserts
Given User is loggedRR in the system
When the user need a dessert with not valid sugar percantage 10
Then error message sholud be display

@tag43
Feature: User Search on Product

Scenario: valid Search on product with userName
Given the user is loggedMA in the system
When the user click on Search button and enter ProductName "prod1"
Then the product should be display for the user



Scenario: invalid Search on product with userName
Given the user is loggedMA in the system
When the user click on Search button and enter invalid ProductName "prod1"
Then an error message should be shown 
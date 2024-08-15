@tag46
Feature: User Add Feedback

Scenario: User Add Feedback
Given the user is loggedpp in the system
When User click on add feedback and enter the feedback "malik is fire"
Then the feedback should added


Scenario: invalid User Add Feedback
Given the user is loggedpp in the system
When User click on add feedback and enter the invalid feedback "malik is fire"
Then the feedback should not added
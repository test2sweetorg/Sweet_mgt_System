@tag10
Feature: Add material supplier account from Admin

Scenario: Create a new supplier account
Given Admin is loggedinW in the System
When Admin click on Create new supplier
And fill the details of the supplier supplier name "shaheen" and password "111111"
Then the new supplier account should be created

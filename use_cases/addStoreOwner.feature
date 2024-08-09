@tag1
Feature: Add store owner account from Admin

Scenario: Create a new store owner account
Given Admin is logged in the System
When Admin click on Create new Store owner
And fill the details of the store owner storeOwnerName "shaheen" and password "111111" storecity "nablus"
Then the new store owner account should be created








 


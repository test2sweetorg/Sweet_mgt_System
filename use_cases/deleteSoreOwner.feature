@tag3
Feature: Admin delete store owner account

Scenario: valid delete Store owner
Given Admin is loggedZ in the System
When Admin click on delete store owner account
And Admin enter storeOwnerName "shaheen"
And there is an existing storeOwner account with storeOwnerName
Then this account should be deleted



Scenario: invalid delete store owner account
Given Admin is loggedZ in the System

When Admin click on delete store owner account
And Admin enter storeOwnerName "shaheen"
And there is No existing storeOwner account with storeOwnerName
Then there no existing account
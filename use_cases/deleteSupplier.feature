@tag6
Feature: Admin delete supplier account

Scenario: valid delete supplier
Given Admin is loggedx in the System
When Admin click on delete supplier account
And Admin enter supplierName "shaheen"
And there is an existing supplier account with supplierName
Then this account should be deleteds



Scenario: invalid delete supplier account
Given Admin is loggedx in the System
When Admin click on delete supplier account
And Admin enter supplierrName "shaheen"
And there is No existing supplier account with supplierName
Then the account not found
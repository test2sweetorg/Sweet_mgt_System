@tag16
Feature: add new product from stroeOwner

Scenario: Store owner adds a new product
Given Store owner is logged in the System
When Store owner clicks on Add New Product with productname "product1" and storename "StoreA" and price "50"
Then the new product should be added to the product list

Scenario: Store owner adds a product with an existing name
 Given Store owner is logged in the System
 When Store owner clicks on Add New Product with already existing productname "product112" and storename "StoreA" and price "50"
 Then an error message "Product with this name already exists" should be displayed
 
 

@tag18
Feature: Update an existing product

Scenario: Successfully update Nmae an existing product
Given Store owner is loggedW into the system
When Store owner click on update product with name "prod1" to name "prod4"
Then the product name shoud updated successfully

Scenario: unSuccessfully update name of product
Given Store owner is loggedW into the system
When Store owner click on update product with invalid or new name name "prod1" to name "prod4"
Then the product update failed

Scenario: Successfully update price an existing product
Given Store owner is loggedW into the system
When Store owner click on update product with name "prod1" to price "50"
Then the product price shoud updated successfully


Scenario: UnSuccessfully update price an existing product
Given Store owner is loggedW into the system
When Store owner click on update product with name not found  "prod1" to price "50"
Then the product price update failed


@tag17
Feature: Delete an existing product

Scenario: Successfully delete an existing product
Given Store owner is loggedQ into the system
When Store owner click on delete product with name "product1"
Then the product should be removed from the list of products

Scenario: Attempt to delete a product that doesn't exist
Given Store owner is loggedQ into the system
When Store owner click on delete product with name "product22"
Then Store owner should see an error message indicating the product does not exist

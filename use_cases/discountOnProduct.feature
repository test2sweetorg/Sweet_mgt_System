@tag31
Feature: Implement dynamic discount on a specific product

Scenario: Store owner applies a discount on a specific product
Given Store owner is loggedU in the system
When Store owner selects the Product Discount section to product with name "prod1" with discount 20%
Then the discount should be applied successfully to product

Scenario: Store owner applies a discount on a not exsisting product
Given Store owner is loggedU in the system
When Store owner selects the Product Discount section to not existing product with name "prod1" with discount 20%
Then the discount should be failed


@tag30
Feature: Identify best-selling products in each store

 Scenario: Store Owner View best-selling products in a specific store
    Given Store owner is loggedY into the system
    When Store owner click on the best-selling products button
    And Store owner select a store
    Then Store owner should see the best-selling products in the selected store
    
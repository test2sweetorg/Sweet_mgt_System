@tag12
Feature: Identify best-selling products in each store

 Scenario: View best-selling products in a specific store
    Given Admin is loggedQ in the System
    When Admin click on the best-selling products button
    And Admin select a store
    Then Admin should see a list of the best-selling products in the selected store
    And the list should include product names and total sales 
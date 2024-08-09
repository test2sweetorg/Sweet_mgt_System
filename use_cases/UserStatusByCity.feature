@tag13
Feature: Gather and display statistics on registered users by city
Scenario: View user statistics by city
    Given Admin is loggedM in the System
    When Admin navigate to the user statistics button
    Then Admin should see a list of cities with the number of registered users in each city
    
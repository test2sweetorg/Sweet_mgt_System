@tag19
Feature: store Owner Monitor sales and profits

Scenario: View daily sales and profits from store owner
Given Store owner is loggedT into the system
When Store owner selects the Monitor Sales and Profits option
And Store owner selects the Daily report type
Then Store owner should see the total sales and profits for the current day

Scenario: View monthly sales and profits
Given Store owner is loggedT into the system
When Store owner selects the Monitor Sales and Profits option
And Store owner selects the Monthly report type
Then Store owner should see the total sales and profits for the current month

Scenario: View yearly sales and profits
Given Store owner is loggedT into the system
When Store owner selects the Monitor Sales and Profits option
And Store owner selects the Yearly report type
Then Store owner should see the total sales and profits for the current year

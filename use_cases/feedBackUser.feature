@tag14
Feature: User Feedback Management

Scenario: View all user feedback
 Given I am loggedJ in as an Admin
 When I navigate to the User Feedback Management page
 Then I should see a list of all user feedback
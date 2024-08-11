@tag32
Feature: Communication and Notification

Scenario: Send a message to a user
Given Store Owner is loggedO in the system
When Store Owner selects a user "mohammad" to communicate with and send message "hello there"
Then the user should receive the message and its stored in communication history


Scenario: Send a message to a supplier
Given Store Owner is loggedO in the system
When Store Owner selects a supllier "mohammad" to communicate with and send message "hello there"
Then the supllier should receive the message and its stored in communication history

Scenario: View communication history
Given Store Owner is loggedO in the system
When Store Owner selects a see communication history option
Then Store Owner should see a list of all previous messages sent and received


@tag45
Feature: user camunication

Scenario: Send a message to a StoreOwner
Given user is loggedO in the system
When user selects a StoreOwner "mohammad" to communicate with and send message "hello there"
Then the storeOwner should receive the message and its stored in communication history

Scenario: View communication historyUser
Given user is loggedO in the system
When user selects a see communication history option
Then user should see a list of all previous messages sent and received


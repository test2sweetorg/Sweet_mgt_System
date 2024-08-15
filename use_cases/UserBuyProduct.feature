@tag44

Feature: User Purchase desserts directly from store owners

Scenario: valid add product to shopping card
Given the user is loggedms in the system
When the user click in shopping button 
And click on add product "prod1" to shopping card
Then the product added shopping card



Scenario: invalid add product to shopping card
Given the user is loggedms in the system
When the user click in shopping button 
And click on add invalid product "prod1" to shopping card
Then the product added shopping card failed

Scenario: valid delete product
Given the user is loggedms in the system
When the user click in shopping button 
And click on delete valid product "prod1" from shopping card
Then the product delete successfully


Scenario: invalid delete product from shopping card
Given the user is loggedms in the system
When the user click in shopping button 
And click on delete invalid product "prod1" from shopping card
Then the product delete fail

Scenario: confirm payment
Given the user is loggedms in the system
When the user click in shopping button 
And click on confirm
Then the products added to order list successfully

@tag35
Feature: Order status

Scenario: View Order status
Given store owner is loggedK in the system
When StoreOwner click on view order status 
Then the orders sholud be display



Scenario: valid Update Order Status
Given store owner is loggedK in the system
When storeOwner click on change order status for order has Id 123
Then the Order should be updated


Scenario: invalid Update Order Status
Given store owner is loggedK in the system
When storeOwner click on change order status for order has not found Id 123
Then the order has not found message


Scenario: valid delete Order 
Given store owner is loggedK in the system
When storeOwner click on delete order with valid id 456 from the list
Then the Order should be deleted successfully



Scenario: invalid delete Order 
Given store owner is loggedK in the system
When storeOwner click on delete order with invalid id 456 from the list
Then the Order is not found mesaage
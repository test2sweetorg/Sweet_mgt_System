@tag34
Feature: Account Management


Scenario: valid Update Store name
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And stroe Owner select upade store name to "StroeC"
Then the store name updated successfully


Scenario: invalid Update Store name
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And Store Owner select update store name to excisted name "StoreB"
Then the store name update faild



Scenario: valid update store Owner name
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And  Store Owner select update his name  to new name "prod5"
Then the storeOwner name updated successfully


Scenario: invalid update store Owner name
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And  Store Owner select update his name  to invalid name "prod5"
Then the storeOwner name updated should failed


Scenario: valid update store Owner password
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And  Store Owner select update his password  to new password "54678"
Then the storeOwner password updated successfully


Scenario: invalid update store Owner password
Given Store Owner is loggedF in the sysyem
When Store owner click on acount information management
And  Store Owner select update his password  to new invalid password "54678"
Then the storeOwner password updated failed











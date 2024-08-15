@tag38
Feature: User manage account

Scenario: valid edit user name 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user name to a new vaild name "ibrahem"
Then the user name updated successfully


Scenario: invalid edit user name 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user name to a new invaild name "ibrahem"
Then the user name updated failed


Scenario: invalid edit user name to exist user name 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user name to a new already exist name "ibrahem"
Then the user name updated faileddd




Scenario: valid edit user password 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user password to a new vaild password "123456789"
Then the user password updated successfully


Scenario: invalid edit user password 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user password to a new invaild password "1234"
Then the user password updated failed


Scenario: valid edit user city 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user city to a new vaild city "nablus"
Then the user city updated successfully


Scenario: invalid edit user city 
Given User is logINB in the System
When User Click on manage personal account
And choose edite user city to a new invaild city "4546513"
Then the user city updated failed





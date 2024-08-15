@tag39
Feature: recipe Management

Scenario: valid accept a recipe
Given Admin is loggedKK in the system
When Admin click on manage recipe
And choose accept a recipe " recipename"
Then the recipe should be accepted 


Scenario: invalid accept a recipe
Given Admin is loggedKK in the system
When Admin click on manage recipe
And choose accept a not valid name recipe " recipename"
Then the recipe  accepte failed

Scenario: valid delete a recipe
Given Admin is loggedKK in the system
When Admin click on manage recipe
And choose delete a recipe with name " recipename" 
Then the recipe should be deleted


Scenario: invalid delete a recipe
Given Admin is loggedKK in the system
When Admin click on manage recipe
And choose delete a recipe with invaild name " recipename" 
Then the recip delete failed


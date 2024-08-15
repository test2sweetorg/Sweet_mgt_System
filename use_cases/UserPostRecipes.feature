@tag40
Feature: User Post Recipes

Scenario: valid post recipes
Given the User is LoggedZ in the system
When the User click on post a recipes with recipe name " recipe1" and discription " discription of recipe"
Then the recipe should be added th the recipe list



Scenario: invalid post recipes with invalid name
Given the User is LoggedZ in the system
When the User click on post a recipes with invalid recipe name " recipe1" and discription " discription of recipe"
Then the recipe not added because invalid name


Scenario: invalid post recipes with invalid discription
Given the User is LoggedZ in the system
When the User click on post a recipes with  recipe name " recipe1" and invalid discription " discription of recipe"
Then the recipe not added because invalid discription




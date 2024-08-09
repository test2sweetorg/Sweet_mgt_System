@tag11
Feature: Monitor profits

Scenario: Monitor daily profits
Given Admin is loggedW in the System
When I click on the Monitor profits button
And  I select the daily profit  
Then I should see the  profit of currnt day for each store



Scenario: Monitor monthly profits
Given Admin is loggedW in the System
When I click on the Monitor profits button
And  I select the month profit  
Then I should see the  profit of currnt month for each store

Scenario: Monitor yearly profits
Given Admin is loggedW in the System
When I click on the Monitor profits button
And  I select the yearly profit  
Then I should see the  profit of currnt yearly for each store
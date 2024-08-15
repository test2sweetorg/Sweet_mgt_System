@tag37
Feature: Sign in to the platform


Scenario: Successfull User Sgin in
Given User is in the log_in page
When User enter valid userName "malik1" and valid password "45as"
Then User log_in successfully



Scenario: Sign-in with invalid userName
Given User is in the log_in page
When User enter invalid userName "malik1" and password "45as"
Then User log_in failed because of invalid userName



Scenario: Sign-in with invalid password
Given User is in the log_in page
When User enter  userName "malik1" and invalid password "45as"
Then User log_in failed because of invalid password


Scenario: Sign-in with not exist User
Given User is in the log_in page
When User enter userName "malik1" and  password "45as" and he has no account
Then User log_in failed because he doesn't have account
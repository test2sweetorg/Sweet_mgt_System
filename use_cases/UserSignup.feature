@tag36
Feature: User Sign up


Scenario: Successful Sign-Up
 Given the user is on the sign-up page
 When the user enter a user name "ahmad" and passowrd "123456" and email "ahmad@gmail.com" and city "nablus"
 Then the user should sign up seccessuflly
 
 Scenario: Sign-Up with Existing Email
 Given the user is on the sign-up page
 When the user enter a user name "ahmad" and passowrd "123456" and  existing email "ahmad@gmail.com" and city "nablus"
 Then the user  sign up failed because of existing email
 
 
 Scenario: Sign-Up with Invalid Password
 Given the user is on the sign-up page
 When the user enter a user name "ahmad" and invalid passowrd "123456" and   email "ahmad@gmail.com" and city "nablus"
 Then the user  sign up failed because of invalid password
  
 
 Scenario: Sign-Up with Invalid userName
 Given the user is on the sign-up page
 When the user enter a invalid user name "ahmad" and  passowrd "123456" and  email "ahmad@gmail.com" and city "nablus"
 Then the user  sign up failed because of invalid userName
 
 
 
 
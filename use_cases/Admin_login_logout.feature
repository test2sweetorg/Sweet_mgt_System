@tag2
Feature: Admin login or logout
 
Scenario: successful log in with valid credentials
 Given the Admin is on the log in page
 When the Admin enter username "malik" and password "1234" 
 And the Admin click in login
 Then the Admin should be enter the dashboard
 
 
 Scenario: unsuccessful log in with invalid username
 Given the Admin is on the log in page
 When the Admin enter username "malik1" and password "1234"
 And the Admin click in login
 Then an error message should be displayed
 
 
 Scenario: unsuccessful log in with invalid password
 Given the Admin is on the log in page
 When the Admin enter username "malik" and password "123456"
 And the Admin click in login
 Then an error message should be displayed
 
 
   
   
   
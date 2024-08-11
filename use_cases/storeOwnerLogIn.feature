@tag15
Feature: StoreOwnerLogIn

Scenario: successful log in with valid credentials
 Given the StoreOwner is on the log in page
 When the StoreOwner enter username "malik" and password "1234" 
 And the StoreOwner click in login
 Then the StoreOwner should be enter the dashboard
 
 
 Scenario: unsuccessful log in with invalid username
 Given the StoreOwner is on the log in page
 When the StoreOwner enter username "malik1" and password "1234"
 And the StoreOwner click in login
 Then invalid StoreOwner message disply
 
 
 Scenario: unsuccessful log in with invalid password
 Given the StoreOwner is on the log in page
 When the StoreOwner enter username "malik" and password "123456"
 And the StoreOwner click in login
 Then invalid StoreOwner message disply
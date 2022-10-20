Feature: To Validate the login functionality of Airline Application

Scenario: To validate the login with invalid credentials
Given The user should be in Airline login page
When The user should enter the emailid and password
And The user has to click the login button
Then The user is in invalid page

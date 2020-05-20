Feature: Check Login Functionality

@Smoke
Scenario: Login with Valid Credentials
Given Launch the application
When enters the "Admin" username  
And enters the "admin123" password
Then click on Login button

@Regression
Scenario: Login with InValid Credentials
Given Launch the application

@Sanity
Scenario: Logout Functionality
Given Launch the application
 
@Smoke
Scenario: Chk Add User Creation Func
Given Launch the application
 
@Smoke
Scenario: Chk User Listing Func
Given Launch the application

@Regression
Scenario: Delete User Func
Given Launch the application


@Regression @Smoke
Scenario: Delete User Func
Given Launch the application


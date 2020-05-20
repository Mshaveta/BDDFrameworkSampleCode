Feature: Check Login Functionality with Parameters

Scenario Outline: Login with Valid Credentials with Parameters
Given Launch the application
When enters the "<username>" username  
And  enters the "<password>" password
Then click on Login button
 
Examples:
|username|password|
|Admin|admin|
|admin|admin123|
|Admin|admin123|


 
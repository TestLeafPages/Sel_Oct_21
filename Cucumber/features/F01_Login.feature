Feature: leaftaps login functionality

#Background:
#Given Open the Chrome Browser
#And Load the application url 'http://leaftaps.com/opentaps'

@functional @smoke
Scenario Outline: Test with positive credential
Given Enter username as <username>
And Enter password as <password>
When Click on login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: Test with negative credential
Given Enter username as 'Demo'
And Enter password as 'crmsfa'
When Click on login button
But Error message should be displayed


Feature: leaftaps CreateLead functionality

#Background:
#Given Open the Chrome Browser
#And Load the application url 'http://leaftaps.com/opentaps'

Scenario: CreateLead with mandatory informations
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on CRMSFA link



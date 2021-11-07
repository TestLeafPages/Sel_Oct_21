@Leads
Feature: leaftaps CreateLead functionality

@regression
Scenario: CreateLead with mandatory informations
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
#Given Enter the Company name as 'Testleaf'
#And Enter the FirstName as 'Hari'
#And Enter the LastName as 'R'
#When Click on Create Lead button
#Then New Lead should be created



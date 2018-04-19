Feature: Delete Lead
Scenario Outline: Find and Delete the lead
And Enter the username as <uName>
And Enter password as <uPwd>
And Click on the login button
And Click the CRM/SFA link
And Click on the Leads
And Click Find Leads
And Enter the company name as <cName>
And Click First record from grid
And Click Delete button
Examples:
|uName|uPwd|cName|
|DemoSalesManager|crmsfa|Test|
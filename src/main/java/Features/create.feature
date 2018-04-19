Feature: create
@Sanity
Scenario Outline: Login and Create Lead
And Enter the username as <uName>
And Enter password as <uPwd>
And Click on the login button
And Click the CRM/SFA link
And Click on the Leads
And Click on the Create lead
And Enter Firstname as <firstName>
And Enter lastname as <lastName>
And Enter the Company <cName>
When Click on the submit button

Examples:
|uName|uPwd|firstName|lastName|cName|
|DemoSalesManager|crmsfa|Kevin|Christ|Infy|
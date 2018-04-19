Feature: Duplicate Lead
Scenario Outline:Login and Duplicate the lead (first user)
And Enter the username as <userName>
And Enter password as <passWord>
And Click on the login button
And Click the CRM/SFA link
And Click on the Leads
And Click on the Create lead
And Input Firstname as <firName>
And Input lastname as <lasName>
And Input the Company <compName>
And Click on the submit button of lead
And View the Created lead
And Click on Duplicate lead button
Examples:
|userName|passWord|firName|LasName|compName|
|DemoSalesManager|crmsfa|kevi|chris|infovi|

Scenario Outline:Login and Duplicate the lead (second user)
And Enter the username as <userName>
And Enter password as <passWord>
And Click on the login button
And Click the CRM/SFA link
And Click on the Leads
And Click on the Create lead
And Input Firstname as <firName>
And Input lastname as <lasName>
And Input the Company <compName>
And Click on the submit button of lead
And View the Created lead
And Click on Duplicate lead button
Examples:
|userName|passWord|firName|LasName|compName|
|DemoSalesCsr|crmsfa|kevi7|chris7|infovi|

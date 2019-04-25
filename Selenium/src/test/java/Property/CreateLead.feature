Feature: Create a Lead for Leaftap Application

#Background:
#Given Open the Browser
#And Maximise the Browser
#And Set the Timeout
#And Enter the URL
#And Enter the Username as DemoSalesManager
#And Enter the Password as crmsfa
#When Click on the Login Button
#Given Verify Home Page is displayed

Scenario Outline: TC01 Positive flow for Create Lead
Given Click on the CRM/SFA link
And Click on the Leads link
And Click on the CreateLead link
And Enter CompanyName as <CompanyName> 
And Enter FirstName as <FirstName>
And Enter LastName as <LastName>
And Click on the CreateLead Button
Then verify ViewLead page is displayed
Examples:
| CompanyName | FirstName | LastName |
| CTS	      | Guru      | Shankar  |

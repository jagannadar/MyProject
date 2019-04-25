Feature: Create a Lead for Leaftap Application


Scenario Outline: TC01 Positive flow for Create Lead
Given Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
When Click on the Login Button

And Click on the CRM/SFA link
And Click on the Leads link
And Click on the CreateLead link
And Enter CompanyName as <CompanyName> 
And Enter FirstName as <FirstName>
And Enter LastName as <LastName>
And Click on the CreateLead Button

Examples:
| CompanyName | FirstName | LastName |
| CTS	      | Guru      | Shankar  |
| HCL		  | Bala	  | Guru	 |



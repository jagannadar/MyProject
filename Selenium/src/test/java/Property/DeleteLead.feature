Feature: Deleting a Lead

Scenario: TC001_Delete_Lead

Given Open the Browser
And Maximise the browser
And Set TimeOut
And Get URL
And Enter Username as DemoSalesManager
And Enter Password
When Click on login button
Then Click on crmLink
When Click on Leads
And Cick on findLeads
And Click Phone tab
And Enter 93
Then Click on findLeads
When Click on firstRecord
And Click delete





Feature: Create Contact Scenario

Scenario: Create Contact
Given Launch the application
When  login to app with valid "admin" and "manager"
Then Home page should be Display
When click on contact link
Then contact page should be display
When click on create new contact page 
Then create contact page should be display
When create a contact then contact should be created
And Verify the contact details
And Verify the successful message
Then Logout
Then Close the browser
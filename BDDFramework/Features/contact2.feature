Feature: Create Contact
Scenario Outline: Create Contact2
Given Launch the application
When Login to application with valid "<username>" and "<password>"
Then Home page should be display
When Click on contact link
Then Contact page should be display
When Click on create new contact page
Then Create contact page should be dispaly
When Create a contact 

Examples:
| username | password |
| admin | manager |
| admin | manager |
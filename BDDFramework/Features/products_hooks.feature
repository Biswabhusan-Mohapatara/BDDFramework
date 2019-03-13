Feature: Create Product Scenario

Scenario: Create products
Given Launch the application
When login to application with valid usernme and password
Then Homepage should be dispalay
When click on products link
Then product page should be display
When click on create new product page 
Then create product page should be dispaly
When create a product
Then product should be created
And verify the product details
And verify the successful message
Then logout
Then close the browser
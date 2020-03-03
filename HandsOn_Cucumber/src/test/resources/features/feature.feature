Feature: EndtoEnd Functionality
Scenario: Login with valid credentials and add product into cart and proceed to payment

Given: Navigate to Home
When :user enter username and password
Then: user logged in successfully
And: navigate to all category
And : add product into shopping cart
When: proceed to checkout 
And :select bank and add credentials



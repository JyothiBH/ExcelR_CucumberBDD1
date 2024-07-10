Feature: TestCases_11to16
 
@Sc11
Scenario: Verify Subscription in Cart page 
	 Given 	User launches the Chromebrowser  	
	 When  	Navigate to app url "http://automationexercise.com" 
	  And  	In home Page user Clicks on Cart button and User Scroll down to footer
	 Then   Verify text "SUBSCRIPTION" 
	 And    Enter the email address in input and click arrow button 
	 Then   Verify success msge "You have been successfully subscribed!" is visible  
	 
@Sc12
Scenario: Add Products in Cart 
	 Given 	User launches the Chromebrowser  	
	 When  	Navigate to app url "http://automationexercise.com"  
	  And  	Click Products button and hover over first product and click Add to cart  
	And     Click on Continue Shopping button
	 Then  Verify products are added to Cart along with prices, quantity and total price
	 
	 @Sc13andSCc14andSc15
	 Scenario: Verify Product quantity in Cart 
	 Given 	User launches the Chromebrowser  	
	 When  	Navigate to app url "http://automationexercise.com" 
	 And   User clicks View Product for any product and increase quantity
	 And   User clicks Add to cart button and click view cart
	 Then  Verify Product is displayed in cart with exact same quantity
	 And   User adds a product in the Cart and clicks on  Proceed to checkout
	 And   Verify Address Details and enter description and click Place Order
	 
	 
	 When User enters payment details: Name on Card, Card Number, CVC, Expiration date
	 And Clicks on Pay Confirm order button 
	 Then Verify success message "Your order has been placed successfully!" is displayed
	 And Let the user clicks on delete account button
	 Then Verify "ACCOUNT DELETED!" and click Continue button
	 
	 @Sc16
  Scenario:  Place Order: Login before Checkout
    Given User launches the Chromebrowser
    When  	Navigate to app url "http://automationexercise.com" 
	 And   User then clicks View Product for any product and increase quantity
	 And   User clicks Add to cart button and click view cart
	 Then  Verify Product is displayed in cart with exact same quantity
	 And   User adds a product in the Cart and clicks on  Proceed to checkout
	 And   Verify Address Details and enter description and click Place Order
	 
	 
	 When User enters payment details: Name on Card, Card Number, CVC, Expiration date
	 And Clicks on Pay Confirm order button 
	 Then Verify success message "Your order has been placed successfully!" is displayed
	 And Let the user clicks on delete account button
	 Then Verify "ACCOUNT DELETED!" and click Continue button	 
	 
	 
	 @Sc17
 Scenario Outline:  Remove Products From Cart 
	 	 Given User launches the Chromebrowser
    When  	Navigate to app url "http://automationexercise.com" 
	And 		User logs in as "<email>" and "<pass>" then,adds product and deletes the product from Cart page
		Then 		Verify that product is removed from the car
		
	 Examples:
	       |email|pass|
			   |jogi111@gmail.com|Samiksha14$| 
			 
	 
	 @Sc18
	 Scenario:  View Category Products 
	 Given User launches the Chromebrowser
   When  Navigate to app url "http://automationexercise.com"
   And   Categories are visible on left side bar and Click on "Women" category
	 Then  Click on any category link under Women categoryand page is displayed with confirm text "WOMEN - TOPS PRODUCTS"
	 
	 @Sc19
	Scenario:   View & Cart Brand Products 
	 Given User launches the Chromebrowser
   When  Navigate to app url "http://automationexercise.com"
  And   User clicks on Products button
	 Then  Verify that Brands are visible on left side bar and Click on any brands 
	 And User is navigated to that brand page
	 
	 @Sc20
	Scenario: Search Products and Verify Cart After Login
	Given User launches the Chromebrowser
   When  Navigate to app url "http://automationexercise.com"
   And   User Clicks on Products button and in ALL PRODUCTS page search for product name 
   Then Verify all the products related to search are visible
   And Add those products to cart
   And Click Cart button and verify that products are visible in cart
   Then Now again Signup and view the products in cart page
   
   @Sc21
	Scenario: Add review on product
	Given User launches the Chromebrowser
   When  Navigate to app url "http://automationexercise.com"
   And Navigte to All Products page and click on View product button 
   And Write your Reviews is visible enter detials and Reviews and Submit it
   Then Success message is displayed
   
    @Sc23
   Scenario: Verify address details in checkout page
	Given User launches the Chromebrowser
   When Navigate to app url "http://automationexercise.com"
   And  Click Signup Login button, fill all details to create account 
   Then verify Loggedin as username on top. Add a product and proceed till checkout
   And verify Delivery address and Billing address is same as filled during signing up
   And Click on Delete Account to verify its deleted  
   
   @Sc25andSc26
   
   Scenario: Verify Scroll Up using Arrow button and Scroll Down functionality
   Given User launches the Chromebrowser
   When Navigate to app url "http://automationexercise.com"
   And User logs in Home Page is displayed and Scroll down to bottom of page 
   Then Verify Subscription is visible
   And Click on arrow at bottom right side to move upward
   And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
   
   
   
   
   
   
   
   
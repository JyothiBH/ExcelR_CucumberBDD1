Feature: Login_AdminTest

@Sc1
Scenario: Successful Login with valid Credentials 
	 Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And  	clicks on Login link
	 Then 	Verify "ENTER ACCOUNT INFORMATION" is visible
	 When 	User enters Title,Password
	 And 		User enters DOB
	 And 		User enters ADDRESS INFORMATION details and clicks on Create_Accnt button
	 Then 	Account is successfully created and "ACCOUNT CREATED!" is visisble
	
@Sc2
Scenario: Login User with correct email and password
	 Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And  	clicks on Login to your account
	 Then User is successfully logged in	

@Sc3
Scenario: Login User with incorrect email and password
	 Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And  	Enter incorrect email address and password
	 Then  	Verify error 'Your email or password is incorrect!' is visible


@Sc4
Scenario: Logout User
	 Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And  	clicks on Login to your account
	 And 		User clicks on Logout
	 Then   Verify that user is navigated to login page
 
 
 @Sc6
Scenario: Contact Us Form
 	 Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And  	clicks on Login to your account
 	 And 		Click on Contact Us button
 	 Then   Verify "GET IN TOUCH" header is visible 
 	 And    Enter name, email, subject, message, Upload file and click on Submit btn
 	 Then   Verify success message "Success! Your details have been submitted successfully." is visible
 
 
 @Sc7
Scenario: Verify Test Cases Page
  Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
  	And 	Clicks on Test Cases button
   Then   Verify user is navigated to test cases page successfully
 
 @Sc8 
 Scenario: Verify All Products and product detail page
  Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
 	And Click on Products button
 	And Verify user is navigated to ALL PRODUCTS page successfully
 	Then  User is landed to product detail page and  all the details like product name, category, price, availability, condition, brand are visible
 
 
 @Sc9 
 Scenario:  Search Product
  Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
	 And Click on Products button
	 And Enter product name in search input and click search button
 
 @Sc10
 Scenario:  Verify Subscription in home page
  Given 	User launch the Chromebrowser  	
	 When  	User open the url as "http://automationexercise.com" 
 	Then Verify text "SUBSCRIPTION" heading is displayed below the page
 	And Enter email address in input and click arrow button
 	Then Verify that success message "You have been successfully subscribed!" is visible
 
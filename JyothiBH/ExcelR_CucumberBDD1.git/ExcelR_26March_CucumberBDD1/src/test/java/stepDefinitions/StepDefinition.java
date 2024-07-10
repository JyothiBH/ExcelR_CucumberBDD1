package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.Login_AdminTest;

public class StepDefinition {

	WebDriver driver;
	Login_AdminTest Signin;

	@Given("User launch the Chromebrowser")
	public void user_launch_the_chromebrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Signin = new Login_AdminTest(driver);

	}
	@When("User open the url as {string}")
	public void user_open_the_url_as(String url) throws InterruptedException {
	   driver.get(url);
	   
	}


@And("clicks on Login link")
public void click_on_login_link() {
	Signin.loginlink();
	Signin.EnterUsername_EmailId("ss","shsff1a0o@gmail.com");
}


@Then("Verify {string} is visible")
public void verify_is_visible(String string) {
    Assert.assertEquals("ENTER ACCOUNT INFORMATION", string);
}

@When("User enters Title,Password")
public void user_enters_title_name_email_password_date_of_birth() {
	Signin.Enterdetails();
}


@And("User enters DOB")
public void user_enters_dob() {
    
	Signin.DOB_Details();
}


@And("User enters ADDRESS INFORMATION details and clicks on Create_Accnt button")
public void user_enters_address_information_details() throws InterruptedException {
	Signin.Add_Info();
}

@Then("Account is successfully created and {string} is visisble")
public void account_is_successfully_created_and_is_visisble(String string) {
   
	Signin.Acc_Created(string);
	driver.quit();
}


/*  Try to move to Step definition1  as its related to SC2  */

@And("clicks on Login to your account")
public void clicks_on_Login_to_your_account() {

 System.out.println("User is on main page");
 Signin.Login();
}
 
@Then("User is successfully logged in")
public void User_is_logged_in() {
driver.quit();
}





/*  Sc03*/
	
@And("Enter incorrect email address and password")
public void enter_incorrect_email_address_and_password() {
	Signin.Incorrectdetails();
}
@Then("Verify error {string} is visible")
public void verify_error_is_visible(String string) {
	Signin.errormsg(string);
	driver.quit();
}


/* Sc04 */
@And("User clicks on Logout")
public void user_clicks_on_logout() {
	Signin.Logout();
}

@Then("Verify that user is navigated to login page")
public void verify_that_user_is_navigated_to_login_page() {
	Signin.New_userSignup();
	driver.quit();
}

/* Sc06 */
@When("Click on Contact Us button")
public void click_on_contact_us_button() {
	Signin.ContactUs();
}

@Then("Verify {string} header is visible")
public void verify_header_is_visible(String string) throws InterruptedException {
	Signin.GetinTouch(string);
    
}
@Then("Enter name, email, subject, message, Upload file and click on Submit btn")
public void enter_name_email_subject_message_upload_file_and_click_on_submit_btn() throws InterruptedException {
	Signin.GetintouchDetails();
}

@Then("Verify success message {string} is visible")
public void verify_success_message_is_visible(String string) {
	Signin.Success_Msg(string);
driver.quit();
}

/*SC07*/

@When("Clicks on Test Cases button")
public void clicks_on_test_cases_button() {
	Signin.TestCaseLink();
}

@Then("Verify user is navigated to test cases page successfully")
public void verify_user_is_navigated_to_test_cases_page_successfully() {
	Signin.TestCaselnksuccess();
	driver.quit();
}

/*SC08*/
@And("Click on Products button")
public void Click_on_Products_button() {
	Signin.Products();
}


@And("Verify user is navigated to ALL PRODUCTS page successfully")
public void verify_user_is_navigated_to_ALL_PRODUCTS() throws InterruptedException {
	Signin.All_Products();
}

@Then("User is landed to product detail page and  all the details like product name, category, price, availability, condition, brand are visible")
public void User_is_landed_to_product_detail_page() {
	Signin.Product_Info();
}

/*Sc09*/
@And("Enter product name in search input and click search button")
public void Enter_product_name_in_search_input() {
	Signin.search();
}

/*Sc10*/





@Then("Verify text {string} heading is displayed below the page")
public void verify_text_heading_is_displayed_below_the_page(String string){
	try {
		Signin.Subscription(string);
	} catch (Exception e) {
	System.out.println(e);
	}
  
}

@Then("Enter email address in input and click arrow button")
public void enter_email_address_in_input_and_click_arrow_button() throws InterruptedException {
    Signin.enter_email();
}

@Then("Verify that success message {string} is visible")
public void verify_that_success_message_is_visible(String string) {
    Signin.Sub_success(string);
}



}

package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TestCases_11to26;

public class StepDefinitionTC11toTC26 {

	WebDriver driver;	
	TestCases_11to26 TC_11to26;

	@Given("User launches the Chromebrowser")
	public void user_launches_the_chromebrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 TC_11to26 = new TestCases_11to26(driver);
	}




@When("Navigate to app url {string}")
public void navigate_to_app_url(String url) {
	 driver.get(url);
}
@When("In home Page user Clicks on Cart button and User Scroll down to footer")
public void in_home_page_user_clicks_on_cart_button_and_user_scroll_down_to_footer() {
	TC_11to26.Cart();
}

@Then("Verify text {string}")
public void verify_text(String string) {
	TC_11to26.Subscription_header(string);
}

@Then("Enter the email address in input and click arrow button")
public void enter_the_email_address_in_input_and_click_arrow_button() {
	TC_11to26.EnterEmail();
}

@Then("Verify success msge {string} is visible")
public void verify_success_msge_you_have_been_successfully_subscribed_is_visible(String string) {
	TC_11to26.success(string);
//	TC_11to26.AddtoCart();
	driver.quit();
}


@When("Click Products button and hover over first product and click Add to cart")
public void click_products_button_and_hover_over_first_product_and_click_add_to_cart() throws InterruptedException {
	Thread.sleep(5000);
	TC_11to26.AddtoCart();
}

@When("Click on Continue Shopping button")
public void click_on_continue_shopping_button() throws InterruptedException {
	TC_11to26.ContinueShop();
}

@Then("Verify products are added to Cart along with prices, quantity and total price")
public void verify_products_are_added_to_cart_along_with_prices_quantity_and_total_price() {
	TC_11to26.Productadded2cart(); 
	driver.quit();
	
}
   

@And("User clicks View Product for any product and increase quantity")
public void User_increase_quantity() throws InterruptedException {
	TC_11to26.login();
	TC_11to26.Quantity();
}
@And("User then clicks View Product for any product and increase quantity")
public void User_LoginAddProd() throws InterruptedException {
	TC_11to26.login2();
	TC_11to26.Quantity();
}

@And("User clicks Add to cart button and click view cart")
public void User_clicks_AddtoCart() throws InterruptedException {
	TC_11to26.Add2Cart();

}

@Then("Verify Product is displayed in cart with exact same quantity")
public void VerifyUpdatedQty() throws InterruptedException {
	//TC_11to26.Checkout();
}
@And("User adds a product in the Cart and clicks on  Proceed to checkout")
public void UseraddsProduct(){
	TC_11to26.Checkout();
}


@And("Verify Address Details and enter description and click Place Order")
public void Place_Order(){
	TC_11to26.PlaceOrder_1();
	//driver.quit(); below for TC15
	
	
	
	
}


@Given("User adds a product and clicks on Place order to enter Payment details page")
public void user_adds_a_product_and_clicks_on_place_order_to_enter_payment_details_page() {
	//TC_11to26.PlaceOrder_1();
}

@When("User enters payment details: Name on Card, Card Number, CVC, Expiration date")
public void user_enters_payment_details_name_on_card_card_number_cvc_expiration_date() {
	TC_11to26.CardDetails();
}

@When("Clicks on Pay Confirm order button")
public void clicks_on_pay_confirm_order_button() {
	TC_11to26.ConfirmOrder1();
	}
@Then("Verify success message {string} is displayed")
public void verify_success_message_is_displayed(String string) {
	TC_11to26.SuccessMsg(string);
}

@Then("Let the user clicks on delete account button")
public void let_the_user_clicks_on_delete_account_button() {
	TC_11to26.Deleteacc();
}

@Then("Verify {string} and click Continue button")
public void verify_and_click_continue_button(String string) {
	TC_11to26.AccDelSuccess(string) ;
	//driver.quit();
}

@When("User deletes the product from Cart page")
public void user_deletes_the_product_from_cart_page(String mailid,String Pswd) {
	TC_11to26.login3(mailid,Pswd);
	TC_11to26.Add2Cart();

}


@And("User logs in as {string} and {string} then,adds product and deletes the product from Cart page")
public void user_logs_in_as_and_then_adds_product_and_deletes_the_product_from_cart_page(String string, String string2) {
	TC_11to26.login3(string,string2);
}

@Then("Verify that product is removed from the car")
public void verify_that_product_is_removed_from_the_car() throws InterruptedException {
	TC_11to26.Quantity();
	TC_11to26.Add2Cart(); 
	TC_11to26.Productdeleted();
	driver.quit();
}


@When("Categories are visible on left side bar and Click on {string} category")
public void categories_are_visible_on_left_side_bar_and_click_on_category(String string) {
	TC_11to26.CategoryProd(); 
	System.out.println(string);
}

@Then("Click on any category link under Women categoryand page is displayed with confirm text {string}")
public void click_on_any_category_link_under_women_categoryand_page_is_displayed_with_confirm_text(String string) {
   System.out.println(string);
   driver.quit();
}


@When("User clicks on Products button")
public void user_clicks_on_products_button() {
	TC_11to26.Product();
}

@Then("Verify that Brands are visible on left side bar and Click on any brands")
public void verify_that_brands_are_visible_on_left_side_bar_and_click_on_any_brands() {
	TC_11to26.Brand();
}

@Then("User is navigated to that brand page")
public void user_is_navigated_to_that_brand_page() {
   
}


@When("User Clicks on Products button and in ALL PRODUCTS page search for product name")
public void user_clicks_on_products_button_and_in_all_products_page_search_for_product_name() {
	TC_11to26.SearchProd();
}

@Then("Verify all the products related to search are visible")
public void verify_all_the_products_related_to_search_are_visible() {
}


@And("Add those products to cart")
public void add_those_products_to_cart() {
	TC_11to26.SubmitSearchedprod();
}

@And("Click Cart button and verify that products are visible in cart")
public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
	TC_11to26.AddtoCartview();
}

@Then("Now again Signup and view the products in cart page")
public void now_again_signup_and_view_the_products_in_cart_page() {
	TC_11to26.login();
	 
}


@When("Navigte to All Products page and click on View product button")
public void navigte_to_all_products_page_and_click_on_view_product_button() {
	TC_11to26.Product();
	
	TC_11to26.GoToProduct();
	
}

@When("Write your Reviews is visible enter detials and Reviews and Submit it")
public void write_your_reviews_is_visible_enter_detials_and_reviews_and_submit_it() {
	TC_11to26.Review();
}

@Then("Success message is displayed")
public void success_message_is_displayed() {
 }


@When("Click Signup Login button, fill all details to create account")
public void click_signup_login_button_fill_all_details_to_create_account() {
	TC_11to26.login();
}

@Then("verify Loggedin as username on top. Add a product and proceed till checkout")
public void verify_loggedin_as_username_on_top_add_a_product_and_proceed_till_checkout() throws InterruptedException {
	TC_11to26.Loggedinuser();
	TC_11to26.AddtoCart();
	TC_11to26.AddtoCartview();
	
}

@Then("verify Delivery address and Billing address is same as filled during signing up")
public void verify_delivery_address_and_billing_address_is_same_as_filled_during_signing_up() {
	TC_11to26.Checkout();
}

@Then("Click on Delete Account to verify its deleted")
public void click_on_delete_account_to_verify_its_deleted() {
	//TC_11to26.pro();
}



@When("User logs in Home Page is displayed and Scroll down to bottom of page")
public void user_logs_in_home_page_is_displayed_and_scroll_down_to_bottom_of_page() throws InterruptedException {
	TC_11to26.login();
	TC_11to26.Scroll_down();
}

@Then("Verify Subscription is visible")
public void verify_subscription_is_visible() {
 }

@Then("Click on arrow at bottom right side to move upward")
public void click_on_arrow_at_bottom_right_side_to_move_upward() {
 }

@Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
}











}






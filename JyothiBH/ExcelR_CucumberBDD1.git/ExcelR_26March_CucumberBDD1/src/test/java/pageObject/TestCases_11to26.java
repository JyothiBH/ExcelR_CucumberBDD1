package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class TestCases_11to26 {
	WebDriver driver;
	public TestCases_11to26(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[3]/a")	WebElement Cart;
	@FindBy (xpath = "//div[@class='col-sm-3 col-sm-offset-1']/div/h2")	WebElement Sub_Header;
	@FindBy (id = "susbscribe_email")	WebElement Susbscribe_Email;
	@FindBy (id = "subscribe")	WebElement Subscribe_arrow;
	@FindBy (id = "success-subscribe")	WebElement Success_subscribe;
	@FindBy (xpath = "//div[@class='col-sm-9 padding-right']/div[1]/div[2]/descendant::a[1]")	WebElement AddToCart;
	
	@FindBy (xpath = "//div[@class='col-sm-9 padding-right']/descendant::span/child::button")	WebElement AddToCart1;
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[2]/a")	WebElement Products;
	@FindBy (xpath = "//div[@class='modal-content']/div[3]/button")	WebElement ContinueShop;
	@FindBy (xpath = "//a[text()='Blue Top']")	WebElement Descriptn_addedProd;
	@FindBy (xpath = "//div[@class='col-sm-9 padding-right']/descendant::h2/following-sibling::div[5]/descendant::li/a/i")	WebElement view_product;
	@FindBy (id = "quantity")	WebElement Quantity;
	
	@FindBy (linkText ="View Cart")	WebElement View_Cart;
	@FindBy (linkText ="Proceed To Checkout")	WebElement ProceedToCheckout;
	@FindBy (xpath = "//td[@class='cart_quantity']")	WebElement QuantityUpdated;
	@FindBy (xpath = "//textarea[@name='message']")	WebElement Message;
	

	@FindBy (name = "email")	WebElement EmailAddr;
	@FindBy (name = "password")	WebElement Password;
	@FindBy (xpath = "//button[text()='Login']")	WebElement Login;
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[4]/a")	WebElement Login_Signup_Link;
	@FindBy (xpath = "//div[@id='cbb']")	WebElement ad_close;
	@FindBy (linkText ="Place Order")	WebElement Place_Order;
	@FindBy (xpath ="//div[@class='col-sm-12 form-group']/input")	WebElement name_on_card;
	@FindBy (xpath = "//div[@class='col-sm-12 form-group card']/input")	WebElement card_number;
	@FindBy (xpath = "//div[@class='col-sm-4 form-group cvc']/input")	WebElement cvc;
	@FindBy (xpath = "//div[@class='col-sm-4 form-group expiration']/input[@name='expiry_month']")	WebElement expiry_month;
	@FindBy (xpath = "//div[@class='col-sm-4 form-group expiration']/input[@name='expiry_year']")	WebElement expiry_year;
	@FindBy (id = "submit")	WebElement Pay_and_Confirm_Order;
	@FindBy (xpath = "//h2[@class='title text-center']/b")	WebElement Order_Placed;
	@FindBy (linkText ="Delete Account")	WebElement Delete_Account;
	@FindBy (xpath ="//h2[@class='title text-center']/b")	WebElement AccountDeletesSucc;
	@FindBy (xpath ="//a[@class='cart_quantity_delete']")	WebElement ProductDeleted;
	@FindBy (xpath ="//div[@class='col-sm-3']/div/h2")	WebElement Category;
	@FindBy (linkText ="WOMEN")	WebElement Women;
	@FindBy (xpath ="//div[@class='brands_products']/h2")	WebElement Brands;
	@FindBy (xpath ="//ul[@class='nav nav-pills nav-stacked']/li[1]/a")	WebElement Brand_MADAME;
	@FindBy (id = "search_product")	WebElement search_product;
	@FindBy (id = "submit_search")	WebElement submit_search;
	@FindBy (id = "name")	WebElement name;
	@FindBy (id = "email")	WebElement email;
	@FindBy (id = "review")	WebElement review;
	@FindBy (xpath ="//ul[@class='nav navbar-nav']/li[10]/a/i")	WebElement LoggedInUsername;
	@FindBy (xpath ="//ul[@class='address alternate_item box']/li[1]/h3")	WebElement Your_billingaddress;
	@FindBy (xpath ="//ul[@class='address item box']/li[1]/h3")	WebElement Your_DeliveryAddress;
	
	
	
	
	/*Sc11*/
	public void Cart() {
		Cart.click();
	}
	public void Subscription_header(String string) {
		
		System.out.println(Sub_Header.getText());
		Assert.assertEquals(string, Sub_Header.getText());
	}
	public void EnterEmail() {
		Susbscribe_Email.sendKeys("qwez@gmail.com");
		Subscribe_arrow.click();
	}
	public void success(String string) {
		
		Success_subscribe.getText();
		System.out.println(Success_subscribe.getText());
		Assert.assertEquals(string, Success_subscribe.getText());
	}
	
	/*Sc12*/

public void AddtoCart() throws InterruptedException {
	
	
	Products.click();
	Thread.sleep(1000);
	try {
		ad_close.click();
	} catch (Exception e) {
	System.out.println(e);
	}
	
	AddToCart.click();
	
}
public void ContinueShop() throws InterruptedException {
	Thread.sleep(1000);
	
	try {
		ContinueShop.click();
	} catch (Exception e) {
	System.out.println(e);
	}
}
public void Productadded2cart() {
	Cart.click();
	Descriptn_addedProd.isDisplayed();
	System.out.println(Descriptn_addedProd.isDisplayed());
	Assert.assertTrue(Descriptn_addedProd.isDisplayed());
}
public void login() {
	Login_Signup_Link.click();
	EmailAddr.sendKeys("jogi@gmail.com");
	Password.sendKeys("Samiksha14$");
	Login.click();
}
public void login2() {
		Login_Signup_Link.click();
		EmailAddr.sendKeys("qlki@gmail.com");
		Password.sendKeys("Samiksha14$");
		Login.click();
}
public void login3(String mailid,String Pswd) {
	Login_Signup_Link.click();
	EmailAddr.sendKeys(mailid);
	Password.sendKeys(Pswd);
	Login.click();
}

public void Quantity() throws InterruptedException {
	view_product.click();
	try {
		ad_close.click();
	} 
	catch (Exception e) {
		System.out.println(e);
		}
	Thread.sleep(1000);
	Quantity.clear();
	Quantity.sendKeys("3");
	//Thread.sleep(1000);
	//driver.quit();
}

public void Add2Cart() {
	AddToCart1.click();
	View_Cart.click();
	QuantityUpdated.getText();
System.out.println(QuantityUpdated.getText());

}
public void Checkout() {
	ProceedToCheckout.click();
}

public void PlaceOrder() {
	Message.sendKeys("Order is placed success***");

}

/*Sc15*/
public void PlaceOrder_1() {

	Place_Order.click();
}

public void CardDetails() {
	name_on_card.sendKeys("jyo");
	card_number.sendKeys("123321");
	cvc.sendKeys("121");
	expiry_month.sendKeys("12");
	expiry_year.sendKeys("1980");
}

public void ConfirmOrder1() {
	Pay_and_Confirm_Order.click();
}
public void SuccessMsg(String string) {
	
}
public void Deleteacc() {
System.out.println(Order_Placed.getText());
	
	Delete_Account.click();
}
public void AccDelSuccess(String string) {
	System.out.println(AccountDeletesSucc.getText());
}
public void Productdeleted() {
	ProductDeleted.click();
}

public void CategoryProd() {
	Assert.assertTrue(Category.isDisplayed());
	Category.isDisplayed();
	Women.click();
}
public void Product() {
	Products.click();
	
}
public void Brand() {
	Assert.assertTrue(Brands.isDisplayed());
	Brands.isDisplayed();
	Brand_MADAME.click();
}
public void SearchProd() {
	Products.click();
	search_product.sendKeys("H&M");
	
	
}
public void SubmitSearchedprod() {
	submit_search.click();
	AddToCart.click();
}
public void AddtoCartview() {
	View_Cart.click();
}
public void GoToProduct() {
	view_product.click();
	
}
public void Review() {
	review.sendKeys("Jyo");
	email.sendKeys("aa@gmail.com");
	review.sendKeys("Project 2 completed");
}

public void Loggedinuser() {
	LoggedInUsername.getText();
	System.out.println(LoggedInUsername.getText());
			
}
public void pro() {
	//AddToCart.click();
	Your_billingaddress.isDisplayed();
		Your_billingaddress.getText();
		Your_DeliveryAddress.isDisplayed();
		Your_DeliveryAddress.getText();
}
public void Scroll_down() throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor Jse = (JavascriptExecutor) driver;
	Jse.executeScript("window.scrollBy(0,6000)");
	
}


}
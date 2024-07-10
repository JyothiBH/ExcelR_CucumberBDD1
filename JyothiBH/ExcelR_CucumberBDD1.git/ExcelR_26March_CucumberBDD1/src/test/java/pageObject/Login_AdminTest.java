package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Login_AdminTest {
	
	
	WebDriver driver;
	public Login_AdminTest(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[4]/a")	WebElement Login_Signup_Link;
	@FindBy (xpath = "//form[@action='/signup']/input[2]")	WebElement Username;
	@FindBy (xpath = "//form[@action='/signup']/input[3]")	WebElement Email_Id;
	@FindBy (xpath = "//form[@action='/signup']/button")	WebElement Signup;
	
	@FindBy (id = "id_gender2")	WebElement Title;
	@FindBy (id = "password")	WebElement password;
	@FindBy (id = "days")	WebElement days;
	@FindBy (id = "months")	WebElement months;
	@FindBy (id = "years")	WebElement years;
	@FindBy (id = "first_name")	WebElement First_name;
	@FindBy (id = "last_name")	WebElement Last_name;
	@FindBy (id = "company")	WebElement Company;
	@FindBy (id = "address1")	WebElement Address1;
	@FindBy (id = "address2")	WebElement Address2;
	@FindBy (id = "country")	WebElement country;
	@FindBy (id = "state")	WebElement state;
	@FindBy (id = "city")	WebElement city;
	@FindBy (id = "zipcode")	WebElement zipcode;
	@FindBy (id = "mobile_number")	WebElement mobile_number;
	//@FindBy (xpath = "//button[text()='Create Account']")	WebElement Create_Accnt;
//@FindBy (xpath = "//form[@action='/signup']/div/following-sibling::p[10]/input/following::button[1]")	WebElement Create_Accnt;
	
	@FindBy (xpath = "//div[@id='cbb']")	WebElement ad_close;
	
	@FindBy (xpath = "//div[@class='login-form']/child::form/p[10]/following::button[1]")	WebElement Create_Accnt;
	@FindBy (xpath = "//h2[@class='title text-center']/b")	WebElement Account_Created;
	
	@FindBy (name = "email")	WebElement EmailAddr;
	@FindBy (name = "password")	WebElement Password;
	@FindBy (xpath = "//button[text()='Login']")	WebElement Login;
		
	@FindBy (xpath = "//form[@action='/login']/input/following::p[1]")	WebElement errormsg1;
	
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[4]/a/i")	WebElement Logout;
	@FindBy (xpath = "//section[@id='form']/div/div/descendant::div[5]//h2")	WebElement Newuser_Signup;
	
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[9]/a")	WebElement ContactUs_Link;
	@FindBy (xpath = "//div[@class='col-sm-8']/div/h2")	WebElement GetinTouch;
	
	@FindBy (name = "name")	WebElement Name;
	@FindBy (name = "email")	WebElement email;
	@FindBy (name = "subject")	WebElement subject;
	@FindBy (id = "message")	WebElement message;
	@FindBy (name = "upload_file")	WebElement upload_file;
	@FindBy (xpath = "//div[@id='form-section']/child::form/child::div[6]/child::input")	WebElement submit;
	@FindBy (xpath = "//div[@class='status alert alert-success']")	WebElement Success_Msg;
	
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[5]/a")	WebElement TestCases;
	@FindBy (xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2/b")	WebElement TestCasesHeader;
	
	@FindBy (xpath = "//ul[@class='nav navbar-nav']/li[2]/a")	WebElement Products;
	@FindBy (xpath = "//div[@class='features_items']/h2")	WebElement All_Products;
	@FindBy (xpath = "//div[@id='cartModal']/following::div[1]/div/div[2]/ul/li/a/i")	WebElement View_Product;
	@FindBy (xpath = "//div[@class='col-sm-3']/div/h2")	WebElement Category;
	@FindBy (xpath = "//div[@class='brands_products']/h2")	WebElement Brands;
	@FindBy (xpath = "//div[@class='product-information']/span/following::p[1]")	WebElement Availability;
	@FindBy (xpath = "//div[@class='product-information']/span/following::p[2]")	WebElement Condition;
	@FindBy (xpath = "//div[@class='product-information']/span/following::p[3]")	WebElement Brand;
	
	@FindBy (id = "search_product")	WebElement Search;
	@FindBy (id = "submit_search")	WebElement Searchoption;
	
	@FindBy (xpath = "//div[@class='col-sm-3 col-sm-offset-1']/div/h2")	WebElement Subscription;
	@FindBy (id = "susbscribe_email")	WebElement Susbscribe_email;
	@FindBy (id = "subscribe")	WebElement subscribe_arrow;
	@FindBy (id = "success-subscribe")	WebElement success_subscribe;
	
	
	public void loginlink()
	{
		Login_Signup_Link.click();
	}
	public void EnterUsername_EmailId(String usrnme,String EmailId)
	{
		Username.sendKeys(usrnme);
		Email_Id.sendKeys(EmailId);
		Signup.click();
	}
	
	public void Enterdetails() {
		Title.click();
		password.sendKeys("Samiksha14$");
	}
	
	public void DOB_Details() {
		Select sel = new Select(days);
		sel.selectByVisibleText("3");
		
		Select sele = new Select(months);
		sele.selectByVisibleText("June");
		
		Select selec = new Select(years);
		selec.selectByVisibleText("2020");
	}
	
	public void Add_Info() throws InterruptedException {
		First_name.sendKeys("Jyothi");
		Last_name.sendKeys("Girish");
		Company.sendKeys("Excelr");
		Address1.sendKeys("H.no 23, Bangalore");
		Address2.sendKeys("H.no 24, Bangalore");
		Select selec = new Select(country);
		selec.selectByVisibleText("New Zealand");
		state.sendKeys("karnataka");
		city.sendKeys("kar");
		zipcode.sendKeys("123454");
		mobile_number.sendKeys("12345678");
		System.out.println("Code reached till here");
		//Thread.sleep(800);
		//driver.switchTo().frame("aswift_1");
		try {
			ad_close.click();
		} 
		catch (Exception e) {
			System.out.println(e);
			}
		Thread.sleep(1000);
		Create_Accnt.click();
		Thread.sleep(2000);
		
	}
	
	public void Acc_Created(String string) {
		
		String Accnt = Account_Created.getText();
		System.out.println(Accnt);
		Assert.assertEquals(string, Accnt);
		}

	public void Login() {
		System.out.println("11111111");
		Login_Signup_Link.click();
		EmailAddr.sendKeys("ss1a0o@gmail.com");
		Password.sendKeys("Samiksha14$");
		Login.click();
		}
	
	
	/*Sc03*/
	public void Incorrectdetails() {
		
		Login_Signup_Link.click();
		EmailAddr.sendKeys("axxa@gmail.com");
		Password.sendKeys("Samiksha14$");
		Login.click();
		}
	
	public void errormsg(String err_msg) {
		
		String errormsg = errormsg1.getText();
		System.out.println(errormsg);
		Assert.assertEquals(err_msg, errormsg);
	}
	
/*SC04*/	
	public void Logout() {
		Logout.click();
	}
	
	public void New_userSignup() {
		System.out.println(Newuser_Signup.getText());
		Assert.assertEquals("New User Signup!", Newuser_Signup.getText());
	}
	
	
	/*SC06*/
	public void ContactUs() {
		ContactUs_Link.click();
	}
	
	public void GetinTouch(String string) throws InterruptedException {
		System.out.println(GetinTouch.getText());
		Assert.assertEquals(string, GetinTouch.getText());
		}
	
	public void GetintouchDetails() throws InterruptedException {
		Name.sendKeys("Jyo");
		email.sendKeys("qaz@gmail.com");
		subject.sendKeys("Regarding Pr2");
		message.sendKeys("Hello this is Project2");
		upload_file.sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\Jyothi\\Xpath screenshots\\New DOC Document.doc");
		Thread.sleep(1000);
		submit.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Success_Msg.getText();
	}
	public void Success_Msg(String msg) {
		System.out.println(Success_Msg.getText());	
		Assert.assertEquals(msg, Success_Msg.getText());
	}
	
/*SC07*/
	
	public void TestCaseLink() {
		TestCases.click();
		
	}
	public void TestCaselnksuccess() {
		System.out.println(TestCasesHeader.getText());
		//driver.quit();
	}

/*Sc08*/	
	public void Products() {
		Products.click();
//ads.click();
		
	}
	public void All_Products() throws InterruptedException {
		All_Products.getText();
		System.out.println(All_Products.getText());
		Assert.assertEquals("ALL PRODUCTS", All_Products.getText());
		Thread.sleep(500);
		System.out.println("qqqqqqqqqqqqqqqqqqqqqqqq");
		View_Product.click();
		Category.getText();
		System.out.println(Category.getText());
		Assert.assertEquals("CATEGORY", Category.getText());
		System.out.println(Brands.getText());
		Assert.assertEquals("BRANDS", Brands.getText());
	}
	
	public void Product_Info() {
		Availability.isDisplayed();
		Condition.isDisplayed();
		Brand.isDisplayed();
		driver.quit();
	}
	
	/*sc09*/
	
	public void search() {
		Search.sendKeys("H&M");
		Searchoption.click();
		driver.quit();
	}
	
	
	/*Sc10*/
	public void Subscription(String string){
		Subscription.getText();
		System.out.println(Subscription.getText());
		Assert.assertEquals(string, Subscription.getText());
	}
	
	
	public void enter_email() throws InterruptedException {
		Susbscribe_email.sendKeys("jj@gmail.com");
		Thread.sleep(2000);
	}
	
	public void Sub_success(String string) {
		subscribe_arrow.click();
		success_subscribe.getText();
		Assert.assertEquals(string, success_subscribe.getText());
		System.out.println(success_subscribe.getText());
		driver.quit();
	}
}



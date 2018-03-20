/*Jino philip
	 * 
	 * This Class is used for Storing all the Locators and Methods of  this   Project
	 */

	 
	package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import Utility.Screenshot;


public class Locators {
	
 WebDriver driver;

	
	
//Locators
 
//Test Case 1
 By mobile =  By.xpath("//a[contains(.,'Mobile')]");
By sortname = By.cssSelector("select[title=\"Sort By\"]");

//TestCase2
By sortposition =By.xpath("//*[@title='Sort By']");
By xperiaprice = By.id("product-price-1");
By xperia =By.xpath("//a[@title='Sony Xperia']");
By xperiatitle =By.xpath("//span[@class='h1']");
By detailprice =By.xpath("//*[@class='price']");

//TestCase3
By cart = By.xpath("//*[@type='button']");
By edit = By.xpath("(//a[contains(text(),'Edit')])[3]");
By quantity =By.name("qty");
By update = By.xpath("//button[@type='button']");
By msg =   By.xpath("//*[@class='error-msg']");
By empty = By.xpath("//*[@id='empty_cart_button']");
By emptycart = By.xpath("//*[@class ='page-title']");

//TestCase4
By compare1 = By.xpath("(//a[contains(text(),'Add to Compare')])[2]");
By compare2 =By.xpath("(//a[contains(text(),'Add to Compare')])[3]");
By compare = By.xpath("//*[@title='Compare']");
By iphonelist = By.xpath("//a[contains(text(),'IPhone')]");
By samsunglist = By.xpath("//a[contains(text(),'Samsung Galaxy')]");
By popup = By.xpath("//h1[contains(.,'Compare Products')]");
By iphonepopup = By.xpath("//a[contains(text(),'IPhone')]");
By samsungpopup = By.xpath("//a[contains(text(),'Samsung Galaxy')]");
By popupclose = By.xpath("//button[@class='button']");

//TestCase 5


By account = By.xpath("//div[2]/div/a/span[2]");
By myaccount = By.xpath("//*[@title='My Account']");
By createaccount =By.xpath("//*[@title='Create an Account']");
By firstname = By.id("firstname");
By secondname =By.id("lastname");
By email =By.id("email_address");
By password =By.id("password");
By confirm_password=By.id("confirmation");
By register =By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span");
By success_msg =By.xpath("//*[@class='success-msg']");
By tv = By.linkText("TV");
By wishlist = By.xpath("//*[@class='link-wishlist']");
By share =By.name("save_and_share");
By share_email =By.name("emails");
By share_submit =By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span");
By share_msg = By.xpath("//*[@class='messages']");



//Test Case 6

By login = By.xpath("//a[@title='Log In']");
By login_email = By.id("email");
By login_pw = By.id("pass");
By submit =By.name("send");
By mywishlist =By.xpath("//strong[contains(.,'My Wishlist')]");
By addcart = By.xpath("//*[@class='button btn-cart']");
By checkout =By.xpath("//*[@title='Proceed to Checkout']");
By state =By.id("region_id");
By zip = By.id("postcode");
By estimate =By.xpath("(//button[@type='button'])[4]");
By estimate_price =By.xpath("//*[@id=\"co-shipping-method-form\"]/dl/dd/ul/li/label/span");
By update_shipping =By.name("do");
By shippingcity = By.id("shipping:city");
By shippingfax =By.id("shipping:fax");
By continue_shipping = By.xpath("//*[@type='button']");
By continue_shipping2 =By.xpath("button validation-passed");
By moneyorder =By.name("payment[method]");
By continue_shipping3 =By.xpath("(//button[@type='button'])[4]");



	
	public Locators (WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	//Test Case1
	
	
	public   void MobileSorting()
	{
         //Actual result
		
	    String actual_title = driver.getTitle();
		System.out.println(" Actual Title is" +actual_title);
		
		//Expected Result
		
		String expected_title= "Home page";
		System.out.println("Expected Result is" +expected_title);
        Assert.assertEquals(expected_title, actual_title, "Title is invalid");
	     System.out.println("Page Title is verified");
		driver.findElement(mobile).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Mobile")," Mobile page is not Verified");
		System.out.println("Mobile page is Verified");
		new Select(driver.findElement(sortname)).selectByVisibleText("Name");
		Screenshot.CaptureScreenshot(driver, "Mobile");
		System.out.println("Screenshot captured");
		
	
	}
	
	
	
	//TestCase 2
	
	public void Productlistingpage() {
		
	
		driver.findElement(mobile).click();
		String Xperia_price= driver.findElement(xperiaprice).getText();
		System.out.println("xperia mobile price in listing page is  " +Xperia_price);
		driver.findElement(xperia).click();
		String xperianame  = driver.findElement(xperiatitle).getText();
		System.out.println("Detail page is of " +xperianame);
		String  Xperia_detailprice = driver.findElement(detailprice).getText();
		System.out.println("xperia mobile detail price is " +Xperia_detailprice);
		try {
			
			Assert.assertEquals(Xperia_price, Xperia_detailprice);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("messge is" +e);
		}
		System.out.println("Sony Xperia Listing and Productdetail price is correct");
		
	}
		
	//TestCase 3
		
		public void Cartpage() 
		{
		driver.findElement(mobile).click();
		driver.findElement(cart).click();
	    driver.findElement(edit).click();
	    driver.findElement(quantity).sendKeys("1000");
	    driver.findElement(update).click();
	    String actual_msg = driver.findElement(msg).getText();
	    System.out.println("Actual Error message is " +actual_msg);
	    String expected_msg = "The maximum quantity allowed for purchase is 500.";
	    System.out.println("Expected  message is" +expected_msg);
	    Assert.assertEquals(actual_msg, expected_msg);
	    System.out.println("Error mesage is verified");
	    driver.findElement(empty).click();
	    Assert.assertTrue(driver.findElement(emptycart).isDisplayed(),"Cart is not empty");
	    System.out.println("Cart is empty");
	    
	    }
		
		
		//TestCase 4
		
		
		public void Compareproducts() throws Exception {
			
	
		driver.findElement(mobile).click();
		new Select(driver.findElement(sortname)).selectByVisibleText("Position");
		Thread.sleep(2000);
		driver.findElement(compare1).click();
	    driver.findElement(compare2).click();
		driver.findElement(compare).click();
		
		//Switch to new Window
		 for (String handle : driver.getWindowHandles()) {
		    	driver.switchTo().window(handle);
		    	}
		 
		
		 //Verify pop up Title
		 
		 String expected_popuptext = "COMPARE PRODUCTS";
		 System.out.println("Expected Pop up title is " +expected_popuptext);
		 String actual_popuptext = driver.findElement(popup).getText();
		 System.out.println("Actual Pop up title is "  +actual_popuptext);
		 Assert.assertEquals(actual_popuptext, expected_popuptext);
		 System.out.println("Pop up is Verified");
		 
		 //Verify the correct products are  added in Compare List
		
		 String Iphone_list = driver.findElement(iphonelist).getText();
		 System.out.println("Iphone name in listing  is " +Iphone_list);  
		 String iphone_popup  = driver.findElement(iphonepopup).getText();
		 System.out.println("Iphone name in popup is " +iphone_popup );
		 String Samsung_list  = driver.findElement(samsunglist).getText();
		 System.out.println("Samsung name in listing  is " +Samsung_list);
		 String samsung_popup = driver.findElement(samsungpopup).getText();
		 System.out.println(" Samung name in pop up is " +samsung_popup);
		 Assert.assertEquals(iphone_popup, Iphone_list);
		 Assert.assertEquals(samsung_popup, Samsung_list);
		 System.out.println("Products are added in Comparison list and Verified ");
		 driver.findElement(popupclose).click();
		 
		}
		
		
	//TestCase 5
		
		public void AccountCreation() throws Exception {
			
			driver.findElement(account).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(myaccount).click();
			driver.findElement(createaccount).click();
			driver.findElement(firstname).sendKeys("Jino");
			driver.findElement(secondname).sendKeys("Philip");
			driver.findElement(email).sendKeys("teste672@gmail.com");
			driver.findElement(password).sendKeys("9745754904");
			driver.findElement(confirm_password).sendKeys("9745754904");
			Thread.sleep(3000);
			driver.findElement(register).click();
			
			//Verify Registration is success
			
			String expected_regmsg = "Thank you for registering with Main Website Store.";
			System.out.println("Expected Registration message is " +expected_regmsg);
			String actual_regmsg = driver.findElement(success_msg).getText();
			System.out.println("Actual Registration message is " +actual_regmsg);
		    Assert.assertEquals(actual_regmsg, expected_regmsg);
			System.out.println("Registration message is verfied and Account created sucessfully");
		 
			driver.findElement(tv).click();
			driver.findElement(wishlist).click();
            driver.findElement(share).click();
            driver.findElement(share_email).sendKeys("yadu@gmail.com,hari@gmail.com");
            driver.findElement(share_submit).click();
			
            //Verify Wishlist is shared
            
            String expected_wishlistmsg = "Your Wishlist has been shared.";
            System.out.println(" Expected Sharelist message is " +expected_wishlistmsg);
            String actual_wishlistmsg = driver.findElement(share_msg).getText();
            System.out.println("Actual Sharelist message is " +actual_wishlistmsg);
            Assert.assertEquals(actual_wishlistmsg, expected_wishlistmsg);
            System.out.println("Sharelist message is Verfied and Product is shared ");
            
            

			
		}
		
		//Test case 6
		
		public void Purchaseproducts() throws Exception
		{
			
			
		driver.findElement(account).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(login).click();
	
		driver.findElement(login_email).sendKeys("jinophilip555@gmail.com");
		driver.findElement(login_pw).sendKeys("9745754904");
		driver.findElement(submit).click();
		driver.findElement(tv).click();
		driver.findElement(wishlist).click();
		driver.findElement(addcart).click();
		//driver.findElement(checkout).click();
		new Select(driver.findElement(state)).selectByVisibleText("New York");
		
		driver.findElement(zip).sendKeys("542986");
		driver.findElement(estimate).click();
		String estimated_cost = driver.findElement(estimate_price).getText();
       System.out.println("Estimated Cost is " +estimated_cost);
		driver.findElement(update_shipping).click();
		driver.findElement(checkout).click();
		driver.findElement(continue_shipping).click();
		Thread.sleep(3000);
		driver.findElement(shippingcity).sendKeys("Miami");
	//	driver.findElement(shippingfax).sendKeys("7654654");
		Thread.sleep(1000);
		driver.findElement(continue_shipping2).click();
		driver.findElement(continue_shipping2).click();
		driver.findElement(moneyorder).click();
		driver.findElement(continue_shipping3).click();	
		
		}
		
		}
		
		
	
	
	
	


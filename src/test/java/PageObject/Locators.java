/*Jino philip
	 * 
	 * This Class is used for Storing all the Locators and Methods of  this   Project
	 */

	 
	package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
By sort = By.cssSelector("select[title=\"Sort By\"]");

//TestCase2
By xperiaprice = By.xpath("//span[@class='price']");
By xperia =By.xpath("//a[@title='Sony Xperia']");
By detailprice =By.xpath("//*[@class='price']");

//TestCase3
By cart = By.xpath("//*[@type='button']");
By edit = By.xpath("(//a[contains(text(),'Edit')])[3]");
By quantity =By.name("qty");
By update = By.xpath("//button[@type='button']");
By msg =   By.xpath("//*[@class='error-msg']");
By empty = By.xpath("//*[@id='empty_cart_button']");
By emptycart = By.xpath("//*[@class ='page-title']");









	
	public Locators (WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	//Test Case1
	public   void MobileSorting()
	{
         //Actual result
		
	    String actual_title = driver.getTitle();
		System.out.println("Title is" +actual_title);
		
		//Expected Result
		
		String expected_title= "Home page";
       Assert.assertEquals(expected_title, actual_title, "Title is invalid");
	     System.out.println("Page Title is verified");
		driver.findElement(mobile).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Mobile")," Mobile page is not Verified");
		System.out.println("Mobile page is Verified");
		new Select(driver.findElement(sort)).selectByVisibleText("Name");
		Screenshot.CaptureScreenshot(driver, "Mobile");
		System.out.println("Screenshot captured");
	
	}
	
	
	
	//TestCase 2
	
	public void Productlistingpage() {
		
		
		driver.findElement(mobile).click();
		String Xperia_price= driver.findElement(xperiaprice).getText();
		System.out.println("xperia mobile price in listing page is  " +Xperia_price);
		driver.findElement(xperia).click();
		String  Xperia_detailprice = driver.findElement(detailprice).getText();
		System.out.println("xperia mobile detail price is " +Xperia_detailprice);
		try {
			
			Assert.assertEquals(Xperia_price, Xperia_detailprice);
		} catch (Exception e) {
			
			e.printStackTrace();
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
	    System.out.println("Error message is " +actual_msg);
	    String expected_msg = "The maximum quantity allowed for purchase is 500.";
	     Assert.assertEquals(actual_msg, expected_msg);
	    System.out.println("Error mesage is verified");
	    driver.findElement(empty).click();
	    Assert.assertTrue(driver.findElement(emptycart).isDisplayed(),"Cart is not empty");
	    System.out.println("Cart is empty");
	    
	    
			
			}
		
		
		}
		
		
	
	
	
	


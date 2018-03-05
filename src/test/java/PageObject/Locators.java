/*Jino philip
	 * 
	 * This Class is used for Storing all the Locators and Methods of  this   Project
	 */

	 
	package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utility.Screenshot;


public class Locators {
	
 WebDriver driver;

	
	
	//Mobile Menu
	
 By mobile =  By.xpath("//a[contains(.,'Mobile')]");
By sort = By.cssSelector("select[title=\"Sort By\"]");
	
	
	
	public Locators (WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	
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
	
	
	
	
	
	
	
}

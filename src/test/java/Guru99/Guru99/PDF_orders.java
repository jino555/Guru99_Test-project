package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PDF_orders {
	
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		
		
		driver=Browser.GetBrowser();
	  }

	
	
  @Test(description = "This Test Case is to verify order is saved as PDF")
 
  public void VerifyOrderasPDF () {
	  
	  Locators orders = new Locators(driver);
	  orders.orderPdf();
	  
  }
  
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}

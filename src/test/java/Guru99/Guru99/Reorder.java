package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Reorder {
  
	WebDriver driver;
	

	  @BeforeTest
	  public void beforeTest() {
		  
		  
		  driver =Browser.GetBrowser();
		  
	  }
	
	
	@Test(description = "This Test Case is to verify Reorder" )
	
	
  public void VerifyReorder() {
		
		Locators reorder = new Locators(driver);
				reorder.reordering();
		
		
  }
	
	
	
	

  @AfterTest
  public void afterTest() {
  }

}

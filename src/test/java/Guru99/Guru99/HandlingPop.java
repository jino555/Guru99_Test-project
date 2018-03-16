package Guru99.Guru99;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class HandlingPop {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 
		 driver= Browser.GetBrowser();
	  }
	 
	 
	 
  @Test(priority=3, description = "This Test Case is to Verify Comparing of two products")
  
  public void VerifyCompare () throws Exception{
	  
	  Locators compare = new Locators(driver);
	  compare.Compareproducts();
	  
  }

 
 

  @AfterTest
  public void afterTest() {
  }

}

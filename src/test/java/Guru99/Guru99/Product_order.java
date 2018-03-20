package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;



public class Product_order {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  
	  driver= Browser.GetBrowser();
  }

  
  
  @Test
  public void VerifyProductOrder() throws Exception {
	  
	  Locators account = new Locators(driver);
		account.AccountCreation();
	  
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}

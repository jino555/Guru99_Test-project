package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Cart {
  
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  
	  driver= Browser.GetBrowser();
	  
  }
  
  @Test(description="This  Test Case is to verify Cart Page")
  public void VerifyCartPage() {
	  
	  Locators cart = new Locators(driver);
	  cart.Cartpage();
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}

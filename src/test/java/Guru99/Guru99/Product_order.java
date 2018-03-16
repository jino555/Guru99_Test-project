package Guru99.Guru99;

import org.testng.annotations.Test;

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
  public void VerifyProductOrder() {
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}

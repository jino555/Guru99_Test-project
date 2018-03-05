package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Product_Listing {
 
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  
	  
	  Browser load = new Browser(driver);
	  load.GetBrowser();
  }
  
  
  
  @Test
  public void f() {
	  
	  {
			Locators sorting = new Locators(driver);
			sorting.MobileSorting();
			
		}
	  
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}

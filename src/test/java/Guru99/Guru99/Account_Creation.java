package Guru99.Guru99;

import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Account_Creation {
 
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver = Browser.GetBrowser();
  }

  
  @Test(priority=4,description="This Testcase is to verify Account Creation")
  public void VerifyAccount() throws Exception {
	  
	  Locators account = new Locators(driver);
      account.AccountCreation();
	  
  
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}

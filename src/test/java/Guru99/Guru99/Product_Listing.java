//********************************************************************************************
//*    Project:  Guru99 
//*    Author   :Jino Philip              
//********************************************************************************************
/*      
Test Steps:
1. Goto http://live.guru99.com/
2. Click on ‘MOBILE’ menu
3. In the list of all mobile , read the cost of Sony Xperia mobile (which is $100)
4. Click on Sony Xperia mobile
5. Read the Sony Xperia mobile from detail page. Product value in list and details page should be equal ($100). 
*/

package Guru99.Guru99;

import org.testng.annotations.Test;
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
	  
	  driver = Browser.GetBrowser();
			  
			  }
  
  
 	  @Test(priority=1,description ="This Test Case is to Verify compare Mobile price")


			
			public void VerifyProductListing()
			{
				Locators price = new Locators(driver);
				price.Productlistingpage();
			}

		
  
  

  @AfterTest
  public void afterTest() {    
	  
	  System.out.println("Browser End");
	  driver.quit();
  }

}

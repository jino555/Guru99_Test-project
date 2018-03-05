/*   
 * Guru99 Demo Project
 * Author-Jino Philip
 * Date-27 -Feb -2018
 * 
 * 
 * 
Test Steps
Step 1. Goto http://live.guru99.com/
Step 2. Verify Title of the page
Step 3. Click on ‘MOBILE’ menu
Step 4. Verify Title of the page
Step 5. In the list of all mobile , select ‘SORT BY’ dropdown as ‘name’
Step 6. Verify all products are sorted by name
*
*
*/


package Guru99.Guru99;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Locators;
import Utility.Browser;
import Utility.ConfigReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Guru {

WebDriver driver;


@BeforeTest
 
	public void Browserloading()
	{
	
	ConfigReader config = new  ConfigReader();
	 System.setProperty("webdriver.chrome.driver", config.getChromePath());
	 driver = new ChromeDriver();
	 String baseurl = config.getApplicationURL();
	 driver.get(baseurl);
	 driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 //System.out.println("Brower Start");
	
	}
	

@Test(priority=0,description="This TestCase is to verify Sorting in Mobile menu")


	
public void VerifyMobileSorting()
{
	Locators sorting = new Locators(driver);
	sorting.MobileSorting();
	
}

@AfterTest

 public void AfterTest()
{
   System.out.println("Browser End");
	driver.quit();
}
}
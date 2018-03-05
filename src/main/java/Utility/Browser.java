package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	WebDriver driver;

	public Browser (WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public   void GetBrowser() 
	
	{
		
		 System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver.exe");

		 driver = new ChromeDriver();
		 String baseurl = "https:\\live.guru99.com\\index.php\\";
		 driver.get(baseurl);
		 driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		
	}
	

	
	
	
	
}

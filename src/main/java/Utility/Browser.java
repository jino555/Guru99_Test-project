package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	  private static WebDriver driver;

	  public static WebDriver GetBrowser() {
	  	if (driver != null) return driver;
	          else {
	        	  
	        	  ConfigReader config = new ConfigReader();
	        	  
	              System.setProperty("webdriver.chrome.driver",config.getChromePath());

	              driver = new ChromeDriver();
	              String baseurl = config.getApplicationURL();
	              driver.get(baseurl);
	              driver.manage().window().maximize();
	              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	              return driver;
	          }     
	      }
	  }

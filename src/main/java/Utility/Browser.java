package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	  private static WebDriver driver;

	  public static WebDriver GetBrowser() {
	  	if (driver != null) return driver;
	          else {
	              System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver.exe");

	              driver = new ChromeDriver();
	              String baseurl = "https:\\live.guru99.com\\index.php\\";
	              driver.get(baseurl);
	              driver.manage().window().maximize();
	              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	              return driver;
	          }     
	      }
	  }

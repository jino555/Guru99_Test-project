package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigReader {

	 Properties pro;
	WebDriver driver;
	public ConfigReader() 
	
	{
		
	       try {
				File src = new File("./Configuration/Config.properties");
				FileInputStream fis = new  FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
				System.out.println("Property class loaded");
			} 
	       
			catch (Exception e) {
				
				System.out.println("Exception is" +e.getMessage());
			}
	}
		
	//Access to Chrome Driver
	
		public   String getChromePath()
		{
			
		String path = pro.getProperty("ChromeDriver");
		return path;
		
		}
		
		
		//Access to Application url
		
       public String getApplicationURL()

      {
	
	return   pro.getProperty("url");
      }


		
		
		

	}

	
	
	



package Utility;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


import java.io.IOException;


 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;

public class Screenshot {
	

	
	public static void CaptureScreenshot(WebDriver driver, String Screenshotname) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File src= ts.getScreenshotAs(OutputType.FILE);
	    try {
	    	
	    	 // now copy the  screenshot to desired location using copyFile //method
	    	Date date = new Date();
			Format formatter = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
	    	Files.copy(src, new File("./Screenshots/" +Screenshotname+   formatter.format(date) +".png"));
	    	
	    
	    	}
	    	 
	    	catch (IOException e)
	    	 {
	    	  System.out.println(e.getMessage());
	    	 
	    	 }
	    	 }

		
		
	}
	
	
	
	
	
	
	
	
	
	


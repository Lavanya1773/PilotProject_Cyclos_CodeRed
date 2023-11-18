package com.utility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	public static HelperClass helperClass;
	public static WebDriver driver;
	
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
		
	//constructor
	HelperClass(){  //constructor
		driver = new EdgeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}  
	
	public static void openPage(String url) {  //to read the url
		driver.get(url);
	}
	
	public static WebDriver getDriver() {   
		return driver;		
	}
	
	public static void setUpDriver() {  //setting up driver
		if(helperClass==null) {
			helperClass = new HelperClass();			
		}
	}
	
	public static void tearDown() {   //closing driver
		if(driver!=null) {
//			driver.close();
//			driver.quit();
		}
		helperClass=null;
		
	}

}

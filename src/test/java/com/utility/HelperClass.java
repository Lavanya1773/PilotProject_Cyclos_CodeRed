package com.utility;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	public static HelperClass helperClass;
	public static WebDriver driver;	
	private static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	public static Logger log = null;
	//constructor
	HelperClass(){  //constructor
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		log = LogManager.getLogger(HelperClass.class);
	}
	public static void openPage(String url) {  //to read the url
		driver.get(url);
		log.info("Logged into Cyclos website");
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
			driver.close();
			driver.quit();
			log.info("Quitting the driver");
		}
		helperClass=null;
	}

}

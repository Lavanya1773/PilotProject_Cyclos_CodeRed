package com.utility;

import java.time.Duration;
<<<<<<< HEAD
import org.apache.logging.log4j.*;
=======

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
>>>>>>> 79295322b35231b02dba261e87cddb486b85e350
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	public static HelperClass helperClass;
<<<<<<< HEAD
	public static WebDriver driver;	
	public static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	public static Logger log = null;
=======
<<<<<<< HEAD
	public static WebDriver driver;	
	private static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	public static Logger log = null;
=======
	public static WebDriver driver;
	
<<<<<<< HEAD
	public static WebDriverWait wait;
	public final static int TIMEOUT = 10;
=======
	private static WebDriverWait wait;
	public final static int TIMEOUT = 20;
>>>>>>> c2a702c9ff4845730e8bf50e0ba0845d2cfd1ed5
>>>>>>> 79295322b35231b02dba261e87cddb486b85e350
		
>>>>>>> ea97bd734d661ee9cd9bb8faafa0b81b29028b20
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
<<<<<<< HEAD
			driver.close();
			driver.quit();
			log.info("Quitting the driver");
=======
<<<<<<< HEAD
			driver.close();
			driver.quit();
			log.info("Quitting the driver");
=======
<<<<<<< HEAD
			//driver.close();
			//driver.quit();
=======
//			driver.close();
//			driver.quit();
>>>>>>> c2a702c9ff4845730e8bf50e0ba0845d2cfd1ed5
>>>>>>> ea97bd734d661ee9cd9bb8faafa0b81b29028b20
>>>>>>> 79295322b35231b02dba261e87cddb486b85e350
		}
		helperClass=null;
	}

}

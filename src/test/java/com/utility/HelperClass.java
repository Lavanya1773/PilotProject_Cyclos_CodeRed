package com.utility;
<<<<<<< HEAD
 
=======
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class HelperClass {
	public static HelperClass helperClass;
 
=======
<<<<<<< HEAD
import org.openqa.selenium.edge.EdgeDriver;
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
import org.openqa.selenium.support.ui.WebDriverWait;
public class HelperClass {
	public static HelperClass helperClass;
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
	public static WebDriver driver;	
	public static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	public static Logger log = null;
	public static JavascriptExecutor javascriptExe;
<<<<<<< HEAD
 
	//constructor
	public HelperClass(){ 		
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(opt);
=======
	//constructor
	public HelperClass(){ 		
<<<<<<< HEAD
	//	ChromeOptions opt = new ChromeOptions();
//		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		driver = new ChromeDriver(opt);
		driver = new EdgeDriver();
=======
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(opt);
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
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
 
=======
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
			driver.close();
			driver.quit();
			log.info("Quitting the driver");
		}
		helperClass=null;
	}
<<<<<<< HEAD
 
=======
>>>>>>> 3001778f8f7b7cb2f4d30d5867dec82be0987e19
}
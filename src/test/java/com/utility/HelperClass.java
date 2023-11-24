package com.utility;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.openqa.selenium.edge.EdgeDriver;
=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
import org.openqa.selenium.support.ui.WebDriverWait;
public class HelperClass {
	public static HelperClass helperClass;
	public static WebDriver driver;	
	public static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	public static Logger log = null;
	public static JavascriptExecutor javascriptExe;
	//constructor
	public HelperClass(){ 		
<<<<<<< HEAD
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(opt);
=======
<<<<<<< HEAD
	//	ChromeOptions opt = new ChromeOptions();
//		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		driver = new ChromeDriver(opt);
		driver = new EdgeDriver();
=======
		ChromeOptions opt = new ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		javascriptExe = (JavascriptExecutor)driver;
		driver = new ChromeDriver(opt);
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
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
//			driver.close();
//			driver.quit();
=======
			driver.close();
			driver.quit();
>>>>>>> ee91d922dd66522ba8552e58e39863a384d96d5c
			log.info("Quitting the driver");
		}
		helperClass=null;
	}
}
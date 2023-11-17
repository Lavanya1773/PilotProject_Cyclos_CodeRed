package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MessageLocators {
	
	public static WebDriver driver;
        
	    //MESSAGES PAGE
	    //Message icon in home page
		@FindBy(xpath ="//*[name()='svg' and @class='bi bi-envelope-fill']")
		public WebElement messageIcon;
		
		//Radio Button InBox
		@FindBy(xpath ="//span[contains(text(),'Inbox (0)')]")
		public WebElement InBoxRadioButton;
		
		//Number of result in After Inbox button
		@FindBy(xpath ="//div[@class='paginationLeft']")
		public WebElement ResultInbox;
		
		
		//Radio Button SendMessage
		@FindBy(xpath ="//span[contains(text(),'Sent messages')]")
		public WebElement  SendMessageRadioButton;
		
		//Number of result in After SendMessage button
		@FindBy(xpath ="//div[@class='paginationLeft']")
		public WebElement ResultSendMessage;	
		
		//Radio Button Trash
		@FindBy (xpath ="//span[contains(text(),'Trash')]")
		public WebElement  TrashRadiOButton;
		
		//Number of result in After Trash button
		@FindBy(xpath ="//div[@class='paginationLeft']")
		public WebElement ResultTrash;			
		
		//Button New
		@FindBy(xpath ="//button[contains(text(),'New ')]")
		public WebElement NewButton;

		//NEW MESSAGE PAGE
		//User Input Field 
		@FindBy(xpath ="//input[@class='inputField large']")
		public WebElement UserInputField;
		
		//Subject input field
		@FindBy(xpath ="//input[@class='inputField full']")
		public WebElement SubjectInputField;
		
		
		//Description Input Field IFRAME !!!
		public WebElement frametext = driver.findElement(By.xpath("//iframe[@class= 'richTextField']"));
				
//		
//        @FindBy(xpath ="")
//        public WebElement DescriptionInputField;	
        
        
		//Send Button 
		@FindBy(xpath ="//button[contains(text(),'Send')]")
		public WebElement ButtonSend;

		//Success message included
		@FindBy(xpath ="//div[@class='notificationText notificationText-singleLine']")
		public WebElement Successmessage;
		
		
		//Login Locators
		
		@FindBy(xpath = "//span[text()='Sign in']")
		public WebElement signIn;
		
		@FindBy(xpath = "//input[@name='principal']")
		public WebElement userName;
		
		@FindBy(xpath = "//input[@name='password']")
		public WebElement password;
		
		@FindBy(xpath = "//button[text()='Sign in']")
		public WebElement signInButton;
		
		
}

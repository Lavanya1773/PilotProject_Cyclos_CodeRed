package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.utility.HelperClass;

public class MessageLocators {
	
//	 public static WebDriver driver;
	//HelperClass driv = new HelperClass();
	
        
	    //MESSAGES PAGE
	    //Message icon in home page
		@FindBy(xpath ="//*[name()='svg' and @class='bi bi-envelope-fill']")
		public WebElement messageIcon;
		
		//Radio Button InBox
		@FindBy(xpath ="//span[contains(text(),'Inbox')]")
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

		//SearchButton
		@FindBy(xpath ="//button[contains(text(),'Search')]")
		public WebElement SearchButton;
				
		//Advance button
		@FindBy(xpath ="//button[contains(text(),'Advanced')]")
		public WebElement AdvanceButton;
		
		
		//NEW MESSAGE PAGE
		//User Input Field 
		@FindBy(xpath ="//input[@class='inputField large']")
		public WebElement UserInputField;
		
		//Subject input field
		@FindBy(xpath ="//input[@class='inputField full']")
		public WebElement SubjectInputField;
		
	
		//Description Input Field IFRAME !!!
//     	public WebElement DescriptionInputField = driv.driver.findElement(By.xpath("//iframe[@class= 'richTextField']"));
				
		@FindBy(xpath ="//body[@marginwidth='0']")
      //  @FindBy(xpath ="//body[@marginwidth='0']")
        public WebElement DescriptionInputField;
		
		
    //  driver.switchTo().frame(DescriptionInputField);
	//	public WebElement DescriptionInputField = driv.driver.findElement(By.xpath("//iframe[@class= 'richTextField']"));
	//	driver.switchTo().frame(Element);
        
		
		
		//Send Button 
		@FindBy(xpath ="//button[contains(text(),'Send')]")
		public WebElement ButtonSend;

		//Success message included
		@FindBy(xpath ="//div[@class='notificationText notificationText-singleLine']")
		public WebElement Successmessage;
		
		//Failed message
		@FindBy(xpath ="/html/body/div[6]/div/div/div[2]/div[1]/div/div[2]/b")
		public WebElement Failmessage;
		
		//Login Locators
		
		@FindBy(xpath = "//span[text()='Sign in']")
		public WebElement signIn;
		
		@FindBy(xpath = "//input[@name='principal']")
		public WebElement userName;
		
		@FindBy(xpath = "//input[@name='password']")
		public WebElement password;
		
		@FindBy(xpath = "//button[text()='Sign in']")
		public WebElement signInButton;

		@FindBy(xpath = "//iframe[@class='richTextField']")
		public WebElement iframe;
		
		@FindBy(xpath = "//div[@class='richTextToolbarButton']")
		public WebElement clickSquareBox;
		
		
		
}

package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Function_Locators {
WebDriver driver;
//Login Valid Credentials		

	//Clicks on the Signin button
	@FindBy(xpath = "//a[@href='#login']/child::div")
	public WebElement Signin;
	
	//Enter the LoginName
	@FindBy(xpath = "//input[@class='inputField full']")
	public WebElement SigninName;
	
	//Enter the  Password
	@FindBy(xpath = "//input[@class='inputField passwordField authenticationInput full']")
	public WebElement SigninPassword;
	
	// Clicks the Submit button
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement Submit;
	 
	//User get Successfull Message
	@FindBy(xpath = "//div[@class='pageSectionHeading']")
	public WebElement SuccessfullMsg;
	
// To Edit User Profile		
	
	// Clicks on Personal
	@FindBy(xpath = "//span[text()='Personal']")
	public WebElement Personal;
	
	// Clicks on Edit
	@FindBy(xpath = "//span[text()='Edit']")
	public WebElement Edit;
	
	// Enters the website in the field
	@FindBy(xpath = "//tr[4]//child::td//following-sibling::td//child::input")
	public WebElement Website;
	
	// Clicks on Gender
	@FindBy(xpath = "//span[text()='Female']")
	public WebElement Gender;
	
	// Clicks on Business Type
	@FindBy(xpath = "//div[@class='selectionLabel']")
	public WebElement BusinessType;
	
	// Clicks on Type
	@FindBy(xpath = "//span[text()='Technical']")
	public WebElement Type;
	
	// Clicks on Save
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement Save;
	
	//User get  Edit Success Message
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']")
	public WebElement EditSuccessMessage;
	
//To Edit Phone Number	

	// Clicks on Phone
	@FindBy(xpath = "//span[text()='Phones']")
	public WebElement Phone;
	
	//Clicks on  PhoneOption inside the phone 
	@FindBy(xpath = "//div[text()='Phones']")
	public WebElement Phone2;
	
	// Clicks on New
	@FindBy(xpath = "//button[@type='button']")
	public WebElement New;
	
	 // Selects Mobile Number
	@FindBy(xpath = "//span[text()='Mobile phone']")
	public WebElement SelectMobileNumber;
	
	// Enters Name
	@FindBy(xpath = "//input[@class='inputField large']")
	public WebElement Name;
	
	// Enters Mobile Number
	@FindBy(xpath = "//input[@class='inputField medium']")
	public WebElement MobileNumber;
	
	// Clicks on Save Number
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement SaveNumber;
	
	//User get Phone Edit Successful Message
	@FindBy(xpath = "//div[@class='tableSectionHeader tableSectionHeader-initial tableSectionHeader-regular']")
	public WebElement PhoneEditMessage;
		
	// Clicks on New
	@FindBy(xpath = "//button[@type='button']")
	public WebElement New2;
	
	//Selects Landline
	@FindBy(xpath = "//span[text()='Land line']")
	public WebElement SelectLandline;
	
	// Enters Name
	@FindBy(xpath = "//input[@class='inputField large']")
	public WebElement Name2;
	
	// Enters Landline
	@FindBy(xpath = "//input[@class='inputField medium']")
	public WebElement Landline;
	
	//User get Phone Edit Successful Message
	@FindBy(xpath = "//div[@class='tableSectionHeader tableSectionHeader-initial tableSectionHeader-regular']")
	public WebElement LandEditMessage;
	
// Manage Password	
	
	// Clicks on Change Password
	@FindBy(xpath = "//span[@class='iconLabelLabel' and contains(text(),'Passwords')]")
	public WebElement ChangePassword ;
	
	// Clicks on Change Option
	@FindBy(xpath = "//a[@class='linkPanel']")
	public WebElement ChangeOption ;
	
	// Enters Old Password
	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement OldPassword ;
	
	// Enters New Password
	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement NewPassword ;
	
	 // Confirms New Password
	@FindBy(xpath = "(//input[@type='password'])[3]")
	public WebElement ConfirmNewPassword ;
	
	// Clicks on Confirm Button
	@FindBy(xpath = "//button[@class='actionButton' and contains(text(),'Confirm')]")
	public WebElement ConfirmButton ;
	
	//User get Password Reset Message
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']")
	public WebElement PasswordResetMessage ;
	
	//User get for Password Error Message
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']//child::b")
	public WebElement PasswordErrorMessage;
	
//To Manage My Contact	
	
	// Clicks on User Option
	@FindBy(xpath = "//span[@class='iconLabelLabel'  and contains(text(),'Users')]")
	public WebElement UserOption ;
	
	// Clicks on My Contact
	@FindBy(xpath = "//span[@class='iconLabelLabel' and contains(text(),'My contacts')]")
	public WebElement MyContact ;
	
	// Clicks on Add Option
	@FindBy(xpath = "//button[@class='actionButton' and contains(text(),'Add')]")
	public WebElement AddOption ;
	
	// Enters Contact Name
	@FindBy(xpath = "//input[@class='inputField large']//parent::div")
	public WebElement MyContactName ;
	
	// Clicks on Save My List
	@FindBy(xpath = "//button[@class='actionButton' and contains(text(),'Save')]")
	public WebElement SaveMyList ;
	
	//User get MyContact AddedList
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']")
	public WebElement MyContactAddedList ;
	
	
//Invalid credential
	
	 // Enters invalid username
	@FindBy(xpath = "//input[@class='inputField full']")
	public WebElement InLoginName;
	
	
	 // Enters invalid password
	@FindBy(xpath = "//input[@class='inputField passwordField authenticationInput full']")
	public WebElement InPassword;
	
	// Clicks on Invalid Signin
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement InvalidSignin;
	
	//User get  ErrorMsg
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']")
	public WebElement ErrorMsg;
	
	@FindBy(xpath = "//span[@class='iconLabelLabel' and contains(text(),'Addresses')]")
	public WebElement ClickAddress;
	
	@FindBy(xpath = "//button[@class='actionButton' and contains(text(),'New')]")
	public WebElement NewAddress;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[1]")
	public WebElement AddressName;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[2]")
	public WebElement Address;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[3]")
	public WebElement Zipecode;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[4]")
	public WebElement City;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[5]")
	public WebElement RegionorState;
	
	@FindBy(xpath = "//div[@class='selectionLabel' and contains(text(),'United States')]")
	public WebElement Country;
	
	@FindBy(xpath = "//input[@class='inputField full']")
	public WebElement CountryName;
	
	@FindBy(xpath = "//span[@class='iconLabelLabel' and contains(text(),'India')]")
	public WebElement ChooseCountry;
	
	@FindBy(xpath = "//span[@class='checkableImageLabel checkableImageLabel-right' and contains(text(),'Visible for other users')]")
	public WebElement Visibility;
	
	@FindBy(xpath = "//button[@class='actionButton' and contains(text(),'Save')]")
	public WebElement AddressSave;
	
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine' and contains(text(),'Saved successfully')]")
	public WebElement AddressMsg;
}

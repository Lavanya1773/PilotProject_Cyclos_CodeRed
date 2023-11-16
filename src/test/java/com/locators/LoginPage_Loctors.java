package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Loctors {
	WebDriver driver;	
	
	@FindBy(xpath = "(//span[@class='iconLabelLabel'])[2]")
	public WebElement Signin;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement LoginName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[2]/div[4]/button")
	public WebElement SigninButton;
	
	@FindBy(xpath = "//div[@class='pageSectionHeading']")
	public WebElement SuccessMsg;
	
	@FindBy(xpath = "//div[@class='notificationText notificationText-singleLine']")
	public WebElement ErrorMsg;
	
	@FindBy(xpath = "")
	public WebElement Profile;
	
	@FindBy(xpath = "")
	public WebElement EditProfile;
	
	@FindBy(xpath = "")
	public WebElement Website;
	
	@FindBy(xpath = "")
	public WebElement Gender;
	
	@FindBy(xpath = "")
	public WebElement BussinessType;
	
	@FindBy(xpath = "")
	public WebElement ChooseBussinessType;
	
	@FindBy(xpath = "")
	public WebElement Save;

	@FindBy(xpath = "")
	public WebElement ProfileSucessfullyMsg;
}

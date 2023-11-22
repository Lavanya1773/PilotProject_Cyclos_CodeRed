package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePhotoUpdateLocators {
	
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//span[text()='Personal']")
	public WebElement personalOption;
	
	@FindBy(xpath = "//span[text()='Profile images']")
	public WebElement profileImagesSection;
	
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement uploadNewButton;
	
	@FindBy(xpath = "//div[text()='1 result']")
	public WebElement resultAssertion;
	
	@FindBy(xpath = "//span[text()='Profile']")
	public WebElement profileSection;
	
	@FindBy(xpath = "//img[@class='gwt-Image']")
	public WebElement profilePic;
	
	@FindBy(xpath = "//td[@title='Remove']")
	public WebElement removePictureOption;
	
	@FindBy(xpath = "//div[@class='paginationLeft']")
	public WebElement PictureresultsCount;
	
	

}

package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterestsLocators {
	@FindBy(xpath = "(//div[@class='iconLabel iconLabel-hasIcon iconLabel-hasText'])[2]") //xpath for signin tab 
	public WebElement signIn1;
	
	@FindBy(xpath = "//input[@name='principal']") //xpath for username text box
	public WebElement userName1;
	
	@FindBy(xpath = "//input[@name='password']") //xpath for password trxt box
	public WebElement password1;
	
	@FindBy(xpath = "//button[@class='actionButton']") //xpath for sign button
	public WebElement signInButton1;
	
	@FindBy(xpath="//span[text()='Marketplace']") //xpath for marketplace tab
	public WebElement market1;
	
	//Advertisement interests	
	@FindBy(xpath="//span[text()='Advertisement interests']") //xpath for advertisement interests
	public WebElement advertisementInterests;

	@FindBy(xpath="//button[text()='New ']") //xpath for new button
	public WebElement newButton;

	@FindBy(xpath="(//input[@class='inputField large'])[1]") //xpath for name field
	public WebElement nameField;

	@FindBy(xpath="//div[@class='selectionField']") //xpath for category dropdown
	public WebElement category;

	@FindBy(xpath="//span[text()='Musicians']") //xpath for one of the category
	public WebElement downCategory;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"ci ci-checkbox-unchecked\"])[1]") //xpath for user checkbox
	public WebElement checkbox1;

	@FindBy(xpath="(//button[@class='actionButton'])[2]") //xpath for save button
	public WebElement saveButton; //

	@FindBy(xpath="//div[text()='Saved successfully']") //xpath for popup message
	public WebElement poUpSuccess; //for assertion//

	@FindBy(xpath="//a[text()='Advertisement interests']") //xpath for going back
	public WebElement goBack;

	@FindBy(xpath="//div[contains(text(),'results')]") //xpath for total count
	public WebElement adResultCount; 
	
	@FindBy(xpath="//div[@class='notificationText notificationText-singleLine']") //xpath for warning message
	public WebElement warnMessage;
}

package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage_Locators {
WebDriver driver;
	
	@FindBy(xpath = "(//span[@class='iconLabelLabel'])[1]")
	public WebElement Register;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[1]")
	public WebElement Name;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[2]")
	public WebElement LoginName;
	
	@FindBy(xpath = "(//input[@class='inputField large'])[3]")
	public WebElement Email;
	
	@FindBy(xpath = "(//input[@class='inputField large passwordField'])[1]")
	public WebElement Password;
	
	@FindBy(xpath = "(//input[@class='inputField large passwordField'])[2]")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath = "(//*[name()='svg' and @class='ci ci-checkbox-unchecked'])[4]")
	public WebElement RegistrationAgreement;
	
	@FindBy(xpath = "(//button[@class='actionButton'])[2]")
	public WebElement SubmitButton;
	
	@FindBy(xpath = "//div[text()='Missing required fields']")
	public WebElement Verification;
}

package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftVoucherLocators {
<<<<<<< HEAD

	//Voucher icon
	@FindBy(xpath ="//span[contains(text(),'Vouchers')]")
	WebElement VoucherIcon;
	
	//Buy Voucher sentence (left)
	@FindBy(xpath ="//span[contains(text(),'Buy vouchers')]")
	WebElement BuyVoucher;
	
	//Select gift voucher
	@FindBy(xpath ="//div[contains(text(),'Gift voucher')]")
	WebElement GiftVoucher;
	
	//Amount input field
	@FindBy(xpath ="//input[@class='inputField large rightAligned']")
	WebElement AmoundInputField;
	
	//Next button
	@FindBy(xpath ="//button[contains(text(),'Next')]")
	WebElement NextButton;
	
	//Submit Button
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	WebElement SubmitButton;
	
	//Print Button
	@FindBy(xpath ="//span[contains(text(),'Print')]")
	WebElement PrintButton;
	
=======
     
	//MarketPlace
	@FindBy(xpath ="//span[contains(text(),'Marketplace')]")
	public WebElement MarketPlace;
	
	///Voucher icon
	@FindBy(xpath ="//span[contains(text(),'Vouchers')]")
	public WebElement VoucherIcon;
	
	///Buy Voucher sentence (left)
	@FindBy(xpath ="//span[contains(text(),'Buy vouchers')]")
	public WebElement BuyVoucher;
	
	//Select gift voucher
	@FindBy(xpath ="//div[contains(text(),'Gift voucher')]")
	public WebElement GiftVoucher;
	
	//Amount input field
	@FindBy(xpath ="//input[@class='inputField large rightAligned']")
	public WebElement AmoundInputField;
	
	//Next button
	@FindBy(xpath ="//button[contains(text(),'Next')]")
	public WebElement NextButton;
	
	//Submit Button
	@FindBy(xpath ="//button[contains(text(),'Submit')]")
	public WebElement SubmitButton;
	
	//Print Button
	@FindBy(xpath ="//span[contains(text(),'Print')]")
	public WebElement PrintButton;
	
	//LOGIN LOCATORS
	
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
>>>>>>> main
	
	
	
	
}

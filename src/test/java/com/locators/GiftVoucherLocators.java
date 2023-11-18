package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftVoucherLocators {

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
	
	
	
	
	
}

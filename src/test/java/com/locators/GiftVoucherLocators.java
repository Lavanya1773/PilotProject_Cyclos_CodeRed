package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftVoucherLocators {
	
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
		
		//Suucess Message
		@FindBy (xpath ="//div[contains(text(),'The voucher has been bought.')]")
		public WebElement SuccessMessBuyVoucher;
		
		
		//LOGIN LOCATORS
		
		@FindBy(xpath = "//span[text()='Sign in']")
		public WebElement signIn;
		
		@FindBy(xpath = "//input[@name='principal']")
		public WebElement userName;
		
		@FindBy(xpath = "//input[@name='password']")
		public WebElement password;
		
		@FindBy(xpath = "//button[text()='Sign in']")
		public WebElement signInButton;
		
		//Gift Voucher locators
		@FindBy(xpath = "//span[text()='My vouchers']")
		public WebElement MyVoucher;
	
		@FindBy(xpath = "//div[@class='paginationLeft']")
		public WebElement ResultMessVouchers;
		
		//print option
		@FindBy(xpath = "//span[contains(text(),'Print')]")
		public WebElement PrintPDF;

		@FindBy(xpath = "//span[text()='Logout']")
		public WebElement logout;
		
		
}

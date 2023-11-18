package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationLocators {
	
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//span[text()='Banking']")
	public WebElement bankingTab;
	
	@FindBy(xpath = "//span[contains(text(),'Balance')]")
	public WebElement currentBalance;
	
	@FindBy(xpath = "//span[contains(text(),'Negative')]")
	public WebElement negativeBalance;
	
	@FindBy(xpath = "//span[contains(text(),'Total')]")
	public WebElement totalReceived;
	
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement advancedButton;
	
	@FindBy(xpath = "//*[name()=\"svg\" and @class='ci ci-radio-button-unchecked']")
	public WebElement incomingPayment;
	
	@FindBy(xpath = "//td[text()='Initial credit']")
	public WebElement initialPayment;	
	
//	@FindBy(xpath = "//tr[@class='dataTableRow dataTableRow-even']")
//	public WebElement evenHistory;
//	
//	@FindBy(xpath = "//tr[@class='dataTableRow dataTableRow-odd']")
//	public WebElement oddHistory;
	
	@FindBy(xpath = "//div[@title='Filter not applied']")
	public WebElement paymentFilterButton;
	
	@FindBy(xpath = "//span[text()='System payments']")
	public WebElement systemPaymentsBox;
	
	@FindBy(xpath = "//button[text()='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//div[text()='1 result']")
	//div[contains(text(),'result')]
	public WebElement systemResultCount;
	
	@FindBy(xpath = "//span[contains(text(),'Member payments')]")
	public WebElement MemberPaymentsBox;
	
	@FindBy(xpath = "//div[contains(text(),'results')]")
//	@FindBy(xpath = "//td[text()='angitha']")
	public WebElement memberResultCount;
	
	
	@FindBy(xpath = "//td[text()='Initial credit']")
	public WebElement initialPaymentTextConfirmation;
	
	@FindBy(xpath = "//span[text()='Download file']")
	public WebElement downloadFile;
	
	@FindBy(xpath = "//span[text()='PDF']")
	public WebElement pdf;
	
}

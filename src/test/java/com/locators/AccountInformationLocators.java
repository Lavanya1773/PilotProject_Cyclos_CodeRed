package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationLocators {
	
	//Locator for Sign-In button in home page
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	//Locator for User Name in login page
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	//Locator for Password in login page
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	//Locator for Sign-in button in login page
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
	
	//Locator for Banking Tab in home page
	@FindBy(xpath = "//span[text()='Banking']")
	public WebElement bankingTab;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//span[contains(text(),'Balance')]")
	public WebElement currentBalance;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//span[contains(text(),'Negative')]")
	public WebElement negativeBalance;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//span[contains(text(),'Total')]")
	public WebElement totalReceived;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement advancedButton;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//*[name()=\"svg\" and @class='ci ci-radio-button-unchecked']")
	public WebElement incomingPayment;
	
	//Locator for Current Balance in Account Information section
	@FindBy(xpath = "//td[text()='Initial credit']")
	public WebElement initialPayment;	
	
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
	public WebElement systemPaymentTextConfirmation;
	
	@FindBy(xpath = "//td[text()='Amount for buying gifts']")
	public WebElement memberPaymentTextConfirmation;
	
	@FindBy(xpath = "//span[text()='Download file']")
	public WebElement downloadFile;
	
	@FindBy(xpath = "//span[text()='PDF']")
	public WebElement pdf;
	
//	@FindBy(xpath = "//tr[@class='dataTableRow dataTableRow-even']//td")
//	public List<WebElement> tableData;  //for table data purpose
	
	@FindBy(xpath = "//div[@class='footerContents']")
	public WebElement scrollElement;
	
}

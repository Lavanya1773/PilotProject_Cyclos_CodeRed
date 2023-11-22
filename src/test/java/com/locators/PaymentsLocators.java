package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsLocators {
	
	//Locator for signIn button
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	//Locator for userName
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	//Locator for password
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	//Locator for signIn button
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
	
	//Locator for Banking Tab Option
	@FindBy(xpath = "//span[text()='Banking']")
	public WebElement bankingTabOption;
	
	//Locator for Payment to User Option
	@FindBy(xpath = "//span[text()='Payment to user']")
	public WebElement paymentToUserOption;
	
	//Locator for user
	@FindBy(xpath = "//input[@class='inputField large']")
	public WebElement user;
	
	//Locator for amount
	@FindBy(xpath = "//input[@class='inputField large rightAligned']")
	public WebElement amount;
	
	//Locator for paynow Schedule
	@FindBy(xpath = "//div[@title='Pay now (not scheduled)']")
	public WebElement paynowSchedule;	
	
	//Locator for descripton
	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement description;
	
	//Locator for submit Button
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	//Locator for submit Button
	@FindBy(xpath = "//div[text()='Please, review the payment below and click the confirm button']")
	public WebElement previewText;
	
	//Locator for submit Button
	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement confirmButton;
	
	//Locator for submit Button
	@FindBy(xpath = "//div[text()='The payment was successful']")
	public WebElement successfulText;
	
	//Locator for submit Button
	@FindBy(xpath = "//span[text()='Print']")
	public WebElement PayprintButton;
	
	//Locator for submit Button
	@FindBy(xpath = "//span[text()='Request from user']")
	public WebElement requestFromUserOption;
	
	//Locator for download button
	@FindBy(xpath = "//span[text()='Download file']")
	public WebElement downloadFilePayRequestButton;
	
	//Locator for Receive QR Payment Option
	@FindBy(xpath = "//span[text()='Receive QR payment']")
	public WebElement ReceiveQRPaymentOption;
	
	//Locator for Generate QR Code button
	@FindBy(xpath = "//button[text()='Generate QR code']")
	public WebElement generateQRCodeButton;
	
	//Locator for payment request Option
	@FindBy(xpath = "//span[text()='Payment requests']")
	public WebElement PaymentRequestOption;
	
	//Locator for generated url
	@FindBy(xpath = "(//div[@class='spacedLabel'])//parent::div[@class='fieldWithAction']")
	public WebElement GeneratedURL;
	
	//Locator for QR Status
	@FindBy(xpath = "//div[text()='Pending confirmation']")
	public WebElement QRStatus;
	
	//Locator for close button
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement close;
	
	//Locator for Warning Text
	@FindBy(xpath = "//div[text()='You have exceeded the maximum of payments per day for the demo network']")
	public WebElement warningText;
}

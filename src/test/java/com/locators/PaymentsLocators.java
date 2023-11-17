package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsLocators {
	@FindBy(xpath = "//span[text()='Sign in']")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//span[text()='Payment to user']")
	public WebElement paymentToUserOption;
	
	@FindBy(xpath = "//input[@class='inputField large']")
	public WebElement user;
	
	@FindBy(xpath = "//input[@class='inputField large rightAligned']")
	public WebElement amount;
	
	@FindBy(xpath = "//div[@title='Pay now (not scheduled)']")
	public WebElement paynowSchedule;
	
	@FindBy(xpath = "//div[@title='Recurring payments']")
	public WebElement recurringPaymentsSchedule;
	
	@FindBy(xpath = "//div[@title='Single payment in future']")
	public WebElement singlePaymentInFutureSchedule;
	
	@FindBy(xpath = "(//*[name()=\"svg\" and @class='bi bi-calendar-event'])[2]")
	public WebElement futuredateCalendar;
	
	@FindBy(xpath = "//div[text()='24']")
	public WebElement futuredate;
	
	@FindBy(xpath = "//button[text()='Ok']")
	public WebElement futuredateOk;
	
	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement description;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//div[text()='Please, review the payment below and click the confirm button']")
	public WebElement previewText;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//div[text()='The payment was successful']")
	public WebElement successfulText;
	
	@FindBy(xpath = "//span[text()='Print']")
	public WebElement PayprintButton;
	
	@FindBy(xpath = "//span[text()='Request from user']")
	public WebElement requestFromUserOption;
	
	@FindBy(xpath = "//div[text()='Are you sure to send this payment request?']")
	public WebElement paymentRequestConfirmPopup;
	
	@FindBy(xpath = "//button[text()='Ok']")
	public WebElement okPopup;
	
	@FindBy(xpath = "//span[text()='Scheduled payments']")
	public WebElement scheduledPaymentsOption;
	
	@FindBy(xpath = "//span[text()='Outgoing']")
	public WebElement scheduleoutgoingRadioOption;
	
	@FindBy(xpath = "//div[contains(text(),'result')]")
	public WebElement schedulePayResults;
	
	@FindBy(xpath = "//span[text()='Sent']")
	public WebElement sentPayRequestRadioOption;
	
	@FindBy(xpath = "//span[text()='Download file']")
	public WebElement downloadFilePayRequestButton;
	
	@FindBy(xpath = "//span[text()='Receive QR payment']")
	public WebElement ReceiveQRPaymentOption;
	
	@FindBy(xpath = "//button[text()='Generate QR code']")
	public WebElement generateQRCodeButton;
	
	@FindBy(xpath = "//div[text()='Pending confirmation']")
	public WebElement QRStatus;
	
	@FindBy(xpath = "//span[text()='Payment requests']")
	public WebElement PaymentRequestOption;
}

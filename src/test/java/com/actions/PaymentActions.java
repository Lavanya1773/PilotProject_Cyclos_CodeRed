package com.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.locators.PaymentsLocators;
import com.utility.HelperClass;

public class PaymentActions {
	PaymentsLocators  objPaymentLocators= new PaymentsLocators();
	String userName, password, user, amount, descripiton;
	Actions action = new Actions(HelperClass.getDriver());
	WebDriverWait wait;
	
	public PaymentActions() {
		this.objPaymentLocators = new PaymentsLocators();
		PageFactory.initElements(HelperClass.getDriver(), objPaymentLocators);		
	}
	
    // Method to perform sign-in
	public void setSignIn(String userName, String password) {
		objPaymentLocators.signIn.click();
		objPaymentLocators.userName.sendKeys(userName);
		objPaymentLocators.password.sendKeys(password);
		objPaymentLocators.signInButton.click();
	}
	
	//For Payment to user scenario
    // Method to click on the Banking tab
	public void clickBankingTab() {
		objPaymentLocators.bankingTabOption.click();
	}
	
    // Method to click on Payment to User option
	public void clickPaymentToUser() {
		objPaymentLocators.paymentToUserOption.click();	
	}
	
    // Method to set user and amount in the Payment to User scenario
	public void setUserAndAmount(String user, String amount) throws InterruptedException{
		
		HelperClass.wait.until(ExpectedConditions.visibilityOf(objPaymentLocators.user));		
		action.moveToElement(objPaymentLocators.user).sendKeys(user).build().perform();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		action.moveToElement(objPaymentLocators.user).sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		objPaymentLocators.amount.sendKeys(amount);
	}
	
    // Method to provide description and submit
	public void clickSchedule(String description) {
		objPaymentLocators.paynowSchedule.click();
		objPaymentLocators.description.sendKeys(description);
		objPaymentLocators.submitButton.click();
	}

    // Method for confirmation steps
	public void Confirmation() {
		objPaymentLocators.confirmButton.click();
		objPaymentLocators.PayprintButton.click();
		System.out.println("Pay to user is downloaded!!");
	}
	
    // Methods to retrieve Preview text information
	public String getPreviewText() {
		return objPaymentLocators.previewText.getText();
	}
	
    // Methods to retrieve success text information
	public String getSuccessText() {
		return objPaymentLocators.successfulText.getText();
	}
	
    // Methods to retrieve Warning text information
	public String getWarningText() {
		
		return objPaymentLocators.warningText.getText();
	}
	
    // Method to close a warning dialog
	public void clickCloseWarning() {
		objPaymentLocators.confirmButton.click();
		objPaymentLocators.close.click();
	}
	
    // Method to retrieve QR status text
	public String getQRStatusText() {
		return objPaymentLocators.QRStatus.getText();
	}
	
	//Payment Request scenario
    // Method to click on the Payment Request option
	public void clickPaymentRequestOption() {
		objPaymentLocators.PaymentRequestOption.click();
	}
	
	
	//Receiving QR Code Payment scenario
	public void clickQRPaymentOption() {
		objPaymentLocators.ReceiveQRPaymentOption.click();
		
	}
	public void clickQRPayment(String amount, String description) {
		objPaymentLocators.ReceiveQRPaymentOption.click();
		objPaymentLocators.amount.sendKeys(amount);
		objPaymentLocators.description.sendKeys(description);
		objPaymentLocators.generateQRCodeButton.click();
//		HelperClass.javascriptExe.executeScript("arguments[0].click()", objPaymentLocators.generateQRCodeButton);
		
	}
	
    // Method to verify QR Payment status
	public void QRPaymentVerification() {
		objPaymentLocators.QRStatus.isDisplayed();
		String URL = objPaymentLocators.GeneratedURL.getText();
		System.out.println("Generated URL is : " + URL);
	}
	
    // Method to perform login with payment-related information
	public void PaymentLogin(String userName, String password, String user, String amount, String description) throws InterruptedException {
		
		this.setSignIn(userName, password);
		this.setUserAndAmount(user, amount);
	}	

}

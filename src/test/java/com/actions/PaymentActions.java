package com.actions;

import java.awt.AWTException;
import java.time.Duration;
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
	
	public void setSignIn(String userName, String password) {
		objPaymentLocators.signIn.click();
		objPaymentLocators.userName.sendKeys(userName);
		objPaymentLocators.password.sendKeys(password);
		objPaymentLocators.signInButton.click();
	}
	
	//For Payment to user scenario
	
	public void clickBankingTab() {
		objPaymentLocators.bankingTabOption.click();
	}
	
	public void clickPaymentToUser() {
		objPaymentLocators.paymentToUserOption.click();	
	}
	
	public void setUserAndAmount(String user, String amount) throws InterruptedException{
		
		HelperClass.wait.until(ExpectedConditions.visibilityOf(objPaymentLocators.user));		
		action.moveToElement(objPaymentLocators.user).sendKeys(user).build().perform();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		action.moveToElement(objPaymentLocators.user).sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		objPaymentLocators.amount.sendKeys(amount);
	}
	
	public void clickSchedule(String description) {
		objPaymentLocators.paynowSchedule.click();
		objPaymentLocators.description.sendKeys(description);
		objPaymentLocators.submitButton.click();
	}


	
	
	
	public void Confirmation() {
		objPaymentLocators.previewText.getText();
		objPaymentLocators.confirmButton.click();
		objPaymentLocators.successfulText.getText();
		objPaymentLocators.PayprintButton.click();
	}

	//single Payment Scenario	
	public void clickSinglePaymentSchedule() throws InterruptedException {
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		action.moveToElement(objPaymentLocators.paynowSchedule).sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		objPaymentLocators.paynowSchedule.click();
		objPaymentLocators.singlePaymentInFutureSchedule.click();
		
	}
	
	public void clickSinglePaymentDateSchedule(String description) {

		objPaymentLocators.futuredateCalendar.click();
		objPaymentLocators.futuredate.click();
		objPaymentLocators.futuredateOk.click();
		objPaymentLocators.description.sendKeys(description);
		objPaymentLocators.submitButton.click();
	}
	
	//Payment Request scenario
	public void clickPaymentRequestOption() {
		objPaymentLocators.PaymentRequestOption.click();
	}
	
	public void clickPaymentRequestdetails() {
		objPaymentLocators.sentPayRequestRadioOption.click();
		System.out.println("Download File button is visible?");
		objPaymentLocators.downloadFilePayRequestButton.isDisplayed();
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
		
	}
	
	public void QRPaymentVerification() {
		objPaymentLocators.QRStatus.isDisplayed();			
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void PaymentLogin(String userName, String password, String user, String amount, String description) throws AWTException, InterruptedException {
		
		this.setSignIn(userName, password);
		this.setUserAndAmount(user, amount);
	}	

}

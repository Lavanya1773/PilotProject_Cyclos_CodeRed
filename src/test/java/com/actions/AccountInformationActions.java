package com.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.locators.AccountInformationLocators;
import com.utility.HelperClass;

public class AccountInformationActions{
	AccountInformationLocators accountInformationLocators = new AccountInformationLocators();
	String userName, password, currentBalance;
	Actions act = new Actions(HelperClass.getDriver());
	public AccountInformationActions() {
		this.accountInformationLocators = new AccountInformationLocators();
		PageFactory.initElements(HelperClass.getDriver(), accountInformationLocators);		
	}
	
	public void setSignIn(String userName, String password) {
		accountInformationLocators.signIn.click();
		accountInformationLocators.userName.sendKeys(userName);
		accountInformationLocators.password.sendKeys(password);
		accountInformationLocators.signInButton.click();
	}
	
	public void clickBanking() {
		accountInformationLocators.bankingTab.click();
	}
	
	public String getCurrentBalanceText() {
		return accountInformationLocators.currentBalance.getText();
	}
	
	public String getNegativeBalanceText() {
		return accountInformationLocators.negativeBalance.getText();
	}
	
	public String getTotalReceivedBalanceText() {
		return accountInformationLocators.totalReceived.getText();
	}
	
	public void clickDownloadFile() {
		accountInformationLocators.downloadFile.click();
		System.out.println("download is clicked");
	}
	
	public void clickMemberPaymentFilters() {
		System.out.println("Working on System Payment filter");
		accountInformationLocators.paymentFilterButton.click();
		accountInformationLocators.MemberPaymentsBox.click();
		accountInformationLocators.searchButton.click();
		String memberPayments = accountInformationLocators.memberResultCount.getText();
		System.out.println("Member filter result is:" + memberPayments);
		
	}
		public void clickSystemFilters() {
		System.out.println("Working on Member filter");
		accountInformationLocators.paymentFilterButton.click();
		accountInformationLocators.systemPaymentsBox.click();
		accountInformationLocators.searchButton.click();
		String systemPayments = accountInformationLocators.systemResultCount.getText();
		System.out.println("System filter result is:" + systemPayments);
	}
	
	public void clickAdvanceButton() {
		accountInformationLocators.advancedButton.click();
		accountInformationLocators.incomingPayment.click();
		accountInformationLocators.initialPayment.getText();
	}
	
	public void clickPdf() {
		accountInformationLocators.pdf.click();
	}
	
	public String getSystemPaymentVerification() {
		return accountInformationLocators.systemPaymentTextConfirmation.getText();
	}
	
	public String getMemberPaymentVerification() {
		return accountInformationLocators.memberPaymentTextConfirmation.getText();
	}
	
	public void scrollAction() throws InterruptedException {
		
//		((JavascriptExecutor)HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView(true);", accountInformationLocators.scrollElement);
//		act.scrollToElement(accountInformationLocators.scrollElement);
//		HelperClass.javascriptExe.executeScript("arguments[0].scrollIntoView(true);",accountInformationLocators.scrollElement);
		HelperClass.javascriptExe.executeScript("window.scrollBy(0,300)");
	}
	
	
	public void AccountInfo(String userName, String password) {
		
		this.setSignIn(userName, password);
		this.clickBanking();
		this.getCurrentBalanceText();
		this.getNegativeBalanceText();
		this.getTotalReceivedBalanceText();
		this.clickDownloadFile();
		this.clickPdf();
		this.clickAdvanceButton();

	}

}

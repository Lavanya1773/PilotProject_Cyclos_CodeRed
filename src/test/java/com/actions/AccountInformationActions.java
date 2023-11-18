package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.AccountInformationLocators;
import com.utility.HelperClass;

public class AccountInformationActions {
	AccountInformationLocators accountInformationLocators = new AccountInformationLocators();
	String userName, password, currentBalance, evenHistory, oddHistory;
	
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
	
	public void clickPaymentFilters() {
		System.out.println("Working on first filter");
		accountInformationLocators.paymentFilterButton.click();
		accountInformationLocators.systemPaymentsBox.click();
		accountInformationLocators.searchButton.click();
		String systemPayments = accountInformationLocators.systemResultCount.getText();
		System.out.println("First filter result is:" + systemPayments);
		
//		System.out.println("Working on second filter");
//		accountInformationLocators.paymentFilterButton.click();
//		accountInformationLocators.MemberPaymentsBox.click();
//		accountInformationLocators.searchButton.click();
//		String memberPayments = accountInformationLocators.memberResultCount.getText();
//		System.out.println("First filter result is:" + memberPayments);
	}
	
	public void clickAdvanceButton() {
		accountInformationLocators.advancedButton.click();
		accountInformationLocators.incomingPayment.click();
		accountInformationLocators.initialPayment.getText();
	}
	
	public void clickPdf() {
		accountInformationLocators.pdf.click();
	}
	
	public String getVerificationInitialText() {
		return accountInformationLocators.initialPaymentTextConfirmation.getText();
	}
	
//	public String getEvenHistory() {
//		return accountInformationLocators.evenHistory.getText();
//	}
//	
//	public String getOddHistory() {
//		return accountInformationLocators.oddHistory.getText();
//	}
	
	public void AccountInfo(String userName, String password) {
		
		this.setSignIn(userName, password);
		this.clickBanking();
		this.getCurrentBalanceText();
		this.getNegativeBalanceText();
		this.getTotalReceivedBalanceText();
		this.clickDownloadFile();
		this.clickPdf();
		this.clickAdvanceButton();
//		this.getEvenHistory();
//		this.getOddHistory();
	}

}

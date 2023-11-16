package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.AccountInformationLocators;
import com.utility.HelperClass;

public class AccountInformationActions {
	AccountInformationLocators accountInformationLocators = new AccountInformationLocators();
	String currentBalance, evenHistory, oddHistory;
	
	public AccountInformationActions() {
		this.accountInformationLocators = new AccountInformationLocators();
		PageFactory.initElements(HelperClass.getDriver(), accountInformationLocators);		
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
	}
	
	public void clickPdf() {
		accountInformationLocators.pdf.click();
	}
	
	public void clickAdvanceButton() {
		accountInformationLocators.advancedButton.click();
	}
	
	public void clickIncoming() {
		accountInformationLocators.incomingPayment.click();
	}
	
	public String getEvenHistory() {
		return accountInformationLocators.evenHistory.getText();
	}
	
	public String getOddHistory() {
		return accountInformationLocators.oddHistory.getText();
	}
	
	public void AccountInfo() {
		
		this.clickBanking();
		this.getCurrentBalanceText();
		this.getNegativeBalanceText();
		this.getTotalReceivedBalanceText();
		this.clickDownloadFile();
		this.clickPdf();
		this.clickAdvanceButton();
		this.clickIncoming();
		this.getEvenHistory();
		this.getOddHistory();
	}

}

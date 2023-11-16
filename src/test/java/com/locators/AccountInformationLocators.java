package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationLocators {
	@FindBy(xpath = "//span[text()='Banking']")
	public WebElement bankingTab;
	
	@FindBy(xpath = "//span[contains(text(),'Balance')]")
	public WebElement currentBalance;
	
	@FindBy(xpath = "//span[contains(text(),'Negative')]")
	public WebElement negativeBalance;
	
	@FindBy(xpath = "//span[contains(text(),'Total')]")
	public WebElement totalReceived;
	
	@FindBy(xpath = "//span[text()='Download file']")
	public WebElement downloadFile;
	
	@FindBy(xpath = "//span[text()='PDF']")
	public WebElement pdf;
	
	@FindBy(xpath = "//tr[@class='dataTableRow dataTableRow-even']")
	public WebElement evenHistory;
	
	@FindBy(xpath = "//tr[@class='dataTableRow dataTableRow-odd']")
	public WebElement oddHistory;
	
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement advancedButton;
	
	@FindBy(xpath = "//*[name()=\"svg\" and @class='ci ci-radio-button-unchecked']")
	public WebElement incomingPayment;


}

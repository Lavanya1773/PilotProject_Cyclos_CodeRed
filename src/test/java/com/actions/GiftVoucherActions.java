package com.actions;

import org.openqa.selenium.support.PageFactory;
import com.locators.GiftVoucherLocators;
import com.utility.HelperClass;

public class GiftVoucherActions {

	GiftVoucherLocators giftVoucherLocators = new GiftVoucherLocators();
	
	public GiftVoucherActions(){
		this.giftVoucherLocators = new GiftVoucherLocators();
		PageFactory.initElements(HelperClass.getDriver(), giftVoucherLocators);		
		
	}
	
	//login
	public void setSignIn(String userName, String password) {
		giftVoucherLocators.signIn.click();
		giftVoucherLocators.userName.sendKeys(userName);
		giftVoucherLocators.password.sendKeys(password);
		giftVoucherLocators.signInButton.click();
	}
	
	
	//Click MarketPlace
	public void clickMarketPlace() {
		giftVoucherLocators.MarketPlace.click();
	}
	
	//Click Buy voucher
	public void clickBuyVoucher() {
		giftVoucherLocators.BuyVoucher.click();
	}
	
	//Click Gift voucher
	public void clickGiftVoucher() {
		giftVoucherLocators.GiftVoucher.click();
	}
		
	//Amount field enter data
	public void setEnterAmount() {
		giftVoucherLocators.AmoundInputField.click();
		giftVoucherLocators.AmoundInputField.sendKeys("1");
		
	}
	
	//click next button
	public void clickNext() {
		giftVoucherLocators.NextButton.click();
	}
	
	//Click submit button
	public void clickSubmit() {
		giftVoucherLocators.SubmitButton.click();
	}
	
	//Click print button
	public void clickPrint() {
		giftVoucherLocators.PrintButton.click();
	}
	

}

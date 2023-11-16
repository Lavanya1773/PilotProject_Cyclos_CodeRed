package com.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.RegisterPage_Locators;
import com.utility.HelperClass;
public class RegisterPage_Actions {
	WebDriver driver;
	RegisterPage_Locators RP = new RegisterPage_Locators();
	
	public RegisterPage_Actions() {
		RP = new RegisterPage_Locators();
		PageFactory.initElements(HelperClass.getDriver(),RP);
	}
	public void Register() {
		RP.Register.click();
	}
	
	public void setName(String strName) {
		RP.Name.sendKeys(strName);
	}
	
	public void setLoginName(String strLoginName) {
		RP.LoginName.sendKeys(strLoginName);
	}
	
	public void setEmail(String strEmail) {
		RP.Email.sendKeys(strEmail);
	}
	
	public void setPassword(String strPassword) {
		RP.Password.sendKeys(strPassword);
	}

	public void setConfirmPassword(String strConfirmPassword) {
		RP.ConfirmPassword.sendKeys(strConfirmPassword);
	}
	
	public void RegistrationAgreement() {
		RP.RegistrationAgreement.click();
	}
	
	public void SubmitButton() {
		RP.SubmitButton.click();
	}
	
	public String Verification() {
		return RP.Verification.getText();
	}
	
}

package com.stepdefinitions;

import org.testng.Assert;

import com.actions.RegisterPage_Actions;
import com.utility.HelperClass;
import com.utility.UtilityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage_definitions {
	RegisterPage_Actions RPA = new RegisterPage_Actions();
	UtilityClass UC = new UtilityClass();
	@Given("User is on Demo Cyclos classic Homepage")
	public void user_is_on_demo_cyclos_classic_homepage() {
		HelperClass.openPage(UC.url);
	}

	@When("User click the register button")
	public void user_click_the_register_button() {
		RPA.Register();
	}

	@When("User enter the Name")
	public void user_enter_the_name() {
		 RPA.setName(UC.strName);
	}

	@When("User enter the LoginName")
	public void user_enter_the_login_name() {
		RPA.setLoginName(UC.strLoginName);
	}

	@When("User enter the Email")
	public void user_enter_the_email() {
		RPA.setEmail(UC.strEmail);
	}

	@When("User enter the Password")
	public void user_enter_the_password() {
		RPA.setPassword(UC.strPassword);
	}

	@When("User enter the confirmPassword")
	public void user_enter_the_confirm_password() {
		RPA.setConfirmPassword(UC.strConfirmPassword);
	}

	@Then("User click the RegistrationAgreement")
	public void user_click_the_registration_agreement() {
		 RPA.RegistrationAgreement();
	}
	
	@Then("User click Submit button")
	public void user_click_submit_button() {
	  RPA.SubmitButton();

	 Assert.assertTrue(RPA.Verification().contains("Missing required fields"));

	}
}

package com.stepdefinitions;

import com.actions.GiftVoucherActions;
import com.utility.HelperClass;
import com.utility.UtilityClassVoucher;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VoucherStepdefinition {

	GiftVoucherActions objgiftVoucherActions = new GiftVoucherActions();
	UtilityClassVoucher data1 = new UtilityClassVoucher();
	
	@Given("User launch the url")
	public void user_launch_the_url() {
		HelperClass.openPage(data1.url);
	    System.out.println("Cyclos Url is launched");
	}

	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objgiftVoucherActions.setSignIn(data1.userName, data1.password);
		
	}

	@When("User choose the marketpalce tab")
	public void user_choose_the_marketpalce_tab() {
		objgiftVoucherActions.clickMarketPlace();
		System.out.println("Select the marketplace");
	}

	@When("User selects the buy voucher")
	public void user_selects_the_buy_voucher() {
		objgiftVoucherActions.clickBuyVoucher();
		System.out.println("Select the Buy voucher");
		
	}

	@When("User selects the Gift voucher")
	public void user_selects_the_gift_voucher() {
		objgiftVoucherActions.clickGiftVoucher();
		System.out.println("Select the Gift voucher");
	}

	@When("User enters the amount and submit")
	public void user_enters_the_amount_and_submit() {
		objgiftVoucherActions.setEnterAmount();
		objgiftVoucherActions.clickNext();
		objgiftVoucherActions.clickSubmit();
	}

	
	@Then("User print the gift voucher pdf and the submission verified.")
	public void user_print_the_gift_voucher_pdf_and_the_submission_verified() {
		objgiftVoucherActions.clickPrint();
		
	}
	
	
	
	
}

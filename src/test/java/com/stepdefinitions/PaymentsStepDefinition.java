package com.stepdefinitions;

import com.actions.PaymentActions;
import com.utility.HelperClass;
import com.utility.UtilityClassPayments;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsStepDefinition {
	
	UtilityClassPayments data = new UtilityClassPayments();
	PaymentActions objPaymentActions = new PaymentActions();
	
	@Given("User launch the url")
	public void user_launch_the_url() {
		HelperClass.openPage(data.url);
	    System.out.println("Cyclos Url is launched");
	    
	}

	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objPaymentActions.setSignIn(data.userName, data.password);		
	}

	@When("User choose the Payment to user Tab")
	public void user_choose_the_payment_to_user_tab() {
		objPaymentActions.clickBankingTab();
		objPaymentActions.clickPaymentToUser();
	    
	}

	@When("User selects the ReceiverName and amount")
	public void user_selects_the_receiver_name_and_amount() throws InterruptedException {
		objPaymentActions.setUserAndAmount(data.user, data.amount);
		
	}

	@When("User choose the schedule as Pay now")
	public void user_choose_the_schedule_as_pay_now() {
		objPaymentActions.clickSchedule(data.description);
		
	}

	@Then("User gets a verification message")
	public void user_gets_a_verification_message() {
		objPaymentActions.Confirmation();    	    
	}
	
	//second scenario

	@When("User choose the schedule as Single Payment in Future")
	public void user_choose_the_schedule_as_single_payment_in_future() throws InterruptedException {
		
//		objPaymentActions.setUserAndAmount(data.user, data.amount);
		objPaymentActions.clickSinglePaymentSchedule();
	    
	}

	@When("User provide the schedule date")
	public void user_provide_the_schedule_date() {
		objPaymentActions.clickSinglePaymentDateSchedule(data.description);
		objPaymentActions.Confirmation();
	}
	
	//third scenario

	@When("User choose the Request From User Tab")
	public void user_choose_the_request_from_user_tab() {
		objPaymentActions.clickBankingTab();
		objPaymentActions.clickPaymentRequestOption();
	    
	}

	@When("User provides the ReceiverName and amount")
	public void user_provides_the_receiver_name_and_amount() throws InterruptedException {
		objPaymentActions.setUserAndAmount(data.user, data.amount);		
	    
	}

	@When("provide Expiration Date")
	public void provide_expiration_date() {
		objPaymentActions.clickPaymentRequestdetails();
	    
	}
	
	//fourth scenario

	@When("User choose the Receive QR Payments Tab")
	public void user_choose_the_receive_qr_payments_tab() {
		objPaymentActions.clickBankingTab();
		objPaymentActions.clickQRPaymentOption();
	    
	}

	@When("User provides the amount which will be converted into a QR code")
	public void user_provides_the_amount_which_will_be_converted_into_a_qr_code() {
		objPaymentActions.clickQRPayment(data.amount, data.description);
	}

	@Then("User gets the QR")
	public void user_gets_the_qr() {
		objPaymentActions.QRPaymentVerification();
	}



}

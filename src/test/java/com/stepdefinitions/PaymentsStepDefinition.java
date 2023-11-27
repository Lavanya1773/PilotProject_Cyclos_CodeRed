package com.stepdefinitions;

import org.junit.Assert;
import com.actions.PaymentActions;
import com.utility.HelperClass;
import com.utility.UtilityClassPayments;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsStepDefinition {
	
	UtilityClassPayments data = new UtilityClassPayments();
	PaymentActions objPaymentActions = new PaymentActions();
	
	@Given("User launched the url")
	public void user_launched_the_url() {
		HelperClass.openPage(data.url);
	    System.out.println("Cyclos Url is launched");
	    HelperClass.log.info("Cyclos URL is launched");
	   
	}

	@When("User provide username and password")
	public void user_provide_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objPaymentActions.setSignIn(data.userName, data.password);		
	    HelperClass.log.info("User Logined and currently in the Home Page");

	}

	@When("User choose the Payment to user Tab")
	public void user_choose_the_payment_to_user_tab() {
		objPaymentActions.clickBankingTab();
		objPaymentActions.clickPaymentToUser();
	    HelperClass.log.info("User is in Payment to user Option");
	   
	}

	@When("User selects the ReceiverName and amount")
	public void user_selects_the_receiver_name_and_amount() throws InterruptedException {
		
		objPaymentActions.setUserAndAmount(data.user, data.amount);
	    HelperClass.log.info("Use provided the Receiver Name and amount");

	}

	@When("User choose the schedule as Pay now")
	public void user_choose_the_schedule_as_pay_now() {
		objPaymentActions.clickSchedule(data.description);
		HelperClass.log.info("User choosed the schedule as PayNow");
	}

	@Then("User gets a verification message")
	public void user_gets_a_verification_message() {

//		objPaymentActions.Confirmation(); 
		 objPaymentActions.clickCloseWarning();

	    HelperClass.log.info("User confirms the payment and result is verified");
	}

	@When("User choose the Receive QR Payments Tab")
	public void user_choose_the_receive_qr_payments_tab() {
		objPaymentActions.clickBankingTab();
		objPaymentActions.clickQRPaymentOption();
	    HelperClass.log.info("User is in QR Payments Option");

	}

	@When("User provides the amount which will be converted into a QR code")
	public void user_provides_the_amount_which_will_be_converted_into_a_qr_code() {
		objPaymentActions.clickQRPayment(data.amount, data.description);
	    HelperClass.log.info("User entered the amount for Conversion purpose");

	}

	@Then("User gets the QR")
	public void user_gets_the_qr() {
		objPaymentActions.QRPaymentVerification();
		Assert.assertTrue(objPaymentActions.getQRStatusText().contains("Pending confirmation"));
	    HelperClass.log.info("QR Code is generated");

	}

}

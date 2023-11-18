package com.stepdefinitions;

import org.junit.Assert;
import com.actions.AccountInformationActions;
import com.utility.HelperClass;
import com.utility.UtilityClassAccountInformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountInformatioStepDefinition {
	UtilityClassAccountInformation data = new UtilityClassAccountInformation();
	AccountInformationActions objAccountActions = new AccountInformationActions();
	
	@Given("User launch the url")
	public void user_launch_the_url() {
		HelperClass.openPage(data.url);
	    System.out.println("Cyclos Url is launched");	    
	}
	
	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objAccountActions.setSignIn(data.userName, data.password);		
	}

	@When("User choose the Banking Tab")
	public void user_choose_the_banking_tab() {
		objAccountActions.clickBanking();
		System.out.println("Banking Tab is clicked!!");
	}

	@When("User view the current balance")
	public void user_view_the_current_balance() {
		String currentBalance = objAccountActions.getCurrentBalanceText();
		System.out.println("The Current Balance of the user is : " + currentBalance);
	    
	}

	@When("User checks the negative balance")
	public void user_checks_the_negative_balance() {
		String negativeBalance = objAccountActions.getNegativeBalanceText();
		System.out.println("The Negative Balance of the user is : " + negativeBalance);
	   
	}

	@When("User checks Total received")
	public void user_checks_total_received() {
		String Totalreceived = objAccountActions.getTotalReceivedBalanceText();
		System.out.println("The total number of incoming payment is : " + Totalreceived);    
	}

	@When("User provide filters to check the number of incoming payments and number of results were verified")
	public void user_provide_filters_to_check_the_number_of_incoming_payments_and_number_of_results_were_verified() {
		
		objAccountActions.clickAdvanceButton();
		System.out.println("The total number of incoming payments have been printed");	
		objAccountActions.clickPaymentFilters();
		Assert.assertTrue(objAccountActions.getVerificationInitialText().contains("Initial credit"));
	}

	@Then("User download the payment history")
	public void user_download_the_payment_history() throws InterruptedException {
		objAccountActions.clickDownloadFile();
		objAccountActions.clickPdf();	
		System.out.println("Payment file is downloaded. Please Check your system");
	   
	}

}

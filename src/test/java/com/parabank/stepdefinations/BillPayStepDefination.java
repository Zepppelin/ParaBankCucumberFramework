package com.parabank.stepdefinations;

import java.util.Map;

import org.junit.Assert;

import com.parabank.base.TestBase;
import com.parabank.pages.BillPay;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.utils.TestUtils;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillPayStepDefination extends TestBase
{
	BillPay billPayPage;
	LoginPage loginpge;
	HomePage homepage;
	TestUtils tstUtil;
	
	@Given("^User should on login page$")
	public void user_should_on_login_page() 
	{
		initialization();
		tstUtil = new TestUtils();
		billPayPage=new BillPay();
		loginpge = new LoginPage();
		homepage = new HomePage();
	}

	@Given("^User should be logged in the application$")
	public void user_should_be_logged_in_the_application() 
	{
		loginpge.login(prop.getProperty("username"),prop.getProperty("password"));
	}


	@Given("^User Is On bill payment service page$")
	public void user_Is_On_bill_payment_service_page() 
	{
		homepage.BillPayHyperLink.click();
	}

	@When("^The Title Of The Page \"([^\"]*)\"$")
	public void the_Title_Of_The_Page(String arg1) 
	{
		String BillPayPageTitle=billPayPage.BillPayPageTitle();
	    Assert.assertEquals(arg1,BillPayPageTitle);
	    
	}

	@When("^User enters the payee information$")
	public void user_enters_the_payee_information(DataTable arg1)
	{
		
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) 
	   {
			billPayPage.enterPayeename(data.get("Payee Name"));
			billPayPage.enterPayeeAddress(data.get("Address"));
			billPayPage.enterPayeeCity(data.get("City"));
			billPayPage.enterPayeeState(data.get("State"));
			billPayPage.enterPayeeZipcode(data.get("Zipcode"));
			billPayPage.enterPayeePhone(data.get("Phone"));
			billPayPage.enterPayeeAccount(data.get("Account"));
			billPayPage.enterPayeeVerifyAccount(data.get("Verify Account"));
			billPayPage.enterAmount(data.get("Amount"));
			billPayPage.payeeFromAccountID(data.get("From account"));
	   }
	}

	@When("^click send payment button$")
	public void click_send_payment_button() 
	{
		billPayPage.sendPaymentButton.click();
	}

	@Then("^payment sucessfull message will be displayed$")
	public void payment_sucessfull_message_will_be_displayed() throws InterruptedException 
	{
		tstUtil.waitTime();
		String billPayCompletedMsg=billPayPage.billPayCompleted.getText();
	    Assert.assertEquals("Bill Payment Complete",billPayCompletedMsg);
	}

	@Then("^User closes the Application Window$")
	public void user_closes_the_Application_Window()
	{
	   driver.close();
	}
	
	//scenario 2
	
	@Given("^User click on Bill Pay$")
	public void user_click_on_Bill_Pay() 
	{
		homepage.BillPayHyperLink.click();
	    
	}
	
	@When("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) 
	{
		Assert.assertEquals(arg1,billPayPage.BillPayPageTitle());
	}

	@When("^Click on Send Payment$")
	public void click_on_Send_Payment() 
	{
		billPayPage.sendPaymentButton.click();
	}

	@Then("^User verify error Msg as \"([^\"]*)\" for empty PayeeName$")
	public void user_verify_error_Msg_as_for_empty_PayeeName(String arg1)
	{
		Assert.assertEquals(arg1,billPayPage.emptyPayeeName());
	    
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeAddress$")
	public void user_verify_error_msg_as_for_empty_payeeAddress(String arg1) 
	{
	    
		Assert.assertEquals(arg1,billPayPage.emptyAddress());
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeAddressCity$")
	public void user_verify_error_msg_as_for_empty_payeeAddressCity(String arg1) 
	{
		Assert.assertEquals(arg1,billPayPage.emptyCity());
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeAddressState$")
	public void user_verify_error_msg_as_for_empty_payeeAddressState(String arg1) 
	{
		Assert.assertEquals(arg1,billPayPage.emptyState()); 
	    
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeAddressZip$")
	public void user_verify_error_msg_as_for_empty_payeeAddressZip(String arg1)
	{
		Assert.assertEquals(arg1,billPayPage.emptyZipcode()); 
	    
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeePhoneNumber$")
	public void user_verify_error_msg_as_for_empty_payeePhoneNumber(String arg1) 
	{
	    
		Assert.assertEquals(arg1,billPayPage.emptyPhoneNumber()); 
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeAccountNumber$")
	public void user_verify_error_msg_as_for_empty_payeeAccountNumber(String arg1) 
	{
		Assert.assertEquals(arg1,billPayPage.emptyaccountNumber());
	    
	}

	@Then("^User verify error msg as \"([^\"]*)\" for empty payeeVerifyAccountNumber$")
	public void user_verify_error_msg_as_for_empty_payeeVerifyAccountNumber(String arg1)
	{
		Assert.assertEquals(arg1,billPayPage.emptyVerifyaccountNumber());
	    
	}

	@Then("^User verify error msg as \"([^\"]*)\"  for empty payeeAmount$")
	public void user_verify_error_msg_as_for_empty_payeeAmount(String arg1) 
	{
		Assert.assertEquals(arg1,billPayPage.emptyAmount());
	    
	}

	@Then("^user closes The Browser window$")
	public void user_closes_The_Browser_window() 
	{
	    
	    driver.close();
	}




}

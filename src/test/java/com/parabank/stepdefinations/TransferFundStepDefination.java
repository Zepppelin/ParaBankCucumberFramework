package com.parabank.stepdefinations;

import org.junit.Assert;


import com.parabank.base.TestBase;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;

import com.parabank.pages.TransferFundPage;
import com.parabank.utils.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransferFundStepDefination extends TestBase
{
	TransferFundPage trasferfundpage;
	LoginPage loginpge;
	HomePage homepage;
	TestUtils tstUtil;
	
	@Given("^User navigates to the login Page$")
	public void user_navigates_to_the_login_Page()
	{
		initialization();
		tstUtil = new TestUtils();
		trasferfundpage=new TransferFundPage();
		loginpge = new LoginPage();
		homepage = new HomePage();
		
	}

	@Given("^User logged in the App$")
	public void user_logged_in_the_App()  
	{
		loginpge.login(prop.getProperty("username"),prop.getProperty("password"));
	    
	}

	@Given("^User Is On Transfer Fund Page$")
	public void user_Is_On_Transfer_Fund_Page()  
	{
		homepage.TrasferFundHyperLink.click();
	    
	}

	@When("^The Title Of The Page Is ParaBank Transfer Funds$")
	public void the_Title_Of_The_Page_Is_ParaBank_Transfer_Funds()  
	{
		String trasferPgeTitle=trasferfundpage.TransferFundPageTitle();
		Assert.assertEquals("ParaBank | Transfer Funds", trasferPgeTitle); 
	}

	@Then("^User enters the trasfer amount$")
	public void user_enters_the_trasfer_amount() throws InterruptedException 
	{
		tstUtil.waitTime();
		trasferfundpage.amountTextBox.sendKeys(tstUtil.trasferAmount);
	}

	@Then("^User Selects the from account$")
	public void user_Selects_the_from_account()  
	{
		trasferfundpage.SelectFromAccountID(tstUtil.FromAccountID);
	    
	}

	@Then("^User selects the to account$")
	public void user_selects_the_to_account()  
	{
		trasferfundpage.SelectTOAccountID(tstUtil.ToAccountID);
	    
	}

	@Then("^user clicks on trasfer button$")
	public void user_clicks_on_trasfer_button() 
	{
		trasferfundpage.trasferButton.click();
	    
	}

	@Then("^user verify the trasfer Complete success message$")
	public void user_verify_the_trasfer_Complete_success_message()  
	{
		String trasferCompleteSuccessMsg=trasferfundpage.trasferComplete.getText();
		 Assert.assertEquals("Transfer Complete!",trasferCompleteSuccessMsg);
	    
	}

	@Then("^user closes the app window$")
	public void user_closes_the_app_window() 
	{
	   driver.close();
	}
	
	@Given("^User navigates to Transfer Fund Page$")
	public void user_navigates_to_Transfer_Fund_Page()
	{
		homepage.TrasferFundHyperLink.click();
	}

	@When("^user clicks on trasfer button without entering the amount$")
	public void user_clicks_on_trasfer_button_without_entering_the_amount() throws InterruptedException
	{
		tstUtil.waitTime();
		trasferfundpage.trasferButton.click();
	}

	@Then("^Error message \"([^\"]*)\" is displayed$")
	public void error_message_is_displayed(String arg1)  
	{
		String amountErrMsg=trasferfundpage.amountErrorMessage.getText();
		Assert.assertEquals("The amount cannot be empty.",amountErrMsg.trim());
	}

	@Then("^app window is closed by user$")
	public void app_window_is_closed_by_user() throws Throwable 
	{
	    driver.close();
	}
}

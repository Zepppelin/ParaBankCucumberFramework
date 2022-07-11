package com.parabank.stepdefinations;



import org.junit.Assert;
import com.parabank.base.TestBase;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.pages.OpenNewAccountPage;
import com.parabank.utils.TestUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NewAccountStepDefination extends TestBase
{

	OpenNewAccountPage newAccountPage;
	LoginPage loginpge;
	HomePage homepage;
	TestUtils tstUtil;
	
	@Given("^User on login page$")
	public void user_on_login_page()
	{
		initialization();
		tstUtil = new TestUtils();
		newAccountPage=new OpenNewAccountPage();
		loginpge = new LoginPage();
		homepage = new HomePage();
		
		
	}
	
	@And("^User logged in the application$")
	public void user_logged_in_the_application() 
	{
		loginpge.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Given("^User Is On Open New Account Page$")
	public void user_Is_On_Open_New_Account_Page() 
	{
	
		homepage.OpenNewAccountHyperLink.click();
	    
	}

	@When("^The Title Of The Page Is ParaBank Open Account$")
	public void the_Title_Of_The_Page_Is_ParaBank_Open_Account()  
	{
		String accountPageTitle=newAccountPage.newAccountPageTitle();
	    Assert.assertEquals("ParaBank | Open Account",accountPageTitle);
	}

	@Then("^User Selects The new Account Type As Checking$")	
	public void user_Selects_The_Account_Type() 
	{
		newAccountPage.selectNewAccountType("CHECKING");
        
	}
	@Then("^User Selects the existing account$")
	public void user_Selects_the_existing_account() 
	{
		newAccountPage.selectExistingAccount(tstUtil.existingAccount);
	}

	@Then("^User Clicks On Open New Account Button$")
	public void user_Clicks_On_Open_New_Account_Button()  
	{
		newAccountPage.openNewAccountButton.click();
		
	}
	
	@Then("^User Verify The Account Opening Success Message$")
	public void user_Verify_The_Account_Opening_Success_Message() 
	{
	   String actSuccessMessage= newAccountPage.accountOpenSuccessMsg.getText();
	   Assert.assertEquals("Congratulations, your account is now open.", actSuccessMessage);
	}
	@Then("^user closes the window$")
	public void user_closes_the_browser() 
	{
	    driver.close();
	}

	@Given("^User Is Already On Open New Account Page$")
	public void user_Is_Already_On_Open_New_Account_Page() 
	{
		homepage.OpenNewAccountHyperLink.click();
		
	}

	@When("^Title Of The Page Is ParaBank Open Account$")
	public void title_Of_The_Page_Is_ParaBank_Open_Account()
	{
		String accountPageTitle=newAccountPage.newAccountPageTitle();
	    Assert.assertEquals(accountPageTitle, "ParaBank | Open Account");
	}

	@Then("^User Selects The new Account Type As Savings$")
	public void user_Selects_The_Account_Type_As_Savings()
	{
		newAccountPage.selectNewAccountType("SAVINGS");
		
	}
	@Then("^User selects existing account$")
	public void user_selects_existing_account() 
	{
		newAccountPage.selectExistingAccount(tstUtil.existingAccount);
	}

	@Then("^User Clicks On Open New Account$")
	public void user_Clicks_On_Open_New_Account() 
	{
		newAccountPage.openNewAccountButton.click();
	}

	@Then("^User Verify The Opened Account Success Message$")
	public void user_Verify_The_Opened_Account_Success_Message() 
	{
		 String actSuccessMessage= newAccountPage.accountOpenSuccessMsg.getText();
		 Assert.assertEquals("Congratulations, your account is now open.",actSuccessMessage);
	}
	@Then("^user closed the browser$")
	public void user_closed_the_browser()
	{
	    driver.close();
	}


}

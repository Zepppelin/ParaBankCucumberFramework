package com.parabank.stepdefinations;
import org.junit.Assert;


import com.parabank.base.TestBase;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination extends TestBase
{
    LoginPage loginpage;
    HomePage homepage;
    
    @Given("^user is on login page$")
    public void user_is_on_login_page() 
    {
    	initialization();
    	loginpage= new LoginPage();
    }
    
	@Given("^User Is Already On Login Page$")
	public void user_Is_Already_On_Login_Page() 
	{
		
		 String loginPageURL= loginpage.LoginPageUrl();
		 Assert.assertEquals("https://parabank.parasoft.com/parabank/index.htm", loginPageURL);
	}

	@When("^The Title Of The Page Is ParaBank$")
	public void the_Title_Of_The_Page_Is_ParaBank()
	{
		String loginpageTitle=loginpage.PageTitle();
	    Assert.assertEquals("ParaBank | Welcome | Online Banking",loginpageTitle);
	}
	
	@Then("^User Enters username And password  and clicks on login button$")
	public void user_Enters_username_And_password_and_clicks_on_login_button()
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Then("^User successfully logged in the application$")
	public void user_successfully_logged_in_the_application() 
	{
		String HomepageTitle=loginpage.PageTitle();
	    Assert.assertEquals("ParaBank | Accounts Overview",HomepageTitle);
	}
	@Then("^user closed the window$")
	public void user_closed_the_window() 
	{
	    driver.close();
	}



}

package com.parabank.stepdefinations;

import java.util.Map;

import org.junit.Assert;

import com.parabank.base.TestBase;

import com.parabank.pages.ContactInfoPage;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.utils.TestUtils;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateContactInformationStepDef extends TestBase
{
	
	ContactInfoPage contactInfoPage;
	LoginPage loginpge;
	HomePage homepage;
	TestUtils utils;
	
	
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() 
	{
		initialization();
		contactInfoPage=new ContactInfoPage();
		loginpge = new LoginPage();
		homepage = new HomePage();
		utils = new TestUtils();
	}

	@Given("^User should logged in the application$")
	public void user_should_logged_in_the_application()  
	{
		loginpge.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Given("^User Is On Upadate Contact Info Page page$")
	public void user_Is_On_Upadate_Contact_Info_Page_page()  
	{
		homepage.UpdateContactInformationHyperLink.click();
	}
	
	@When("^The page title is \"([^\"]*)\"$")
	public void the_page_title_is(String arg1)  
	{
		String updateContactInfoPageTitle=contactInfoPage.UpdateContactInfoPageTitle();
	    Assert.assertEquals(arg1,updateContactInfoPageTitle);
	}

	@When("^User enters the contact info details$")
	public void user_enters_the_contact_info_details(DataTable arg1) throws Throwable 
	{
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) 
		   {
			contactInfoPage.enterCustomerFirstName(data.get("First Name"));
			contactInfoPage.enterCustomerLastName(data.get("last Name"));
			contactInfoPage.enterCustomerAddress(data.get("Address"));
			contactInfoPage.enterCustomerCity(data.get("City"));
			contactInfoPage.enterCustomerState(data.get("State"));
			contactInfoPage.enterCustomerZipcode(data.get("Zipcode"));
			contactInfoPage.enterCustomerPhoneNumber(data.get("Phone Number"));
				
		   }
	}

	@When("^click on update profile button$")
	public void click_on_update_profile_button() 
	{
		contactInfoPage.clickOnUpdateProfileBtn();
	}

	@Then("^\"([^\"]*)\" message will be displayed$")
	public void message_will_be_displayed(String arg1)
	{
		   Assert.assertEquals(arg1,contactInfoPage.profileUpdatedMsg());
	}

	@Then("^User Closed The Window$")
	public void user_Closed_The_Window()
	{
	   driver.close();
	}

	//scenario 2
	
	@Given("^User click on Update Contact$")
	public void user_click_on_Update_Contact()
	{
		homepage.UpdateContactInformationHyperLink.click();
	}

	@When("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String arg1) 
	{
		String updateContactInfoPageTitle=contactInfoPage.UpdateContactInfoPageTitle();
	    Assert.assertEquals(arg1,updateContactInfoPageTitle);
	}

	@When("^User Clears the First Name Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_First_Name_Column_and_verify_Error_msg_as(String arg1) throws InterruptedException 
	{
		 utils.waitTime();
		 Assert.assertEquals(arg1,contactInfoPage.clearCustomerFirstName());
		
	}

	@When("^User Clears the Last Name Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_Last_Name_Column_and_verify_Error_msg_as(String arg1) 
	{
		Assert.assertEquals(arg1,contactInfoPage.clearCustomerLastName());
	}

	@When("^User Clears the Address  Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_Address_Column_and_verify_Error_msg_as(String arg1) 
	{
		Assert.assertEquals(arg1,contactInfoPage.clearCustomerAddress());
	}

	@Then("^User Clears the city  Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_city_Column_and_verify_Error_msg_as(String arg1) 
	{
		Assert.assertEquals(arg1,contactInfoPage.clearCustomerCity());
	}

	@Then("^User Clears the state  Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_state_Column_and_verify_Error_msg_as(String arg1) 
	{
		Assert.assertEquals(arg1,contactInfoPage.clearCustomerState()); 
	}

	@Then("^User Clears the Zip code Column and verify Error msg as \"([^\"]*)\"$")
	public void user_Clears_the_Zip_code_Column_and_verify_Error_msg_as(String arg1) 
	{
		Assert.assertEquals(arg1,contactInfoPage.clearCustomerZipcode()); 
	}
	
	@Then("^application window is closed by user$")
	public void application_window_is_closed_by_user() 
	{
	    driver.close();
	}


}

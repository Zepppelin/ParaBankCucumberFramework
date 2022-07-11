package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.base.TestBase;

public class ContactInfoPage extends TestBase
{
   @FindBy(id="customer.firstName")
   private WebElement customerFirstName;
   
   @FindBy(id="customer.lastName")
   private WebElement customerLastName;
   
   @FindBy(id="customer.address.street")
   private WebElement customerAddress;
   
   @FindBy(id="customer.address.city")
   private WebElement customerCity;
   
   @FindBy(id="customer.address.state")
   private WebElement customerState;
   
   @FindBy(id="customer.address.zipCode")
   private WebElement customerZipcode;
   
   @FindBy(id="customer.phoneNumber")
   private WebElement customerPhoneNumber;
   
   @FindBy(xpath ="//input[@value='Update Profile' and @type='submit']")
   private WebElement updateProfileButton;
   
   @FindBy(xpath="//p[text()='Your updated address and phone number have been added to the system. ']/preceding-sibling::h1")
   private WebElement profileUpdateMsg;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.firstName']")
   private WebElement firstNameErrorMessage;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.lastName']")
   private WebElement LastNameErrorMessage;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.address.street']")
   private WebElement addressErrorMessage;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.address.city']")
   private WebElement cityErrorMessage;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.address.state']")
   private WebElement stateErrorMessage;
   
   @FindBy(xpath="//span[@ng-if='customer && !customer.address.zipCode']")
   private WebElement zipcodeErrorMessage;
   
   public ContactInfoPage() 
   {
	   PageFactory.initElements(driver, this);
   }
   
   public String profileUpdatedMsg() 
   {
	   return profileUpdateMsg.getText();
   }
   
   public String UpdateContactInfoPageTitle() 
   {
	   return driver.getTitle();
   }
   public void enterCustomerFirstName(String firstName) 
   {
	   customerFirstName.clear();
	   customerFirstName.sendKeys(firstName);
   }
   public void enterCustomerLastName(String lastName) 
   {
	   customerLastName.clear();
	   customerLastName.sendKeys(lastName);
   }
   
   public void enterCustomerAddress(String address) 
   {
	   customerAddress.clear();
	   customerAddress.sendKeys(address);
   }
   public void enterCustomerCity(String city) 
   {
	   customerCity.clear();
	   customerCity.sendKeys(city);
   }
   public void enterCustomerState(String state) 
   {
	   customerState.clear();
	   customerState.sendKeys(state);
   }
   public void enterCustomerZipcode(String zipcode) 
   {
	   customerZipcode.clear();
	   customerZipcode.sendKeys(zipcode);
   }
   
   public void enterCustomerPhoneNumber(String phoneNumber) 
   {
	   customerPhoneNumber.clear();
	   customerPhoneNumber.sendKeys(phoneNumber);
   }
   
   public void clickOnUpdateProfileBtn() 
   {
	   updateProfileButton.click();
   }
   //scenario : 2
   public String clearCustomerFirstName() 
   {
	   customerFirstName.clear();
	   return firstNameErrorMessage.getText();
   }
   public String clearCustomerLastName() 
   {
	   customerLastName.clear();
	   return LastNameErrorMessage.getText();
	   
   }
   
   public String clearCustomerAddress() 
   {
	   customerAddress.clear();
	   return addressErrorMessage.getText();
	  
   }
   public String clearCustomerCity() 
   {
	   customerCity.clear();
	   return cityErrorMessage.getText();
	
   }
   public String clearCustomerState() 
   {
	   customerState.clear();
	   return stateErrorMessage.getText();
	   
   }
   public String clearCustomerZipcode() 
   {
	   customerZipcode.clear();
	   return zipcodeErrorMessage.getText();
   }
   
   
}

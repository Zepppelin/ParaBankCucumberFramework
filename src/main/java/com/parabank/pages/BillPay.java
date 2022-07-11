package com.parabank.pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.TestBase;

public class BillPay extends TestBase 
{
	@FindBy(xpath="//input[@name='payee.name']")
    public WebElement payeeName;
   
    @FindBy(xpath="//input[@name='payee.address.street']")
    public WebElement address;
   
    @FindBy(xpath="//input[@name='payee.address.city']")
    public WebElement city;
   
    @FindBy(xpath="//input[@name='payee.address.state']")
    public WebElement state;
    
    @FindBy(xpath="//input[@name='payee.address.zipCode']")
    public WebElement zipcode;
    
    @FindBy(xpath="//input[@name='payee.phoneNumber']")
    public WebElement phoneNumber;
    
    @FindBy(xpath="//input[@name='payee.accountNumber']")
    public WebElement accountNumber;
    
    @FindBy(xpath="//input[@name='verifyAccount']")
    public WebElement verifyAccount;
    
    @FindBy(xpath="//input[@name='amount']")
    public WebElement amount;
    
    @FindBy(xpath="//select[@name='fromAccountId']")
    public WebElement fromAccountID;
    
    @FindBy(xpath="//input[@value='Send Payment' and @type='submit']")
    public WebElement sendPaymentButton;
    
    @FindBy(xpath="//div[@ng-show='showResult']//h1[1]")
    public WebElement billPayCompleted;
    
    //scenario 2
    
    @FindBy(xpath="//span[@ng-show='!validationModel.name']")
    private WebElement payeeNameRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show='!validationModel.address']")
    private WebElement addressRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show='!validationModel.city']")
    private WebElement cityRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show='!validationModel.state']")
    private WebElement stateRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show='!validationModel.zipCode']")
    private WebElement zipcodeRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show='!validationModel.phoneNumber']")
    private WebElement phoneNumberRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show=\"validationModel.account == 'empty'\"]")
    private WebElement accountNumberRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show=\"validationModel.verifyAccount == 'empty'\"]")
    private WebElement verifyAccountNumberRequiredErrMsg;
    
    @FindBy(xpath="//span[@ng-show=\"validationModel.amount == 'empty'\"]")
    private WebElement amountRequiredErrMsg;
    
   
    public BillPay()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterPayeename(String Name)
    {
    	payeeName.sendKeys(Name);
    }
    
    public void enterPayeeAddress(String Address)
    {
    	address.sendKeys(Address);
    }
    
    public void enterPayeeCity(String City)
    {
    	city.sendKeys(City);
    }
    
 
    public void enterPayeeState(String State)
    {
    	state.sendKeys(State);
    }
    
    public void enterPayeeZipcode(String Zipcode)
    {
    	zipcode.sendKeys(Zipcode);
    }
    
    public void enterPayeePhone(String Phone)
    {
    	phoneNumber.sendKeys(Phone);
    }
    
    public void enterPayeeAccount(String Account)
    {
    	accountNumber.sendKeys(Account);
    }
    
    public void enterPayeeVerifyAccount(String VerifyAccount)
    {
    	verifyAccount.sendKeys(VerifyAccount);
    }
    
    public void enterAmount(String Amount)
    {
    	amount.sendKeys(Amount);
    }
    
    
    public String BillPayPageTitle() 
    {
    	return driver.getTitle();
    }
    
    public void payeeFromAccountID(String value) 
    {
    	Select sct = new Select(fromAccountID);
    	sct.selectByValue(value);
    }
    
    // secenario : 2
    
    public String emptyPayeeName() 
    {
    	return payeeNameRequiredErrMsg.getText();
    }
    
    public String emptyAddress() 
    {
    	return addressRequiredErrMsg.getText();
    }
    
    public String emptyCity() 
    {
    	return cityRequiredErrMsg.getText();
    }
    
    public String emptyState() 
    {
    	return stateRequiredErrMsg.getText();
    }
    
    public String emptyZipcode() 
    {
    	return zipcodeRequiredErrMsg.getText();
    }
    
    public String emptyPhoneNumber() 
    {
    	return phoneNumberRequiredErrMsg.getText();
    }
    
    public String emptyaccountNumber() 
    {
    	return accountNumberRequiredErrMsg.getText();
    }
    
    public String emptyVerifyaccountNumber() 
    {
    	return verifyAccountNumberRequiredErrMsg.getText();
    }
    
    public String emptyAmount() 
    {
    	return amountRequiredErrMsg.getText();
    }
}

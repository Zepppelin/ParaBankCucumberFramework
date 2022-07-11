package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.TestBase;

public class TransferFundPage extends TestBase
{
    @FindBy(xpath="//input[@id='amount']")
    public WebElement amountTextBox;
    
    @FindBy(xpath="//select[@id='fromAccountId']")
    public WebElement FromAccountIdDropdown;
    
    @FindBy(xpath="//select[@id='toAccountId']")
    public WebElement toAccountIdDropDown;
    
    @FindBy(xpath="//input[@value='Transfer' and @type='submit']")
    public WebElement trasferButton;
    
    @FindBy(xpath="//span[@id='amount']/ancestor::p/../h1[@class='title']")
    public WebElement trasferComplete;
    
    @FindBy(xpath="//p[@id='amount.errors']")
    public WebElement amountErrorMessage;
    
    public TransferFundPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String TransferFundPageTitle()
    {
    	return driver.getTitle();
    }
    
    public void SelectFromAccountID(String AccountID)
    {
    	Select sct = new Select(FromAccountIdDropdown);
    	sct.selectByValue(AccountID);
    }
    public void SelectTOAccountID(String AccountID)
    {
    	Select sct = new Select(toAccountIdDropDown);
    	sct.selectByValue(AccountID);
    }
}

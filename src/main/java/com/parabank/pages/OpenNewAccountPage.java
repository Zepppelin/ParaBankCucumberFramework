package com.parabank.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.base.TestBase;

public class OpenNewAccountPage extends TestBase
{
    @FindBy(xpath="//select[@id='type']")
    public WebElement newAccountType;
    
    @FindBy(xpath="//select[@id='fromAccountId']")
    public WebElement existingAccount;
    
    @FindBy(xpath="//input[@value='Open New Account']")
    public WebElement openNewAccountButton;
    
    @FindBy(xpath="//h1[@class='title' and text()='Account Opened!']/following-sibling::p[1]")
    public WebElement accountOpenSuccessMsg;
    
    public OpenNewAccountPage() 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String newAccountPageTitle() 
    {
    	return driver.getTitle();
    }
    
    public void selectNewAccountType(String accountType)
    {
    	Select sct = new Select(newAccountType);
    	sct.selectByVisibleText(accountType);
    	
    }
    public void selectExistingAccount(String accountType)
    {
    	Select sct = new Select(existingAccount);
    	sct.selectByValue(accountType);
    	
    }
}

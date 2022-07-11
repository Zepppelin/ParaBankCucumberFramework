package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.base.TestBase;

public class HomePage extends TestBase
{
   @FindBy(xpath="//a[text()='Open New Account']")
   public WebElement OpenNewAccountHyperLink;
   
   @FindBy(xpath="//a[text()='Update Contact Info']")
   public WebElement UpdateContactInformationHyperLink;
   
   @FindBy(xpath="//a[text()='Transfer Funds']")
   public WebElement TrasferFundHyperLink;
   
   @FindBy(xpath="//a[text()='Bill Pay']")
   public WebElement BillPayHyperLink;
   
   public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String homePageTitle() 
	{
		return driver.getTitle();
	}
	
}

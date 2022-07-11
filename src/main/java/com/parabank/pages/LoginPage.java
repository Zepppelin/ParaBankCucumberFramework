package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.base.TestBase;

public class LoginPage extends TestBase
{
    @FindBy(xpath="//input[@name='username']")
    public WebElement username;
    
    @FindBy(xpath="//input[@name='password']")
    public WebElement password;
    
    @FindBy(xpath="//input[@class='button' and @type='submit']")
    public WebElement loginButton;
    
    public LoginPage() 
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String LoginPageUrl() 
    {
    	return driver.getCurrentUrl();
    }
    public String PageTitle() 
    {
    	return driver.getTitle();
    }
    
    public void login(String un, String pass)
    {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginButton.click();
    	
    }
}

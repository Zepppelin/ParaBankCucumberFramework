package com.parabank.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import com.parabank.utils.TestUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
    public TestBase() 
    {
    	try
    	{
    		prop = new Properties();
    		FileInputStream fis = new FileInputStream("C:\\Cucumber Framework\\ParaBank\\src\\main\\java\\com\\parabank\\config\\config.properties");
    		prop.load(fis);
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    public static void initialization() 
    {
    	String browserName=prop.getProperty("browser");
    	if(browserName.equals("chrome")) 
    	{
    		driver= WebDriverManager.chromedriver().create();
    	}
    	else if(browserName.equals("firefox")) 
    	{
    		driver=WebDriverManager.firefoxdriver().create();
    	}
    	else if (browserName.equals("ie"))
    	{
    		driver=WebDriverManager.iedriver().create();
    	}
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtils.page_load_time_out, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtils.implicitly_wait, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
    }
    
}

package com.parabank.utils;

import com.parabank.base.TestBase;

public class TestUtils extends TestBase
{
    public static int page_load_time_out=30;
    public static int implicitly_wait =30;
    public  String existingAccount = "13344";
    public  String trasferAmount = "1";
    public  String FromAccountID="13344";
    public String ToAccountID="13344";
    public String payeeFromAccountID="13344";
   
    public void waitTime() throws InterruptedException
    {
    	Thread.sleep(2000);
    }
    
}

package com.parabank.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		           
		           //features="C:\\Cucumber Framework\\ParaBank\\src\\test\\resources\\com\\parabank\\features",
		           features="src\\test\\resources\\com\\parabank\\features",
		           glue= {"com.parabank.stepdefinations"},
		           plugin= {"pretty","html:test-output"},
		           monochrome=true,
		           strict= false,
		           dryRun=false
		           
		        )
public class MyTestRunner
{

}

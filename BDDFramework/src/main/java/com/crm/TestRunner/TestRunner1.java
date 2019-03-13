package com.crm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Asus-User\\eclipse-workspace\\BDDFramework\\Features\\contact1.feature"
		,glue= {"com.crm.StepDefination"}
		,dryRun=false
		,format= {"pretty","html:test-output"}
		,monochrome=true
		,strict=true
		
		
		)


public class TestRunner1 {

}

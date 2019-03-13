package com.crm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Asus-User\\eclipse-workspace\\BDDFramework\\Features\\contact2.feature"
		,glue= {"com.crm.StepDefination"}
		,dryRun=true
		,monochrome=true
		,strict=true
		,format={"pretty","html:test-output"}
		
		)


public class TestRunner2 {

}

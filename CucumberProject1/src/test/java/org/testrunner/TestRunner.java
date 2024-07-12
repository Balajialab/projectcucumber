package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Sai Siddharth\\eclipse-workspace\\CucumberProject1\\src\\test\\resources\\Feature\\Login.Feature", 
					glue = "org.stepdefination", dryRun = false,
					monochrome = true)

public class TestRunner {
	
	
	

}

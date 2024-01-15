package com_qa_runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(

features = "C:\\Users\\info\\eclipse-workspace\\CRM_CucumberBDD_POM_Maven\\src\\main\\java\\com\\featurefile\\Cucumber.feature",
glue = {"com_qa_StepDefinition"},
plugin = {"pretty","html:test-output"},
monochrome=true, // to display console in  readable output
dryRun = false
)

public class Runner {
	
}



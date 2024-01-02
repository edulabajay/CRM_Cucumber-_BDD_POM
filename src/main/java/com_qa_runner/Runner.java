package com_qa_runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.example.steps")
public class Runner {
}









/*
@RunWith (Cuucmber.class)
@CucumberOptions(
    features = "C:\\Users\\info\\eclipse-workspace\\CRM_CucumberBDD_POM\\src\\main\\java\\com_qa_feature",
    glue = {"com_qa_StepDefinition"},
    plugin = {"pretty", "html:test-output"},
    monochrome = true, // to display console in readable output
    dryRun = false
)

*/


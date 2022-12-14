package com.testRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
		// path of feature file
		features = "src/test/resources/features",
		plugin = { "pretty",
				"html:target/cucumber-html-report.html",
				"json:target/Cucumber-Json-reports/cucumber.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, 
		monochrome = true,
		// path of step definition file
		glue = "com.stepdefinations", tags = "",
		publish = true)

public class TestRunner {

}

package dev.autoprac.runner.runnerClass;

import dev.autoprac.driver.DriverFactory;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/fifth.feature", glue ="dev.autoprac.glue", plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
public class Test005 extends DriverFactory{
	
	
}


package dev.autoprac.runner.runnerClass;

import dev.autoprac.driver.DriverFactory;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/third.feature", glue ="dev.autoprac.glue", plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"})
public class Test003 extends DriverFactory{
	
	
}

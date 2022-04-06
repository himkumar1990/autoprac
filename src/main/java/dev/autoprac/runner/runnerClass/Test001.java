package dev.autoprac.runner.runnerClass;

import dev.autoprac.driver.DriverFactory;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/LaunchGoogle.feature", glue = "dev.autoprac.glue", plugin = {
		"pretty" })
public class Test001 extends DriverFactory {

}

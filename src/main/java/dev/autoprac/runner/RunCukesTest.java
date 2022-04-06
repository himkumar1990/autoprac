package dev.autoprac.runner;

import dev.autoprac.driver.CucumberRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/resources/features/", glue = "dev.autoprac.glue", tags = "@Auto-pra12", plugin = {
		"pretty" }, snippets = SnippetType.CAMELCASE)
public class RunCukesTest extends CucumberRunner {

}

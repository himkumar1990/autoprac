package dev.autoprac.glue;

import java.net.MalformedURLException;

import org.testng.Assert;

import dev.autoprac.driver.DriverFactory;
import dev.autoprac.model.Google.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	int first, second;

	GooglePage googlePage;

	@When("google page is launched")
	public void google_page_is_launched() throws MalformedURLException {
		DriverFactory.getDriver().get("https://www.google.com");
	}

	@When("text is entered")
	public void text_is_entered() throws Exception {
		googlePage = new GooglePage();
		googlePage.enterTextInSearchBox("India");
	}

	@Then("search result should be displayed")
	public void search_result_should_be_displayed() {
		Assert.assertTrue(googlePage.isListOfSearchResultDisplayed());
	}

	@And("^number are  (\\d+) and (\\d+)$")
	public void numberAre(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@And("^sum should be (\\d+)$")
	public void sumShouldBe(int sum) {
		Assert.assertEquals(sum, first + second);
	}

}

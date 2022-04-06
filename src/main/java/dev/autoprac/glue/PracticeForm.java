package dev.autoprac.glue;

import java.net.MalformedURLException;

import org.springframework.test.context.ContextConfiguration;

import dev.autoprac.driver.DriverFactory;
import dev.autoprac.model.practice.PracticeFormPage;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(value = "/spring-cucumber.xml")
public class PracticeForm extends CoreGlue {

	PracticeFormPage practiceFormPage;

	@When("the practice form is opened")
	public void thePracticeFormIsOpened() throws Exception {
		engine.practiceFormPage = new PracticeFormPage();
		DriverFactory.getDriver().get("https://demoqa.com/automation-practice-form");
//		ExecuteQuery.executeStatement("select * from employees", DatabaseConnection.getInstance().getConnection());
	}

	@When("first name is entered")
	public void firstNameIsEntered() throws MalformedURLException {
		engine.practiceFormPage.enterFirstName("Himanshu");

	}

	@When("last name is entered")
	public void lastNameIsEntered() throws MalformedURLException {
		engine.practiceFormPage.enterLastName("Kumar");
	}
}

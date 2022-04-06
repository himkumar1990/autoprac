package dev.autoprac.model.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.autoprac.model.BasePage;

public class PracticeFormPage extends BasePage {

	public PracticeFormPage() throws Exception {
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	public void enterFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void enterLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
}
